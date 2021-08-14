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

import java.util.Collection;

@Mixin(WorldRenderer.class)
public class MixinWorldRenderer {
    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderWeather(LightmapTextureManager manager, float f, double d, double e, double g) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void tickRainSplashing(Camera camera) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void close() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void reload(ResourceManager manager) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void loadEntityOutlineShader() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void loadTransparencyShader() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void resetTransparencyShader() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void drawEntityOutlinesFramebuffer() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public boolean canDrawEntityOutlines() {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderDarkSky() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderLightSky() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void method_34550(BufferBuilder bufferBuilder, float f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderStars() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderStars(BufferBuilder buffer) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void setWorld(@Nullable ClientWorld world) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void reloadTransparencyShader() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void reload() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void clearChunkRenderers() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void onResized(int width, int height) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public String getChunksDebugString() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public ChunkBuilder getChunkBuilder() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public double getChunkCount() {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public double getViewDistance() {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public int getCompletedChunkCount() {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public String getEntitiesDebugString() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void setupTerrain(Camera camera, Frustum frustum, boolean hasForcedFrustum, int frame, boolean spectator) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void method_34808(Frustum frustum, int i, boolean bl, Vec3d vec3d, BlockPos blockPos, ChunkBuilder.BuiltChunk builtChunk, int j, BlockPos blockPos2) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    private ChunkBuilder.BuiltChunk getAdjacentChunk(BlockPos pos, ChunkBuilder.BuiltChunk chunk, Direction direction) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void captureFrustum(Matrix4f modelMatrix, Matrix4f matrix4f, double x, double y, double z, Frustum frustum) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void setupFrustum(MatrixStack matrices, Vec3d pos, Matrix4f projectionMatrix) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void render(MatrixStack matrices, float tickDelta, long limitTime, boolean renderBlockOutline, Camera camera, GameRenderer gameRenderer, LightmapTextureManager lightmapTextureManager, Matrix4f matrix4f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void checkEmpty(MatrixStack matrices) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderEntity(Entity entity, double cameraX, double cameraY, double cameraZ, float tickDelta, MatrixStack matrices, VertexConsumerProvider vertexConsumers) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderLayer(RenderLayer renderLayer, MatrixStack matrices, double d, double e, double f, Matrix4f matrix4f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderChunkDebugInfo(Camera camera) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void method_22984(VertexConsumer vertexConsumer, int i) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void method_22985(VertexConsumer vertexConsumer, int i, int j, int k, int l, int m, int n, int o) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void captureFrustum() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void killFrustum() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void tick() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void removeBlockBreakingInfo(BlockBreakingInfo info) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderEndSky(MatrixStack matrices) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void renderSky(MatrixStack matrices, Matrix4f matrix4f, float f, Runnable runnable) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void renderClouds(MatrixStack matrices, Matrix4f matrix4f, float f, double d, double e, double g) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderClouds(BufferBuilder builder, double x, double y, double z, Vec3d color) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void updateChunks(long limitTime) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderWorldBorder(Camera camera) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void drawBlockOutline(MatrixStack matrices, VertexConsumer vertexConsumer, Entity entity, double d, double e, double f, BlockPos blockPos, BlockState blockState) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void method_22983(MatrixStack matrixStack, VertexConsumer vertexConsumer, VoxelShape voxelShape, double d, double e, double f, float g, float h, float i, float j) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private static void drawShapeOutline(MatrixStack matrices, VertexConsumer vertexConsumer, VoxelShape voxelShape, double d, double e, double f, float g, float h, float i, float j) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void method_35773(VertexConsumer vertexConsumer, double d, double e, double f, double g, double h, double i, float j, float k, float l, float m) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawBox(MatrixStack matrices, VertexConsumer vertexConsumer, Box box, float red, float green, float blue, float alpha) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawBox(MatrixStack matrices, VertexConsumer vertexConsumer, double x1, double y1, double z1, double x2, double y2, double z2, float red, float green, float blue, float alpha) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawBox(MatrixStack matrices, VertexConsumer vertexConsumer, double x1, double y1, double z1, double x2, double y2, double z2, float red, float green, float blue, float alpha, float xAxisRed, float yAxisGreen, float zAxisBlue) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static void drawBox(BufferBuilder buffer, double x1, double y1, double z1, double x2, double y2, double z2, float red, float green, float blue, float alpha) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void updateBlock(BlockView world, BlockPos pos, BlockState oldState, BlockState newState, int flags) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void scheduleSectionRender(BlockPos pos, boolean important) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void scheduleBlockRenders(int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void scheduleBlockRerenderIfNeeded(BlockPos pos, BlockState old, BlockState updated) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void scheduleBlockRenders(int x, int y, int z) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void scheduleBlockRender(int x, int y, int z) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void scheduleChunkRender(int x, int y, int z, boolean important) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void playSong(@Nullable SoundEvent song, BlockPos songPosition) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void updateEntitiesForSong(World world, BlockPos pos, boolean playing) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void addParticle(ParticleEffect parameters, boolean shouldAlwaysSpawn, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void addParticle(ParticleEffect parameters, boolean shouldAlwaysSpawn, boolean important, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private <T extends ParticleEffect> void addParticle(T parameters, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    private Particle spawnParticle(ParticleEffect parameters, boolean alwaysSpawn, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    private Particle spawnParticle(ParticleEffect parameters, boolean alwaysSpawn, boolean canSpawnOnMinimal, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private ParticlesMode getRandomParticleSpawnChance(boolean canSpawnOnMinimal) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void method_3267() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void processGlobalEvent(int eventId, BlockPos pos, int i) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void processWorldEvent(PlayerEntity source, int eventId, BlockPos pos, int data) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void setBlockBreakingInfo(int entityId, BlockPos pos, int stage) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public boolean isTerrainRenderComplete() {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void scheduleTerrainUpdate() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void updateNoCullingBlockEntities(Collection<BlockEntity> removed, Collection<BlockEntity> added) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static int getLightmapCoordinates(BlockRenderView world, BlockPos pos) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static int getLightmapCoordinates(BlockRenderView world, BlockState state, BlockPos pos) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public Framebuffer getEntityOutlinesFramebuffer() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public Framebuffer getTranslucentFramebuffer() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public Framebuffer getEntityFramebuffer() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public Framebuffer getParticlesFramebuffer() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public Framebuffer getWeatherFramebuffer() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public Framebuffer getCloudsFramebuffer() {
        // Source of original method is not available
        return null;
    }
}
