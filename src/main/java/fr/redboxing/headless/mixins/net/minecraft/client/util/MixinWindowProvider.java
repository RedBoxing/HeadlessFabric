package fr.redboxing.headless.mixins.net.minecraft.client.util;

import fr.redboxing.headless.utils.ObjectAllocator;
import net.minecraft.client.WindowSettings;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.WindowProvider;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WindowProvider.class)
public class MixinWindowProvider {
    @Inject(method = "createWindow", at = @At("HEAD"), cancellable = true)
    public void createWindow(WindowSettings settings, String videoMode, String title, CallbackInfoReturnable<Window> cir) {
        cir.setReturnValue(ObjectAllocator.allocate(Window.class));
    }
}
