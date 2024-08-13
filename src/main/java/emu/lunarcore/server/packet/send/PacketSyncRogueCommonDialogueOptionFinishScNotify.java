package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.rogue.event.RogueEventInstance;
import emu.lunarcore.proto.SyncRogueCommonDialogueOptionFinishScNotifyOuterClass.SyncRogueCommonDialogueOptionFinishScNotify;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketSyncRogueCommonDialogueOptionFinishScNotify extends BasePacket {
    
    public PacketSyncRogueCommonDialogueOptionFinishScNotify(RogueEventInstance instance) {
        super(CmdId.SelectRogueCommonDialogueOptionScRsp);
        
        var proto = SyncRogueCommonDialogueOptionFinishScNotify.newInstance()
            .setEventUniqueId(instance.EventUniqueId)
            .setOptionId(instance.SelectedOptionId)
            .setResultOptionInfo(instance.Options.stream().filter(o -> o.OptionId == instance.SelectedOptionId).findFirst().get().ToProto());
        
        this.setData(proto);
    }
}
