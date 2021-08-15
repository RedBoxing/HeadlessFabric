package fr.redboxing.headless.mixins.net.minecraft.client.gl;

import net.minecraft.client.gl.WindowFramebuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WindowFramebuffer.class)
public class MixinWindowFramebuffer {
    @Inject(method = "initSize", at = @At("HEAD"), cancellable = true)
    private void initSize(int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "findSuitableSize", at = @At("HEAD"), cancellable = true)
    private void findSuitableSize(int width, int height, CallbackInfoReturnable<WindowFramebuffer.Size> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "supportColor", at = @At("HEAD"), cancellable = true)
    private void supportColor(WindowFramebuffer.Size size, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(method = "supportsDepth", at = @At("HEAD"), cancellable = true)
    private void supportsDepth(WindowFramebuffer.Size size, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}
