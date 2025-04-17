package com.cerbon.adorable_eggs.neoforge.datagen.providers;

import com.cerbon.adorable_eggs.AdorableEggs;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ADEItemModelProvider extends ItemModelProvider {

    public ADEItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, AdorableEggs.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        SpawnEggItem.eggs().forEach(this::basicItem);
    }
}
