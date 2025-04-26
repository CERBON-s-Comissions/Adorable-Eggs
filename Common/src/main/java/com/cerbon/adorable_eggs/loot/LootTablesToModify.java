package com.cerbon.adorable_eggs.loot;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class LootTablesToModify {
    public static final String ALLAY = "minecraft:entities/allay";
    public static final String ARMADILLO = "minecraft:entities/armadillo";
    public static final String BREEZE = "minecraft:entities/breeze";
    public static final String CAMEL = "minecraft:entities/camel";
    public static final String CAT = "minecraft:entities/cat";
    public static final String CREAKING = "minecraft:entities/creaking";
    public static final String DOLPHIN = "minecraft:entities/dolphin";
    public static final String ELDER_GUARDIAN = "minecraft:entities/elder_guardian";
    public static final String ENDERMITE = "minecraft:entities/endermite";
    public static final String EVOKER = "minecraft:entities/evoker";
    public static final String FOX = "minecraft:entities/fox";
    public static final String IRON_GOLEM = "minecraft:entities/iron_golem";
    public static final String PANDA = "minecraft:entities/panda";
    public static final String POLAR_BEAR = "minecraft:entities/polar_bear";
    public static final String PUFFERFISH = "minecraft:entities/pufferfish";
    public static final String RAVAGER = "minecraft:entities/ravager";
    public static final String SKELETON_HORSE = "minecraft:entities/skeleton_horse";
    public static final String SNIFFER = "minecraft:entities/sniffer";
    public static final String STRIDER = "minecraft:entities/strider";
    public static final String TRADER_LLAMA = "minecraft:entities/trader_llama";
    public static final String WANDERING_TRADER = "minecraft:entities/wandering_trader";
    public static final String WARDEN = "minecraft:entities/warden";
    public static final String ENDER_DRAGON = "minecraft:entities/ender_dragon";
    public static final String WITHER = "minecraft:entities/wither";
    public static final String ZOGLIN = "minecraft:entities/zoglin";
    public static final String ZOMBIE_HORSE = "minecraft:entities/zombie_horse";
    public static final String AXOLOTL             = "minecraft:entities/axolotl";
    public static final String TADPOLE             = "minecraft:entities/tadpole";
    public static final String BAT                 = "minecraft:entities/bat";
    public static final String BEE                 = "minecraft:entities/bee";
    public static final String BOGGED              = "minecraft:entities/bogged";
    public static final String DONKEY              = "minecraft:entities/donkey";
    public static final String FROG                = "minecraft:entities/frog";
    public static final String GHAST               = "minecraft:entities/ghast";
    public static final String GLOW_SQUID          = "minecraft:entities/glow_squid";
    public static final String GOAT                = "minecraft:entities/goat";
    public static final String GUARDIAN            = "minecraft:entities/guardian";
    public static final String HOGLIN              = "minecraft:entities/hoglin";
    public static final String HORSE               = "minecraft:entities/horse";
    public static final String LLAMA               = "minecraft:entities/llama";
    public static final String MOOSHROOM           = "minecraft:entities/mooshroom";
    public static final String MULE                = "minecraft:entities/mule";
    public static final String OCELOT              = "minecraft:entities/ocelot";
    public static final String PARROT              = "minecraft:entities/parrot";
    public static final String PHANTOM             = "minecraft:entities/phantom";
    public static final String RABBIT              = "minecraft:entities/rabbit";
    public static final String SHULKER             = "minecraft:entities/shulker";
    public static final String SNOW_GOLEM          = "minecraft:entities/snow_golem";
    public static final String STRAY               = "minecraft:entities/stray";
    public static final String TROPICAL_FISH       = "minecraft:entities/tropical_fish";
    public static final String TURTLE              = "minecraft:entities/turtle";
    public static final String VEX                 = "minecraft:entities/vex";
    public static final String VILLAGER            = "minecraft:entities/villager";
    public static final String WOLF                = "minecraft:entities/wolf";
    public static final String COD                 = "minecraft:entities/cod";
    public static final String SALMON              = "minecraft:entities/salmon";
    public static final String BLAZE               = "minecraft:entities/blaze";
    public static final String CAVE_SPIDER         = "minecraft:entities/cave_spider";
    public static final String HUSK                = "minecraft:entities/husk";
    public static final String PIGLIN_BRUTE        = "minecraft:entities/piglin_brute";
    public static final String PILLAGER            = "minecraft:entities/pillager";
    public static final String SILVERFISH          = "minecraft:entities/silverfish";
    public static final String SQUID               = "minecraft:entities/squid";
    public static final String VINDICATOR          = "minecraft:entities/vindicator";
    public static final String WITCH               = "minecraft:entities/witch";
    public static final String WITHER_SKELETON     = "minecraft:entities/wither_skeleton";
    public static final String ZOMBIE_VILLAGER     = "minecraft:entities/zombie_villager";
    public static final String DROWNED             = "minecraft:entities/drowned";
    public static final String ENDERMAN            = "minecraft:entities/enderman";
    public static final String PIGLIN              = "minecraft:entities/piglin";
    public static final String ZOMBIFIED_PIGLIN    = "minecraft:entities/zombified_piglin";
    public static final String CHICKEN             = "minecraft:entities/chicken";
    public static final String COW                 = "minecraft:entities/cow";
    public static final String CREEPER             = "minecraft:entities/creeper";
    public static final String MAGMA_CUBE          = "minecraft:entities/magma_cube";
    public static final String PIG                 = "minecraft:entities/pig";
    public static final String SLIME               = "minecraft:entities/slime";
    public static final String SPIDER              = "minecraft:entities/spider";
    public static final String ZOMBIE              = "minecraft:entities/zombie";
    public static final String SKELETON            = "minecraft:entities/skeleton";
    public static final String SHEEP               = "minecraft:entities/sheep";
    
    public static Map<String, Float> DROP_CHANCE_MAP = ImmutableMap.<String, Float>builder()
            .put(ALLAY,             AdorableEggs.config.allayEggDropChance)
            .put(ARMADILLO,         AdorableEggs.config.armadilloEggDropChance)
            .put(BREEZE,            AdorableEggs.config.breezeEggDropChance)
            .put(CAMEL,             AdorableEggs.config.camelEggDropChance)
            .put(CAT,               AdorableEggs.config.catEggDropChance)
            .put(CREAKING,          AdorableEggs.config.creakingEggDropChance)
            .put(DOLPHIN,           AdorableEggs.config.dolphinEggDropChance)
            .put(ELDER_GUARDIAN,    AdorableEggs.config.elderGuardianEggDropChance)
            .put(ENDERMITE,         AdorableEggs.config.endermiteEggDropChance)
            .put(EVOKER,            AdorableEggs.config.evokerEggDropChance)
            .put(FOX,               AdorableEggs.config.foxEggDropChance)
            .put(IRON_GOLEM,        AdorableEggs.config.ironGolemEggDropChance)
            .put(PANDA,             AdorableEggs.config.pandaEggDropChance)
            .put(POLAR_BEAR,        AdorableEggs.config.polarBearEggDropChance)
            .put(PUFFERFISH,        AdorableEggs.config.pufferfishEggDropChance)
            .put(RAVAGER,           AdorableEggs.config.ravagerEggDropChance)
            .put(SKELETON_HORSE,    AdorableEggs.config.skeletonHorseEggDropChance)
            .put(SNIFFER,           AdorableEggs.config.snifferEggDropChance)
            .put(STRIDER,           AdorableEggs.config.striderEggDropChance)
            .put(TRADER_LLAMA,      AdorableEggs.config.traderLlamaEggDropChance)
            .put(WANDERING_TRADER,  AdorableEggs.config.wanderingTraderEggDropChance)
            .put(WARDEN,            AdorableEggs.config.wardenEggDropChance)
            .put(ENDER_DRAGON,      AdorableEggs.config.enderDragonEggDropChance)
            .put(WITHER,            AdorableEggs.config.witherEggDropChance)
            .put(ZOGLIN,            AdorableEggs.config.zoglinEggDropChance)
            .put(ZOMBIE_HORSE,      AdorableEggs.config.zombieHorseEggDropChance)
            .put(AXOLOTL,           AdorableEggs.config.axolotlEggDropChance)
            .put(TADPOLE,           AdorableEggs.config.tadpoleEggDropChance)
            .put(BAT,               AdorableEggs.config.batEggDropChance)
            .put(BEE,               AdorableEggs.config.beeEggDropChance)
            .put(BOGGED,            AdorableEggs.config.boggedEggDropChance)
            .put(DONKEY,            AdorableEggs.config.donkeyEggDropChance)
            .put(FROG,              AdorableEggs.config.frogEggDropChance)
            .put(GHAST,             AdorableEggs.config.ghastEggDropChance)
            .put(GLOW_SQUID,        AdorableEggs.config.glowSquidEggDropChance)
            .put(GOAT,              AdorableEggs.config.goatEggDropChance)
            .put(GUARDIAN,          AdorableEggs.config.guardianEggDropChance)
            .put(HOGLIN,            AdorableEggs.config.hoglinEggDropChance)
            .put(HORSE,             AdorableEggs.config.horseEggDropChance)
            .put(LLAMA,             AdorableEggs.config.llamaEggDropChance)
            .put(MOOSHROOM,         AdorableEggs.config.mooshroomEggDropChance)
            .put(MULE,              AdorableEggs.config.muleEggDropChance)
            .put(OCELOT,            AdorableEggs.config.ocelotEggDropChance)
            .put(PARROT,            AdorableEggs.config.parrotEggDropChance)
            .put(PHANTOM,           AdorableEggs.config.phantomEggDropChance)
            .put(RABBIT,            AdorableEggs.config.rabbitEggDropChance)
            .put(SHULKER,           AdorableEggs.config.shulkerEggDropChance)
            .put(SNOW_GOLEM,        AdorableEggs.config.snowGolemEggDropChance)
            .put(STRAY,             AdorableEggs.config.strayEggDropChance)
            .put(TROPICAL_FISH,     AdorableEggs.config.tropicalFishEggDropChance)
            .put(TURTLE,            AdorableEggs.config.turtleEggDropChance)
            .put(VEX,               AdorableEggs.config.vexEggDropChance)
            .put(VILLAGER,          AdorableEggs.config.villagerEggDropChance)
            .put(WOLF,              AdorableEggs.config.wolfEggDropChance)
            .put(COD,               AdorableEggs.config.codEggDropChance)
            .put(SALMON,            AdorableEggs.config.salmonEggDropChance)
            .put(BLAZE,             AdorableEggs.config.blazeEggDropChance)
            .put(CAVE_SPIDER,       AdorableEggs.config.caveSpiderEggDropChance)
            .put(HUSK,              AdorableEggs.config.huskEggDropChance)
            .put(PIGLIN_BRUTE,      AdorableEggs.config.piglinBruteEggDropChance)
            .put(PILLAGER,          AdorableEggs.config.pillagerEggDropChance)
            .put(SILVERFISH,        AdorableEggs.config.silverfishEggDropChance)
            .put(SQUID,             AdorableEggs.config.squidEggDropChance)
            .put(VINDICATOR,        AdorableEggs.config.vindicatorEggDropChance)
            .put(WITCH,             AdorableEggs.config.witchEggDropChance)
            .put(WITHER_SKELETON,   AdorableEggs.config.witherSkeletonEggDropChance)
            .put(ZOMBIE_VILLAGER,   AdorableEggs.config.zombieVillagerEggDropChance)
            .put(DROWNED,           AdorableEggs.config.drownedEggDropChance)
            .put(ENDERMAN,          AdorableEggs.config.endermanEggDropChance)
            .put(PIGLIN,            AdorableEggs.config.piglinEggDropChance)
            .put(ZOMBIFIED_PIGLIN,  AdorableEggs.config.zombifiedPiglinEggDropChance)
            .put(CHICKEN,           AdorableEggs.config.chickenEggDropChance)
            .put(COW,               AdorableEggs.config.cowEggDropChance)
            .put(CREEPER,           AdorableEggs.config.creeperEggDropChance)
            .put(MAGMA_CUBE,        AdorableEggs.config.magmaCubeEggDropChance)
            .put(PIG,               AdorableEggs.config.pigEggDropChance)
            .put(SLIME,             AdorableEggs.config.slimeEggDropChance)
            .put(SPIDER,            AdorableEggs.config.spiderEggDropChance)
            .put(ZOMBIE,            AdorableEggs.config.zombieEggDropChance)
            .put(SKELETON,          AdorableEggs.config.skeletonEggDropChance)
            .put(SHEEP,             AdorableEggs.config.sheepEggDropChance)
            .build();
}
