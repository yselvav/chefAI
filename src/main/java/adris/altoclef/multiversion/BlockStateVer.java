package adris.altoclef.multiversion;

import net.minecraft.block.BlockState;

public class BlockStateVer {


    @Pattern
    public boolean isSolid(BlockState state) {
        //#if MC >= 12001
        return state.isSolid();
        //#else
        //$$ return state.getMaterial().isSolid();
        //#endif
    }

}
