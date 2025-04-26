package com.cerbon.adorable_eggs.neoforge.loot;

import com.cerbon.adorable_eggs.loot.LootTablesToModify;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import org.jetbrains.annotations.NotNull;

public class ADELootModifiersNeo extends LootModifier {
    public static final MapCodec<ADELootModifiersNeo> CODEC = RecordCodecBuilder.mapCodec(
            instance -> LootModifier.codecStart(instance)
                    .and(BuiltInRegistries.ITEM.byNameCodec().fieldOf("item").forGetter(m -> m.item))
                    .and(Codec.STRING.fieldOf("loot_table").forGetter(m -> m.lootTable))
                    .apply(instance, ADELootModifiersNeo::new)
    );
    private final Item item;
    private final String lootTable;

    public ADELootModifiersNeo(LootItemCondition[] conditionsIn, Item item, String lootTable) {
        super(conditionsIn);
        this.item = item;
        this.lootTable = lootTable;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(@NotNull ObjectArrayList<ItemStack> generatedLoot, @NotNull LootContext lootContext) {
        for (LootItemCondition condition : this.conditions)
            if (!condition.test(lootContext))
                return generatedLoot;

        if (LootItemRandomChanceCondition.randomChance(LootTablesToModify.DROP_CHANCE_MAP.getOrDefault(lootTable, 0f)).build().test(lootContext))
            generatedLoot.add(new ItemStack(this.item));

        return generatedLoot;
    }

    @Override
    public @NotNull MapCodec<? extends IGlobalLootModifier> codec() {
        return CODEC;
    }
}
