package com.cerbon.adorable_eggs.fabric;

import com.cerbon.adorable_eggs.AdorableEggs;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class AdorableEggsFabric implements ModInitializer, ClientModInitializer {

    @Override
    public void onInitialize() {
        AdorableEggs.init();
    }

    @Override
    public void onInitializeClient() {}
}