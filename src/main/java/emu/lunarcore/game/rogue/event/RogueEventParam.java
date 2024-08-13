package emu.lunarcore.game.rogue.event;

import emu.lunarcore.proto.NpcDialogueEventParamOuterClass.NpcDialogueEventParam;
import emu.lunarcore.proto.RogueCommonDialogueOptionDisplayInfoOuterClass.RogueCommonDialogueOptionDisplayInfo;
import emu.lunarcore.proto.RogueCommonDialogueOptionInfoOuterClass.RogueCommonDialogueOptionInfo;

import java.util.ArrayList;
import java.util.List;

public class RogueEventParam
{
    public int OptionId;
    public int ArgId;
    public float Ratio;
    public boolean IsSelected;
    public Boolean OverrideSelected = null;
    public List<RogueEventResultInfo> Results = new ArrayList<>();

    public RogueCommonDialogueOptionInfo ToProto()
    {
        var proto = RogueCommonDialogueOptionInfo.newInstance()
            .setArgId(ArgId)
            .setIsValid(true)
            .setOptionId(OptionId)
            .setDisplayValue(RogueCommonDialogueOptionDisplayInfo.newInstance()
                .setDisplayFloatValue(Ratio))
            .setConfirm(OverrideSelected != null ? OverrideSelected : IsSelected);
        
        for (var result: Results) proto.addOptionResultInfo(result.ToProto());
        return proto;
    }
    
    public NpcDialogueEventParam toNpcProto() {
        return NpcDialogueEventParam.newInstance()
            .setRogueDialogueEventId(OptionId)
            .setArgId(ArgId);
    }
}
