package com.cerbon.adorable_eggs.forge;

import com.cerbon.adorable_eggs.AdorableEggs;
import net.minecraftforge.fml.common.Mod;

@Mod(AdorableEggs.MOD_ID)
public class AdorableEggsForge {

    public AdorableEggsForge() {
        AdorableEggs.init();
    }
}