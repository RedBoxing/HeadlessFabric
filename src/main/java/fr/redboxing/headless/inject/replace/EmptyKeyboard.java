package fr.redboxing.headless.inject.replace;

import net.minecraft.client.Keyboard;
import net.minecraft.client.MinecraftClient;

public class EmptyKeyboard extends Keyboard {
    public EmptyKeyboard(MinecraftClient client) {
        super(client);
    }

    @Override
    public void onKey(long window, int key, int scancode, int action, int modifiers) {

    }

    @Override
    public void setRepeatEvents(boolean repeatEvents) {

    }

    @Override
    public void setup(long window) {

    }

    @Override
    public String getClipboard() {
        return "";
    }

    @Override
    public void setClipboard(String clipboard) {

    }

    @Override
    public void pollDebugCrash() {

    }
}
