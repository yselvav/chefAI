package adris.altoclef.multiversion.versionedfields;


import net.minecraft.item.Item;

/**
 * A helper class implementing items that are not yet supported in certain versions
 * Using these in non-supported versions might lead to strange bugs and/or crashes...
 * Please see {@link VersionedFieldHelper#isSupported(Object)}
 */
public class Items extends net.minecraft.item.Items {


    public static final Item UNSUPPORTED = VersionedFieldHelper.createUnsafeUnsupportedItem();

    //#if MC <= 11802
    //$$ public static final Item MANGROVE_PROPAGULE = UNSUPPORTED;
    //$$ public static final Item CHERRY_SAPLING = UNSUPPORTED;
    //$$ public static final Item SCULK_CATALYST = UNSUPPORTED;
    //$$ public static final Item MANGROVE_PLANKS = UNSUPPORTED;
    //$$ public static final Item CHERRY_PLANKS = UNSUPPORTED;
    //$$ public static final Item BAMBOO_PLANKS = UNSUPPORTED;
    //$$ public static final Item MANGROVE_LEAVES = UNSUPPORTED;
    //$$ public static final Item CHERRY_LEAVES = UNSUPPORTED;
    //$$ public static final Item MANGROVE_WOOD = UNSUPPORTED;
    //$$ public static final Item MANGROVE_BUTTON = UNSUPPORTED;
    //$$ public static final Item BAMBOO_BUTTON = UNSUPPORTED;
    //$$ public static final Item CHERRY_BUTTON = UNSUPPORTED;
    //$$ public static final Item MANGROVE_SIGN = UNSUPPORTED;
    //$$ public static final Item BAMBOO_SIGN = UNSUPPORTED;
    //$$ public static final Item CHERRY_SIGN = UNSUPPORTED;
    //$$ public static final Item ACACIA_HANGING_SIGN = UNSUPPORTED;
    //$$ public static final Item BIRCH_HANGING_SIGN = UNSUPPORTED;
    //$$ public static final Item CRIMSON_HANGING_SIGN = UNSUPPORTED;
    //$$ public static final Item DARK_OAK_HANGING_SIGN = UNSUPPORTED;
    //$$ public static final Item OAK_HANGING_SIGN = UNSUPPORTED;
    //$$ public static final Item JUNGLE_HANGING_SIGN = UNSUPPORTED;
    //$$ public static final Item SPRUCE_HANGING_SIGN = UNSUPPORTED;
    //$$ public static final Item WARPED_HANGING_SIGN = UNSUPPORTED;
    //$$ public static final Item MANGROVE_HANGING_SIGN = UNSUPPORTED;
    //$$ public static final Item BAMBOO_HANGING_SIGN = UNSUPPORTED;
    //$$ public static final Item CHERRY_HANGING_SIGN = UNSUPPORTED;
    //$$ public static final Item MANGROVE_PRESSURE_PLATE = UNSUPPORTED;
    //$$ public static final Item BAMBOO_PRESSURE_PLATE = UNSUPPORTED;
    //$$ public static final Item CHERRY_PRESSURE_PLATE = UNSUPPORTED;
    //$$ public static final Item MANGROVE_FENCE = UNSUPPORTED;
    //$$ public static final Item BAMBOO_FENCE = UNSUPPORTED;
    //$$ public static final Item CHERRY_FENCE = UNSUPPORTED;
    //$$ public static final Item MANGROVE_FENCE_GATE = UNSUPPORTED;
    //$$ public static final Item BAMBOO_FENCE_GATE = UNSUPPORTED;
    //$$ public static final Item CHERRY_FENCE_GATE = UNSUPPORTED;
    //$$ public static final Item MANGROVE_BOAT = UNSUPPORTED;
    //$$ public static final Item CHERRY_BOAT = UNSUPPORTED;
    //$$ public static final Item MANGROVE_DOOR = UNSUPPORTED;
    //$$ public static final Item BAMBOO_DOOR = UNSUPPORTED;
    //$$ public static final Item CHERRY_DOOR = UNSUPPORTED;
    //$$ public static final Item MANGROVE_SLAB = UNSUPPORTED;
    //$$ public static final Item BAMBOO_SLAB = UNSUPPORTED;
    //$$ public static final Item CHERRY_SLAB = UNSUPPORTED;
    //$$ public static final Item MANGROVE_STAIRS = UNSUPPORTED;
    //$$ public static final Item BAMBOO_STAIRS = UNSUPPORTED;
    //$$ public static final Item CHERRY_STAIRS = UNSUPPORTED;
    //$$ public static final Item MANGROVE_TRAPDOOR = UNSUPPORTED;
    //$$ public static final Item BAMBOO_TRAPDOOR = UNSUPPORTED;
    //$$ public static final Item CHERRY_TRAPDOOR = UNSUPPORTED;
    //$$ public static final Item MANGROVE_LOG = UNSUPPORTED;
    //$$ public static final Item STRIPPED_MANGROVE_LOG = UNSUPPORTED;
    //$$ public static final Item STRIPPED_MANGROVE_WOOD = UNSUPPORTED;
    //$$ public static final Item CHERRY_LOG = UNSUPPORTED;
    //$$ public static final Item CHERRY_WOOD = UNSUPPORTED;
    //$$ public static final Item STRIPPED_CHERRY_LOG = UNSUPPORTED;
    //$$ public static final Item STRIPPED_CHERRY_WOOD = UNSUPPORTED;
    //$$ public static final Item BAMBOO_RAFT = UNSUPPORTED;
    //$$ public static final Item CHISELED_BOOKSHELF = UNSUPPORTED;
    //$$ public static final Item DECORATED_POT = UNSUPPORTED;
    //$$ public static final Item BRUSH = UNSUPPORTED;
    //$$ public static final Item BAMBOO_BLOCK = UNSUPPORTED;
    //$$ public static final Item NETHERITE_UPGRADE_SMITHING_TEMPLATE = UNSUPPORTED;
    //$$ public static final Item STRIPPED_BAMBOO_BLOCK = UNSUPPORTED;
    //$$ public static final Item TORCHFLOWER_SEEDS = UNSUPPORTED;
    //$$ public static final Item PINK_PETALS = UNSUPPORTED;
    //$$ public static final Item MANGROVE_ROOTS = UNSUPPORTED;
    //$$ public static final Item MUDDY_MANGROVE_ROOTS = UNSUPPORTED;
    //$$ public static final Item MUD = UNSUPPORTED;
    //#endif


}
