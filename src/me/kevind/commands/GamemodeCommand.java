package me.kevind.commands;

import me.kevind.utils.ColorUtils;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        Player player = (Player) sender;
        if (sender instanceof Player) {
            if (args.length == 0) {
                player.sendMessage(ColorUtils.color("&cPlease specify arguments!: c, sp, s, a"));
                return false;
            }
            if (args[0].equalsIgnoreCase("c")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ColorUtils.color("&7Set your gamemode to &9Creative"));
            }
            if (args[0].equalsIgnoreCase("s")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ColorUtils.color("&7Set your gamemode to &9Survival"));
            }
            if (args[0].equalsIgnoreCase("sp")) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage(ColorUtils.color("&7Set your gamemode to &9Spectator"));
            }
            if (args[0].equalsIgnoreCase("a")) {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage(ColorUtils.color("&7Set your gamemode to &9Adventure"));
            }
        }else {
            sender.sendMessage("You must be a player to use this command.");
        }
        return false;
    }
}
