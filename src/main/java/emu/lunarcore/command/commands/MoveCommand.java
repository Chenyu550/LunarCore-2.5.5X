package emu.lunarcore.command.commands;

import java.util.ArrayList;
import java.util.List;

import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.util.Position;

@Command(
   label = "move",
   aliases = {"tp"},
   permission = "player.setlevel",
   requireTarget = true,
   desc = "/move @[player id](optional) [x] [y] [z]. Move a player (yourself as default) with specific ID to a specific position."
)
public class MoveCommand implements CommandHandler {
   public MoveCommand() {
   }

   public void execute(CommandArgs args) {
      //Player player = args.getSender();
      Player player = args.getTarget();
      try{
        List<Integer> pos = new ArrayList<>();
        for(String arg: args.getList()){
          if(pos.size()>=3) break;
          if(!arg.startsWith("@")){
              pos.add(Integer.parseInt(arg));
          }
        }
        if(pos.size()<3) throw new Exception("pos args less than 3!");
        Position posi = new Position();
        posi.set(pos.get(0), pos.get(1), pos.get(2));
        player.loadScene(player.getPlaneId(), player.getFloorId(), player.getEntryId(), posi, player.getRot(), true);
        args.sendMessage(String.format("Teleported to position - X: %s, Y: %s, Z: %s", pos.get(0), pos.get(1), pos.get(2)));  
      } catch(Exception e){
        args.sendMessage(new StringBuilder("Invalid position: ").append(e.getMessage()).toString());
      }
   }
}

