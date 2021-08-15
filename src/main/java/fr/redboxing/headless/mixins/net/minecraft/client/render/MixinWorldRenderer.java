package fr.redboxing.headless.mixins.net.minecraft.client.render;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.option.ParticlesMode;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.render.*;
import net.minecraft.client.render.chunk.ChunkBuilder;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.resource.ResourceManager;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.*;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockRenderView;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Collection;

@Mixin(WorldRenderer.class)
public class MixinWorldRenderer {
    @Inject(method = "scheduleChunkRender", at = @At("HEAD"), cancellable = true)
    private void scheduleChunkRender(int x, int y, int z, boolean important, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "scheduleBlockRerenderIfNeeded", at = @At("HEAD"), cancellable = true)
    private void scheduleBlockRerenderIfNeeded(BlockPos pos, BlockState old, BlockState updated, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "processWorldEvent", at = @At("HEAD"), cancellable = true)
    private void processWorldEvent(PlayerEntity source, int eventId, BlockPos pos, int data, CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "processGlobalEvent", at = @At("HEAD"), cancellable = true)
    private void processGlobalEvent(int eventId, BlockPos pos, int i, CallbackInfo ci) {
        ci.cancel();
    }
}
