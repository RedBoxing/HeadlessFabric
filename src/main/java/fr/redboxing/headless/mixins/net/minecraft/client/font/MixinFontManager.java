package fr.redboxing.headless.mixins.net.minecraft.client.font;

import net.minecraft.client.font.Font;
import net.minecraft.client.font.FontManager;
import net.minecraft.client.font.FontStorage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Group;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.List;

@Mixin(value = FontManager.class, remap = false)
public class MixinFontManager {
    @SuppressWarnings("UnresolvedMixinReference")
    @Group(name = "setFontsHook")
    @Redirect(method = "method_27540(Lnet/minecraft/client/font/FontStorage;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/font/FontStorage;setFonts(Ljava/util/List;)V"), remap = false)
    private static void setFontsHookDev(FontStorage fontStorage, List<Font> fonts) {
    }

    @SuppressWarnings("UnresolvedMixinReference")
    @Group(name = "setFontsHook")
    @Redirect(method = "method_27540(Lnet/minecraft/class_377;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_377;method_2004(Ljava/util/List;)V"), remap = false)
    private static void setFontsHookProd(FontStorage fontStorage, List<Font> fonts) {
    }


}
