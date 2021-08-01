package fr.redboxing.headless.mixins.net.minecraft.client.network;

import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.render.MapRenderer;
import net.minecraft.item.map.MapState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ClientPlayNetworkHandler.class)
public class MixinClientPlayNetworkHandler {
    @Redirect(method = "onMapUpdate", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/MapRenderer;updateTexture(ILnet/minecraft/item/map/MapState;)V"))
    private void updateTextureHook(MapRenderer mapRenderer, int id, MapState state) {

    }
}
