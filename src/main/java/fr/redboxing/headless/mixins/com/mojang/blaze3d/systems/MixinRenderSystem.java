package fr.redboxing.headless.mixins.com.mojang.blaze3d.systems;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderCall;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.Shader;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Matrix4f;
import net.minecraft.util.math.Vec3f;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Group;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

@Mixin(value = RenderSystem.class, remap = false)
public class MixinRenderSystem {
  /*  @Inject(method = "initRenderThread", at = @At("HEAD"), cancellable = true)
    private static void initRenderThread(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "isOnRenderThread", at = @At("HEAD"), cancellable = true)
    private static void isOnRenderThread(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(method = "isOnRenderThreadOrInit", at = @At("HEAD"), cancellable = true)
    private static void isOnRenderThreadOrInit(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(method = "initGameThread", at = @At("HEAD"), cancellable = true)
    private static void initGameThread(boolean assertNotRenderThread, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "isOnGameThread", at = @At("HEAD"), cancellable = true)
    private static void isOnGameThread(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(method = "isOnGameThreadOrInit", at = @At("HEAD"), cancellable = true)
    private static void isOnGameThreadOrInit(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(method = "assertThread", at = @At("HEAD"), cancellable = true)
    private static void assertThread(Supplier<Boolean> check, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "isInInitPhase", at = @At("HEAD"), cancellable = true)
    private static void isInInitPhase(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }

    @Inject(method = "recordRenderCall", at = @At("HEAD"), cancellable = true)
    private static void recordRenderCall(RenderCall renderCall, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "flipFrame", at = @At("HEAD"), cancellable = true)
    private static void flipFrame(long window, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "replayQueue", at = @At("HEAD"), cancellable = true)
    private static void replayQueue(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "limitDisplayFPS", at = @At("HEAD"), cancellable = true)
    private static void limitDisplayFPS(int fps, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "disableDepthTest", at = @At("HEAD"), cancellable = true)
    private static void disableDepthTest(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "enableDepthTest", at = @At("HEAD"), cancellable = true)
    private static void enableDepthTest(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "enableScissor", at = @At("HEAD"), cancellable = true)
    private static void enableScissor(int i, int j, int k, int l, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "disableScissor", at = @At("HEAD"), cancellable = true)
    private static void disableScissor(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "depthFunc", at = @At("HEAD"), cancellable = true)
    private static void depthFunc(int func, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "depthMask", at = @At("HEAD"), cancellable = true)
    private static void depthMask(boolean mask, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "enableBlend", at = @At("HEAD"), cancellable = true)
    private static void enableBlend(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "disableBlend", at = @At("HEAD"), cancellable = true)
    private static void disableBlend(CallbackInfo ci) {
        ci.cancel();
    }

    @Group(name = "blendFunc")
    @Inject(method = "blendFunc(Lcom/mojang/blaze3d/platform/GlStateManager$SrcFactor;Lcom/mojang/blaze3d/platform/GlStateManager$DstFactor;)V", at = @At("HEAD"), cancellable = true)
    private static void blendFuncDev(GlStateManager.SrcFactor srcFactor, GlStateManager.DstFactor dstFactor, CallbackInfo ci) {
        ci.cancel();
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @Group(name = "blendFunc")
    @Inject(method = "blendFunc(Lcom/mojang/blaze3d/platform/GlStateManager$class_4535;Lcom/mojang/blaze3d/platform/GlStateManager$class_4534;)V", at = @At("HEAD"), cancellable = true)
    private static void blendFuncProd(GlStateManager.SrcFactor srcFactor, GlStateManager.DstFactor dstFactor, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "blendFunc(II)V", at = @At("HEAD"), cancellable = true)
    private static void blendFunc(int srcFactor, int dstFactor, CallbackInfo ci) {
        ci.cancel();
    }

    @Group(name = "blendFuncSeparate")
    @Inject(method = "blendFuncSeparate(Lcom/mojang/blaze3d/platform/GlStateManager$SrcFactor;Lcom/mojang/blaze3d/platform/GlStateManager$DstFactor;Lcom/mojang/blaze3d/platform/GlStateManager$SrcFactor;Lcom/mojang/blaze3d/platform/GlStateManager$DstFactor;)V", at = @At("HEAD"), cancellable = true)
    private static void blendFuncSeparateDev(GlStateManager.SrcFactor srcFactor, GlStateManager.DstFactor dstFactor, GlStateManager.SrcFactor srcAlpha, GlStateManager.DstFactor dstAlpha, CallbackInfo ci) {
        ci.cancel();
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @Group(name = "blendFuncSeparate")
    @Inject(method = "blendFuncSeparate(Lcom/mojang/blaze3d/platform/GlStateManager$class_4535;Lcom/mojang/blaze3d/platform/GlStateManager$class_4534;Lcom/mojang/blaze3d/platform/GlStateManager$class_4535;Lcom/mojang/blaze3d/platform/GlStateManager$class_4534;)V", at = @At("HEAD"), cancellable = true)
    private static void blendFuncSeparateProd(GlStateManager.SrcFactor srcFactor, GlStateManager.DstFactor dstFactor, GlStateManager.SrcFactor srcAlpha, GlStateManager.DstFactor dstAlpha, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "blendFuncSeparate(IIII)V", at = @At("HEAD"), cancellable = true)
    private static void blendFuncSeparate(int srcFactorRGB, int dstFactorRGB, int srcFactorAlpha, int dstFactorAlpha, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "blendEquation", at = @At("HEAD"), cancellable = true)
    private static void blendEquation(int mode, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "enableCull", at = @At("HEAD"), cancellable = true)
    private static void enableCull(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "disableCull", at = @At("HEAD"), cancellable = true)
    private static void disableCull(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "polygonMode", at = @At("HEAD"), cancellable = true)
    private static void polygonMode(int i, int j, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "enablePolygonOffset", at = @At("HEAD"), cancellable = true)
    private static void enablePolygonOffset(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "disablePolygonOffset", at = @At("HEAD"), cancellable = true)
    private static void disablePolygonOffset(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "polygonOffset", at = @At("HEAD"), cancellable = true)
    private static void polygonOffset(float factor, float units, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "enableColorLogicOp", at = @At("HEAD"), cancellable = true)
    private static void enableColorLogicOp(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "disableColorLogicOp", at = @At("HEAD"), cancellable = true)
    private static void disableColorLogicOp(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "logicOp", at = @At("HEAD"), cancellable = true)
    private static void logicOp(GlStateManager.LogicOp op, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "activeTexture", at = @At("HEAD"), cancellable = true)
    private static void activeTexture(int texture, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "enableTexture", at = @At("HEAD"), cancellable = true)
    private static void enableTexture(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "disableTexture", at = @At("HEAD"), cancellable = true)
    private static void disableTexture(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "texParameter", at = @At("HEAD"), cancellable = true)
    private static void texParameter(int target, int pname, int param, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "deleteTexture", at = @At("HEAD"), cancellable = true)
    private static void deleteTexture(int texture, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "bindTextureForSetup", at = @At("HEAD"), cancellable = true)
    private static void bindTextureForSetup(int i, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "bindTexture", at = @At("HEAD"), cancellable = true)
    private static void bindTexture(int texture, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "viewport", at = @At("HEAD"), cancellable = true)
    private static void viewport(int x, int y, int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "colorMask", at = @At("HEAD"), cancellable = true)
    private static void colorMask(boolean red, boolean green, boolean blue, boolean alpha, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "stencilFunc", at = @At("HEAD"), cancellable = true)
    private static void stencilFunc(int func, int ref, int mask, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "stencilMask", at = @At("HEAD"), cancellable = true)
    private static void stencilMask(int i, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "stencilOp", at = @At("HEAD"), cancellable = true)
    private static void stencilOp(int sfail, int dpfail, int dppass, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "clearDepth", at = @At("HEAD"), cancellable = true)
    private static void clearDepth(double depth, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "clearColor", at = @At("HEAD"), cancellable = true)
    private static void clearColor(float red, float green, float blue, float alpha, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "clearStencil", at = @At("HEAD"), cancellable = true)
    private static void clearStencil(int i, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "clear", at = @At("HEAD"), cancellable = true)
    private static void clear(int mask, boolean getError, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setShaderFogStart", at = @At("HEAD"), cancellable = true)
    private static void setShaderFogStart(float f, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_setShaderFogStart", at = @At("HEAD"), cancellable = true)
    private static void _setShaderFogStart(float f, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getShaderFogStart", at = @At("HEAD"), cancellable = true)
    private static void getShaderFogStart(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(0.0F);
    }

    @Inject(method = "setShaderFogEnd", at = @At("HEAD"), cancellable = true)
    private static void setShaderFogEnd(float f, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_setShaderFogEnd", at = @At("HEAD"), cancellable = true)
    private static void _setShaderFogEnd(float f, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getShaderFogEnd", at = @At("HEAD"), cancellable = true)
    private static void getShaderFogEnd(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(0.0F);
    }

    @Inject(method = "setShaderFogColor(FFFF)V", at = @At("HEAD"), cancellable = true)
    private static void setShaderFogColor(float f, float g, float h, float i, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setShaderFogColor(FFF)V", at = @At("HEAD"), cancellable = true)
    private static void setShaderFogColor(float f, float g, float h, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_setShaderColor", at = @At("HEAD"), cancellable = true)
    private static void _setShaderFogColor(float f, float g, float h, float i, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getShaderFogColor", at = @At("HEAD"), cancellable = true)
    private static void getShaderFogColor(CallbackInfoReturnable<float[]> cir) {
        cir.setReturnValue(new float[0]);
    }

    @Inject(method = "setShaderLights", at = @At("HEAD"), cancellable = true)
    private static void setShaderLights(Vec3f vec3f, Vec3f vec3f2, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_setShaderLights", at = @At("HEAD"), cancellable = true)
    private static void _setShaderLights(Vec3f vec3f, Vec3f vec3f2, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setupShaderLights", at = @At("HEAD"), cancellable = true)
    private static void setupShaderLights(Shader shader, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setShaderColor", at = @At("HEAD"), cancellable = true)
    private static void setShaderColor(float f, float g, float h, float i, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_setShaderColor", at = @At("HEAD"), cancellable = true)
    private static void _setShaderColor(float f, float g, float h, float i, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getShaderColor", at = @At("HEAD"), cancellable = true)
    private static void getShaderColor(CallbackInfoReturnable<float[]> cir) {
        cir.setReturnValue(new float[0]);
    }

    @Inject(method = "drawElements", at = @At("HEAD"), cancellable = true)
    private static void drawElements(int mode, int first, int count, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "lineWidth", at = @At("HEAD"), cancellable = true)
    private static void lineWidth(float width, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getShaderLineWidth", at = @At("HEAD"), cancellable = true)
    private static void getShaderLineWidth(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(0.0F);
    }

    @Inject(method = "pixelStore", at = @At("HEAD"), cancellable = true)
    private static void pixelStore(int pname, int param, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "readPixels", at = @At("HEAD"), cancellable = true)
    private static void readPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getString", at = @At("HEAD"), cancellable = true)
    private static void getString(int name, Consumer<String> consumer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getBackendDescription", at = @At("HEAD"), cancellable = true)
    private static void getBackendDescription(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("");
    }

    @Inject(method = "getApiDescription", at = @At("HEAD"), cancellable = true)
    private static void getApiDescription(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("");
    }

    @Inject(method = "initBackendSystem", at = @At("HEAD"), cancellable = true)
    private static void initBackendSystem(CallbackInfoReturnable<LongSupplier> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "initRenderer", at = @At("HEAD"), cancellable = true)
    private static void initRenderer(int debugVerbosity, boolean debugSync, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setErrorCallback", at = @At("HEAD"), cancellable = true)
    private static void setErrorCallback(GLFWErrorCallbackI callback, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "renderCrosshair", at = @At("HEAD"), cancellable = true)
    private static void renderCrosshair(int size, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getCapsString", at = @At("HEAD"), cancellable = true)
    private static void getCapsString(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("");
    }

    @Inject(method = "setupDefaultState", at = @At("HEAD"), cancellable = true)
    private static void setupDefaultState(int x, int y, int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "maxSupportedTextureSize", at = @At("HEAD"), cancellable = true)
    private static void maxSupportedTextureSize(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "glBindBuffer", at = @At("HEAD"), cancellable = true)
    private static void glBindBuffer(int i, IntSupplier intSupplier, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glBindVertexArray", at = @At("HEAD"), cancellable = true)
    private static void glBindVertexArray(Supplier<Integer> supplier, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glBufferData", at = @At("HEAD"), cancellable = true)
    private static void glBufferData(int target, ByteBuffer data, int usage, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glDeleteBuffers", at = @At("HEAD"), cancellable = true)
    private static void glDeleteBuffers(int buffer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glDeleteVertexArrays", at = @At("HEAD"), cancellable = true)
    private static void glDeleteVertexArrays(int i, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniform1i", at = @At("HEAD"), cancellable = true)
    private static void glUniform1i(int location, int value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniform1(ILjava/nio/IntBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void glUniform1(int location, IntBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniform2(ILjava/nio/IntBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void glUniform2(int location, IntBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniform3(ILjava/nio/IntBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void glUniform3(int location, IntBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniform4(ILjava/nio/IntBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void glUniform4(int location, IntBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniform1(ILjava/nio/FloatBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void glUniform1(int location, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniform2(ILjava/nio/FloatBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void glUniform2(int location, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniform3(ILjava/nio/FloatBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void glUniform3(int location, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniform4(ILjava/nio/FloatBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void glUniform4(int location, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniformMatrix2", at = @At("HEAD"), cancellable = true)
    private static void glUniformMatrix2(int location, boolean transpose, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniformMatrix3", at = @At("HEAD"), cancellable = true)
    private static void glUniformMatrix3(int location, boolean transpose, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glUniformMatrix4", at = @At("HEAD"), cancellable = true)
    private static void glUniformMatrix4(int location, boolean transpose, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setupOverlayColor", at = @At("HEAD"), cancellable = true)
    private static void setupOverlayColor(IntSupplier texture, int size, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "teardownOverlayColor", at = @At("HEAD"), cancellable = true)
    private static void teardownOverlayColor(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setupLevelDiffuseLighting", at = @At("HEAD"), cancellable = true)
    private static void setupLevelDiffuseLighting(Vec3f vec3f, Vec3f vec3f2, Matrix4f matrix4f, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setupGuiFlatDiffuseLighting", at = @At("HEAD"), cancellable = true)
    private static void setupGuiFlatDiffuseLighting(Vec3f vec3f, Vec3f vec3f2, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setupGui3DDiffuseLighting", at = @At("HEAD"), cancellable = true)
    private static void setupGui3DDiffuseLighting(Vec3f vec3f, Vec3f vec3f2, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "beginInitialization", at = @At("HEAD"), cancellable = true)
    private static void beginInitialization(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "finishInitialization", at = @At("HEAD"), cancellable = true)
    private static void finishInitialization(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glGenBuffers", at = @At("HEAD"), cancellable = true)
    private static void glGenBuffers(Consumer<Integer> consumer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glGenVertexArrays", at = @At("HEAD"), cancellable = true)
    private static void glGenVertexArrays(Consumer<Integer> consumer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "renderThreadTesselator", at = @At("HEAD"), cancellable = true)
    private static void renderThreadTesselator(CallbackInfoReturnable<Tessellator> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "defaultBlendFunc", at = @At("HEAD"), cancellable = true)
    private static void defaultBlendFunc(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "runAsFancy", at = @At("HEAD"), cancellable = true)
    private static void runAsFancy(Runnable runnable, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setShader", at = @At("HEAD"), cancellable = true)
    private static void setShader(Supplier<Shader> supplier, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getShader", at = @At("HEAD"), cancellable = true)
    private static void getShader(CallbackInfoReturnable<Shader> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "getTextureId", at = @At("HEAD"), cancellable = true)
    private static void getTextureId(int i, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Group(name = "setShaderTexture")
    @Inject(method = "setShaderTexture(ILnet/minecraft/util/Identifier;)V", at = @At("HEAD"), cancellable = true)
    private static void setShaderTextureDev(int i, Identifier identifier, CallbackInfo ci) {
        ci.cancel();
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @Group(name = "setShaderTexture")
    @Inject(method = "setShaderTexture(ILnet/minecraft/class_2960;)V", at = @At("HEAD"), cancellable = true)
    private static void setShaderTextureProd(int i, Identifier identifier, CallbackInfo ci) {
        ci.cancel();
    }

    @Group(name = "_setShaderTexture")
    @Inject(method = "_setShaderTexture(ILnet/minecraft/util/Identifier;)V", at = @At("HEAD"), cancellable = true)
    private static void _setShaderTextureDev(int i, Identifier identifier, CallbackInfo ci) {
        ci.cancel();
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @Group(name = "_setShaderTexture")
    @Inject(method = "_setShaderTexture(ILnet/minecraft/class_2960;)V", at = @At("HEAD"), cancellable = true)
    private static void _setShaderTextureProd(int i, Identifier identifier, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setShaderTexture(II)V", at = @At("HEAD"), cancellable = true)
    private static void setShaderTexture(int i, int j, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_setShaderTexture(II)V", at = @At("HEAD"), cancellable = true)
    private static void _setShaderTexture(int i, int j, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getShaderTexture", at = @At("HEAD"), cancellable = true)
    private static void getShaderTexture(int i, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "setProjectionMatrix", at = @At("HEAD"), cancellable = true)
    private static void setProjectionMatrix(Matrix4f matrix4f, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "setTextureMatrix", at = @At("HEAD"), cancellable = true)
    private static void setTextureMatrix(Matrix4f matrix4f, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "resetTextureMatrix", at = @At("HEAD"), cancellable = true)
    private static void resetTextureMatrix(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "applyModelViewMatrix", at = @At("HEAD"), cancellable = true)
    private static void applyModelViewMatrix(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "backupProjectionMatrix", at = @At("HEAD"), cancellable = true)
    private static void backupProjectionMatrix(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_backupProjectionMatrix", at = @At("HEAD"), cancellable = true)
    private static void _backupProjectionMatrix(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "restoreProjectionMatrix", at = @At("HEAD"), cancellable = true)
    private static void restoreProjectionMatrix(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_restoreProjectionMatrix", at = @At("HEAD"), cancellable = true)
    private static void _restoreProjectionMatrix(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getProjectionMatrix", at = @At("HEAD"), cancellable = true)
    private static void getProjectionMatrix(CallbackInfoReturnable<Matrix4f> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "getModelViewMatrix", at = @At("HEAD"), cancellable = true)
    private static void getModelViewMatrix(CallbackInfoReturnable<Matrix4f> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "getModelViewStack", at = @At("HEAD"), cancellable = true)
    private static void getModelViewStack(CallbackInfoReturnable<MatrixStack> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "getTextureMatrix", at = @At("HEAD"), cancellable = true)
    private static void getTextureMatrix(CallbackInfoReturnable<Matrix4f> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "getSequentialBuffer", at = @At("HEAD"), cancellable = true)
    private static void getSequentialBuffer(VertexFormat.DrawMode drawMode, int i, CallbackInfoReturnable<RenderSystem.IndexBuffer> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "setShaderGameTime", at = @At("HEAD"), cancellable = true)
    private static void setShaderGameTime(long l, float f, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getShaderGameTime", at = @At("HEAD"), cancellable = true)
    private static void getShaderGameTime(CallbackInfoReturnable<Float> cir) {
        cir.setReturnValue(0.0F);
    }*/

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void initRenderThread() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static boolean isOnRenderThread() {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static boolean isOnRenderThreadOrInit() {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void initGameThread(boolean assertNotRenderThread) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static boolean isOnGameThread() {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static boolean isOnGameThreadOrInit() {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void assertThread(Supplier<Boolean> check) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static boolean isInInitPhase() {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void recordRenderCall(RenderCall renderCall) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void flipFrame(long window) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void replayQueue() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void limitDisplayFPS(int fps) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void disableDepthTest() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void enableDepthTest() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void enableScissor(int i, int j, int k, int l) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void disableScissor() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void depthFunc(int func) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void depthMask(boolean mask) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void enableBlend() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void disableBlend() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void blendFunc(GlStateManager.SrcFactor srcFactor, GlStateManager.DstFactor dstFactor) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void blendFunc(int srcFactor, int dstFactor) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void blendFuncSeparate(GlStateManager.SrcFactor srcFactor, GlStateManager.DstFactor dstFactor, GlStateManager.SrcFactor srcAlpha, GlStateManager.DstFactor dstAlpha) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void blendFuncSeparate(int srcFactorRGB, int dstFactorRGB, int srcFactorAlpha, int dstFactorAlpha) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void blendEquation(int mode) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void enableCull() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void disableCull() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void polygonMode(int i, int j) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void enablePolygonOffset() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void disablePolygonOffset() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void polygonOffset(float factor, float units) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void enableColorLogicOp() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void disableColorLogicOp() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void logicOp(GlStateManager.LogicOp op) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void activeTexture(int texture) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void enableTexture() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void disableTexture() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void texParameter(int target, int pname, int param) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void deleteTexture(int texture) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void bindTextureForSetup(int i) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void bindTexture(int texture) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void viewport(int x, int y, int width, int height) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void colorMask(boolean red, boolean green, boolean blue, boolean alpha) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void stencilFunc(int func, int ref, int mask) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void stencilMask(int i) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void stencilOp(int sfail, int dpfail, int dppass) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void clearDepth(double depth) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void clearColor(float red, float green, float blue, float alpha) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void clearStencil(int i) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void clear(int mask, boolean getError) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setShaderFogStart(float f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void _setShaderFogStart(float f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static float getShaderFogStart() {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setShaderFogEnd(float f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void _setShaderFogEnd(float f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static float getShaderFogEnd() {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setShaderFogColor(float f, float g, float h, float i) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setShaderFogColor(float f, float g, float h) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void _setShaderFogColor(float f, float g, float h, float i) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static float[] getShaderFogColor() {
        // Source of original method is not available
        return new float[0];
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setShaderLights(Vec3f vec3f, Vec3f vec3f2) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void _setShaderLights(Vec3f vec3f, Vec3f vec3f2) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setupShaderLights(Shader shader) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setShaderColor(float f, float g, float h, float i) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void _setShaderColor(float f, float g, float h, float i) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static float[] getShaderColor() {
        // Source of original method is not available
        return new float[0];
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawElements(int mode, int first, int count) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void lineWidth(float width) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static float getShaderLineWidth() {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void pixelStore(int pname, int param) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void readPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void getString(int name, Consumer<String> consumer) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static String getBackendDescription() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static String getApiDescription() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static LongSupplier initBackendSystem() {
        // Source of original method is not available
        return System::nanoTime;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void initRenderer(int debugVerbosity, boolean debugSync) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setErrorCallback(GLFWErrorCallbackI callback) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void renderCrosshair(int size) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static String getCapsString() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setupDefaultState(int x, int y, int width, int height) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static int maxSupportedTextureSize() {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glBindBuffer(int i, IntSupplier intSupplier) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glBindVertexArray(Supplier<Integer> supplier) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glBufferData(int target, ByteBuffer data, int usage) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glDeleteBuffers(int buffer) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glDeleteVertexArrays(int i) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniform1i(int location, int value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniform1(int location, IntBuffer value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniform2(int location, IntBuffer value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniform3(int location, IntBuffer value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniform4(int location, IntBuffer value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniform1(int location, FloatBuffer value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniform2(int location, FloatBuffer value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniform3(int location, FloatBuffer value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniform4(int location, FloatBuffer value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniformMatrix2(int location, boolean transpose, FloatBuffer value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniformMatrix3(int location, boolean transpose, FloatBuffer value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glUniformMatrix4(int location, boolean transpose, FloatBuffer value) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setupOverlayColor(IntSupplier texture, int size) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void teardownOverlayColor() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setupLevelDiffuseLighting(Vec3f vec3f, Vec3f vec3f2, Matrix4f matrix4f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setupGuiFlatDiffuseLighting(Vec3f vec3f, Vec3f vec3f2) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setupGui3DDiffuseLighting(Vec3f vec3f, Vec3f vec3f2) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void beginInitialization() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void finishInitialization() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glGenBuffers(Consumer<Integer> consumer) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void glGenVertexArrays(Consumer<Integer> consumer) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static Tessellator renderThreadTesselator() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void defaultBlendFunc() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Deprecated
    public static void runAsFancy(Runnable runnable) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setShader(Supplier<Shader> supplier) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static int getTextureId(int i) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setShaderTexture(int i, Identifier identifier) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void _setShaderTexture(int i, Identifier identifier) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setShaderTexture(int i, int j) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void _setShaderTexture(int i, int j) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static int getShaderTexture(int i) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setProjectionMatrix(Matrix4f matrix4f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setTextureMatrix(Matrix4f matrix4f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void resetTextureMatrix() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void applyModelViewMatrix() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void backupProjectionMatrix() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void _backupProjectionMatrix() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void restoreProjectionMatrix() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void _restoreProjectionMatrix() {
        // Source of original method is not available
    }


    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static RenderSystem.IndexBuffer getSequentialBuffer(VertexFormat.DrawMode drawMode, int i) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void setShaderGameTime(long l, float f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static float getShaderGameTime() {
        // Source of original method is not available
        return 0;
    }
}
