package com.cerbon.adorable_eggs.fabric.loot;

import com.cerbon.adorable_eggs.loot.LootTablesToModify;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;

public class ADELootModifiersFabric {

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceKey, builder, lootTableSource, provider) -> {
            switch (resourceKey.location().toString()) {
                case LootTablesToModify.ALLAY               -> buildLootTable(Items.ALLAY_SPAWN_EGG,           LootTablesToModify.ALLAY,               builder);
                case LootTablesToModify.ARMADILLO           -> buildLootTable(Items.ARMADILLO_SPAWN_EGG,       LootTablesToModify.ARMADILLO,           builder);
                case LootTablesToModify.BREEZE              -> buildLootTable(Items.BREEZE_SPAWN_EGG,          LootTablesToModify.BREEZE,              builder);
                case LootTablesToModify.CAMEL               -> buildLootTable(Items.CAMEL_SPAWN_EGG,           LootTablesToModify.CAMEL,               builder);
                case LootTablesToModify.CAT                 -> buildLootTable(Items.CAT_SPAWN_EGG,             LootTablesToModify.CAT,                 builder);
                case LootTablesToModify.CREAKING            -> buildLootTable(Items.CREAKING_SPAWN_EGG,        LootTablesToModify.CREAKING,            builder);
                case LootTablesToModify.DOLPHIN             -> buildLootTable(Items.DOLPHIN_SPAWN_EGG,         LootTablesToModify.DOLPHIN,             builder);
                case LootTablesToModify.ELDER_GUARDIAN      -> buildLootTable(Items.ELDER_GUARDIAN_SPAWN_EGG,  LootTablesToModify.ELDER_GUARDIAN,      builder);
                case LootTablesToModify.ENDERMITE           -> buildLootTable(Items.ENDERMITE_SPAWN_EGG,       LootTablesToModify.ENDERMITE,           builder);
                case LootTablesToModify.EVOKER              -> buildLootTable(Items.EVOKER_SPAWN_EGG,          LootTablesToModify.EVOKER,              builder);
                case LootTablesToModify.FOX                 -> buildLootTable(Items.FOX_SPAWN_EGG,             LootTablesToModify.FOX,                 builder);
                case LootTablesToModify.IRON_GOLEM          -> buildLootTable(Items.IRON_GOLEM_SPAWN_EGG,      LootTablesToModify.IRON_GOLEM,          builder);
                case LootTablesToModify.PANDA               -> buildLootTable(Items.PANDA_SPAWN_EGG,           LootTablesToModify.PANDA,               builder);
                case LootTablesToModify.POLAR_BEAR          -> buildLootTable(Items.POLAR_BEAR_SPAWN_EGG,      LootTablesToModify.POLAR_BEAR,          builder);
                case LootTablesToModify.PUFFERFISH          -> buildLootTable(Items.PUFFERFISH_SPAWN_EGG,      LootTablesToModify.PUFFERFISH,          builder);
                case LootTablesToModify.RAVAGER             -> buildLootTable(Items.RAVAGER_SPAWN_EGG,         LootTablesToModify.RAVAGER,             builder);
                case LootTablesToModify.SKELETON_HORSE      -> buildLootTable(Items.SKELETON_HORSE_SPAWN_EGG,  LootTablesToModify.SKELETON_HORSE,      builder);
                case LootTablesToModify.SNIFFER             -> buildLootTable(Items.SNIFFER_SPAWN_EGG,         LootTablesToModify.SNIFFER,             builder);
                case LootTablesToModify.STRIDER             -> buildLootTable(Items.STRIDER_SPAWN_EGG,         LootTablesToModify.STRIDER,             builder);
                case LootTablesToModify.TRADER_LLAMA        -> buildLootTable(Items.TRADER_LLAMA_SPAWN_EGG,    LootTablesToModify.TRADER_LLAMA,        builder);
                case LootTablesToModify.WANDERING_TRADER    -> buildLootTable(Items.WANDERING_TRADER_SPAWN_EGG,LootTablesToModify.WANDERING_TRADER,    builder);
                case LootTablesToModify.WARDEN              -> buildLootTable(Items.WARDEN_SPAWN_EGG,          LootTablesToModify.WARDEN,              builder);
                case LootTablesToModify.ENDER_DRAGON        -> buildLootTable(Items.ENDER_DRAGON_SPAWN_EGG,    LootTablesToModify.ENDER_DRAGON,        builder);
                case LootTablesToModify.WITHER              -> buildLootTable(Items.WITHER_SPAWN_EGG,          LootTablesToModify.WITHER,              builder);
                case LootTablesToModify.ZOGLIN              -> buildLootTable(Items.ZOGLIN_SPAWN_EGG,          LootTablesToModify.ZOGLIN,              builder);
                case LootTablesToModify.ZOMBIE_HORSE        -> buildLootTable(Items.ZOMBIE_HORSE_SPAWN_EGG,    LootTablesToModify.ZOMBIE_HORSE,        builder);
                case LootTablesToModify.AXOLOTL             -> buildLootTable(Items.AXOLOTL_SPAWN_EGG,         LootTablesToModify.AXOLOTL,             builder);
                case LootTablesToModify.TADPOLE             -> buildLootTable(Items.TADPOLE_SPAWN_EGG,         LootTablesToModify.TADPOLE,             builder);
                case LootTablesToModify.BAT                 -> buildLootTable(Items.BAT_SPAWN_EGG,             LootTablesToModify.BAT,                 builder);
                case LootTablesToModify.BEE                 -> buildLootTable(Items.BEE_SPAWN_EGG,             LootTablesToModify.BEE,                 builder);
                case LootTablesToModify.BOGGED              -> buildLootTable(Items.BOGGED_SPAWN_EGG,          LootTablesToModify.BOGGED,              builder);
                case LootTablesToModify.DONKEY              -> buildLootTable(Items.DONKEY_SPAWN_EGG,          LootTablesToModify.DONKEY,              builder);
                case LootTablesToModify.FROG                -> buildLootTable(Items.FROG_SPAWN_EGG,            LootTablesToModify.FROG,                builder);
                case LootTablesToModify.GHAST               -> buildLootTable(Items.GHAST_SPAWN_EGG,           LootTablesToModify.GHAST,               builder);
                case LootTablesToModify.GLOW_SQUID          -> buildLootTable(Items.GLOW_SQUID_SPAWN_EGG,      LootTablesToModify.GLOW_SQUID,          builder);
                case LootTablesToModify.GOAT                -> buildLootTable(Items.GOAT_SPAWN_EGG,            LootTablesToModify.GOAT,                builder);
                case LootTablesToModify.GUARDIAN            -> buildLootTable(Items.GUARDIAN_SPAWN_EGG,        LootTablesToModify.GUARDIAN,            builder);
                case LootTablesToModify.HOGLIN              -> buildLootTable(Items.HOGLIN_SPAWN_EGG,          LootTablesToModify.HOGLIN,              builder);
                case LootTablesToModify.HORSE               -> buildLootTable(Items.HORSE_SPAWN_EGG,           LootTablesToModify.HORSE,               builder);
                case LootTablesToModify.LLAMA               -> buildLootTable(Items.LLAMA_SPAWN_EGG,           LootTablesToModify.LLAMA,               builder);
                case LootTablesToModify.MOOSHROOM           -> buildLootTable(Items.MOOSHROOM_SPAWN_EGG,       LootTablesToModify.MOOSHROOM,           builder);
                case LootTablesToModify.MULE                -> buildLootTable(Items.MULE_SPAWN_EGG,            LootTablesToModify.MULE,                builder);
                case LootTablesToModify.OCELOT              -> buildLootTable(Items.OCELOT_SPAWN_EGG,          LootTablesToModify.OCELOT,              builder);
                case LootTablesToModify.PARROT              -> buildLootTable(Items.PARROT_SPAWN_EGG,          LootTablesToModify.PARROT,              builder);
                case LootTablesToModify.PHANTOM             -> buildLootTable(Items.PHANTOM_SPAWN_EGG,         LootTablesToModify.PHANTOM,             builder);
                case LootTablesToModify.RABBIT              -> buildLootTable(Items.RABBIT_SPAWN_EGG,          LootTablesToModify.RABBIT,              builder);
                case LootTablesToModify.SHULKER             -> buildLootTable(Items.SHULKER_SPAWN_EGG,         LootTablesToModify.SHULKER,             builder);
                case LootTablesToModify.SNOW_GOLEM          -> buildLootTable(Items.SNOW_GOLEM_SPAWN_EGG,      LootTablesToModify.SNOW_GOLEM,          builder);
                case LootTablesToModify.STRAY               -> buildLootTable(Items.STRAY_SPAWN_EGG,           LootTablesToModify.STRAY,               builder);
                case LootTablesToModify.TROPICAL_FISH       -> buildLootTable(Items.TROPICAL_FISH_SPAWN_EGG,   LootTablesToModify.TROPICAL_FISH,       builder);
                case LootTablesToModify.TURTLE              -> buildLootTable(Items.TURTLE_SPAWN_EGG,          LootTablesToModify.TURTLE,              builder);
                case LootTablesToModify.VEX                 -> buildLootTable(Items.VEX_SPAWN_EGG,             LootTablesToModify.VEX,                 builder);
                case LootTablesToModify.VILLAGER            -> buildLootTable(Items.VILLAGER_SPAWN_EGG,        LootTablesToModify.VILLAGER,            builder);
                case LootTablesToModify.WOLF                -> buildLootTable(Items.WOLF_SPAWN_EGG,            LootTablesToModify.WOLF,                builder);
                case LootTablesToModify.COD                 -> buildLootTable(Items.COD_SPAWN_EGG,             LootTablesToModify.COD,                 builder);
                case LootTablesToModify.SALMON              -> buildLootTable(Items.SALMON_SPAWN_EGG,          LootTablesToModify.SALMON,              builder);
                case LootTablesToModify.BLAZE               -> buildLootTable(Items.BLAZE_SPAWN_EGG,           LootTablesToModify.BLAZE,               builder);
                case LootTablesToModify.CAVE_SPIDER         -> buildLootTable(Items.CAVE_SPIDER_SPAWN_EGG,     LootTablesToModify.CAVE_SPIDER,         builder);
                case LootTablesToModify.HUSK                -> buildLootTable(Items.HUSK_SPAWN_EGG,            LootTablesToModify.HUSK,                builder);
                case LootTablesToModify.PIGLIN_BRUTE        -> buildLootTable(Items.PIGLIN_BRUTE_SPAWN_EGG,    LootTablesToModify.PIGLIN_BRUTE,        builder);
                case LootTablesToModify.PILLAGER            -> buildLootTable(Items.PILLAGER_SPAWN_EGG,        LootTablesToModify.PILLAGER,            builder);
                case LootTablesToModify.SILVERFISH          -> buildLootTable(Items.SILVERFISH_SPAWN_EGG,      LootTablesToModify.SILVERFISH,          builder);
                case LootTablesToModify.SQUID               -> buildLootTable(Items.SQUID_SPAWN_EGG,           LootTablesToModify.SQUID,               builder);
                case LootTablesToModify.VINDICATOR          -> buildLootTable(Items.VINDICATOR_SPAWN_EGG,      LootTablesToModify.VINDICATOR,          builder);
                case LootTablesToModify.WITCH               -> buildLootTable(Items.WITCH_SPAWN_EGG,           LootTablesToModify.WITCH,               builder);
                case LootTablesToModify.WITHER_SKELETON     -> buildLootTable(Items.WITHER_SKELETON_SPAWN_EGG, LootTablesToModify.WITHER_SKELETON,     builder);
                case LootTablesToModify.ZOMBIE_VILLAGER     -> buildLootTable(Items.ZOMBIE_VILLAGER_SPAWN_EGG, LootTablesToModify.ZOMBIE_VILLAGER,     builder);
                case LootTablesToModify.DROWNED             -> buildLootTable(Items.DROWNED_SPAWN_EGG,         LootTablesToModify.DROWNED,             builder);
                case LootTablesToModify.ENDERMAN            -> buildLootTable(Items.ENDERMAN_SPAWN_EGG,        LootTablesToModify.ENDERMAN,            builder);
                case LootTablesToModify.PIGLIN              -> buildLootTable(Items.PIGLIN_SPAWN_EGG,          LootTablesToModify.PIGLIN,              builder);
                case LootTablesToModify.ZOMBIFIED_PIGLIN    -> buildLootTable(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG,LootTablesToModify.ZOMBIFIED_PIGLIN,    builder);
                case LootTablesToModify.CHICKEN             -> buildLootTable(Items.CHICKEN_SPAWN_EGG,         LootTablesToModify.CHICKEN,             builder);
                case LootTablesToModify.COW                 -> buildLootTable(Items.COW_SPAWN_EGG,             LootTablesToModify.COW,                 builder);
                case LootTablesToModify.CREEPER             -> buildLootTable(Items.CREEPER_SPAWN_EGG,         LootTablesToModify.CREEPER,             builder);
                case LootTablesToModify.MAGMA_CUBE          -> buildLootTable(Items.MAGMA_CUBE_SPAWN_EGG,      LootTablesToModify.MAGMA_CUBE,          builder);
                case LootTablesToModify.PIG                 -> buildLootTable(Items.PIG_SPAWN_EGG,             LootTablesToModify.PIG,                 builder);
                case LootTablesToModify.SLIME               -> buildLootTable(Items.SLIME_SPAWN_EGG,           LootTablesToModify.SLIME,               builder);
                case LootTablesToModify.SPIDER              -> buildLootTable(Items.SPIDER_SPAWN_EGG,          LootTablesToModify.SPIDER,              builder);
                case LootTablesToModify.ZOMBIE              -> buildLootTable(Items.ZOMBIE_SPAWN_EGG,          LootTablesToModify.ZOMBIE,              builder);
                case LootTablesToModify.SKELETON            -> buildLootTable(Items.SKELETON_SPAWN_EGG,        LootTablesToModify.SKELETON,            builder);
                case LootTablesToModify.SHEEP               -> buildLootTable(Items.SHEEP_SPAWN_EGG,           LootTablesToModify.SHEEP,               builder);
            }
        });
    }

    private static void buildLootTable(Item eggDrop, String lootTableKey, LootTable.Builder tableBuilder) {
        float dropChance = LootTablesToModify
                .DROP_CHANCE_MAP
                .getOrDefault(lootTableKey, 0f);

        LootPool.Builder pool = LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1))
                .conditionally(LootItemRandomChanceCondition.randomChance(dropChance).build());

        pool.with(LootItem.lootTableItem(eggDrop).setWeight(1).build())
                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1)));

        tableBuilder.pool(pool.build());
    }
}
