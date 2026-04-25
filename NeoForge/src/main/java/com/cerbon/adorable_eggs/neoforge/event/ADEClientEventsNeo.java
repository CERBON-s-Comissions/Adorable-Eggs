package com.cerbon.adorable_eggs.neoforge.event;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.config.ADEConfig;
import me.shedaniel.autoconfig.AutoConfigClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@EventBusSubscriber(modid = AdorableEggs.MOD_ID, value = Dist.CLIENT)
public class ADEClientEventsNeo {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, () -> (mc, parent) -> AutoConfigClient.getConfigScreen(ADEConfig.class, parent).get());
    }
}
