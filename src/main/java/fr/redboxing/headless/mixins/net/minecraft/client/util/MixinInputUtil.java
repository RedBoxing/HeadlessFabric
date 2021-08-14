package fr.redboxing.headless.mixins.net.minecraft.client.util;

import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(InputUtil.class)
public class MixinInputUtil {
    private static final InputUtil.Key DUMMY_KEY = InputUtil.Type.KEYSYM.createFromCode(-1);

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static InputUtil.Key fromKeyCode(int keyCode, int scanCode) {
        return DUMMY_KEY;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static InputUtil.Key fromTranslationKey(String translationKey) {
        // Source of original method is not available
        return DUMMY_KEY;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static boolean isKeyPressed(long handle, int code) {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setKeyboardCallbacks(long handle, GLFWKeyCallbackI keyCallback, GLFWCharModsCallbackI charModsCallback) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setMouseCallbacks(long handle, GLFWCursorPosCallbackI cursorPosCallback, GLFWMouseButtonCallbackI mouseButtonCallback, GLFWScrollCallbackI scrollCallback, GLFWDropCallbackI gLFWDropCallbackI) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setCursorParameters(long handler, int inputModeValue, double x, double y) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static boolean isRawMouseMotionSupported() {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setRawMouseMotionMode(long window, boolean value) {
        // Source of original method is not available
    }
}
