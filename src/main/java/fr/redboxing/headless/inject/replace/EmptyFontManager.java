package fr.redboxing.headless.inject.replace;

import net.minecraft.client.font.FontManager;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.resource.ResourceReloader;
import net.minecraft.util.Identifier;

import java.util.Map;

public class EmptyFontManager extends FontManager {
    public EmptyFontManager(TextureManager manager) {
        super(manager);
    }

    @Override
    public void setIdOverrides(Map<Identifier, Identifier> overrides) {

    }

    @Override
    public TextRenderer createTextRenderer() {
        return null;
    }

    @Override
    public ResourceReloader getResourceReloadListener() {
        return null;
    }

    @Override
    public void close() {

    }
}
