package com.cerbon.adorable_eggs.neoforge.event;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.neoforge.datagen.providers.ADEBlockStateProvider;
import com.cerbon.adorable_eggs.neoforge.datagen.providers.ADELootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = AdorableEggs.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ADEEvents {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), ADELootTableProvider.create(packOutput, lookupProvider));

        generator.addProvider(event.includeClient(), new ADEBlockStateProvider(packOutput, existingFileHelper));
    }
}
