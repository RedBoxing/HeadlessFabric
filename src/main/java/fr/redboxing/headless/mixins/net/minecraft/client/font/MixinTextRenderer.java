package fr.redboxing.headless.mixins.net.minecraft.client.font;

import net.minecraft.client.font.GlyphRenderer;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.OrderedText;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.Text;
import net.minecraft.util.math.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.ArrayList;
import java.util.List;

@Mixin(TextRenderer.class)
public class MixinTextRenderer {
    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int drawWithShadow(MatrixStack matrices, String text, float x, float y, int color) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int drawWithShadow(MatrixStack matrices, String text, float x, float y, int color, boolean rightToLeft) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int draw(MatrixStack matrices, String text, float x, float y, int color) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int drawWithShadow(MatrixStack matrices, OrderedText text, float x, float y, int color) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int drawWithShadow(MatrixStack matrices, Text text, float x, float y, int color) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int draw(MatrixStack matrices, OrderedText text, float x, float y, int color) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int draw(MatrixStack matrices, Text text, float x, float y, int color) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public String mirror(String text) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private int draw(String text, float x, float y, int color, Matrix4f matrix, boolean shadow, boolean mirror) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private int draw(OrderedText text, float x, float y, int color, Matrix4f matrix, boolean shadow) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int draw(String text, float x, float y, int color, boolean shadow, Matrix4f matrix, VertexConsumerProvider vertexConsumers, boolean seeThrough, int backgroundColor, int light) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int draw(String text, float x, float y, int color, boolean shadow, Matrix4f matrix, VertexConsumerProvider vertexConsumers, boolean seeThrough, int backgroundColor, int light, boolean rightToLeft) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int draw(Text text, float x, float y, int color, boolean shadow, Matrix4f matrix, VertexConsumerProvider vertexConsumers, boolean seeThrough, int backgroundColor, int light) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int draw(OrderedText text, float x, float y, int color, boolean shadow, Matrix4f matrix, VertexConsumerProvider vertexConsumers, boolean seeThrough, int backgroundColor, int light) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void drawWithOutline(OrderedText text, float x, float y, int color, int outlineColor, Matrix4f matrix, VertexConsumerProvider vertexConsumers, int light) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static int tweakTransparency(int argb) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private int drawInternal(String text, float x, float y, int color, boolean shadow, Matrix4f matrix, VertexConsumerProvider vertexConsumers, boolean seeThrough, int backgroundColor, int light, boolean mirror) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private int drawInternal(OrderedText text, float x, float y, int color, boolean shadow, Matrix4f matrix, VertexConsumerProvider vertexConsumerProvider, boolean seeThrough, int backgroundColor, int light) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private float drawLayer(String text, float x, float y, int color, boolean shadow, Matrix4f matrix, VertexConsumerProvider vertexConsumerProvider, boolean seeThrough, int underlineColor, int light) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private float drawLayer(OrderedText text, float x, float y, int color, boolean shadow, Matrix4f matrix, VertexConsumerProvider vertexConsumerProvider, boolean seeThrough, int underlineColor, int light) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void drawGlyph(GlyphRenderer glyphRenderer, boolean bold, boolean italic, float weight, float x, float y, Matrix4f matrix, VertexConsumer vertexConsumer, float red, float green, float blue, float alpha, int light) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int getWidth(String text) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int getWidth(StringVisitable text) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int getWidth(OrderedText text) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public String trimToWidth(String text, int maxWidth, boolean backwards) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public String trimToWidth(String text, int maxWidth) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public StringVisitable trimToWidth(StringVisitable text, int width) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void drawTrimmed(StringVisitable text, int x, int y, int maxWidth, int color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int getWrappedLinesHeight(String text, int maxWidth) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public List<OrderedText> wrapLines(StringVisitable text, int width) {
        return new ArrayList<>();
    }
}
