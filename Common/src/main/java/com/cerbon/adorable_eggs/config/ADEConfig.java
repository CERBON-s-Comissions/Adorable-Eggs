package com.cerbon.adorable_eggs.config;

import com.cerbon.adorable_eggs.AdorableEggs;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = AdorableEggs.MOD_ID)
public class ADEConfig implements ConfigData {

    public boolean isPlaceEggsEnabled = true;
}
