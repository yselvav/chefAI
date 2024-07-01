package adris.altoclef.multiversion;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Position;

public class BlockPosVer {


    public static BlockPos ofFloored(Position pos) {
        return new BlockPos(MathHelper.floor(pos.getX()), MathHelper.floor(pos.getY()), MathHelper.floor(pos.getZ()));
    }


    public static double getSquaredDistance(BlockPos pos, Position obj) {
        //#if MC >= 11802
        return pos.getSquaredDistance(obj);
        //#else
        //$$ return pos.getSquaredDistance(obj.getX(), obj.getY(), obj.getZ(), true);
        //#endif
    }


}
