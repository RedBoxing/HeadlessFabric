package fr.redboxing.headless.mixins.net.minecraft.client.texture;

import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TextureManager.class)
public class MixinTextureManager {
    @Inject(method = "bindTexture", at = @At("HEAD"), cancellable = true)
    private void bindTextureHook(Identifier id, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "registerTexture", at = @At("HEAD"), cancellable = true)
    private void registerTextureHook(Identifier id, AbstractTexture texture, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "registerDynamicTexture", at = @At("HEAD"), cancellable = true)
    private void registerDynamicTexture(String prefix, NativeImageBackedTexture texture, CallbackInfoReturnable<Identifier> cir) {
        cir.setReturnValue(null);
    }
}
