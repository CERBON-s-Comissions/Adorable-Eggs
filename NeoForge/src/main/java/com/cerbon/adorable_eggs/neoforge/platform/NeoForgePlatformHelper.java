package com.cerbon.adorable_eggs.neoforge.platform;

import com.cerbon.adorable_eggs.neoforge.registry.NeoForgeResourcefulRegistry;
import com.cerbon.adorable_eggs.platform.services.IPlatformHelper;
import com.cerbon.adorable_eggs.registry.ResourcefulRegistry;
import net.minecraft.core.Registry;
import net.neoforged.fml.ModList;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public <T> ResourcefulRegistry<T> create(Registry<T> registry, String id) {
        return new NeoForgeResourcefulRegistry<>(registry, id);
    }

    @Override
    public boolean isModLoaded(String modId) {
        return ModList.get().isLoaded(modId);
    }
}

