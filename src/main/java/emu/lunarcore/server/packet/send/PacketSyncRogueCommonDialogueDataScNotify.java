package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.rogue.event.RogueEventInstance;
import emu.lunarcore.proto.SyncRogueCommonDialogueDataScNotifyOuterClass.SyncRogueCommonDialogueDataScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketSyncRogueCommonDialogueDataScNotify extends BasePacket {
    public PacketSyncRogueCommonDialogueDataScNotify(RogueEventInstance event) {
        super(CmdId.SyncRogueCommonDialogueDataScNotify);
        
        var proto = SyncRogueCommonDialogueDataScNotify.newInstance()
            .addDialogueDataList(event.toProto());

        this.setData(proto);
    }
}
