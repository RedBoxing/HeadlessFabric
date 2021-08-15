package fr.redboxing.headless.mixins.com.mojang.blaze3d.platform;

import com.mojang.blaze3d.platform.TextureUtil;
import net.minecraft.client.texture.NativeImage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.nio.IntBuffer;

@Mixin(value = TextureUtil.class, remap = false)
public class MixinTextureUtil {
    @Inject(method = "generateTextureId", at = @At("HEAD"), cancellable = true)
    private static void generateTextureId(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "releaseTextureId", at = @At("HEAD"), cancellable = true)
    private static void releaseTextureId(int id, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "prepareImage(III)V", at = @At("HEAD"), cancellable = true)
    private static void prepareImage(int id, int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "prepareImage(Lnet/minecraft/client/texture/NativeImage$GLFormat;III)V", at = @At("HEAD"), cancellable = true)
    private static void prepareImage(NativeImage.GLFormat internalFormat, int id, int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "prepareImage(IIII)V", at = @At("HEAD"), cancellable = true)
    private static void prepareImage(int id, int maxLevel, int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "prepareImage(Lnet/minecraft/client/texture/NativeImage$GLFormat;IIII)V", at = @At("HEAD"), cancellable = true)
    private static void prepareImage(NativeImage.GLFormat internalFormat, int id, int maxLevel, int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "bind", at = @At("HEAD"), cancellable = true)
    private static void bind(int id, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "writeAsPNG", at = @At("HEAD"), cancellable = true)
    private static void writeAsPNG(String string, int i, int j, int k, int l, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "initTexture", at = @At("HEAD"), cancellable = true)
    private static void initTexture(IntBuffer imageData, int width, int height, CallbackInfo ci) {
        ci.cancel();
    }
}
