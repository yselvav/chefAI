package adris.altoclef.multiversion;

import net.minecraft.entity.Entity;
import adris.altoclef.mixins.EntityAccessor;

public class EntityVer {


    @Pattern
    public int getPortalCooldown(Entity entity) {
        //#if MC >= 12001
        return entity.getPortalCooldown();
        //#else
        //$$ return ((EntityAccessor) entity).getPortalCooldown();
        //#endif
    }
}
