package fr.redboxing.headless.mixins.net.minecraft.client.texture;

import net.minecraft.client.texture.NativeImage;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.stb.STBTTFontinfo;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Path;

@Mixin(NativeImage.class)
public class MixinNativeImage {
    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public String toString() {
        return "NativeImage[]";
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void setTextureFilter(boolean blur, boolean mipmap) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void uploadInternal(int level, int offsetX, int offsetY, int unpackSkipPixels, int unpackSkipRows, int width, int height, boolean blur, boolean clamp, boolean mipmap, boolean close) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void loadFromTextureImage(int level, boolean removeAlpha) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void makeGlyphBitmapSubpixel(STBTTFontinfo fontInfo, int glyphIndex, int width, int height, float scaleX, float scaleY, float shiftX, float shiftY, int startX, int startY) {
        // Source of original method is not available
    }
}
