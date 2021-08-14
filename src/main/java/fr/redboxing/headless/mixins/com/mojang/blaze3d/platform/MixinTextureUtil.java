package fr.redboxing.headless.mixins.com.mojang.blaze3d.platform;

import com.mojang.blaze3d.platform.TextureUtil;
import net.minecraft.client.texture.NativeImage;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

@Mixin(value = TextureUtil.class, remap = false)
public class MixinTextureUtil {
    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static int generateTextureId() {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void releaseTextureId(int id) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void prepareImage(int id, int width, int height) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void prepareImage(NativeImage.GLFormat internalFormat, int id, int width, int height) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void prepareImage(int id, int maxLevel, int width, int height) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void prepareImage(NativeImage.GLFormat internalFormat, int id, int maxLevel, int width, int height) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void bind(int id) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void writeAsPNG(String string, int i, int j, int k, int l) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void initTexture(IntBuffer imageData, int width, int height) {
        // Source of original method is not available
    }
}
