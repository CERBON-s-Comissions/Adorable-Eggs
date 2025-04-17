package com.cerbon.adorable_eggs.neoforge.datagen.providers;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.block.ADEBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ADEBlockStateProvider extends BlockStateProvider {
    private final ExistingFileHelper exFileHelper;

    public ADEBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, AdorableEggs.MOD_ID, exFileHelper);
        this.exFileHelper = exFileHelper;
    }

    @Override
    protected void registerStatesAndModels() {
        ADEBlocks.BLOCKS.getEntries().forEach(block -> eggBlock(block.get()));
    }

    private void eggBlock(Block eggBlock) {
        this.simpleBlock(eggBlock, new ModelFile.ExistingModelFile(this.blockTexture(eggBlock), this.exFileHelper));
    }
}
