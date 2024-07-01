package adris.altoclef.multiversion;

import net.minecraft.block.BlockState;

public class BlockStateVer {


    @Pattern
    private static boolean isSolid(BlockState state) {
        //#if MC >= 12001
        return state.isSolid();
        //#else
        //$$ return state.getMaterial().isSolid();
        //#endif
    }

    @Pattern
    private static boolean isReplaceable(BlockState state) {
        //#if MC >= 11904
        return state.isReplaceable();
        //#else
        //$$ return state.getMaterial().isReplaceable();
        //#endif
    }

}
