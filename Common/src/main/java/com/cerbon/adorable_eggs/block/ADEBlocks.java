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

    public static final RegistryEntry<EggBlock> ALLAY_EGG = register("allay_egg", Items.ALLAY_SPAWN_EGG, MapColor.COLOR_LIGHT_BLUE);
    //public static final RegistryEntry<EggBlock> ARMADILLO_EGG = register("armadillo_egg", Items.ARMADILLO_SPAWN_EGG, MapColor.COLOR_BROWN);
    public static final RegistryEntry<EggBlock> AXOLOTL_EGG = register("axolotl_egg", Items.AXOLOTL_SPAWN_EGG, MapColor.COLOR_PINK);
    public static final RegistryEntry<EggBlock> BAT_EGG = register("bat_egg", Items.BAT_SPAWN_EGG, MapColor.COLOR_BLACK);
    public static final RegistryEntry<EggBlock> POLAR_BEAR_EGG = register("polar_bear_egg", Items.POLAR_BEAR_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> BEE_EGG = register("bee_egg", Items.BEE_SPAWN_EGG, MapColor.COLOR_YELLOW);
    public static final RegistryEntry<EggBlock> WITHER_SKELETON_EGG = register("wither_skeleton_egg", Items.WITHER_SKELETON_SPAWN_EGG, MapColor.COLOR_YELLOW);
    //public static final RegistryEntry<EggBlock> BREEZE_EGG = register("breeze_egg", Items.BREEZE_SPAWN_EGG, MapColor.COLOR_LIGHT_GRAY);
    public static final RegistryEntry<EggBlock> PIGLIN_BRUTE_EGG = register("piglin_brute_egg", Items.PIGLIN_BRUTE_SPAWN_EGG, MapColor.COLOR_PINK);
    public static final RegistryEntry<EggBlock> HUSK_EGG = register("husk_egg", Items.HUSK_SPAWN_EGG, MapColor.COLOR_YELLOW);
    public static final RegistryEntry<EggBlock> CAMEL_EGG = register("camel_egg", Items.CAMEL_SPAWN_EGG, MapColor.COLOR_YELLOW);
    public static final RegistryEntry<EggBlock> CAT_EGG = register("cat_egg", Items.CAT_SPAWN_EGG, MapColor.COLOR_GRAY);
    public static final RegistryEntry<EggBlock> CAVE_SPIDER_EGG = register("cave_spider_egg", Items.CAVE_SPIDER_SPAWN_EGG, MapColor.COLOR_BLACK);
    public static final RegistryEntry<EggBlock> CHICKEN_EGG = register("chicken_egg", Items.CHICKEN_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> COD_EGG = register("cod_egg", Items.COD_SPAWN_EGG, MapColor.COLOR_BROWN);
    public static final RegistryEntry<EggBlock> COW_EGG = register("cow_egg", Items.COW_SPAWN_EGG, MapColor.COLOR_BROWN);
    public static final RegistryEntry<EggBlock> DROWNED_EGG = register("drowned_egg", Items.DROWNED_SPAWN_EGG, MapColor.COLOR_CYAN);
    public static final RegistryEntry<EggBlock> SHEEP_EGG = register("sheep_egg", Items.SHEEP_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> SKELETON_EGG = register("skeleton_egg", Items.SKELETON_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> STRAY_EGG = register("stray_egg", Items.STRAY_SPAWN_EGG, MapColor.COLOR_CYAN);
    public static final RegistryEntry<EggBlock> TRADER_LLAMA_EGG = register("trader_llama_egg", Items.TRADER_LLAMA_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> TROPICAL_FISH_EGG = register("tropical_fish_egg", Items.TROPICAL_FISH_SPAWN_EGG, MapColor.COLOR_ORANGE);
    public static final RegistryEntry<EggBlock> CREEPER_EGG = register("creeper_egg", Items.CREEPER_SPAWN_EGG, MapColor.COLOR_GREEN);
    public static final RegistryEntry<EggBlock> RAVAGER_EGG = register("ravager_egg", Items.RAVAGER_SPAWN_EGG, MapColor.COLOR_GRAY);
    public static final RegistryEntry<EggBlock> DOLPHIN_EGG = register("dolphin_egg", Items.DOLPHIN_SPAWN_EGG, MapColor.COLOR_GRAY);
    public static final RegistryEntry<EggBlock> DONKEY_EGG = register("donkey_egg", Items.DONKEY_SPAWN_EGG, MapColor.COLOR_BROWN);
    public static final RegistryEntry<EggBlock> ENDER_DRAGON_EGG = register("ender_dragon_egg", Items.ENDER_DRAGON_SPAWN_EGG, MapColor.COLOR_BLACK);
    public static final RegistryEntry<EggBlock> ENDERMITE_EGG = register("endermite_egg", Items.ENDERMITE_SPAWN_EGG, MapColor.COLOR_BLACK);
    public static final RegistryEntry<EggBlock> ENDERMAN_EGG = register("enderman_egg", Items.ENDERMAN_SPAWN_EGG, MapColor.COLOR_BLACK);
    public static final RegistryEntry<EggBlock> VEX_EGG = register("vex_egg", Items.VEX_SPAWN_EGG, MapColor.COLOR_BLUE);
    public static final RegistryEntry<EggBlock> BLAZE_EGG = register("blaze_egg", Items.BLAZE_SPAWN_EGG, MapColor.COLOR_YELLOW);
    public static final RegistryEntry<EggBlock> FOX_EGG = register("fox_egg", Items.FOX_SPAWN_EGG, MapColor.COLOR_ORANGE);
    public static final RegistryEntry<EggBlock> FROG_EGG = register("frog_egg", Items.FROG_SPAWN_EGG, MapColor.COLOR_BROWN);
    public static final RegistryEntry<EggBlock> GHAST_EGG = register("ghast_egg", Items.GHAST_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> GLOW_SQUID_EGG = register("glow_squid_egg", Items.GLOW_SQUID_SPAWN_EGG, MapColor.COLOR_BLUE);
    public static final RegistryEntry<EggBlock> GOAT_EGG = register("goat_egg", Items.GOAT_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> GUARDIAN_EGG = register("guardian_egg", Items.GUARDIAN_SPAWN_EGG, MapColor.COLOR_GRAY);
    public static final RegistryEntry<EggBlock> ELDER_GUARDIAN_EGG = register("elder_guardian_egg", Items.ELDER_GUARDIAN_SPAWN_EGG, MapColor.COLOR_GRAY);
    public static final RegistryEntry<EggBlock> HOGLIN_EGG = register("hoglin_egg", Items.HOGLIN_SPAWN_EGG, MapColor.COLOR_BROWN);
    public static final RegistryEntry<EggBlock> HORSE_EGG = register("horse_egg", Items.HORSE_SPAWN_EGG, MapColor.COLOR_BROWN);
    public static final RegistryEntry<EggBlock> IRON_GOLEM_EGG = register("iron_golem_egg", Items.IRON_GOLEM_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> LLAMA_EGG = register("llama_egg", Items.LLAMA_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> MAGMA_CUBE_EGG = register("magma_cube_egg", Items.MAGMA_CUBE_SPAWN_EGG, MapColor.COLOR_RED);
    public static final RegistryEntry<EggBlock> MULE_EGG = register("mule_egg", Items.MULE_SPAWN_EGG, MapColor.COLOR_BROWN);
    public static final RegistryEntry<EggBlock> MOOSHROOM_EGG = register("mooshroom_egg", Items.MOOSHROOM_SPAWN_EGG, MapColor.COLOR_RED);
    public static final RegistryEntry<EggBlock> OCELOT_EGG = register("ocelot_egg", Items.OCELOT_SPAWN_EGG, MapColor.COLOR_YELLOW);
    public static final RegistryEntry<EggBlock> PANDA_EGG = register("panda_egg", Items.PANDA_SPAWN_EGG, MapColor.COLOR_BLACK);
    public static final RegistryEntry<EggBlock> PARROT_EGG = register("parrot_egg", Items.PARROT_SPAWN_EGG, MapColor.COLOR_RED);
    public static final RegistryEntry<EggBlock> PHANTOM_EGG = register("phantom_egg", Items.PHANTOM_SPAWN_EGG, MapColor.COLOR_BLUE);
    public static final RegistryEntry<EggBlock> PIG_EGG = register("pig_egg", Items.PIG_SPAWN_EGG, MapColor.COLOR_PINK);
    public static final RegistryEntry<EggBlock> PIGLIN_EGG = register("piglin_egg", Items.PIGLIN_SPAWN_EGG, MapColor.COLOR_PINK);
    public static final RegistryEntry<EggBlock> PUFFERFISH_EGG = register("pufferfish_egg", Items.PUFFERFISH_SPAWN_EGG, MapColor.COLOR_PINK);
    public static final RegistryEntry<EggBlock> RABBIT_EGG = register("rabbit_egg", Items.RABBIT_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> VINDICATOR_EGG = register("vindicator_egg", Items.VINDICATOR_SPAWN_EGG, MapColor.COLOR_GRAY);
    public static final RegistryEntry<EggBlock> PILLAGER_EGG = register("pillager_egg", Items.PILLAGER_SPAWN_EGG, MapColor.COLOR_GRAY);
    public static final RegistryEntry<EggBlock> SALMON_EGG = register("salmon_egg", Items.SALMON_SPAWN_EGG, MapColor.COLOR_ORANGE);
    public static final RegistryEntry<EggBlock> SHULKER_EGG = register("shulker_egg", Items.SHULKER_SPAWN_EGG, MapColor.COLOR_PURPLE);
    public static final RegistryEntry<EggBlock> SILVERFISH_EGG = register("silverfish_egg", Items.SILVERFISH_SPAWN_EGG, MapColor.COLOR_GRAY);
    public static final RegistryEntry<EggBlock> SKELETON_HORSE_EGG = register("skeleton_horse_egg", Items.SKELETON_HORSE_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> SLIME_EGG = register("slime_egg", Items.SLIME_SPAWN_EGG, MapColor.COLOR_GREEN);
    public static final RegistryEntry<EggBlock> SNIFFER_EGG = register("sniffer_egg", Items.SNIFFER_SPAWN_EGG, MapColor.COLOR_RED);
    public static final RegistryEntry<EggBlock> SNOW_GOLEM_EGG = register("snow_golem_egg", Items.SNOW_GOLEM_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> SPIDER_EGG = register("spider_egg", Items.SPIDER_SPAWN_EGG, MapColor.COLOR_BLACK);
    public static final RegistryEntry<EggBlock> SQUID_EGG = register("squid_egg", Items.SQUID_SPAWN_EGG, MapColor.COLOR_BLUE);
    public static final RegistryEntry<EggBlock> STRIDER_EGG = register("strider_egg", Items.STRIDER_SPAWN_EGG, MapColor.COLOR_PURPLE);
    public static final RegistryEntry<EggBlock> EVOKER_EGG = register("evoker_egg", Items.EVOKER_SPAWN_EGG, MapColor.COLOR_GRAY);
    //public static final RegistryEntry<EggBlock> BOGGED_EGG = register("bogged_egg", Items.BOGGED_SPAWN_EGG, MapColor.COLOR_GRAY);
    public static final RegistryEntry<EggBlock> TADPOLE_EGG = register("tadpole_egg", Items.TADPOLE_SPAWN_EGG, MapColor.COLOR_BROWN);
    public static final RegistryEntry<EggBlock> TURTLE_EGG = register("turtle_egg", Items.TURTLE_SPAWN_EGG, MapColor.COLOR_GREEN);
    public static final RegistryEntry<EggBlock> WANDERING_TRADER_EGG = register("wandering_trader_egg", Items.WANDERING_TRADER_SPAWN_EGG, MapColor.COLOR_BLUE);
    public static final RegistryEntry<EggBlock> VILLAGER_EGG = register("villager_egg", Items.VILLAGER_SPAWN_EGG, MapColor.COLOR_BROWN);
    public static final RegistryEntry<EggBlock> WARDEN_EGG = register("warden_egg", Items.WARDEN_SPAWN_EGG, MapColor.COLOR_GREEN);
    public static final RegistryEntry<EggBlock> WITHER_EGG = register("wither_egg", Items.WITHER_SPAWN_EGG, MapColor.COLOR_BLACK);
    public static final RegistryEntry<EggBlock> WITCH_EGG = register("witch_egg", Items.WITCH_SPAWN_EGG, MapColor.COLOR_PURPLE);
    public static final RegistryEntry<EggBlock> WOLF_EGG = register("wolf_egg", Items.WOLF_SPAWN_EGG, MapColor.TERRACOTTA_WHITE);
    public static final RegistryEntry<EggBlock> ZOGLIN_EGG = register("zoglin_egg", Items.ZOGLIN_SPAWN_EGG, MapColor.COLOR_PINK);
    public static final RegistryEntry<EggBlock> ZOMBIE_EGG = register("zombie_egg", Items.ZOMBIE_SPAWN_EGG, MapColor.COLOR_GREEN);
    public static final RegistryEntry<EggBlock> ZOMBIE_HORSE_EGG = register("zombie_horse_egg", Items.ZOMBIE_HORSE_SPAWN_EGG, MapColor.COLOR_GREEN);
    public static final RegistryEntry<EggBlock> ZOMBIFIED_PIGLIN_EGG = register("zombified_piglin_egg", Items.ZOMBIFIED_PIGLIN_SPAWN_EGG, MapColor.COLOR_PINK);
    public static final RegistryEntry<EggBlock> ZOMBIE_VILLAGER_EGG = register("zombie_villager_egg", Items.ZOMBIE_VILLAGER_SPAWN_EGG, MapColor.COLOR_GREEN);
//    public static final RegistryEntry<EggBlock> CREAKING_EGG = register("creaking_egg", Items.CREAKING_SPAWN_EGG, MapColor.COLOR_GRAY);

    private static RegistryEntry<EggBlock> register(String id, ItemLike eggDrop, MapColor mapColor) {
        return BLOCKS.register(
                id,
                () -> new EggBlock(
                        BlockBehaviour.Properties.of().mapColor(mapColor).strength(0.5F).sound(SoundType.METAL).noOcclusion(),
                        eggDrop
                )
        );
    }

    public static void register() {
        BLOCKS.register();
    }
}
