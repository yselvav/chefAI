package adris.altoclef.eventbus.events;

import adris.altoclef.multiversion.DrawContextVer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class ClientRenderEvent {
    public DrawContextVer context;
    public float tickDelta;

    public ClientRenderEvent(DrawContextVer context, float tickDelta) {
        this.context = context;
        this.tickDelta = tickDelta;
    }
}
