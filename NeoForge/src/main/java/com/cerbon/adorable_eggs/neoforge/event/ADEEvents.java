package com.cerbon.adorable_eggs.neoforge.event;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class ADEEvents {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        /*DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), ADELootTableProvider.create(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new ADELootModifierProvider(packOutput, lookupProvider));

        generator.addProvider(event.includeClient(), new ADEBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ADEItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ADELanguageProvider(packOutput));*/
    }
}
