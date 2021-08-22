package me.daan.mtcore.events;

import me.daan.mtcore.Mtcore;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (p.hasPlayedBefore()) {
            String message = Mtcore.instance.getConfig().getString("Join-Message").replace("%speler%", p.getName());
            e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', message));
        }
        if (!p.hasPlayedBefore()) {
            String message2 = Mtcore.instance.getConfig().getString("First-Join").replace("%speler%", p.getName());
            e.setJoinMessage(ChatColor.translateAlternateColorCodes('&', message2));

        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();
        String message = Mtcore.instance.getConfig().getString("Leave-Message").replace("%speler%", p.getName());
        e.setQuitMessage(ChatColor.translateAlternateColorCodes('&', message));
    }
}

