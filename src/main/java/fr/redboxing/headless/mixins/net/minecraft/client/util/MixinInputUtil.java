package fr.redboxing.headless.mixins.net.minecraft.client.util;

import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(InputUtil.class)
public class MixinInputUtil {
    private static final InputUtil.Key DUMMY_KEY = InputUtil.Type.KEYSYM.createFromCode(-1);

    @Inject(method = "fromKeyCode", at = @At("HEAD"), cancellable = true)
    private static void fromKeyCode(int keyCode, int scanCode, CallbackInfoReturnable<InputUtil.Key> cir) {
        cir.setReturnValue(DUMMY_KEY);
    }

    @Inject(method = "fromTranslationKey", at = @At("HEAD"), cancellable = true)
    private static void fromTranslationKey(String translationKey, CallbackInfoReturnable<InputUtil.Key> cir) {
        cir.setReturnValue(DUMMY_KEY);
    }

    @Inject(method = "isKeyPressed", at = @At("HEAD"), cancellable = true)
    private static void isKeyPressed(long handle, int code, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(method = "setKeyboardCallbacks", at = @At("HEAD"), cancellable = true)
    private static void setKeyboardCallbacks(long handle, GLFWKeyCallbackI keyCallback, GLFWCharModsCallbackI charModsCallback, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setMouseCallbacks", at = @At("HEAD"), cancellable = true)
    private static void setMouseCallbacks(long handle, GLFWCursorPosCallbackI cursorPosCallback, GLFWMouseButtonCallbackI mouseButtonCallback, GLFWScrollCallbackI scrollCallback, GLFWDropCallbackI gLFWDropCallbackI, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setCursorParameters", at = @At("HEAD"), cancellable = true)
    private static void setCursorParameters(long handler, int inputModeValue, double x, double y, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "isRawMouseMotionSupported", at = @At("HEAD"), cancellable = true)
    private static void isRawMouseMotionSupported(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(method = "setRawMouseMotionMode", at = @At("HEAD"), cancellable = true)
    private static void setRawMouseMotionMode(long window, boolean value, CallbackInfo ci) {
        ci.cancel();
    }
}
