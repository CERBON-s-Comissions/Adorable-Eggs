package com.cerbon.adorable_eggs.fabric.loot;

import com.cerbon.adorable_eggs.loot.LootTablesToModify;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
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
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            switch (id.toString()) {
                case LootTablesToModify.ALLAY               -> buildLootTable(Items.ALLAY_SPAWN_EGG,           LootTablesToModify.ALLAY,               tableBuilder);
                //case LootTablesToModify.ARMADILLO           -> buildLootTable(Items.ARMADILLO_SPAWN_EGG,       LootTablesToModify.ARMADILLO,           tableBuilder);
                //case LootTablesToModify.BREEZE              -> buildLootTable(Items.BREEZE_SPAWN_EGG,          LootTablesToModify.BREEZE,              tableBuilder);
                case LootTablesToModify.CAMEL               -> buildLootTable(Items.CAMEL_SPAWN_EGG,           LootTablesToModify.CAMEL,               tableBuilder);
                case LootTablesToModify.CAT                 -> buildLootTable(Items.CAT_SPAWN_EGG,             LootTablesToModify.CAT,                 tableBuilder);
                //case LootTablesToModify.CREAKING            -> buildLootTable(Items.CREAKING_SPAWN_EGG,        LootTablesToModify.CREAKING,            tableBuilder);
                case LootTablesToModify.DOLPHIN             -> buildLootTable(Items.DOLPHIN_SPAWN_EGG,         LootTablesToModify.DOLPHIN,             tableBuilder);
                case LootTablesToModify.ELDER_GUARDIAN      -> buildLootTable(Items.ELDER_GUARDIAN_SPAWN_EGG,  LootTablesToModify.ELDER_GUARDIAN,      tableBuilder);
                case LootTablesToModify.ENDERMITE           -> buildLootTable(Items.ENDERMITE_SPAWN_EGG,       LootTablesToModify.ENDERMITE,           tableBuilder);
                case LootTablesToModify.EVOKER              -> buildLootTable(Items.EVOKER_SPAWN_EGG,          LootTablesToModify.EVOKER,              tableBuilder);
                case LootTablesToModify.FOX                 -> buildLootTable(Items.FOX_SPAWN_EGG,             LootTablesToModify.FOX,                 tableBuilder);
                case LootTablesToModify.IRON_GOLEM          -> buildLootTable(Items.IRON_GOLEM_SPAWN_EGG,      LootTablesToModify.IRON_GOLEM,          tableBuilder);
                case LootTablesToModify.PANDA               -> buildLootTable(Items.PANDA_SPAWN_EGG,           LootTablesToModify.PANDA,               tableBuilder);
                case LootTablesToModify.POLAR_BEAR          -> buildLootTable(Items.POLAR_BEAR_SPAWN_EGG,      LootTablesToModify.POLAR_BEAR,          tableBuilder);
                case LootTablesToModify.PUFFERFISH          -> buildLootTable(Items.PUFFERFISH_SPAWN_EGG,      LootTablesToModify.PUFFERFISH,          tableBuilder);
                case LootTablesToModify.RAVAGER             -> buildLootTable(Items.RAVAGER_SPAWN_EGG,         LootTablesToModify.RAVAGER,             tableBuilder);
                case LootTablesToModify.SKELETON_HORSE      -> buildLootTable(Items.SKELETON_HORSE_SPAWN_EGG,  LootTablesToModify.SKELETON_HORSE,      tableBuilder);
                case LootTablesToModify.SNIFFER             -> buildLootTable(Items.SNIFFER_SPAWN_EGG,         LootTablesToModify.SNIFFER,             tableBuilder);
                case LootTablesToModify.STRIDER             -> buildLootTable(Items.STRIDER_SPAWN_EGG,         LootTablesToModify.STRIDER,             tableBuilder);
                case LootTablesToModify.TRADER_LLAMA        -> buildLootTable(Items.TRADER_LLAMA_SPAWN_EGG,    LootTablesToModify.TRADER_LLAMA,        tableBuilder);
                case LootTablesToModify.WANDERING_TRADER    -> buildLootTable(Items.WANDERING_TRADER_SPAWN_EGG,LootTablesToModify.WANDERING_TRADER,    tableBuilder);
                case LootTablesToModify.WARDEN              -> buildLootTable(Items.WARDEN_SPAWN_EGG,          LootTablesToModify.WARDEN,              tableBuilder);
                case LootTablesToModify.ENDER_DRAGON        -> buildLootTable(Items.ENDER_DRAGON_SPAWN_EGG,    LootTablesToModify.ENDER_DRAGON,        tableBuilder);
                case LootTablesToModify.WITHER              -> buildLootTable(Items.WITHER_SPAWN_EGG,          LootTablesToModify.WITHER,              tableBuilder);
                case LootTablesToModify.ZOGLIN              -> buildLootTable(Items.ZOGLIN_SPAWN_EGG,          LootTablesToModify.ZOGLIN,              tableBuilder);
                case LootTablesToModify.ZOMBIE_HORSE        -> buildLootTable(Items.ZOMBIE_HORSE_SPAWN_EGG,    LootTablesToModify.ZOMBIE_HORSE,        tableBuilder);
                case LootTablesToModify.AXOLOTL             -> buildLootTable(Items.AXOLOTL_SPAWN_EGG,         LootTablesToModify.AXOLOTL,             tableBuilder);
                case LootTablesToModify.TADPOLE             -> buildLootTable(Items.TADPOLE_SPAWN_EGG,         LootTablesToModify.TADPOLE,             tableBuilder);
                case LootTablesToModify.BAT                 -> buildLootTable(Items.BAT_SPAWN_EGG,             LootTablesToModify.BAT,                 tableBuilder);
                case LootTablesToModify.BEE                 -> buildLootTable(Items.BEE_SPAWN_EGG,             LootTablesToModify.BEE,                 tableBuilder);
                //case LootTablesToModify.BOGGED              -> buildLootTable(Items.BOGGED_SPAWN_EGG,          LootTablesToModify.BOGGED,              tableBuilder);
                case LootTablesToModify.DONKEY              -> buildLootTable(Items.DONKEY_SPAWN_EGG,          LootTablesToModify.DONKEY,              tableBuilder);
                case LootTablesToModify.FROG                -> buildLootTable(Items.FROG_SPAWN_EGG,            LootTablesToModify.FROG,                tableBuilder);
                case LootTablesToModify.GHAST               -> buildLootTable(Items.GHAST_SPAWN_EGG,           LootTablesToModify.GHAST,               tableBuilder);
                case LootTablesToModify.GLOW_SQUID          -> buildLootTable(Items.GLOW_SQUID_SPAWN_EGG,      LootTablesToModify.GLOW_SQUID,          tableBuilder);
                case LootTablesToModify.GOAT                -> buildLootTable(Items.GOAT_SPAWN_EGG,            LootTablesToModify.GOAT,                tableBuilder);
                case LootTablesToModify.GUARDIAN            -> buildLootTable(Items.GUARDIAN_SPAWN_EGG,        LootTablesToModify.GUARDIAN,            tableBuilder);
                case LootTablesToModify.HOGLIN              -> buildLootTable(Items.HOGLIN_SPAWN_EGG,          LootTablesToModify.HOGLIN,              tableBuilder);
                case LootTablesToModify.HORSE               -> buildLootTable(Items.HORSE_SPAWN_EGG,           LootTablesToModify.HORSE,               tableBuilder);
                case LootTablesToModify.LLAMA               -> buildLootTable(Items.LLAMA_SPAWN_EGG,           LootTablesToModify.LLAMA,               tableBuilder);
                case LootTablesToModify.MOOSHROOM           -> buildLootTable(Items.MOOSHROOM_SPAWN_EGG,       LootTablesToModify.MOOSHROOM,           tableBuilder);
                case LootTablesToModify.MULE                -> buildLootTable(Items.MULE_SPAWN_EGG,            LootTablesToModify.MULE,                tableBuilder);
                case LootTablesToModify.OCELOT              -> buildLootTable(Items.OCELOT_SPAWN_EGG,          LootTablesToModify.OCELOT,              tableBuilder);
                case LootTablesToModify.PARROT              -> buildLootTable(Items.PARROT_SPAWN_EGG,          LootTablesToModify.PARROT,              tableBuilder);
                case LootTablesToModify.PHANTOM             -> buildLootTable(Items.PHANTOM_SPAWN_EGG,         LootTablesToModify.PHANTOM,             tableBuilder);
                case LootTablesToModify.RABBIT              -> buildLootTable(Items.RABBIT_SPAWN_EGG,          LootTablesToModify.RABBIT,              tableBuilder);
                case LootTablesToModify.SHULKER             -> buildLootTable(Items.SHULKER_SPAWN_EGG,         LootTablesToModify.SHULKER,             tableBuilder);
                case LootTablesToModify.SNOW_GOLEM          -> buildLootTable(Items.SNOW_GOLEM_SPAWN_EGG,      LootTablesToModify.SNOW_GOLEM,          tableBuilder);
                case LootTablesToModify.STRAY               -> buildLootTable(Items.STRAY_SPAWN_EGG,           LootTablesToModify.STRAY,               tableBuilder);
                case LootTablesToModify.TROPICAL_FISH       -> buildLootTable(Items.TROPICAL_FISH_SPAWN_EGG,   LootTablesToModify.TROPICAL_FISH,       tableBuilder);
                case LootTablesToModify.TURTLE              -> buildLootTable(Items.TURTLE_SPAWN_EGG,          LootTablesToModify.TURTLE,              tableBuilder);
                case LootTablesToModify.VEX                 -> buildLootTable(Items.VEX_SPAWN_EGG,             LootTablesToModify.VEX,                 tableBuilder);
                case LootTablesToModify.VILLAGER            -> buildLootTable(Items.VILLAGER_SPAWN_EGG,        LootTablesToModify.VILLAGER,            tableBuilder);
                case LootTablesToModify.WOLF                -> buildLootTable(Items.WOLF_SPAWN_EGG,            LootTablesToModify.WOLF,                tableBuilder);
                case LootTablesToModify.COD                 -> buildLootTable(Items.COD_SPAWN_EGG,             LootTablesToModify.COD,                 tableBuilder);
                case LootTablesToModify.SALMON              -> buildLootTable(Items.SALMON_SPAWN_EGG,          LootTablesToModify.SALMON,              tableBuilder);
                case LootTablesToModify.BLAZE               -> buildLootTable(Items.BLAZE_SPAWN_EGG,           LootTablesToModify.BLAZE,               tableBuilder);
                case LootTablesToModify.CAVE_SPIDER         -> buildLootTable(Items.CAVE_SPIDER_SPAWN_EGG,     LootTablesToModify.CAVE_SPIDER,         tableBuilder);
                case LootTablesToModify.HUSK                -> buildLootTable(Items.HUSK_SPAWN_EGG,            LootTablesToModify.HUSK,                tableBuilder);
                case LootTablesToModify.PIGLIN_BRUTE        -> buildLootTable(Items.PIGLIN_BRUTE_SPAWN_EGG,    LootTablesToModify.PIGLIN_BRUTE,        tableBuilder);
                case LootTablesToModify.PILLAGER            -> buildLootTable(Items.PILLAGER_SPAWN_EGG,        LootTablesToModify.PILLAGER,            tableBuilder);
                case LootTablesToModify.SILVERFISH          -> buildLootTable(Items.SILVERFISH_SPAWN_EGG,      LootTablesToModify.SILVERFISH,          tableBuilder);
                case LootTablesToModify.SQUID               -> buildLootTable(Items.SQUID_SPAWN_EGG,           LootTablesToModify.SQUID,               tableBuilder);
                case LootTablesToModify.VINDICATOR          -> buildLootTable(Items.VINDICATOR_SPAWN_EGG,      LootTablesToModify.VINDICATOR,          tableBuilder);
                case LootTablesToModify.WITCH               -> buildLootTable(Items.WITCH_SPAWN_EGG,           LootTablesToModify.WITCH,               tableBuilder);
                case LootTablesToModify.WITHER_SKELETON     -> buildLootTable(Items.WITHER_SKELETON_SPAWN_EGG, LootTablesToModify.WITHER_SKELETON,     tableBuilder);
                case LootTablesToModify.ZOMBIE_VILLAGER     -> buildLootTable(Items.ZOMBIE_VILLAGER_SPAWN_EGG, LootTablesToModify.ZOMBIE_VILLAGER,     tableBuilder);
                case LootTablesToModify.DROWNED             -> buildLootTable(Items.DROWNED_SPAWN_EGG,         LootTablesToModify.DROWNED,             tableBuilder);
                case LootTablesToModify.ENDERMAN            -> buildLootTable(Items.ENDERMAN_SPAWN_EGG,        LootTablesToModify.ENDERMAN,            tableBuilder);
                case LootTablesToModify.PIGLIN              -> buildLootTable(Items.PIGLIN_SPAWN_EGG,          LootTablesToModify.PIGLIN,              tableBuilder);
                case LootTablesToModify.ZOMBIFIED_PIGLIN    -> buildLootTable(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG,LootTablesToModify.ZOMBIFIED_PIGLIN,    tableBuilder);
                case LootTablesToModify.CHICKEN             -> buildLootTable(Items.CHICKEN_SPAWN_EGG,         LootTablesToModify.CHICKEN,             tableBuilder);
                case LootTablesToModify.COW                 -> buildLootTable(Items.COW_SPAWN_EGG,             LootTablesToModify.COW,                 tableBuilder);
                case LootTablesToModify.CREEPER             -> buildLootTable(Items.CREEPER_SPAWN_EGG,         LootTablesToModify.CREEPER,             tableBuilder);
                case LootTablesToModify.MAGMA_CUBE          -> buildLootTable(Items.MAGMA_CUBE_SPAWN_EGG,      LootTablesToModify.MAGMA_CUBE,          tableBuilder);
                case LootTablesToModify.PIG                 -> buildLootTable(Items.PIG_SPAWN_EGG,             LootTablesToModify.PIG,                 tableBuilder);
                case LootTablesToModify.SLIME               -> buildLootTable(Items.SLIME_SPAWN_EGG,           LootTablesToModify.SLIME,               tableBuilder);
                case LootTablesToModify.SPIDER              -> buildLootTable(Items.SPIDER_SPAWN_EGG,          LootTablesToModify.SPIDER,              tableBuilder);
                case LootTablesToModify.ZOMBIE              -> buildLootTable(Items.ZOMBIE_SPAWN_EGG,          LootTablesToModify.ZOMBIE,              tableBuilder);
                case LootTablesToModify.SKELETON            -> buildLootTable(Items.SKELETON_SPAWN_EGG,        LootTablesToModify.SKELETON,            tableBuilder);
                case LootTablesToModify.SHEEP               -> buildLootTable(Items.SHEEP_SPAWN_EGG,           LootTablesToModify.SHEEP,               tableBuilder);
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
