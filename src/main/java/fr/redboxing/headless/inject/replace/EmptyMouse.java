package fr.redboxing.headless.inject.replace;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.Mouse;

public class EmptyMouse extends Mouse {
    public EmptyMouse(MinecraftClient client) {
        super(client);
    }

    @Override
    public void setup(long window) {

    }

    @Override
    public void updateMouse() {

    }

    @Override
    public boolean wasLeftButtonClicked() {
        return false;
    }

    @Override
    public boolean wasMiddleButtonClicked() {
        return false;
    }

    @Override
    public boolean wasRightButtonClicked() {
        return false;
    }

    @Override
    public double getX() {
        return 0.0D;
    }

    @Override
    public double getY() {
        return 0.0D;
    }

    @Override
    public void onResolutionChanged() {

    }

    @Override
    public boolean isCursorLocked() {
        return false;
    }

    @Override
    public void lockCursor() {

    }

    @Override
    public void unlockCursor() {

    }

    @Override
    public void setResolutionChanged() {

    }
}
