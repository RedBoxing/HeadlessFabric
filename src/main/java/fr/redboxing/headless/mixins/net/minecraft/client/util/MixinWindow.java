package fr.redboxing.headless.mixins.net.minecraft.client.util;

import net.minecraft.client.util.Monitor;
import net.minecraft.client.util.VideoMode;
import net.minecraft.client.util.Window;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Optional;
import java.util.function.BiConsumer;

@Mixin(Window.class)
public class MixinWindow {
    @Inject(method = "getRefreshRate", at = @At("HEAD"), cancellable = true)
    public void getRefreshRate(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "shouldClose", at = @At("HEAD"), cancellable = true)
    public void shouldClose(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(method = "acceptError", at = @At("HEAD"), cancellable = true)
    private static void acceptError(BiConsumer<Integer, String> consumer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setIcon", at = @At("HEAD"), cancellable = true)
    public void setIcon(InputStream icon16, InputStream icon32, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "readImage", at = @At("HEAD"), cancellable = true)
    private void readImage(InputStream in, IntBuffer x, IntBuffer y, IntBuffer channels, CallbackInfoReturnable<ByteBuffer> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "setPhase", at = @At("HEAD"), cancellable = true)
    public void setPhase(String phase, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "throwGlError", at = @At("HEAD"), cancellable = true)
    private static void throwOnGlError(int error, long description, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "throwGlError", at = @At("HEAD"), cancellable = true)
    private static void throwGlError(int error, long description, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "logGlError", at = @At("HEAD"), cancellable = true)
    public void logGlError(int error, long description, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "logOnGlError", at = @At("HEAD"), cancellable = true)
    public void logOnGlError(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setVsync", at = @At("HEAD"), cancellable = true)
    public void setVsync(boolean vsync, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "close", at = @At("HEAD"), cancellable = true)
    public void close(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "onWindowPosChanged", at = @At("HEAD"), cancellable = true)
    private void onWindowPosChanged(long window, int x, int y, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "onFramebufferSizeChanged", at = @At("HEAD"), cancellable = true)
    private void onFramebufferSizeChanged(long window, int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "updateFramebufferSize", at = @At("HEAD"), cancellable = true)
    private void updateFramebufferSize(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "onWindowSizeChanged", at = @At("HEAD"), cancellable = true)
    private void onWindowSizeChanged(long window, int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "onWindowFocusChanged", at = @At("HEAD"), cancellable = true)
    private void onWindowFocusChanged(long window, boolean focused, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "onCursorEnterChanged", at = @At("HEAD"), cancellable = true)
    private void onCursorEnterChanged(long window, boolean entered, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setFramerateLimit", at = @At("HEAD"), cancellable = true)
    public void setFramerateLimit(int framerateLimit, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getFramerateLimit", at = @At("HEAD"), cancellable = true)
    public void getFramerateLimit(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "swapBuffers", at = @At("HEAD"), cancellable = true)
    public void swapBuffers(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getVideoMode", at = @At("HEAD"), cancellable = true)
    public void getVideoMode(CallbackInfoReturnable<Optional<VideoMode>> cir) {
        cir.setReturnValue(Optional.empty());
    }

    @Inject(method = "setVideoMode", at = @At("HEAD"), cancellable = true)
    public void setVideoMode(Optional<VideoMode> videoMode, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "applyVideoMode", at = @At("HEAD"), cancellable = true)
    public void applyVideoMode(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "updateWindowRegion", at = @At("HEAD"), cancellable = true)
    private void updateWindowRegion(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "toggleFullscreen", at = @At("HEAD"), cancellable = true)
    public void toggleFullscreen(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setWindowedSize", at = @At("HEAD"), cancellable = true)
    public void setWindowedSize(int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "updateFullscreen", at = @At("HEAD"), cancellable = true)
    private void updateFullscreen(boolean vsync, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "calculateScaleFactor", at = @At("HEAD"), cancellable = true)
    public void calculateScaleFactor(int guiScale, boolean forceUnicodeFont, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "setScaleFactor", at = @At("HEAD"), cancellable = true)
    public void setScaleFactor(double scaleFactor, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setTitle", at = @At("HEAD"), cancellable = true)
    public void setTitle(String title, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getHandle", at = @At("HEAD"), cancellable = true)
    public void getHandle(CallbackInfoReturnable<Long> cir) {
        cir.setReturnValue(0L);
    }

    @Inject(method = "isFullscreen", at = @At("HEAD"), cancellable = true)
    public void isFullscreen(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(method = "getFramebufferWidth", at = @At("HEAD"), cancellable = true)
    public void getFramebufferWidth(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "getFramebufferHeight", at = @At("HEAD"), cancellable = true)
    public void getFramebufferHeight(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "setFramebufferWidth", at = @At("HEAD"), cancellable = true)
    public void setFramebufferWidth(int framebufferWidth, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setFramebufferHeight", at = @At("HEAD"), cancellable = true)
    public void setFramebufferHeight(int framebufferHeight, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getWidth", at = @At("HEAD"), cancellable = true)
    public void getWidth(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "getHeight", at = @At("HEAD"), cancellable = true)
    public void getHeight(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "getScaledWidth", at = @At("HEAD"), cancellable = true)
    public void getScaledWidth(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "getScaledHeight", at = @At("HEAD"), cancellable = true)
    public void getScaledHeight(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "getX", at = @At("HEAD"), cancellable = true)
    public void getX(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "getY", at = @At("HEAD"), cancellable = true)
    public void getY(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "getScaleFactor", at = @At("HEAD"), cancellable = true)
    public void getScaleFactor(CallbackInfoReturnable<Double> cir) {
        cir.setReturnValue(0D);
    }

    @Inject(method = "getMonitor", at = @At("HEAD"), cancellable = true)
    public void getMonitor(CallbackInfoReturnable<Monitor> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "setRawMouseMotion", at = @At("HEAD"), cancellable = true)
    public void setRawMouseMotion(boolean rawMouseMotion, CallbackInfo ci) {
        ci.cancel();
    }
}
