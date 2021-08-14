package fr.redboxing.headless.mixins.net.minecraft.client.util;

import fr.redboxing.headless.utils.ObjectAllocator;
import net.minecraft.client.WindowSettings;
import net.minecraft.client.util.Window;
import net.minecraft.client.util.WindowProvider;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(WindowProvider.class)
public class MixinWindowProvider {
    /**
     * @author RedBoxing
     * @reason noop
    */
    @Overwrite
    public Window createWindow(WindowSettings settings, @Nullable String videoMode, String title) {
        return ObjectAllocator.allocate(Window.class);
    }
}
