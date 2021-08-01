package fr.redboxing.headless.inject.replace;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.ShaderEffect;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.ResourceFactory;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.math.Matrix4f;
import net.minecraft.util.profiler.Profiler;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class EmptyGameRenderer extends GameRenderer {
    public EmptyGameRenderer(MinecraftClient client, ResourceManager resourceManager, BufferBuilderStorage buffers) {
        super(client, resourceManager, buffers);
    }

    @Override
    public void close() {

    }

    @Override
    public void setRenderHand(boolean renderHand) {

    }

    @Override
    public void setBlockOutlineEnabled(boolean blockOutlineEnabled) {

    }

    @Override
    public void setRenderingPanorama(boolean renderingPanorama) {

    }

    @Override
    public boolean isRenderingPanorama() {
        return false;
    }

    @Override
    public void disableShader() {

    }

    @Override
    public void toggleShadersEnabled() {

    }

    @Override
    public void onCameraEntitySet(@Nullable Entity entity) {

    }

    @Override
    public void loadForcedShader() {

    }

    @Override
    public void reload(ResourceManager manager) {

    }

    @Override
    public void preloadShaders(ResourceFactory factory) {

    }

    @Override
    public void loadShaders(ResourceManager manager) {

    }

    @Nullable
    @Override
    public Shader getShader(@Nullable String name) {
        return null;
    }

    @Override
    public void tick() {

    }

    @Nullable
    @Override
    public ShaderEffect getShader() {
        return null;
    }

    @Override
    public void onResized(int width, int height) {

    }

    @Override
    public void updateTargetedEntity(float tickDelta) {

    }

    @Override
    public void renderWithZoom(float zoom, float zoomX, float zoomY) {

    }

    @Override
    public void loadProjectionMatrix(Matrix4f matrix4f) {

    }

    @Override
    public Matrix4f getBasicProjectionMatrix(double d) {
        return null;
    }

    @Override
    public float method_32796() {
        return 0.0F;
    }

    @Override
    public void render(float tickDelta, long startTime, boolean tick) {

    }

    @Override
    public void renderWorld(float tickDelta, long limitTime, MatrixStack matrix) {

    }

    @Override
    public void reset() {

    }

    @Override
    public MapRenderer getMapRenderer() {
        return null;
    }

    @Override
    public void showFloatingItem(ItemStack floatingItem) {

    }

    @Override
    public MinecraftClient getClient() {
        return super.getClient();
    }

    @Override
    public float getSkyDarkness(float tickDelta) {
        return 0.0F;
    }

    @Override
    public float getViewDistance() {
        return 0.0F;
    }

    @Override
    public Camera getCamera() {
        return null;
    }

    @Override
    public LightmapTextureManager getLightmapTextureManager() {
        return null;
    }

    @Override
    public OverlayTexture getOverlayTexture() {
        return null;
    }

    @Override
    public CompletableFuture<Void> reload(Synchronizer synchronizer, ResourceManager manager, Profiler prepareProfiler, Profiler applyProfiler, Executor prepareExecutor, Executor applyExecutor) {
        return null;
    }

    @Override
    public String getName() {
        return "";
    }
}
