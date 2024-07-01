package adris.altoclef.multiversion.versionedfields;

import net.minecraft.block.Block;

/**
 * A helper class implementing blocks that are not yet supported in certain versions
 * Using these in non-supported versions might lead to strange bugs and/or crashes...
 * Please see {@link VersionedFieldHelper#isSupported(Object)}
 */
public class Blocks extends net.minecraft.block.Blocks {

    public static final Block UNSUPPORTED = VersionedFieldHelper.createUnsafeUnsupportedBlock();

    //#if MC <= 11802
    //$$ public static final Block MANGROVE_PROPAGULE = UNSUPPORTED;
    //$$ public static final Block CHERRY_LEAVES = UNSUPPORTED;
    //$$ public static final Block MANGROVE_SIGN = UNSUPPORTED;
    //$$ public static final Block MANGROVE_WALL_SIGN = UNSUPPORTED;
    //$$ public static final Block BAMBOO_SIGN = UNSUPPORTED;
    //$$ public static final Block BAMBOO_WALL_SIGN = UNSUPPORTED;
    //$$ public static final Block CHERRY_SIGN = UNSUPPORTED;
    //$$ public static final Block CHERRY_WALL_SIGN = UNSUPPORTED;
    //$$ public static final Block SCULK = UNSUPPORTED;
    //$$ public static final Block SCULK_VEIN = UNSUPPORTED;
    //$$ public static final Block SCULK_SHRIEKER = UNSUPPORTED;
    //#endif

}
