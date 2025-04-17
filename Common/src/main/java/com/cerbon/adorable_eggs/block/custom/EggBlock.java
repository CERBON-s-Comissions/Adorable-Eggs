package com.cerbon.adorable_eggs.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class EggBlock extends Block {
    protected static final VoxelShape SHAPE = Block.box(1.0D, 0.0D, 1.0D, 15.0D, 19.0D, 15.0D);
    private final ItemLike eggDrop;

    public EggBlock(Properties properties, ItemLike eggDrop) {
        super(properties);
        this.eggDrop = eggDrop;
    }

    @Override
    protected @NotNull VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    public ItemLike eggDrop() {
        return eggDrop;
    }
}
