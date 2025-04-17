package com.cerbon.adorable_eggs.block;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.block.custom.EggBlock;
import com.cerbon.cerbons_api.api.registry.RegistryEntry;
import com.cerbon.cerbons_api.api.registry.ResourcefulRegistries;
import com.cerbon.cerbons_api.api.registry.ResourcefulRegistry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ADEBlocks {
    public static final ResourcefulRegistry<Block> BLOCKS = ResourcefulRegistries.create(BuiltInRegistries.BLOCK, AdorableEggs.MOD_ID);

    public static final RegistryEntry<Block> ALLAY_EGG = register("allay_egg", Items.ALLAY_SPAWN_EGG, MapColor.COLOR_LIGHT_BLUE);
    public static final RegistryEntry<Block> ARMADILLO_EGG = register("armadillo_egg", Items.ARMADILLO_SPAWN_EGG, MapColor.COLOR_BROWN);
    public static final RegistryEntry<Block> AXOLOTL_EGG = register("axolotl_egg", Items.AXOLOTL_SPAWN_EGG, MapColor.COLOR_PINK);
    public static final RegistryEntry<Block> BAT_EGG = register("bat_egg", Items.BAT_SPAWN_EGG, MapColor.COLOR_BLACK);

    private static RegistryEntry<Block> register(String id, ItemLike eggDrop, MapColor mapColor) {
        return BLOCKS.register(id, () -> new EggBlock(BlockBehaviour.Properties.of().mapColor(mapColor).strength(0.5F).sound(SoundType.METAL).noOcclusion(), eggDrop));
    }

    public static void register() {
        BLOCKS.register();
    }
}
