package com.example;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IyılesKomutu implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        //komutu yazan kişi oyuncu mu kontrolü eğer konsol yazarsa hata verir
        if(!(sender instanceof Player)){
            sender.sendMessage(("Bu komut sadece oyun içinde kullanılabilir!"));
            return true;
        }
        Player player = (Player) sender;
        player.setHealth(20.0);  //-> double
        player.setFoodLevel(20);  // -> int , hem canı hem yemeği fuller.
        player.sendMessage(ChatColor.GREEN + "[FirstPlugin] Canin ve acligin tamamen dolduruldu!");

        return true;
    }
}
