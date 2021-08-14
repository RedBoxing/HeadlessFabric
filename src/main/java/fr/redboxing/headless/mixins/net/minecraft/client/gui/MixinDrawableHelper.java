package fr.redboxing.headless.mixins.net.minecraft.client.gui;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.Text;
import net.minecraft.util.math.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.function.BiConsumer;

@Mixin(DrawableHelper.class)
public class MixinDrawableHelper {
    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void drawHorizontalLine(MatrixStack matrices, int x1, int x2, int y, int color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void drawVerticalLine(MatrixStack matrices, int x, int y1, int y2, int color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void fill(MatrixStack matrices, int x1, int y1, int x2, int y2, int color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void fill(Matrix4f matrix, int x1, int y1, int x2, int y2, int color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void fillGradient(MatrixStack matrices, int startX, int startY, int endX, int endY, int colorStart, int colorEnd) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void fillGradient(MatrixStack matrices, int startX, int startY, int endX, int endY, int colorStart, int colorEnd, int z) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void fillGradient(Matrix4f matrix, BufferBuilder bufferBuilder, int startX, int startY, int endX, int endY, int z, int colorStart, int colorEnd) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawCenteredText(MatrixStack matrices, TextRenderer textRenderer, String text, int centerX, int y, int color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawCenteredText(MatrixStack matrices, TextRenderer textRenderer, Text text, int centerX, int y, int color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawCenteredTextWithShadow(MatrixStack matrices, TextRenderer textRenderer, OrderedText text, int centerX, int y, int color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawStringWithShadow(MatrixStack matrices, TextRenderer textRenderer, String text, int x, int y, int color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawWithShadow(MatrixStack matrices, TextRenderer textHandler, OrderedText text, int x, int y, int color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawTextWithShadow(MatrixStack matrices, TextRenderer textRenderer, Text text, int x, int y, int color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void drawWithOutline(int x, int y, BiConsumer<Integer, Integer> renderAction) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawSprite(MatrixStack matrices, int x, int y, int z, int width, int height, Sprite sprite) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void drawTexture(MatrixStack matrices, int x, int y, int u, int v, int width, int height) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawTexture(MatrixStack matrices, int x, int y, int z, float u, float v, int width, int height, int textureHeight, int textureWidth) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawTexture(MatrixStack matrices, int x, int y, int width, int height, float u, float v, int regionWidth, int regionHeight, int textureWidth, int textureHeight) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawTexture(MatrixStack matrices, int x, int y, float u, float v, int width, int height, int textureWidth, int textureHeight) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void drawTexture(MatrixStack matrices, int x0, int y0, int x1, int y1, int z, int regionWidth, int regionHeight, float u, float v, int textureWidth, int textureHeight) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void drawTexturedQuad(Matrix4f matrices, int x0, int x1, int y0, int y1, int z, float u0, float u1, float v0, float v1) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int getZOffset() {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void setZOffset(int zOffset) {
        // Source of original method is not available
    }
}
