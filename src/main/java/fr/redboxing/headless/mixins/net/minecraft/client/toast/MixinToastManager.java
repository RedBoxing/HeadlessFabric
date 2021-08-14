package fr.redboxing.headless.mixins.net.minecraft.client.toast;

import net.minecraft.client.toast.ToastManager;
import net.minecraft.client.util.math.MatrixStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ToastManager.class)
public class MixinToastManager {
    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public void draw(MatrixStack matrices) {
        // Source of original method is not available
    }
}
