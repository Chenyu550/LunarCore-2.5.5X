package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.rogue.event.RogueEventInstance;
import emu.lunarcore.proto.SelectRogueCommonDialogueOptionScRspOuterClass.SelectRogueCommonDialogueOptionScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketSelectRogueCommonDialogueOptionScRsp extends BasePacket {

    public PacketSelectRogueCommonDialogueOptionScRsp(RogueEventInstance instance) {
        super(CmdId.SelectRogueCommonDialogueOptionScRsp);
        
        var data = SelectRogueCommonDialogueOptionScRsp.newInstance()
            .setDialogueData(instance.toProto())
            .setOptionId(instance.SelectedOptionId)
            .setEventUniqueId(instance.EventUniqueId)
            .setEventHasEffect(true);  // TODO: improve it (if any option is selected)
        
        for (var eVi : instance.EffectEventId) {
            data.addEffectEventIdList(eVi);
        }
        
        this.setData(data);
    }
}
