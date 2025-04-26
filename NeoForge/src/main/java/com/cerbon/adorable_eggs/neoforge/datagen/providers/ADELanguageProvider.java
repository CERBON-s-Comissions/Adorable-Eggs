package com.cerbon.adorable_eggs.neoforge.datagen.providers;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.block.ADEBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ADELanguageProvider extends LanguageProvider {

    public ADELanguageProvider(PackOutput output) {
        super(output, AdorableEggs.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        ADEBlocks.BLOCKS.getEntries().forEach(block -> addEggTranslation(block.get()));
        add("item.minecraft.spawn_egg.creative_tooltip", "Shift + Right Click to place the egg");
        add("item.minecraft.spawn_egg.survival_tooltip", "Right Click to place the egg");

        // Config
        add("text.autoconfig.adorable_eggs.option.isPlaceEggsEnabled", "Can Place Eggs");

        add("text.autoconfig.adorable_eggs.option.allayEggDropChance",         "Allay Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.armadilloEggDropChance",     "Armadillo Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.breezeEggDropChance",        "Breeze Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.camelEggDropChance",         "Camel Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.catEggDropChance",           "Cat Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.creakingEggDropChance",      "Creaking Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.dolphinEggDropChance",       "Dolphin Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.elderGuardianEggDropChance","Elder Guardian Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.endermiteEggDropChance",     "Endermite Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.evokerEggDropChance",        "Evoker Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.foxEggDropChance",           "Fox Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.ironGolemEggDropChance",     "Iron Golem Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.pandaEggDropChance",         "Panda Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.polarBearEggDropChance",     "Polar Bear Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.pufferfishEggDropChance",    "Pufferfish Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.ravagerEggDropChance",       "Ravager Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.skeletonHorseEggDropChance","Skeleton Horse Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.snifferEggDropChance",       "Sniffer Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.striderEggDropChance",       "Strider Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.traderLlamaEggDropChance",   "Trader Llama Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.wanderingTraderEggDropChance","Wandering Trader Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.wardenEggDropChance",        "Warden Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.enderDragonEggDropChance",   "Ender Dragon Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.witherEggDropChance",        "Wither Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.zoglinEggDropChance",        "Zoglin Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.zombieHorseEggDropChance",   "Zombie Horse Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.axolotlEggDropChance",       "Axolotl Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.tadpoleEggDropChance",       "Tadpole Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.batEggDropChance",           "Bat Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.beeEggDropChance",           "Bee Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.boggedEggDropChance",        "Bogged Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.donkeyEggDropChance",        "Donkey Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.frogEggDropChance",          "Frog Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.ghastEggDropChance",         "Ghast Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.glowSquidEggDropChance",     "Glow Squid Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.goatEggDropChance",          "Goat Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.guardianEggDropChance",      "Guardian Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.hoglinEggDropChance",        "Hoglin Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.horseEggDropChance",         "Horse Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.llamaEggDropChance",         "Llama Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.mooshroomEggDropChance",     "Mooshroom Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.muleEggDropChance",          "Mule Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.ocelotEggDropChance",        "Ocelot Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.parrotEggDropChance",        "Parrot Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.phantomEggDropChance",       "Phantom Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.rabbitEggDropChance",        "Rabbit Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.shulkerEggDropChance",       "Shulker Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.snowGolemEggDropChance",     "Snow Golem Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.strayEggDropChance",         "Stray Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.tropicalFishEggDropChance",  "Tropical Fish Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.turtleEggDropChance",        "Turtle Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.vexEggDropChance",           "Vex Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.villagerEggDropChance",      "Villager Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.wolfEggDropChance",          "Wolf Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.codEggDropChance",           "Cod Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.salmonEggDropChance",        "Salmon Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.blazeEggDropChance",         "Blaze Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.caveSpiderEggDropChance",    "Cave Spider Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.huskEggDropChance",          "Husk Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.piglinBruteEggDropChance",   "Piglin Brute Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.pillagerEggDropChance",      "Pillager Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.silverfishEggDropChance",    "Silverfish Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.squidEggDropChance",         "Squid Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.vindicatorEggDropChance",    "Vindicator Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.witchEggDropChance",         "Witch Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.witherSkeletonEggDropChance","Wither Skeleton Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.zombieVillagerEggDropChance","Zombie Villager Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.drownedEggDropChance",       "Drowned Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.endermanEggDropChance",      "Enderman Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.piglinEggDropChance",        "Piglin Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.zombifiedPiglinEggDropChance","Zombified Piglin Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.chickenEggDropChance",       "Chicken Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.cowEggDropChance",           "Cow Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.creeperEggDropChance",       "Creeper Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.magmaCubeEggDropChance",     "Magma Cube Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.pigEggDropChance",           "Pig Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.slimeEggDropChance",         "Slime Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.spiderEggDropChance",        "Spider Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.zombieEggDropChance",        "Zombie Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.skeletonEggDropChance",      "Skeleton Egg Drop Chance");
        add("text.autoconfig.adorable_eggs.option.sheepEggDropChance",         "Sheep Egg Drop Chance");
    }

    private void addEggTranslation(Block block) {
        String path = BuiltInRegistries.BLOCK.getKey(block).getPath();

        String translation = Arrays.stream(path.split("_"))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));

        add(block, translation);
    }
}
