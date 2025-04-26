package com.cerbon.adorable_eggs.mixin;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CreativeModeTab.class)
public class CreativeModeTabMixin {

    @Shadow private ItemStack iconItemStack;

    @Shadow @Final private Component displayName;

    @Inject(method = "getIconItem", at = @At("HEAD"))
    private void getIconItem(CallbackInfoReturnable<ItemStack> cir) {
        if (this.iconItemStack == null && this.displayName.equals(Component.translatable("itemGroup.spawnEggs"))) {
            this.iconItemStack = new ItemStack(Items.CREEPER_SPAWN_EGG);
        }
    }
}
