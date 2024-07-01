package adris.altoclef.multiversion.versionedfields;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.world.World;

/**
 * A helper class implementing entities that are not yet supported in certain versions
 */
public class Entities {

    public static final Class<? extends Entity> UNSUPPORTED;
    public static final Class<? extends Entity> WARDEN;

    static {
        UNSUPPORTED = VersionedFieldHelper.getUnsupportedEntityClass();

        //#if MC >= 11904
        WARDEN = net.minecraft.entity.mob.WardenEntity.class;
        //#else
        //$$ WARDEN = UNSUPPORTED;
        //#endif
    }



}
