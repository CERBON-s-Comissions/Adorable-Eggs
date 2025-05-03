package com.cerbon.adorable_eggs.fabric.registry;

import com.cerbon.adorable_eggs.registry.RegistryEntry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;

import java.util.List;
import java.util.function.Supplier;

public class FabricRegistryEntry<T> implements RegistryEntry<T> {
    private final ResourceLocation id;
    private final T value;

    private List<TagKey<T>> datagenTags;

    private FabricRegistryEntry(ResourceLocation id, T value) {
        this.id = id;
        this.value = value;
    }

    public static <T, I extends T> FabricRegistryEntry<I> of(Registry<T> registry, ResourceLocation id, Supplier<I> supplier) {
        return new FabricRegistryEntry<>(id, Registry.register(registry, id, supplier.get()));
    }

    @Override
    public T get() {
        return this.value;
    }

    @Override
    public ResourceLocation getId() {
        return this.id;
    }

//    @Override
//    public @Nullable List<TagKey<T>> getDatagenTags() {
//        if (MiscUtils.isRunningDatagen() && datagenTags == null)
//            datagenTags = new ObjectArrayList<>();
//
//        return datagenTags;
//    }
}
