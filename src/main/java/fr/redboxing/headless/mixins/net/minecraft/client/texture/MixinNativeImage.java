package fr.redboxing.headless.mixins.net.minecraft.client.texture;

import net.minecraft.client.texture.NativeImage;
import org.lwjgl.stb.STBTTFontinfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(NativeImage.class)
public class MixinNativeImage {
    @Inject(method = "toString", at = @At("HEAD"), cancellable = true)
    public void toString(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("NativeImage[]");
    }

    @Inject(method = "setTextureFilter", at = @At("HEAD"), cancellable = true)
    private static void setTextureFilter(boolean blur, boolean mipmap, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "uploadInternal", at = @At("HEAD"), cancellable = true)
    private void uploadInternal(int level, int offsetX, int offsetY, int unpackSkipPixels, int unpackSkipRows, int width, int height, boolean blur, boolean clamp, boolean mipmap, boolean close, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "loadFromTextureImage", at = @At("HEAD"), cancellable = true)
    public void loadFromTextureImage(int level, boolean removeAlpha, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "makeGlyphBitmapSubpixel", at = @At("HEAD"), cancellable = true)
    public void makeGlyphBitmapSubpixel(STBTTFontinfo fontInfo, int glyphIndex, int width, int height, float scaleX, float scaleY, float shiftX, float shiftY, int startX, int startY, CallbackInfo ci) {
        ci.cancel();
    }
}
