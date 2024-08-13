package emu.lunarcore.data.excel;

import emu.lunarcore.data.GameData;
import emu.lunarcore.data.GameResource;
import emu.lunarcore.data.ResourceType;
import emu.lunarcore.game.enums.DialogueEventCostType;
import emu.lunarcore.game.enums.DialogueEventType;
import emu.lunarcore.game.rogue.RogueBuffType;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import lombok.Getter;

@Getter
@ResourceType(name = {"DialogueEvent.json"})
public class DialogueEventExcel extends GameResource {
    public int EventID;
    public DialogueEventType RogueEffectType;
    public IntArrayList RogueEffectParamList;
    public DialogueEventCostType CostType;
    public IntArrayList CostParamList;
    public IntArrayList ConditionIDList;
    public RogueBuffType AeonOption;
    
    @Override
    public int getId() {
        return EventID;
    }
    
    @Override
    public void onLoad() {
        GameData.getRogueDialogueEventList().put(EventID, this);
    }
}
