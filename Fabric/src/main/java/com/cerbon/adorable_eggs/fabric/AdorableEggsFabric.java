package com.cerbon.adorable_eggs.fabric;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.block.ADEBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class AdorableEggsFabric implements ModInitializer, ClientModInitializer {

    @Override
    public void onInitialize() {
        AdorableEggs.init();
    }

    @Override
    public void onInitializeClient() {
        ADEBlocks.BLOCKS.getEntries().forEach(block -> BlockRenderLayerMap.INSTANCE.putBlock(block.get(), RenderType.cutout()));
    }
}