package fr.redboxing.headless.inject.replace;

import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.WindowFramebuffer;

public class EmptyFrameBuffer extends WindowFramebuffer {
    public EmptyFrameBuffer(int width, int height) {
        super(width, height);
    }

    @Override
    public void resize(int width, int height, boolean getError) {

    }

    @Override
    public void delete() {

    }

    @Override
    public void copyDepthFrom(Framebuffer framebuffer) {

    }

    @Override
    public void initFbo(int width, int height, boolean getError) {

    }

    @Override
    public void setTexFilter(int i) {

    }

    @Override
    public void checkFramebufferStatus() {

    }

    @Override
    public void method_35610() {

    }

    @Override
    public void endRead() {

    }

    @Override
    public void beginWrite(boolean setViewport) {

    }

    @Override
    public void endWrite() {

    }

    @Override
    public void setClearColor(float r, float g, float b, float a) {

    }

    @Override
    public void draw(int width, int height) {

    }

    @Override
    public void draw(int width, int height, boolean bl) {

    }

    @Override
    public void clear(boolean getError) {

    }

    @Override
    public int getColorAttachment() {
        return 0;
    }

    @Override
    public int getDepthAttachment() {
       return 0;
    }
}
