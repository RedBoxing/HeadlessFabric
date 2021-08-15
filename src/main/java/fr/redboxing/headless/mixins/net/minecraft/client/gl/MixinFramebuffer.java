package fr.redboxing.headless.mixins.net.minecraft.client.gl;

import net.minecraft.client.gl.Framebuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Framebuffer.class)
public class MixinFramebuffer {
    @Inject(method = "resize", at = @At("HEAD"), cancellable = true)
    public void resize(int width, int height, boolean getError, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "resizeInternal", at = @At("HEAD"), cancellable = true)
    private void resizeInternal(int width, int height, boolean getError, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "delete", at = @At("HEAD"), cancellable = true)
    public void delete(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "copyDepthFrom", at = @At("HEAD"), cancellable = true)
    public void copyDepthFrom(Framebuffer framebuffer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "initFbo", at = @At("HEAD"), cancellable = true)
    public void initFbo(int width, int height, boolean getError, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setTexFilter", at = @At("HEAD"), cancellable = true)
    public void setTexFilter(int i, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "checkFramebufferStatus", at = @At("HEAD"), cancellable = true)
    public void checkFramebufferStatus(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "method_35610", at = @At("HEAD"), cancellable = true)
    public void method_35610(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "endRead", at = @At("HEAD"), cancellable = true)
    public void endRead(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "beginWrite", at = @At("HEAD"), cancellable = true)
    public void beginWrite(boolean setViewport, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "bind", at = @At("HEAD"), cancellable = true)
    private void bind(boolean updateViewport, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "endWrite", at = @At("HEAD"), cancellable = true)
    public void endWrite(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setClearColor", at = @At("HEAD"), cancellable = true)
    public void setClearColor(float r, float g, float b, float a, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "draw(II)V", at = @At("HEAD"), cancellable = true)
    public void draw(int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "draw(IIZ)V", at = @At("HEAD"), cancellable = true)
    public void draw(int width, int height, boolean bl, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "drawInternal", at = @At("HEAD"), cancellable = true)
    private void drawInternal(int width, int height, boolean disableBlend, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "clear", at = @At("HEAD"), cancellable = true)
    public void clear(boolean getError, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getColorAttachment", at = @At("HEAD"), cancellable = true)
    public void getColorAttachment(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "getDepthAttachment", at = @At("HEAD"), cancellable = true)
    public void getDepthAttachment(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }
}
