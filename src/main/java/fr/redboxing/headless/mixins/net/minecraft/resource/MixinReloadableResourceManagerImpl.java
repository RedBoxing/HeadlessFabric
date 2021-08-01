package fr.redboxing.headless.mixins.net.minecraft.resource;

import net.minecraft.resource.ReloadableResourceManagerImpl;
import net.minecraft.resource.ResourcePack;
import net.minecraft.resource.ResourceReload;
import net.minecraft.resource.ResourceReloader;
import net.minecraft.util.Unit;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@Mixin(ReloadableResourceManagerImpl.class)
public class MixinReloadableResourceManagerImpl {
    @Inject(method = "registerReloader", at = @At("HEAD"), cancellable = true)
    private void registerReloaderHook(ResourceReloader reloader, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "reload", at = @At("HEAD"), cancellable = true)
    private void reloadHook(Executor prepareExecutor, Executor applyExecutor, CompletableFuture<Unit> initialStage, List<ResourcePack> packs, CallbackInfoReturnable<ResourceReload> cir) {
        cir.setReturnValue(null);
    }
}
