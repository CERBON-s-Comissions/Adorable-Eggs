package com.cerbon.adorable_eggs.forge.platform;

import com.cerbon.adorable_eggs.forge.registry.ForgeResourcefulRegistry;
import com.cerbon.adorable_eggs.platform.custom.IPlatformHelper;
import com.cerbon.adorable_eggs.registry.ResourcefulRegistry;
import net.minecraft.core.Registry;

public class ForgePlatformHelper implements IPlatformHelper {

    @Override
    public <T> ResourcefulRegistry<T> create(Registry<T> registry, String id) {
        return new ForgeResourcefulRegistry<>(registry, id);
    }
}
