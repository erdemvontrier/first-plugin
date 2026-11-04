package com.example;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class KatilimDinleyicisi implements Listener{

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        String joinMsg = ChatColor.translateAlternateColorCodes('&', "&e[+] &b" + player.getName() + " &7sunucuya katildi!");
        event.setJoinMessage(joinMsg);

        String welcomeMsg = ChatColor.translateAlternateColorCodes('&', "&aSunucuya hos geldin &e" + player.getName() + "&a! /iyiles yazarak canini yenileyebilirsin.");
        player.sendMessage(welcomeMsg);
    }
}
