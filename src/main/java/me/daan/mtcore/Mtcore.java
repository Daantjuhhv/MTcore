package me.daan.mtcore;

import me.daan.mtcore.events.JoinLeaveListener;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mtcore extends JavaPlugin {

    public static Mtcore instance;

    @Override
    public void onEnable() {
        instance = this;
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage("");
        console.sendMessage("MTcore");
        console.sendMessage("door Daan!");
        console.sendMessage("Gestart!");
        console.sendMessage("");
        getCommand("Discord").setExecutor(new Discord(this));
        getCommand("join-info").setExecutor(new Info());
        Bukkit.getPluginManager().registerEvents(new JoinLeaveListener(), this);
        saveDefaultConfig();
    }

    @Override

    public void onDisable() {
        ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
        console.sendMessage("");
        console.sendMessage("- MTcore");
        console.sendMessage("door Daan!");
        console.sendMessage("Afgesloten!");
        console.sendMessage("");
    }
}
