package com.cerbon.adorable_eggs.forge.registry;

import com.cerbon.adorable_eggs.registry.RegistryEntry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ForgeRegistryEntry<T> implements RegistryEntry<T> {
    private final RegistryObject<T> object;

    private List<TagKey<T>> datagenTags;

    public ForgeRegistryEntry(RegistryObject<T> object) {
        this.object = object;
    }

    @Override
    public T get() {
        return object.get();
    }

    @Override
    public ResourceLocation getId() {
        return object.getId();
    }
}
