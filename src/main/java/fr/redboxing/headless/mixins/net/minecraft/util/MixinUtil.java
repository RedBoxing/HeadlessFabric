package fr.redboxing.headless.mixins.net.minecraft.util;

import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Util.class)
public class MixinUtil {
  /*  @Inject(method = "getMeasuringTimeNano", at = @At("HEAD"), cancellable = true)
    private static void getMeasuringTimeNanoHook(CallbackInfoReturnable<Long> cir) {
        cir.setReturnValue(0L);
    }*/
}
