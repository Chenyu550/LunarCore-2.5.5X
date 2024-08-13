package emu.lunarcore.server.packet.recv;

import emu.lunarcore.game.rogue.event.RogueEventInstance;
import emu.lunarcore.proto.SelectRogueCommonDialogueOptionCsReqOuterClass.SelectRogueCommonDialogueOptionCsReq;
import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;
import emu.lunarcore.server.packet.send.PacketSelectRogueCommonDialogueOptionScRsp;

@Opcodes(CmdId.SelectRogueCommonDialogueOptionCsReq)
public class HandlerSelectRogueCommonDialogueOptionCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] data) throws Exception {
        var req = SelectRogueCommonDialogueOptionCsReq.parseFrom(data);

        
        if (session.getPlayer().getRogueInstance() == null) return;
        
        session.getPlayer().getRogueInstance().onSelectDialogue(req.getOptionId(), req.getEventUniqueId());
        RogueEventInstance eventInstance = session.getPlayer().getRogueInstance().getRunningEvents().get(req.getEventUniqueId());
        if (eventInstance == null) {
            return;
        }
        
        session.send(new PacketSelectRogueCommonDialogueOptionScRsp(eventInstance));
    }

}
