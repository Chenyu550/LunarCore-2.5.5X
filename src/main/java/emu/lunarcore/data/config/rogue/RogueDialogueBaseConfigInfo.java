package emu.lunarcore.data.config.rogue;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.Nullable;

/**
 * Original Name: RogueDialogueBaseConfig
 */
@Getter
public class RogueDialogueBaseConfigInfo {
    public String OptionPath;
    public String DialoguePath;
    
    @Nullable
    @Setter
    public RogueDialogueEventConfigInfo OptionInfo;
}
