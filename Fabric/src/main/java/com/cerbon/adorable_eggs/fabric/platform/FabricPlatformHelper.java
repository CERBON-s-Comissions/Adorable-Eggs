package com.cerbon.adorable_eggs.fabric.platform;

import com.cerbon.adorable_eggs.fabric.registry.FabricResourcefulRegistry;
import com.cerbon.adorable_eggs.platform.services.IPlatformHelper;
import com.cerbon.adorable_eggs.registry.ResourcefulRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public <T> ResourcefulRegistry<T> create(Registry<T> registry, String id) {
        return new FabricResourcefulRegistry<>(registry, id);
    }

    @Override
    public boolean isModLoaded(String modId) {
        return FabricLoader.getInstance().isModLoaded(modId);
    }
}
