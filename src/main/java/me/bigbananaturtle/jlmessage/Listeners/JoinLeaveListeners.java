package me.bigbananaturtle.jlmessage.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (player.hasPlayedBefore()) {
            e.setJoinMessage(ChatColor.GREEN + "Welcome back to the server " +
                    ChatColor.YELLOW + "" +
                    ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + "!!! We missed you!");
        } else {
            e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + player.getDisplayName() + ", " +
                             ChatColor.BLUE + "Welcome to t he best server ever. I hope you like it!");
        }
    }


    @EventHandler
    public void onLeave(PlayerQuitEvent e) {

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + ChatColor.RED + " has left, let's hope they come back.");
    }

}
