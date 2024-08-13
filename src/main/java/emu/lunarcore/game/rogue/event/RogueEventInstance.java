package emu.lunarcore.game.rogue.event;

import emu.lunarcore.data.excel.RogueNPCExcel;
import emu.lunarcore.game.scene.entity.EntityNpc;
import emu.lunarcore.proto.RogueCommonDialogueBasicInfoOuterClass.RogueCommonDialogueBasicInfo;
import emu.lunarcore.proto.RogueCommonDialogueDataInfoOuterClass.RogueCommonDialogueDataInfo;
import emu.lunarcore.proto.RogueCommonDialogueInfoOuterClass.RogueCommonDialogueInfo;

import java.util.ArrayList;
import java.util.List;

public class RogueEventInstance
{
    public RogueEventInstance(RogueNPCExcel excel, EntityNpc npc, int uniqueId)// check in RogueInstance.cs
    {
        EventId = excel.getRogueNPCID();
        EventEntity = npc;
        EventUniqueId = uniqueId;
        
        for (var option: excel.RogueNpcConfig.DialogueList.get(0).OptionInfo.OptionList)
        {
            var param = new RogueEventParam();
            param.OptionId = option.OptionID;
            Options.add(param);
        }
    }

    public int EventId;
    public boolean Finished;
    public EntityNpc EventEntity;
    public List<RogueEventParam> Options = new ArrayList<>();
    public int EventUniqueId;
    public int SelectedOptionId = 0;
    public List<Integer> EffectEventId = new ArrayList<>();

    public RogueCommonDialogueDataInfo toProto()
    {
        var proto = RogueCommonDialogueDataInfo.newInstance()
            .setDialogueInfo(toDialogueInfo())
            .setEventUniqueId(EventUniqueId);

        for (var option: Options) proto.addOptionList(option.ToProto());
        
        System.out.println("RogueEventInstance.toProto: " + proto);
        return proto;
    }

    public RogueCommonDialogueInfo toDialogueInfo()
    {
        return RogueCommonDialogueInfo.newInstance()
            .setDialogueBasicInfo(RogueCommonDialogueBasicInfo.newInstance()
                .setDialogueId(EventId));
    }
}
