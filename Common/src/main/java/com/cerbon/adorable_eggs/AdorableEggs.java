package com.cerbon.adorable_eggs;

import com.cerbon.adorable_eggs.block.ADEBlocks;
import com.cerbon.adorable_eggs.config.ADEConfig;
import com.mojang.logging.LogUtils;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import org.slf4j.Logger;

public class AdorableEggs {
	public static final String MOD_ID = "adorable_eggs";
	public static final String MOD_NAME = "AdorableEggs";

	public static final Logger LOGGER = LogUtils.getLogger();

	public static ADEConfig config;

	public static void init() {
		AutoConfig.register(ADEConfig.class, JanksonConfigSerializer::new);
		AutoConfig.getConfigHolder(ADEConfig.class).save();
		config = AutoConfig.getConfigHolder(ADEConfig.class).get();

		ADEBlocks.register();
	}
}
