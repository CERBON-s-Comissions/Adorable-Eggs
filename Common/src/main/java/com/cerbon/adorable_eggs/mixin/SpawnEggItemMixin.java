package com.cerbon.adorable_eggs.mixin;

import net.minecraft.world.item.SpawnEggItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SpawnEggItem.class)
public class SpawnEggItemMixin {

    @Inject(method = "getColor", at = @At("RETURN"), cancellable = true)
    private void getColor(int tintIndex, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0xFFFFFF);
    }
}
