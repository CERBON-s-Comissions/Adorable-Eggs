package com.cerbon.adorable_eggs.registry;

import com.cerbon.adorable_eggs.platform.Services;
import net.minecraft.core.Registry;

public class ResourcefulRegistries {

    public static <T> ResourcefulRegistry<T> create(Registry<T> registry, String id) {
        return Services.PLATFORM.create(registry, id);
    }
}
