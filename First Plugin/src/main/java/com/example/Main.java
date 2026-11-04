package com.example;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

    @Override
    public void onEnable(){

        //iyiles komutu tanımlanır.
        getCommand("iyiles").setExecutor(new IyılesKomutu());

        //event listeneri sunucuya kaydetme
        getServer().getPluginManager().registerEvents(new KatilimDinleyicisi(), this);

        getLogger().info("plugin başarıyla aktif edildi."); // plugin yüklendiğinde çalışacak kodlar.
    }

    @Override
    public void onDisable(){
        getLogger().info(("plugin devre dışı bırakıldı.")); // plugin devre dışı veya sunucu kapandığında çalışır.
    }

}