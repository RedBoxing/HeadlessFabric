package fr.redboxing.headless.mixins.net.minecraft.client.render;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.ShaderEffect;
import net.minecraft.client.render.*;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.ResourceFactory;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Matrix4f;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.nio.file.Path;

@Mixin(GameRenderer.class)
public class MixinGameRenderer {
    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void setRenderHand(boolean renderHand) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void setBlockOutlineEnabled(boolean blockOutlineEnabled) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void setRenderingPanorama(boolean renderingPanorama) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public boolean isRenderingPanorama() {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void disableShader() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void toggleShadersEnabled() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void onCameraEntitySet(@Nullable Entity entity) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void loadForcedShader() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void loadShader(Identifier id) {
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
    public void preloadShaders(ResourceFactory factory) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private Shader loadShader(ResourceFactory factory, String name, VertexFormat vertexFormat) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void loadShaders(ResourceManager manager) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void clearShaders() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public Shader getShader(@Nullable String name) {
        // Source of original method is not available
        return null;
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
    @Nullable
    public ShaderEffect getShader() {
        // Source of original method is not available
        return null;
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
    public void updateTargetedEntity(float tickDelta) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void updateMovementFovMultiplier() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private double getFov(Camera camera, float tickDelta, boolean changingFov) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void bobViewWhenHurt(MatrixStack matrices, float f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void bobView(MatrixStack matrices, float f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void renderWithZoom(float zoom, float zoomX, float zoomY) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderHand(MatrixStack matrices, Camera camera, float tickDelta) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void loadProjectionMatrix(Matrix4f matrix4f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public Matrix4f getBasicProjectionMatrix(double d) {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public float method_32796() {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public static float getNightVisionStrength(LivingEntity entity, float f) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void render(float tickDelta, long startTime, boolean tick) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void updateWorldIcon() {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void updateWorldIcon(Path path) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private boolean shouldRenderBlockOutline() {
        // Source of original method is not available
        return false;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void renderWorld(float tickDelta, long limitTime, MatrixStack matrix) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void reset() {
        // Source of original method is not available
    }

  /*  @Overwrite
    public MapRenderer getMapRenderer() {
        // Source of original method is not available
        return null;
    }*/

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void showFloatingItem(ItemStack floatingItem) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void renderFloatingItem(int scaledWidth, int scaledHeight, float tickDelta) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    private void method_31136(float f) {
        // Source of original method is not available
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public float getSkyDarkness(float tickDelta) {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public float getViewDistance() {
        // Source of original method is not available
        return 0;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getPositionShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getPositionColorShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getPositionColorTexShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getPositionTexShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getPositionTexColorShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getBlockShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getNewEntityShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getParticleShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getPositionColorLightmapShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getPositionColorTexLightmapShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getPositionTexColorNormalShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getPositionTexLightmapColorShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeSolidShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeCutoutMippedShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeCutoutShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeTranslucentShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeTranslucentMovingBlockShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeTranslucentNoCrumblingShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeArmorCutoutNoCullShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntitySolidShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntityCutoutShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntityCutoutNoNullShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntityCutoutNoNullZOffsetShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeItemEntityTranslucentCullShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntityTranslucentCullShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntityTranslucentShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntitySmoothCutoutShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeBeaconBeamShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntityDecalShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntityNoOutlineShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntityShadowShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntityAlphaShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEyesShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEnergySwirlShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeLeashShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeWaterMaskShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeOutlineShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeArmorGlintShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeArmorEntityGlintShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeGlintTranslucentShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeGlintShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeGlintDirectShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntityGlintShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEntityGlintDirectShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeTextShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeTextIntensityShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeTextSeeThroughShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeTextIntensitySeeThroughShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeLightningShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeTripwireShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEndPortalShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeEndGatewayShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeLinesShader() {
        // Source of original method is not available
        return null;
    }

    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    @Nullable
    public static Shader getRenderTypeCrumblingShader() {
        // Source of original method is not available
        return null;
    }
}
