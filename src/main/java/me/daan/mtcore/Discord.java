package me.daan.mtcore;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Discord implements CommandExecutor {
    private Mtcore Plugin;

    public Discord(Mtcore Plugin) {
        this.Plugin = Plugin;
        Plugin.getCommand("discord").setExecutor(this);
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("discord"))
            //sender.sendMessage(this.Plugin.getConfig().getString("discord"));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', this.Plugin.getConfig().getString("discord")));
        return false;
    }
}