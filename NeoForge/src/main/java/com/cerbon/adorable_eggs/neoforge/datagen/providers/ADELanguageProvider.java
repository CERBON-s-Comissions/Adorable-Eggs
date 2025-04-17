package com.cerbon.adorable_eggs.neoforge.datagen.providers;

import com.cerbon.adorable_eggs.AdorableEggs;
import com.cerbon.adorable_eggs.block.ADEBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ADELanguageProvider extends LanguageProvider {

    public ADELanguageProvider(PackOutput output) {
        super(output, AdorableEggs.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        ADEBlocks.BLOCKS.getEntries().forEach(block -> addEggTranslation(block.get()));
    }

    private void addEggTranslation(Block block) {
        String path = BuiltInRegistries.BLOCK.getKey(block).getPath();

        String translation = Arrays.stream(path.split("_"))
                .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
                .collect(Collectors.joining(" "));

        add(block, translation);
    }
}
