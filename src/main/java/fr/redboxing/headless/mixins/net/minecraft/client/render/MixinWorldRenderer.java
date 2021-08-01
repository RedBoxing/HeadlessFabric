package fr.redboxing.headless.mixins.net.minecraft.client.render;

import net.minecraft.block.BlockState;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldRenderer.class)
public class MixinWorldRenderer {
    @Inject(method = "addParticle(Lnet/minecraft/particle/ParticleEffect;ZZDDDDDD)V", at = @At("HEAD"), cancellable = true)
    private void addParticleHook(ParticleEffect parameters, boolean shouldAlwaysSpawn, boolean important, double x, double y, double z, double velocityX, double velocityY, double velocityZ, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "scheduleBlockRerenderIfNeeded", at = @At("HEAD"), cancellable = true)
    private void scheduleBlockRerenderIfNeededHook(BlockPos pos, BlockState old, BlockState updated, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "processWorldEvent", at = @At("HEAD"), cancellable = true)
    private void processWorldEventHook(PlayerEntity source, int eventId, BlockPos pos, int data, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "processGlobalEvent", at = @At("HEAD"), cancellable = true)
    private void processGlobalEventHook(int eventId, BlockPos pos, int i, CallbackInfo ci) {
        ci.cancel();
    }
}
