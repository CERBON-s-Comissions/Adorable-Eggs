package com.cerbon.adorable_eggs.block.custom;

import com.cerbon.adorable_eggs.block.ADEBlocks;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class EggBlock extends HorizontalDirectionalBlock {
    private final ItemLike eggDrop;

    public static final MapCodec<EggBlock> CODEC = simpleCodec(properties1 -> new EggBlock(properties1, ADEBlocks.ALLAY_EGG.get()));
    public static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 19.0D, 15.0D);
    public static final Map<ItemLike, EggBlock> SPAWN_EGG_TO_BLOCK_EGG = new Object2ObjectOpenHashMap<>();

    public EggBlock(Properties properties, ItemLike eggDrop) {
        super(properties);
        this.eggDrop = eggDrop;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
        SPAWN_EGG_TO_BLOCK_EGG.putIfAbsent(eggDrop, this);
    }

    @Override
    protected @NotNull VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public ItemLike eggDrop() {
        return eggDrop;
    }

    @Override
    protected @NotNull MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    public void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    protected @NotNull BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    protected @NotNull BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }
}
