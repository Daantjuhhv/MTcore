package me.daan.mtcore;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Info implements CommandExecutor {
    public static String serverVersion = Bukkit.getBukkitVersion();

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Je moet een speler zijn.");
            return false;
        }
        Player player = (Player)sender;
        player.sendMessage(ChatColor.GREEN + "----------------------------------------------");
        player.sendMessage(ChatColor.GREEN + "Deze server maakt gebruikt van MTcore.");
        player.sendMessage(ChatColor.GREEN + "Plugin gemaakt door Daantjuhh_");
        player.sendMessage(ChatColor.GREEN + "Server versie: " + serverVersion);
        player.sendMessage(ChatColor.GREEN + "----------------------------------------------");
        return true;
    }
}
