package com.cerbon.adorable_eggs.forge;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.forge.loot.LootModifiers;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(AdorableEggs.MOD_ID)
public class AdorableEggsForge {

    public AdorableEggsForge() {
        AdorableEggs.init();

        LootModifiers.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}