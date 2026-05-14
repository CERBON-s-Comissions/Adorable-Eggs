package com.cerbon.adorable_eggs.mixin;

import com.cerbon.adorable_eggs.AdorableEggs;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import org.spongepowered.asm.mixin.Mixin;

import java.util.function.Consumer;

@Mixin(SpawnEggItem.class)
public class SpawnEggItemClientMixin extends Item {

    public SpawnEggItemClientMixin(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> tooltipAdder, TooltipFlag flag) {
        super.appendHoverText(stack, context, tooltipDisplay, tooltipAdder, flag);

        if (AdorableEggs.config.isPlaceEggsEnabled) {
            Minecraft client = Minecraft.getInstance();
            Player player = client.player;
            if (player == null) return;

            if (player.isCreative())
                tooltipAdder.accept(Component.translatable("item.minecraft.spawn_egg.creative_tooltip"));
            else
                tooltipAdder.accept(Component.translatable("item.minecraft.spawn_egg.survival_tooltip"));
        }
    }
}
