package fr.redboxing.headless.mixins.net.minecraft.client.render;

import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.resource.ResourceFactory;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GameRenderer.class)
public class MixinGameRenderer {
    @Inject(method = "loadShader(Lnet/minecraft/util/Identifier;)V", at = @At("HEAD"), cancellable = true)
    private void loadShader(Identifier id, CallbackInfo ci) {
        ci.cancel();
    }

   @Inject(method = "preloadShaders", at = @At("HEAD"), cancellable = true)
    public void preloadShaders(ResourceFactory factory, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "loadShader(Lnet/minecraft/resource/ResourceFactory;Ljava/lang/String;Lnet/minecraft/client/render/VertexFormat;)Lnet/minecraft/client/render/Shader;", at = @At("HEAD"), cancellable = true)
    private void loadShader(ResourceFactory factory, String name, VertexFormat vertexFormat, CallbackInfoReturnable<Shader> cir) {
        cir.setReturnValue(null);
    }

    @Inject(method = "loadShaders", at = @At("HEAD"), cancellable = true)
    public void loadShaders(ResourceManager manager, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    public void render(float tickDelta, long startTime, boolean tick, CallbackInfo ci) {
        ci.cancel();
    }
}
