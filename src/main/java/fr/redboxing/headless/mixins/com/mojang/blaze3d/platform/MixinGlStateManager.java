package fr.redboxing.headless.mixins.com.mojang.blaze3d.platform;

import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.util.math.Matrix4f;
import net.minecraft.util.math.Vec3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Group;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;

@Mixin(value = GlStateManager.class, remap = false)
public class MixinGlStateManager {
    @Inject(method = "_disableScissorTest", at = @At("HEAD"), cancellable = true)
    private static void _disableScissorTest(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_enableScissorTest", at = @At("HEAD"), cancellable = true)
    private static void _enableScissorTest(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_scissorBox", at = @At("HEAD"), cancellable = true)
    private static void _scissorBox(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_disableDepthTest", at = @At("HEAD"), cancellable = true)
    private static void _disableDepthTest(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_enableDepthTest", at = @At("HEAD"), cancellable = true)
    private static void _enableDepthTest(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_depthFunc", at = @At("HEAD"), cancellable = true)
    private static void _depthFunc(int func, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_depthMask", at = @At("HEAD"), cancellable = true)
    private static void _depthMask(boolean mask, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_disableBlend", at = @At("HEAD"), cancellable = true)
    private static void _disableBlend(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_enableBlend", at = @At("HEAD"), cancellable = true)
    private static void _enableBlend(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_blendFunc", at = @At("HEAD"), cancellable = true)
    private static void _blendFunc(int srcFactor, int dstFactor, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_blendFuncSeparate", at = @At("HEAD"), cancellable = true)
    private static void _blendFuncSeparate(int srcFactorRGB, int dstFactorRGB, int srcFactorAlpha, int dstFactorAlpha, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_blendEquation", at = @At("HEAD"), cancellable = true)
    private static void _blendEquation(int mode, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glGetProgrami", at = @At("HEAD"), cancellable = true)
    private static void glGetProgrami(int program, int pname, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "glAttachShader", at = @At("HEAD"), cancellable = true)
    private static void glAttachShader(int program, int shader, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glDeleteShader", at = @At("HEAD"), cancellable = true)
    private static void glDeleteShader(int shader, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glCreateShader", at = @At("HEAD"), cancellable = true)
    private static void glCreateShader(int type, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "glShaderSource", at = @At("HEAD"), cancellable = true)
    private static void glShaderSource(int shader, List<String> strings, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glCompileShader", at = @At("HEAD"), cancellable = true)
    private static void glCompileShader(int shader, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glGetShaderi", at = @At("HEAD"), cancellable = true)
    private static void glGetShaderi(int shader, int pname, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_glUseProgram", at = @At("HEAD"), cancellable = true)
    private static void _glUseProgram(int program, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glCreateProgram", at = @At("HEAD"), cancellable = true)
    private static void glCreateProgram(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "glDeleteProgram", at = @At("HEAD"), cancellable = true)
    private static void glDeleteProgram(int program, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glLinkProgram", at = @At("HEAD"), cancellable = true)
    private static void glLinkProgram(int program, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glGetUniformLocation", at = @At("HEAD"), cancellable = true)
    private static void _glGetUniformLocation(int program, CharSequence name, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_glUniform1(ILjava/nio/IntBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void _glUniform1(int location, IntBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glUniform1i", at = @At("HEAD"), cancellable = true)
    private static void _glUniform1i(int location, int value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glUniform1(ILjava/nio/FloatBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void _glUniform1(int location, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glUniform2(ILjava/nio/IntBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void _glUniform2(int location, IntBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glUniform2(ILjava/nio/FloatBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void _glUniform2(int location, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glUniform3(ILjava/nio/IntBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void _glUniform3(int location, IntBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glUniform3(ILjava/nio/FloatBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void _glUniform3(int location, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glUniform4(ILjava/nio/IntBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void _glUniform4(int location, IntBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glUniform4(ILjava/nio/FloatBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void _glUniform4(int location, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glUniformMatrix2", at = @At("HEAD"), cancellable = true)
    private static void _glUniformMatrix2(int location, boolean transpose, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glUniformMatrix3", at = @At("HEAD"), cancellable = true)
    private static void _glUniformMatrix3(int location, boolean transpose, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glUniformMatrix4", at = @At("HEAD"), cancellable = true)
    private static void _glUniformMatrix4(int location, boolean transpose, FloatBuffer value, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glGetAttribLocation", at = @At("HEAD"), cancellable = true)
    private static void _glGetAttribLocation(int program, CharSequence name, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_glBindAttribLocation", at = @At("HEAD"), cancellable = true)
    private static void _glBindAttribLocation(int program, int index, CharSequence name, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glGenBuffers", at = @At("HEAD"), cancellable = true)
    private static void _glGenBuffers(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_glGenVertexArrays", at = @At("HEAD"), cancellable = true)
    private static void _glGenVertexArrays(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_glBindBuffer", at = @At("HEAD"), cancellable = true)
    private static void _glBindBuffer(int target, int buffer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glBindVertexArray", at = @At("HEAD"), cancellable = true)
    private static void _glBindVertexArray(int array, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glBufferData(ILjava/nio/ByteBuffer;I)V", at = @At("HEAD"), cancellable = true)
    private static void _glBufferData(int target, ByteBuffer data, int usage, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glBufferData(IJI)V", at = @At("HEAD"), cancellable = true)
    private static void _glBufferData(int target, long size, int usage, CallbackInfo ci) {
        ci.cancel();
    }

    @Group(name = "mapBuffer")
    @Inject(method = "mapBuffer", at = @At("HEAD"), cancellable = true)
    private static void mapBufferDEv(int target, int access, CallbackInfoReturnable<ByteBuffer> cir) {
       cir.setReturnValue(null);
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @Group(name = "mapBuffer")
    @Inject(method = "_glMapBuffer", at = @At("HEAD"), cancellable = true)
    private static void mapBufferProd(int target, int access, CallbackInfoReturnable<ByteBuffer> cir) {
       cir.setReturnValue(null);
    }

    @Inject(method = "_glUnmapBuffer", at = @At("HEAD"), cancellable = true)
    private static void _glUnmapBuffer(int target, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glDeleteBuffers", at = @At("HEAD"), cancellable = true)
    private static void _glDeleteBuffers(int buffer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glCopyTexSubImage2D", at = @At("HEAD"), cancellable = true)
    private static void _glCopyTexSubImage2D(int i, int j, int k, int l, int m, int n, int o, int p, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glDeleteVertexArrays", at = @At("HEAD"), cancellable = true)
    private static void _glDeleteVertexArrays(int array, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glBindFramebuffer", at = @At("HEAD"), cancellable = true)
    private static void _glBindFramebuffer(int target, int framebuffer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glBlitFrameBuffer", at = @At("HEAD"), cancellable = true)
    private static void _glBlitFrameBuffer(int srcX0, int srcY0, int srcX1, int srcY1, int dstX0, int dstY0, int dstX1, int dstY1, int mask, int filter, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glBindRenderbuffer", at = @At("HEAD"), cancellable = true)
    private static void _glBindRenderbuffer(int i, int j, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glDeleteRenderbuffers", at = @At("HEAD"), cancellable = true)
    private static void _glDeleteRenderbuffers(int i, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glDeleteFramebuffers", at = @At("HEAD"), cancellable = true)
    private static void _glDeleteFramebuffers(int framebuffer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glGenFramebuffers", at = @At("HEAD"), cancellable = true)
    private static void glGenFramebuffers(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "glGenRenderbuffers", at = @At("HEAD"), cancellable = true)
    private static void glGenRenderbuffers(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_glRenderbufferStorage", at = @At("HEAD"), cancellable = true)
    private static void _glRenderbufferStorage(int i, int j, int k, int l, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glFramebufferRenderbuffer", at = @At("HEAD"), cancellable = true)
    private static void _glFramebufferRenderbuffer(int i, int j, int k, int l, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glCheckFramebufferStatus", at = @At("HEAD"), cancellable = true)
    private static void glCheckFramebufferStatus(int target, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_glFramebufferTexture2D", at = @At("HEAD"), cancellable = true)
    private static void _glFramebufferTexture2D(int target, int attachment, int textureTarget, int texture, int level, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "getBoundFramebuffer", at = @At("HEAD"), cancellable = true)
    private static void getBoundFramebuffer(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "glActiveTexture", at = @At("HEAD"), cancellable = true)
    private static void glActiveTexture(int texture, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glBlendFuncSeparate", at = @At("HEAD"), cancellable = true)
    private static void glBlendFuncSeparate(int srcFactorRGB, int dstFactorRGB, int srcFactorAlpha, int dstFactorAlpha, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "glGetShaderInfoLog", at = @At("HEAD"), cancellable = true)
    private static void glGetShaderInfoLog(int shader, int maxLength, CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("");
    }

    @Inject(method = "glGetProgramInfoLog", at = @At("HEAD"), cancellable = true)
    private static void glGetProgramInfoLog(int program, int maxLength, CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("");
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

    @Inject(method = "_enableCull", at = @At("HEAD"), cancellable = true)
    private static void _enableCull(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_disableCull", at = @At("HEAD"), cancellable = true)
    private static void _disableCull(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_polygonMode", at = @At("HEAD"), cancellable = true)
    private static void _polygonMode(int face, int mode, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_enablePolygonOffset", at = @At("HEAD"), cancellable = true)
    private static void _enablePolygonOffset(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_disablePolygonOffset", at = @At("HEAD"), cancellable = true)
    private static void _disablePolygonOffset(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_polygonOffset", at = @At("HEAD"), cancellable = true)
    private static void _polygonOffset(float factor, float units, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_enableColorLogicOp", at = @At("HEAD"), cancellable = true)
    private static void _enableColorLogicOp(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_disableColorLogicOp", at = @At("HEAD"), cancellable = true)
    private static void _disableColorLogicOp(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_logicOp", at = @At("HEAD"), cancellable = true)
    private static void _logicOp(int op, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_activeTexture", at = @At("HEAD"), cancellable = true)
    private static void _activeTexture(int texture, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_enableTexture", at = @At("HEAD"), cancellable = true)
    private static void _enableTexture(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_disableTexture", at = @At("HEAD"), cancellable = true)
    private static void _disableTexture(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_texParameter(IIF)V", at = @At("HEAD"), cancellable = true)
    private static void _texParameter(int target, int pname, float param, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_texParameter(III)V", at = @At("HEAD"), cancellable = true)
    private static void _texParameter(int target, int pname, int param, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_getTexLevelParameter", at = @At("HEAD"), cancellable = true)
    private static void _getTexLevelParameter(int target, int level, int pname, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_genTexture", at = @At("HEAD"), cancellable = true)
    private static void _genTexture(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_genTextures", at = @At("HEAD"), cancellable = true)
    private static void _genTextures(int[] is, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_deleteTexture", at = @At("HEAD"), cancellable = true)
    private static void _deleteTexture(int texture, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_deleteTextures", at = @At("HEAD"), cancellable = true)
    private static void _deleteTextures(int[] is, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_bindTexture", at = @At("HEAD"), cancellable = true)
    private static void _bindTexture(int texture, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_getTextureId", at = @At("HEAD"), cancellable = true)
    private static void _getTextureId(int i, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_getActiveTexture", at = @At("HEAD"), cancellable = true)
    private static void _getActiveTexture(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_texImage2D", at = @At("HEAD"), cancellable = true)
    private static void _texImage2D(int target, int level, int internalFormat, int width, int height, int border, int format, int type, IntBuffer pixels, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_texSubImage2D", at = @At("HEAD"), cancellable = true)
    private static void _texSubImage2D(int target, int level, int offsetX, int offsetY, int width, int height, int format, int type, long pixels, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_getTexImage", at = @At("HEAD"), cancellable = true)
    private static void _getTexImage(int target, int level, int format, int type, long pixels, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_viewport", at = @At("HEAD"), cancellable = true)
    private static void _viewport(int x, int y, int width, int height, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_colorMask", at = @At("HEAD"), cancellable = true)
    private static void _colorMask(boolean red, boolean green, boolean blue, boolean alpha, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_stencilFunc", at = @At("HEAD"), cancellable = true)
    private static void _stencilFunc(int func, int ref, int mask, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_stencilMask", at = @At("HEAD"), cancellable = true)
    private static void _stencilMask(int mask, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_stencilOp", at = @At("HEAD"), cancellable = true)
    private static void _stencilOp(int sfail, int dpfail, int dppass, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_clearDepth", at = @At("HEAD"), cancellable = true)
    private static void _clearDepth(double depth, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_clearColor", at = @At("HEAD"), cancellable = true)
    private static void _clearColor(float red, float green, float blue, float alpha, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_clearStencil", at = @At("HEAD"), cancellable = true)
    private static void _clearStencil(int stencil, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_clear", at = @At("HEAD"), cancellable = true)
    private static void _clear(int mask, boolean getError, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_glDrawPixels", at = @At("HEAD"), cancellable = true)
    private static void _glDrawPixels(int i, int j, int k, int l, long m, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_vertexAttribPointer", at = @At("HEAD"), cancellable = true)
    private static void _vertexAttribPointer(int index, int size, int type, boolean normalized, int stride, long pointer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_vertexAttribIPointer", at = @At("HEAD"), cancellable = true)
    private static void _vertexAttribIPointer(int index, int size, int type, int stride, long pointer, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_enableVertexAttribArray", at = @At("HEAD"), cancellable = true)
    private static void _enableVertexAttribArray(int index, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_disableVertexAttribArray", at = @At("HEAD"), cancellable = true)
    private static void _disableVertexAttribArray(int index, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_drawElements", at = @At("HEAD"), cancellable = true)
    private static void _drawElements(int mode, int first, int type, long indices, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_pixelStore", at = @At("HEAD"), cancellable = true)
    private static void _pixelStore(int pname, int param, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_readPixels(IIIIIILjava/nio/ByteBuffer;)V", at = @At("HEAD"), cancellable = true)
    private static void _readPixels(int x, int y, int width, int height, int format, int type, ByteBuffer pixels, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_readPixels(IIIIIIJ)V", at = @At("HEAD"), cancellable = true)
    private static void _readPixels(int i, int j, int k, int l, int m, int n, long o, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "_getError", at = @At("HEAD"), cancellable = true)
    private static void _getError(CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }

    @Inject(method = "_getString", at = @At("HEAD"), cancellable = true)
    private static void _getString(int name, CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("");
    }

    @Inject(method = "_getInteger", at = @At("HEAD"), cancellable = true)
    private static void _getInteger(int pname, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }
}
