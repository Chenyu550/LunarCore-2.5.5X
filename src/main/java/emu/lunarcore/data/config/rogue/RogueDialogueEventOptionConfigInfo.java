package emu.lunarcore.data.config.rogue;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import lombok.Getter;

import java.util.Map;

/**
 * Original Name: RogueDialogueEventOptionConfig
 */
@Getter
public class RogueDialogueEventOptionConfigInfo {

    public int OptionID;
    public int DisplayID;
    public int SpecialOptionID;
    public Map<Integer, RogueDialogueEventOptionDynamicConfigInfo> DynamicMap = new Int2ObjectOpenHashMap<RogueDialogueEventOptionDynamicConfigInfo>();
    public int DescValue;
    public int DescValue2;
    public int DescValue3;
    public int DescValue4;
}
