package com.cerbon.adorable_eggs.mixin;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.block.custom.EggBlock;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.BlockItemStateProperties;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.shapes.CollisionContext;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(SpawnEggItem.class)
public class SpawnEggItemMixin extends Item {

    public SpawnEggItemMixin(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);

        if (AdorableEggs.config.isPlaceEggsEnabled)
            tooltipComponents.add(Component.translatable("item.minecraft.spawn_egg.tooltip"));
    }

    @Inject(method = "useOn", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;getCollisionShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;"), cancellable = true)
    private void useOn(UseOnContext context, CallbackInfoReturnable<InteractionResult> cir) {
        Player player = context.getPlayer();
        if (player == null || !AdorableEggs.config.isPlaceEggsEnabled || this.getBlock() == null) return;

        if ((player.isCreative() && player.isShiftKeyDown()) || !player.isCreative())
            cir.setReturnValue(this.place(new BlockPlaceContext(context)));
    }

    @Inject(method = "getColor", at = @At("RETURN"), cancellable = true)
    private void getColor(int tintIndex, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0xFFFFFF);
    }

    @Unique
    public InteractionResult place(BlockPlaceContext context) {
        if (!this.getBlock().isEnabled(context.getLevel().enabledFeatures())) {
            return InteractionResult.FAIL;
        } else if (!context.canPlace()) {
            return InteractionResult.FAIL;
        } else {
            BlockPlaceContext blockPlaceContext = this.updatePlacementContext(context);
            if (blockPlaceContext == null) {
                return InteractionResult.FAIL;
            } else {
                BlockState blockState = this.getPlacementState(blockPlaceContext);
                if (blockState == null) {
                    return InteractionResult.FAIL;
                } else if (!this.placeBlock(blockPlaceContext, blockState)) {
                    return InteractionResult.FAIL;
                } else {
                    BlockPos blockPos = blockPlaceContext.getClickedPos();
                    Level level = blockPlaceContext.getLevel();
                    Player player = blockPlaceContext.getPlayer();
                    ItemStack itemStack = blockPlaceContext.getItemInHand();
                    BlockState blockState2 = level.getBlockState(blockPos);
                    if (blockState2.is(blockState.getBlock())) {
                        blockState2 = this.updateBlockStateFromTag(blockPos, level, itemStack, blockState2);
                        this.updateCustomBlockEntityTag(blockPos, level, player, itemStack, blockState2);
                        updateBlockEntityComponents(level, blockPos, itemStack);
                        blockState2.getBlock().setPlacedBy(level, blockPos, blockState2, player, itemStack);
                        if (player instanceof ServerPlayer) {
                            CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer)player, blockPos, itemStack);
                        }
                    }

                    SoundType soundType = blockState2.getSoundType();
                    level.playSound(player, blockPos, this.getPlaceSound(blockState2), SoundSource.BLOCKS, (soundType.getVolume() + 1.0F) / 2.0F, soundType.getPitch() * 0.8F);
                    level.gameEvent(GameEvent.BLOCK_PLACE, blockPos, GameEvent.Context.of(player, blockState2));
                    itemStack.consume(1, player);
                    return InteractionResult.sidedSuccess(level.isClientSide);
                }
            }
        }
    }

    @Unique
    @Nullable
    public BlockPlaceContext updatePlacementContext(BlockPlaceContext context) {
        return context;
    }

    @Unique
    private static void updateBlockEntityComponents(Level level, BlockPos poa, ItemStack stack) {
        BlockEntity blockEntity = level.getBlockEntity(poa);
        if (blockEntity != null) {
            blockEntity.applyComponentsFromItemStack(stack);
            blockEntity.setChanged();
        }
    }

    @Unique
    private BlockState updateBlockStateFromTag(BlockPos pos, Level level, ItemStack stack, BlockState state) {
        BlockItemStateProperties blockItemStateProperties = stack.getOrDefault(DataComponents.BLOCK_STATE, BlockItemStateProperties.EMPTY);
        if (blockItemStateProperties.isEmpty()) {
            return state;
        } else {
            BlockState blockState = blockItemStateProperties.apply(state);
            if (blockState != state) {
                level.setBlock(pos, blockState, 2);
            }

            return blockState;
        }
    }

    @Unique
    protected boolean updateCustomBlockEntityTag(BlockPos pos, Level level, @Nullable Player player, ItemStack stack, BlockState state) {
        return BlockItem.updateCustomBlockEntityTag(level, player, pos, stack);
    }

    @Unique
    protected boolean placeBlock(BlockPlaceContext context, BlockState state) {
        return context.getLevel().setBlock(context.getClickedPos(), state, 11);
    }

    @Nullable
    protected BlockState getPlacementState(BlockPlaceContext context) {
        BlockState blockState = this.getBlock().getStateForPlacement(context);
        return blockState != null && this.canPlace(context, blockState) ? blockState : null;
    }

    @Unique
    protected Block getBlock() {
        return EggBlock.SPAWN_EGG_TO_BLOCK_EGG.get(this);
    }

    @Unique
    protected boolean canPlace(BlockPlaceContext context, BlockState state) {
        Player player = context.getPlayer();
        CollisionContext collisionContext = player == null ? CollisionContext.empty() : CollisionContext.of(player);
        return (!this.mustSurvive() || state.canSurvive(context.getLevel(), context.getClickedPos()))
                && context.getLevel().isUnobstructed(state, context.getClickedPos(), collisionContext);
    }

    @Unique
    protected boolean mustSurvive() {
        return true;
    }

    @Unique
    protected SoundEvent getPlaceSound(BlockState state) {
        return state.getSoundType().getPlaceSound();
    }
}
