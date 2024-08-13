package emu.lunarcore.game.rogue.event;

import emu.lunarcore.proto.RogueCommonDialogueOptionBattleResultInfoOuterClass;
import emu.lunarcore.proto.RogueCommonDialogueOptionResultInfoOuterClass;

public class RogueEventResultInfo {
    public int BattleEventId;

    public RogueCommonDialogueOptionResultInfoOuterClass.RogueCommonDialogueOptionResultInfo ToProto() {
        return RogueCommonDialogueOptionResultInfoOuterClass.RogueCommonDialogueOptionResultInfo.newInstance()
            .setBattleResultInfo(RogueCommonDialogueOptionBattleResultInfoOuterClass.RogueCommonDialogueOptionBattleResultInfo.newInstance()
                .setBattleEventId(BattleEventId));
    }
}
