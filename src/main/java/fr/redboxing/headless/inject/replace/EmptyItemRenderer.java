package fr.redboxing.headless.inject.replace;

import net.minecraft.client.color.item.ItemColors;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.client.render.item.ItemModels;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.render.model.BakedModel;
import net.minecraft.client.render.model.BakedModelManager;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.profiler.Profiler;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class EmptyItemRenderer extends ItemRenderer {
    public EmptyItemRenderer(TextureManager manager, BakedModelManager bakery, ItemColors colors, BuiltinModelItemRenderer builtinModelItemRenderer) {
        super(manager, bakery, colors, builtinModelItemRenderer);
    }

    @Override
    public ItemModels getModels() {
        return null;
    }

    @Override
    public void renderItem(ItemStack stack, ModelTransformation.Mode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, BakedModel model) {
    }

    @Override
    public BakedModel getHeldItemModel(ItemStack stack, @Nullable World world, @Nullable LivingEntity entity, int seed) {
        return null;
    }

    @Override
    public void renderItem(ItemStack stack, ModelTransformation.Mode transformationType, int light, int overlay, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int seed) {
    }

    @Override
    public void renderItem(@Nullable LivingEntity entity, ItemStack item, ModelTransformation.Mode renderMode, boolean leftHanded, MatrixStack matrices, VertexConsumerProvider vertexConsumers, @Nullable World world, int light, int overlay, int seed) {
    }

    @Override
    public void renderGuiItemIcon(ItemStack stack, int x, int y) {
    }

    @Override
    protected void renderGuiItemModel(ItemStack stack, int x, int y, BakedModel model) {
    }

    @Override
    public void renderInGuiWithOverrides(ItemStack stack, int x, int y) {
    }

    @Override
    public void renderInGuiWithOverrides(ItemStack stack, int x, int y, int seed) {
    }

    @Override
    public void renderInGuiWithOverrides(ItemStack stack, int x, int y, int seed, int depth) {
    }

    @Override
    public void renderInGui(ItemStack stack, int x, int y) {
    }

    @Override
    public void renderInGuiWithOverrides(LivingEntity entity, ItemStack stack, int x, int y, int seed) {
    }

    @Override
    public void renderGuiItemOverlay(TextRenderer renderer, ItemStack stack, int x, int y) {
    }

    @Override
    public void renderGuiItemOverlay(TextRenderer renderer, ItemStack stack, int x, int y, @Nullable String countLabel) {
    }

    @Override
    public void reload(ResourceManager manager) {
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
