package emu.lunarcore.command.commands;

import emu.lunarcore.GameConstants;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.data.GameData;
import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.game.enums.ItemMainType;
import emu.lunarcore.game.inventory.GameItem;
import emu.lunarcore.game.inventory.GameItemSubAffix;
import emu.lunarcore.game.player.Player;
import emu.lunarcore.server.packet.send.PacketPlayerSyncScNotify;
import emu.lunarcore.util.FileUtils;
import emu.lunarcore.util.JsonUtils;

import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Command(
        label = "json",
        aliases = {"h"}, 
        permission = "player.json",
        requireTarget = true,
        desc = "/json - 从freesr-data.json中获取遗器/光锥/星魂等信息."
)//get relics from freesr-data.json
public class JsonImport implements CommandHandler {
    @Override
    public void execute(CommandArgs args) {
        var player = args.getTarget();
        var data = JsonUtils.decode(new String(FileUtils.read("./data/freesr-data.json"), StandardCharsets.UTF_8), JsonData.class);
        if (data == null) {
            player.sendMessage("freesr-data.json未找到或已损坏。确保您已经将json放入服务器核心同文件夹下的data文件夹中.");//freesr-data.json not found or corrupted. ensure you already put the json into \"data\" folder.
            return;
        }

        // Clear Relics & Lightcone From Inventory
        JsonImport.clearInventory(player);

        if(Objects.equals(args.get(0), "clear")) {
            player.sendMessage("Successfully clear inventory");
            return;
        }
        
        // Set Avatar
        var changed = new LinkedList<GameAvatar>();
        
        // add avatar that we dont have
        for (var newAvatar: data.avatars.values()) {
            var avatar = player.getAvatarById(newAvatar.avatar_id);
            if (avatar == null) {
                var excel = GameData.getAvatarExcelMap().get(newAvatar.avatar_id);
                if(excel == null) {
                    args.sendMessage("Avatar with id " + newAvatar.avatar_id + " is not found on excel ");
                    continue;
                }
                avatar = new GameAvatar(excel);
                if(avatar.getExcel() == null) continue;
                player.addAvatar(avatar);
            }
        }
        
        // set avatar properties
        for (var newAvatar: data.avatars.values()) {
            var avatar = player.getAvatarById(newAvatar.avatar_id);
            if (avatar == null) continue;
            avatar.setLevel(newAvatar.level);
            avatar.setRank(newAvatar.data.rank);
            avatar.setPromotion(newAvatar.promotion);
            avatar.getSkills().clear();
            for (var entry: newAvatar.data.skills.entrySet()) {
                avatar.getSkills().put(entry.getKey(), entry.getValue());
            }
            avatar.save();
            changed.push(avatar);
        }
        
        // sync avatar
        player.sendPacket(new PacketPlayerSyncScNotify(changed.toArray(GameAvatar[]::new)));
        
        // Add New Relics
        for (var relic: data.relics) {
            var item = new GameItem(relic.relic_id);
            if(item.getExcel() == null) continue;;
            item.setLevel(relic.level);
            item.setMainAffix(relic.main_affix_id);
            item.resetSubAffixes();
            
            for (var newSubAffix: relic.sub_affixes) {
                var excel = GameData.getRelicSubAffixExcel(item.getExcel().getRarityNum(), newSubAffix.sub_affix_id);
                if(excel == null) {
                    continue;
                }
                var subAffix = new GameItemSubAffix(excel);
                subAffix.setCount(newSubAffix.count);
                subAffix.setStep(newSubAffix.step);
                item.getSubAffixes().add(subAffix);
            }
            
            player.getInventory().addItem(item);
            
            var avatar = player.getAvatarById(relic.equip_avatar);
            if(avatar != null) {
                avatar.equipItem(item);
            }
        }
        
        // Add New Lightcones
        for (var lightcone: data.lightcones ) {
            var item = new GameItem(lightcone.item_id);
            if(item.getExcel() == null) continue;;
            item.setLevel(lightcone.level);
            item.setRank(lightcone.rank);
            item.setPromotion(lightcone.promotion);
            
            player.getInventory().addItem(item);
            
            var avatar = player.getAvatarById(lightcone.equip_avatar);
            if(avatar != null) {
                avatar.equipItem(item);
            }
        }
        
        player.sendMessage("成功从freesr-data.json中获取数据.");//Successfully Imported Data From freesr-data.json
    }
    
    static void clearInventory(Player player) {
        var toRemove = new LinkedList<GameItem>();
        for (var item: player.getInventory().getItems().values()) {
            if(item.getItemMainType() != ItemMainType.Equipment && item.getItemMainType() != ItemMainType.Relic) {
                continue;
            }

            if(item.isEquipped()) {
                player
                    .getAvatarById(item.getEquipAvatarId())
                    .unequipItem(item.getItemMainType() == ItemMainType.Equipment ? GameConstants.EQUIPMENT_SLOT_ID : item.getEquipSlot());
            }

            toRemove.push(item);
        }
        player.getInventory().removeItems(toRemove);
    }
}

class JsonData {
    public List<RelicJson> relics;
    public List<LightconeJson> lightcones;
    public Map<Integer, AvatarJson> avatars;
    
    static class RelicJson {
        public int level;
        public int relic_id;
        public int relic_set_id;
        public int main_affix_id;
        public int internal_uid;
        public int equip_avatar;
        public List<RelicSubAffixData> sub_affixes;
        
        static class RelicSubAffixData {
            public int sub_affix_id;
            public int count;
            public int step;
        }
    }
    
    static class LightconeJson {
        public int level;
        public int internal_uid;
        public int equip_avatar;
        public int item_id;
        public int rank;
        public int promotion;
    }
    
    static class AvatarJson {
        public int avatar_id;
        public int level;
        public int promotion;
        public AvatarJsonExtraData data;
        
        static class AvatarJsonExtraData {
            public int rank;
            public Map<Integer, Integer> skills;
        }
    }
    
    public static int getPromotion(int level) {
        return  level > 80 ?
            6 :
            (int) (level <= 20
                ? 0 :
                Math.ceil((double) level / 10) - 2);
    }
}
