package com.cerbon.adorable_eggs.neoforge.datagen.providers;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.loot.LootTablesToModify;
import com.cerbon.adorable_eggs.neoforge.loot.ADELootModifiersNeo;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class ADELootModifierProvider extends GlobalLootModifierProvider {

    public ADELootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, AdorableEggs.MOD_ID);
    }

    @Override
    protected void start() {
        add("allay_egg_drop",            buildLootTable(Items.ALLAY_SPAWN_EGG,            LootTablesToModify.ALLAY));
        add("armadillo_egg_drop",        buildLootTable(Items.ARMADILLO_SPAWN_EGG,        LootTablesToModify.ARMADILLO));
        add("breeze_egg_drop",           buildLootTable(Items.BREEZE_SPAWN_EGG,           LootTablesToModify.BREEZE));
        add("camel_egg_drop",            buildLootTable(Items.CAMEL_SPAWN_EGG,            LootTablesToModify.CAMEL));
        add("cat_egg_drop",              buildLootTable(Items.CAT_SPAWN_EGG,              LootTablesToModify.CAT));
        //add("creaking_egg_drop",         buildLootTable(Items.CREAKING_SPAWN_EGG,         LootTablesToModify.CREAKING));
        add("dolphin_egg_drop",          buildLootTable(Items.DOLPHIN_SPAWN_EGG,          LootTablesToModify.DOLPHIN));
        add("elder_guardian_egg_drop",   buildLootTable(Items.ELDER_GUARDIAN_SPAWN_EGG,   LootTablesToModify.ELDER_GUARDIAN));
        add("endermite_egg_drop",        buildLootTable(Items.ENDERMITE_SPAWN_EGG,        LootTablesToModify.ENDERMITE));
        add("evoker_egg_drop",           buildLootTable(Items.EVOKER_SPAWN_EGG,           LootTablesToModify.EVOKER));
        add("fox_egg_drop",              buildLootTable(Items.FOX_SPAWN_EGG,              LootTablesToModify.FOX));
        add("iron_golem_egg_drop",       buildLootTable(Items.IRON_GOLEM_SPAWN_EGG,       LootTablesToModify.IRON_GOLEM));
        add("panda_egg_drop",            buildLootTable(Items.PANDA_SPAWN_EGG,            LootTablesToModify.PANDA));
        add("polar_bear_egg_drop",       buildLootTable(Items.POLAR_BEAR_SPAWN_EGG,       LootTablesToModify.POLAR_BEAR));
        add("pufferfish_egg_drop",       buildLootTable(Items.PUFFERFISH_SPAWN_EGG,       LootTablesToModify.PUFFERFISH));
        add("ravager_egg_drop",          buildLootTable(Items.RAVAGER_SPAWN_EGG,          LootTablesToModify.RAVAGER));
        add("skeleton_horse_egg_drop",   buildLootTable(Items.SKELETON_HORSE_SPAWN_EGG,   LootTablesToModify.SKELETON_HORSE));
        add("sniffer_egg_drop",          buildLootTable(Items.SNIFFER_SPAWN_EGG,          LootTablesToModify.SNIFFER));
        add("strider_egg_drop",          buildLootTable(Items.STRIDER_SPAWN_EGG,          LootTablesToModify.STRIDER));
        add("trader_llama_egg_drop",     buildLootTable(Items.TRADER_LLAMA_SPAWN_EGG,     LootTablesToModify.TRADER_LLAMA));
        add("wandering_trader_egg_drop", buildLootTable(Items.WANDERING_TRADER_SPAWN_EGG, LootTablesToModify.WANDERING_TRADER));
        add("warden_egg_drop",           buildLootTable(Items.WARDEN_SPAWN_EGG,           LootTablesToModify.WARDEN));
        add("ender_dragon_egg_drop",     buildLootTable(Items.ENDER_DRAGON_SPAWN_EGG,     LootTablesToModify.ENDER_DRAGON));
        add("wither_egg_drop",           buildLootTable(Items.WITHER_SPAWN_EGG,           LootTablesToModify.WITHER));
        add("zoglin_egg_drop",           buildLootTable(Items.ZOGLIN_SPAWN_EGG,           LootTablesToModify.ZOGLIN));
        add("zombie_horse_egg_drop",     buildLootTable(Items.ZOMBIE_HORSE_SPAWN_EGG,     LootTablesToModify.ZOMBIE_HORSE));
        add("axolotl_egg_drop",          buildLootTable(Items.AXOLOTL_SPAWN_EGG,          LootTablesToModify.AXOLOTL));
        add("tadpole_egg_drop",          buildLootTable(Items.TADPOLE_SPAWN_EGG,          LootTablesToModify.TADPOLE));
        add("bat_egg_drop",              buildLootTable(Items.BAT_SPAWN_EGG,              LootTablesToModify.BAT));
        add("bee_egg_drop",              buildLootTable(Items.BEE_SPAWN_EGG,              LootTablesToModify.BEE));
        add("bogged_egg_drop",           buildLootTable(Items.BOGGED_SPAWN_EGG,           LootTablesToModify.BOGGED));
        add("donkey_egg_drop",           buildLootTable(Items.DONKEY_SPAWN_EGG,           LootTablesToModify.DONKEY));
        add("frog_egg_drop",             buildLootTable(Items.FROG_SPAWN_EGG,             LootTablesToModify.FROG));
        add("ghast_egg_drop",            buildLootTable(Items.GHAST_SPAWN_EGG,            LootTablesToModify.GHAST));
        add("glow_squid_egg_drop",       buildLootTable(Items.GLOW_SQUID_SPAWN_EGG,       LootTablesToModify.GLOW_SQUID));
        add("goat_egg_drop",             buildLootTable(Items.GOAT_SPAWN_EGG,             LootTablesToModify.GOAT));
        add("guardian_egg_drop",         buildLootTable(Items.GUARDIAN_SPAWN_EGG,         LootTablesToModify.GUARDIAN));
        add("hoglin_egg_drop",           buildLootTable(Items.HOGLIN_SPAWN_EGG,           LootTablesToModify.HOGLIN));
        add("horse_egg_drop",            buildLootTable(Items.HORSE_SPAWN_EGG,            LootTablesToModify.HORSE));
        add("llama_egg_drop",            buildLootTable(Items.LLAMA_SPAWN_EGG,            LootTablesToModify.LLAMA));
        add("mooshroom_egg_drop",        buildLootTable(Items.MOOSHROOM_SPAWN_EGG,        LootTablesToModify.MOOSHROOM));
        add("mule_egg_drop",             buildLootTable(Items.MULE_SPAWN_EGG,             LootTablesToModify.MULE));
        add("ocelot_egg_drop",           buildLootTable(Items.OCELOT_SPAWN_EGG,           LootTablesToModify.OCELOT));
        add("parrot_egg_drop",           buildLootTable(Items.PARROT_SPAWN_EGG,           LootTablesToModify.PARROT));
        add("phantom_egg_drop",          buildLootTable(Items.PHANTOM_SPAWN_EGG,          LootTablesToModify.PHANTOM));
        add("rabbit_egg_drop",           buildLootTable(Items.RABBIT_SPAWN_EGG,           LootTablesToModify.RABBIT));
        add("shulker_egg_drop",          buildLootTable(Items.SHULKER_SPAWN_EGG,          LootTablesToModify.SHULKER));
        add("snow_golem_egg_drop",       buildLootTable(Items.SNOW_GOLEM_SPAWN_EGG,       LootTablesToModify.SNOW_GOLEM));
        add("stray_egg_drop",            buildLootTable(Items.STRAY_SPAWN_EGG,            LootTablesToModify.STRAY));
        add("tropical_fish_egg_drop",    buildLootTable(Items.TROPICAL_FISH_SPAWN_EGG,    LootTablesToModify.TROPICAL_FISH));
        add("turtle_egg_drop",           buildLootTable(Items.TURTLE_SPAWN_EGG,           LootTablesToModify.TURTLE));
        add("vex_egg_drop",              buildLootTable(Items.VEX_SPAWN_EGG,              LootTablesToModify.VEX));
        add("villager_egg_drop",         buildLootTable(Items.VILLAGER_SPAWN_EGG,         LootTablesToModify.VILLAGER));
        add("wolf_egg_drop",             buildLootTable(Items.WOLF_SPAWN_EGG,             LootTablesToModify.WOLF));
        add("cod_egg_drop",              buildLootTable(Items.COD_SPAWN_EGG,              LootTablesToModify.COD));
        add("salmon_egg_drop",           buildLootTable(Items.SALMON_SPAWN_EGG,           LootTablesToModify.SALMON));
        add("blaze_egg_drop",            buildLootTable(Items.BLAZE_SPAWN_EGG,            LootTablesToModify.BLAZE));
        add("cave_spider_egg_drop",      buildLootTable(Items.CAVE_SPIDER_SPAWN_EGG,      LootTablesToModify.CAVE_SPIDER));
        add("husk_egg_drop",             buildLootTable(Items.HUSK_SPAWN_EGG,             LootTablesToModify.HUSK));
        add("piglin_brute_egg_drop",     buildLootTable(Items.PIGLIN_BRUTE_SPAWN_EGG,     LootTablesToModify.PIGLIN_BRUTE));
        add("pillager_egg_drop",         buildLootTable(Items.PILLAGER_SPAWN_EGG,         LootTablesToModify.PILLAGER));
        add("silverfish_egg_drop",       buildLootTable(Items.SILVERFISH_SPAWN_EGG,       LootTablesToModify.SILVERFISH));
        add("squid_egg_drop",            buildLootTable(Items.SQUID_SPAWN_EGG,            LootTablesToModify.SQUID));
        add("vindicator_egg_drop",       buildLootTable(Items.VINDICATOR_SPAWN_EGG,       LootTablesToModify.VINDICATOR));
        add("witch_egg_drop",            buildLootTable(Items.WITCH_SPAWN_EGG,            LootTablesToModify.WITCH));
        add("wither_skeleton_egg_drop",  buildLootTable(Items.WITHER_SKELETON_SPAWN_EGG,  LootTablesToModify.WITHER_SKELETON));
        add("zombie_villager_egg_drop",  buildLootTable(Items.ZOMBIE_VILLAGER_SPAWN_EGG,  LootTablesToModify.ZOMBIE_VILLAGER));
        add("drowned_egg_drop",          buildLootTable(Items.DROWNED_SPAWN_EGG,          LootTablesToModify.DROWNED));
        add("enderman_egg_drop",         buildLootTable(Items.ENDERMAN_SPAWN_EGG,         LootTablesToModify.ENDERMAN));
        add("piglin_egg_drop",           buildLootTable(Items.PIGLIN_SPAWN_EGG,           LootTablesToModify.PIGLIN));
        add("zombified_piglin_egg_drop", buildLootTable(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG,  LootTablesToModify.ZOMBIFIED_PIGLIN));
        add("chicken_egg_drop",          buildLootTable(Items.CHICKEN_SPAWN_EGG,          LootTablesToModify.CHICKEN));
        add("cow_egg_drop",              buildLootTable(Items.COW_SPAWN_EGG,              LootTablesToModify.COW));
        add("creeper_egg_drop",          buildLootTable(Items.CREEPER_SPAWN_EGG,          LootTablesToModify.CREEPER));
        add("magma_cube_egg_drop",       buildLootTable(Items.MAGMA_CUBE_SPAWN_EGG,       LootTablesToModify.MAGMA_CUBE));
        add("pig_egg_drop",              buildLootTable(Items.PIG_SPAWN_EGG,              LootTablesToModify.PIG));
        add("slime_egg_drop",            buildLootTable(Items.SLIME_SPAWN_EGG,            LootTablesToModify.SLIME));
        add("spider_egg_drop",           buildLootTable(Items.SPIDER_SPAWN_EGG,           LootTablesToModify.SPIDER));
        add("zombie_egg_drop",           buildLootTable(Items.ZOMBIE_SPAWN_EGG,           LootTablesToModify.ZOMBIE));
        add("skeleton_egg_drop",         buildLootTable(Items.SKELETON_SPAWN_EGG, LootTablesToModify.SKELETON));
        add("sheep_egg_drop",            buildLootTable(Items.SHEEP_SPAWN_EGG, LootTablesToModify.SHEEP));
    }

    private ADELootModifiersNeo buildLootTable(Item eggDrop, String lootTableName) {
        return new ADELootModifiersNeo(
                new LootItemCondition[] {
                        LootTableIdCondition.builder(ResourceLocation.tryParse(lootTableName)).build()
                },
                eggDrop,
                lootTableName
        );
    }
}
