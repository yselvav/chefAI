package adris.altoclef.multiversion;

import adris.altoclef.mixins.DrawableHelperInvoker;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.util.math.MatrixStack;
import org.jetbrains.annotations.Nullable;

public class DrawContextVer {


    //#if MC >= 12001
    public static DrawContextVer of(DrawContext context) {
        if (context == null) return null;
        return new DrawContextVer(context);
    }
    private final DrawContext context;

    private DrawContextVer(DrawContext context) {
        this.context = context;
    }
    //#else
    //$$ public static DrawContextVer of(MatrixStack matrices) {
    //$$    if (matrices == null) return null;
    //$$    return new DrawContextVer(matrices);
    //$$ }
    //$$
    //$$ private final MatrixStack matrices;
    //$$ private DrawContextVer(MatrixStack matrices) {
    //$$        this.matrices = matrices;
    //$$    }
    //#endif

    private RenderLayer renderLayer = null;

    // used only 1.20.1 and later... can pass null in earlier versions
    public void setRenderLayer(RenderLayer renderLayer) {
        this.renderLayer = renderLayer;
    }

    public void fill(int x1, int y1, int x2, int y2, int color) {
        //#if MC >= 12001
        context.fill(renderLayer, x1, y1, x2, y2, color);
        //#else
        //$$  DrawableHelper.fill(matrices, x1, y1, x2, y2, color);
        //#endif
    }

    public void drawHorizontalLine(int x1, int x2, int y, int color) {
        //#if MC >= 12001
        context.drawHorizontalLine(renderLayer, x1, x2, y, color);
        //#else
        //$$ DrawableHelperInvoker.drawHorizontalLine(matrices, x1, x2, y, color);
        //#endif
    }

    public void drawVerticalLine(int x, int y1, int y2, int color) {
        //#if MC >= 12001
        context.drawVerticalLine(renderLayer, x, y1, y2, color);
        //#else
        //$$ DrawableHelperInvoker.drawVerticalLine(matrices, x, y1, y2, color);
        //#endif
    }

    public void drawText(TextRenderer textRenderer, @Nullable String text, int x, int y, int color, boolean shadow) {
        //#if MC >= 12001
        context.drawText(textRenderer,text,x,y,color,shadow);
        //#else
        //$$ if (shadow) {
        //$$    textRenderer.drawWithShadow(matrices, text,x,y,color);
        //$$ } else {
        //$$    textRenderer.draw(matrices, text,x,y,color);
        //$$ }
        //#endif
    }


    public MatrixStack getMatrices() {
        //#if MC >= 12001
        return context.getMatrices();
        //#else
        //$$ return matrices;
        //#endif
    }

    public int getScaledWindowWidth() {
        //#if MC >= 12001
        return context.getScaledWindowWidth();
        //#else
        //$$ return MinecraftClient.getInstance().getWindow().getScaledWidth();
        //#endif
    }

    public int getScaledWindowHeight() {
        //#if MC >= 12001
        return context.getScaledWindowHeight();
        //#else
        //$$ return MinecraftClient.getInstance().getWindow().getScaledHeight();
        //#endif
    }


}
