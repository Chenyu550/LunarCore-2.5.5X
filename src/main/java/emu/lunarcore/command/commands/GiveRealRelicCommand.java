package emu.lunarcore.command.commands;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import emu.lunarcore.LunarCore;
import emu.lunarcore.command.Command;
import emu.lunarcore.command.CommandArgs;
import emu.lunarcore.command.CommandHandler;
import emu.lunarcore.data.GameData;
import emu.lunarcore.data.excel.ItemExcel;
import emu.lunarcore.game.inventory.GameItem;
import emu.lunarcore.game.inventory.GameItemSubAffix;
import emu.lunarcore.util.Utils;

@Command(label = "giverealrelic", aliases = { "grr",
        "realrelic" }, permission = "player.give", requireTarget = true, desc = "/giverealrelic [item id] lv[level] s[mainstat ID] [substat ID]:[Substat Value In Game x10] ... Gives the targeted player a relic with given substat values exactly.")
public class GiveRealRelicCommand implements CommandHandler {

    @Override
    public void execute(CommandArgs args) {
        // Setup items
        List<GameItem> items = new LinkedList<>();

        // Parse items
        for (String arg : args.getList()) {
            // Parse item id
            int itemId = Utils.parseSafeInt(arg);

            ItemExcel itemData = GameData.getItemExcelMap().get(itemId);
            if (itemData == null) {
                args.sendMessage("Item \"" + arg + "\" does not exist!");
                continue;
            }
            // ignore if not a relic item
            if (!itemData.isRelic()) {
                args.sendMessage("Item \"" + arg + "\" is not a relic!");
                continue;
            }
            // Make sure we dont go over the inventory limit
            var tab = args.getTarget().getInventory().getTabByItemType(itemData.getItemMainType());
            if (tab.getAvailableCapacity() < 1) {
                args.sendMessage("Inventory is full!");
                break;
            }
            // Check if level and mainstat is assigned
            if (!(args.getLevel() > 0)) {
                args.sendMessage("Parameter level is missing or incorrect!");
                break;
            }
            if (!(args.getStage() > 0)) {
                args.sendMessage("Parameter mainstat ID is missing or incorrect!");
                break;
            }

            GameItem item = new GameItem(itemData);
            setStats(args, item);
            item.sortSubAffixes();
            items.add(item);

            // Send message
            args.sendMessage("Giving " + args.getTarget().getName() + " 1 of " + itemId);
        }

        // Add to player inventory
        args.getTarget().getInventory().addItems(items, true);
    }

    private void setStats(CommandArgs args, GameItem item) {
        // Try to set level first to prevent subaffix auto upgrade
        if (args.getLevel() > 0) {
            // Set relic level
            item.setLevel(Math.min(args.getLevel(), LunarCore.getConfig().getServerOptions().maxCustomRelicLevel));
        }

        // Main stat
        if (args.getStage() > 0) {
            var mainAffix = GameData.getRelicMainAffixExcel(item.getExcel().getRelicExcel().getMainAffixGroup(),
                    args.getStage());
            if (mainAffix != null) {
                item.setMainAffix(mainAffix.getAffixID());
            }
        }

        // Sub stats
        if (args.getMap() != null) {
            // Reset substats first
            item.resetSubAffixes();

            int maxCount = (int) Math.floor(LunarCore.getConfig().getServerOptions().maxCustomRelicLevel / 3) + 1;

            for (var entry : args.getMap().int2IntEntrySet()) {
                if (entry.getIntValue() <= 0)
                    continue;

                var subAffix = GameData.getRelicSubAffixExcel(item.getExcel().getRelicExcel().getSubAffixGroup(),
                        entry.getIntKey());
                if (subAffix == null)
                    continue;

                // Set count and step
                double typeAffix = 100;
                double valueAffix = 1;
                if (subAffix.getProperty().name().contains("Delta")) {
                    typeAffix = 1;
                    if (!subAffix.getProperty().name().contains("Speed")) {
                        valueAffix = 0.1;
                        typeAffix = 0.1;
                    }
                }
                List<Integer> result = solveCountAndStepByValue((int) Math.floor(valueAffix * entry.getIntValue()),
                        typeAffix * subAffix.getBaseValue(), typeAffix * subAffix.getStepValue(), subAffix.getStepNum());
                GameItemSubAffix gameItemSubAffix = null;
                if (result.get(0) > maxCount) {
                    gameItemSubAffix = new GameItemSubAffix(subAffix, maxCount);
                    gameItemSubAffix.setStep(gameItemSubAffix.getCount() * subAffix.getStepNum());
                } else {
                    gameItemSubAffix = new GameItemSubAffix(subAffix, result.get(0));
                    int step = Math.min(result.get(1), (gameItemSubAffix.getCount() * subAffix.getStepNum()));
                    gameItemSubAffix.setStep(step);
                }
                item.getSubAffixes().add(gameItemSubAffix);
            }
        }

    }

    private List<Integer> solveCountAndStepByValue(int value, double baseValue, double stepValue, int stepNum) {
        List<Integer> result = new ArrayList<>();
        baseValue = baseValue * 10;
        stepValue = stepValue * 10;
        int count = (int) Math.floor(((double) value) / baseValue);
        int step = Integer.MAX_VALUE;
        do {
            double mod = ((double) value) - baseValue * count;
            step = (int) Math.floor(mod / stepValue);
            if ((int) Math.floor(count * baseValue + step * stepValue) == value) {
                // In Game Value
                // do nothing
            } else if ((int) Math.floor(count * baseValue + (step + 1) * stepValue) == value) {
                // In Game Value
                step += 1;
            } else if ((int) Math.ceil(count * baseValue + step * stepValue) == value) {
                // Third party tool Value
                // do nothing
            } else if ((int) Math.ceil(count * baseValue + (step + 1) * stepValue) == value) {
                // Third party tool Value
                step += 1;
            } else {
                // ???
                // do nothing
            }
            if (step > count * stepNum) {
                count++;
            }
        } while (step > count * stepNum);
        result.add(count);
        result.add(step);
        return result;
    }

}
