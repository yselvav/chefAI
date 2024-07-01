package adris.altoclef.multiversion;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;

public class PlayerVer {


    public static void sendChatMessage(ClientPlayerEntity player,String content) {
        //#if MC >= 11904
        player.networkHandler.sendChatMessage(content);
        //#else
        //$$ player.sendChatMessage(content);
        //#endif
    }

    public static void sendChatCommand(ClientPlayerEntity player,String content) {
        //#if MC >= 11904
        player.networkHandler.sendChatCommand(content);
        //#else
        //$$ player.sendChatMessage("/"+content);
        //#endif
    }


}
