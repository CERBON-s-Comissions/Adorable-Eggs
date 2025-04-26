package com.cerbon.adorable_eggs.neoforge;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.neoforge.loot.LootModifiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(AdorableEggs.MOD_ID)
public class AdorableEggsNeo {

    public AdorableEggsNeo(IEventBus eventBus) {
        AdorableEggs.init();

        LootModifiers.register(eventBus);
    }
}
