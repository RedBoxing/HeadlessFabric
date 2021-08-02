package fr.redboxing.headless.mixins.net.minecraft.client;

import fr.redboxing.headless.inject.replace.*;
import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;
import net.minecraft.client.WindowSettings;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.gl.WindowFramebuffer;
import net.minecraft.client.gui.screen.Overlay;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.render.BufferBuilderStorage;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModelManager;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.WindowProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.resource.ReloadableResourceManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.resource.ResourcePackManager;
import net.minecraft.resource.ResourceReloader;
import net.minecraft.util.Util;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.profiler.ProfileResult;
import net.minecraft.util.profiler.Profiler;
import net.minecraft.util.thread.ThreadExecutor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.io.InputStream;
import java.util.function.LongSupplier;

@Mixin(MinecraftClient.class)
public abstract class MixinMinecraftClient {
    @Shadow @Final private RenderTickCounter renderTickCounter;

    @Shadow private Profiler profiler;

    @Shadow public abstract void tick();

    @Redirect(method = "<init>", at = @At(value = "NEW", target = "net/minecraft/client/gl/WindowFramebuffer"))
    private WindowFramebuffer replaceFrameBuffer(int width, int height) {
        return new EmptyFrameBuffer(width, height);
    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/WindowProvider;createWindow(Lnet/minecraft/client/WindowSettings;Ljava/lang/String;Ljava/lang/String;)Lnet/minecraft/client/util/Window;"))
    private Window replaceWindow(WindowProvider windowProvider, WindowSettings settings, String videoMode, String title) {
        return null;
    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;setIcon(Ljava/io/InputStream;Ljava/io/InputStream;)V"))
    private void setIconHook(Window window, InputStream icon16, InputStream icon32) {

    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;setFramerateLimit(I)V"))
    private void setFramerateLimitHook(Window window, int framerateLimit) {

    }

    @Redirect(method = "<init>", at = @At(value = "NEW", target = "net/minecraft/client/Mouse"))
    private Mouse replaceMouse(MinecraftClient client) {
        return new EmptyMouse(client);
    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;getHandle()J"))
    private long windowGetHandleHook(Window window) {
        return 0;
    }

    @Redirect(method = "<init>", at = @At(value = "NEW", target = "net/minecraft/client/Keyboard"))
    private Keyboard replaceKeyboard(MinecraftClient client) {
        return new EmptyKeyboard(client);
    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;getFramebufferWidth()I"))
    private int getFramebufferWidthHook(Window window) {
        return 0;
    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;getFramebufferHeight()I"))
    private int getFramebufferHeightHook(Window window) {
        return 0;
    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;setPhase(Ljava/lang/String;)V"))
    private void setPhaseHook(Window window, String phase) {

    }

    @Redirect(method = "<init>", at = @At(value = "NEW", target = "net/minecraft/client/render/GameRenderer"))
    private GameRenderer replaceGameRenderer(MinecraftClient client, ResourceManager resourceManager, BufferBuilderStorage buffers) {
        return new EmptyGameRenderer(client, resourceManager, buffers);
    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;setVsync(Z)V"))
    private void setVsyncHook(Window window, boolean vsync) {

    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;setRawMouseMotion(Z)V"))
    private void setRawMouseMotionHook(Window window, boolean rawMouseMotion) {

    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/Window;logOnGlError()V"))
    private void logOnGlErrorHook(Window window) {

    }

    @Inject(method = "updateWindowTitle", at = @At("HEAD"), cancellable = true)
    private void updateWindowTitleHook(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "onResolutionChanged", at = @At("HEAD"), cancellable = true)
    private void onResolutionChangedHook(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setOverlay", at = @At("HEAD"), cancellable = true)
    private void setOverlayHook(Overlay overlay, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setScreen", at = @At("HEAD"), cancellable = true)
    private void setScreenHook(Screen screen, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void renderHook(boolean tick, CallbackInfo ci) {
        int k;
        if (tick) {
            int i = this.renderTickCounter.beginRenderTick(Util.getMeasuringTimeMs());
            this.profiler.push("scheduledExecutables");
            ((ThreadExecutor) (Object) this).runTasks();
            this.profiler.pop();
            this.profiler.push("tick");

            for(k = 0; k < Math.min(10, i); ++k) {
                this.profiler.visit("clientTick");
                this.tick();
            }

            this.profiler.pop();
        }

        this.profiler.swap("yield");
        Thread.yield();
        this.profiler.pop();

        ci.cancel();
    }

    @Redirect(method = "<init>", at = @At(value = "NEW", target = "net/minecraft/client/render/item/ItemRenderer"))
    private ItemRenderer replaceItemRenderer(TextureManager manager, BakedModelManager bakery, ItemColors colors, BuiltinModelItemRenderer builtinModelItemRenderer) {
        return new EmptyItemRenderer(manager, bakery, colors, builtinModelItemRenderer);
    }

    @Inject(method = "drawProfilerResults", at = @At("HEAD"), cancellable = true)
    private void drawProfilerResultsHook(MatrixStack matrices, ProfileResult profileResult, CallbackInfo ci) {
        ci.cancel();
    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/resource/ResourcePackManager;scanPacks()V"))
    private void scanPacksHook(ResourcePackManager resourcePackManager) {

    }

    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/WorldRenderer;tick()V"))
    private void worldRendererTickHook(WorldRenderer worldRenderer) {

    }

    @Inject(method = "handleInputEvents", at = @At("HEAD"), cancellable = true)
    private void handleInputEventsHook(CallbackInfo ci) {
        ci.cancel();
    }

    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/tutorial/TutorialManager;tick(Lnet/minecraft/client/world/ClientWorld;Lnet/minecraft/util/hit/HitResult;)V"))
    private void tutorialManagerTickHook(TutorialManager tutorialManager, ClientWorld world, HitResult hitResult) {

    }

    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/particle/ParticleManager;tick()V"))
    private void particleManagerTickHook(ParticleManager particleManager) {

    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;initBackendSystem()Ljava/util/function/LongSupplier;"))
    private LongSupplier initBackendSystem() {
        return System::nanoTime;
    }

    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/option/GameOptions;write()V"))
    private void gameOptionsWriteHook(GameOptions gameOptions) {

    }

    @Redirect(method = "<init>", at = @At(value = "INVOKE", target = "Lnet/minecraft/resource/ReloadableResourceManager;registerReloader(Lnet/minecraft/resource/ResourceReloader;)V"))
    private void replaceRegisterReloader(ReloadableResourceManager reloadableResourceManager, ResourceReloader reloader) {}
}
