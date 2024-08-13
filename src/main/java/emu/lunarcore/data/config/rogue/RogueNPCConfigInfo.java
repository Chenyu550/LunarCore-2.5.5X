package emu.lunarcore.data.config.rogue;

import emu.lunarcore.game.enums.RogueDialogueType;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class RogueNPCConfigInfo {
    public RogueDialogueType DialogueType;
    public List<RogueNPCDialogueConfigInfo> DialogueList = new ArrayList<>();
}
