package com.cerbon.adorable_eggs.block;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.block.custom.EggBlock;
import com.cerbon.cerbons_api.api.registry.RegistryEntry;
import com.cerbon.cerbons_api.api.registry.ResourcefulRegistries;
import com.cerbon.cerbons_api.api.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ADEBlocks {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(BuiltInRegistries.BLOCK, AdorableEggs.MOD_ID);

    public static final RegistryEntry<Block> ALLEY_EGG = register("alley_egg", MapColor.COLOR_LIGHT_BLUE);

    private static RegistryEntry<Block> register(String id, MapColor mapColor) {
        return BLOCKS.register(id, () -> new EggBlock(BlockBehaviour.Properties.of().mapColor(mapColor).strength(0.5F).sound(SoundType.METAL).noOcclusion()));
    }

    public static void register() {
        BLOCKS.register();
    }
}
