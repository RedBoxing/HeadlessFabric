package fr.redboxing.headless.mixins.net.minecraft.client.gl;

import net.minecraft.client.gl.WindowFramebuffer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(WindowFramebuffer.class)
public class MixinWindowFramebuffer {
    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void initSize(int width, int height) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private WindowFramebuffer.Size findSuitableSize(int width, int height) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private boolean supportColor(WindowFramebuffer.Size size) {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private boolean supportsDepth(WindowFramebuffer.Size size) {
        // Source of original method is not available
        return false;
    }
}
