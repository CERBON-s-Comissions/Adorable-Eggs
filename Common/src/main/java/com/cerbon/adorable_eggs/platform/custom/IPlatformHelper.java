package com.cerbon.adorable_eggs.platform.custom;

import com.cerbon.adorable_eggs.registry.ResourcefulRegistry;
import net.minecraft.core.Registry;

public interface IPlatformHelper {
    <T> ResourcefulRegistry<T> create(Registry<T> registry, String id);
}
