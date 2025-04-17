package com.cerbon.adorable_eggs.neoforge.datagen.loot;

import com.cerbon.adorable_eggs.block.ADEBlocks;
import com.cerbon.adorable_eggs.block.custom.EggBlock;
import com.cerbon.cerbons_api.api.registry.RegistryEntry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ADEBlockLootTables extends BlockLootSubProvider {

    public ADEBlockLootTables(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        ADEBlocks.BLOCKS.getEntries().stream()
                .filter(block -> block.get() instanceof EggBlock)
                .forEach(eggBlock -> this.dropOther(eggBlock.get(), ((EggBlock) eggBlock.get()).eggDrop()));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ADEBlocks.BLOCKS.getEntries().stream().map(RegistryEntry::get)::iterator;
    }
}
