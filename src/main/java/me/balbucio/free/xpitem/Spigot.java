package me.balbucio.free.xpitem;

import me.balbucio.free.xpitem.events.PlayerXPEvent;
import me.balbucio.free.xpitem.files.FileManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Spigot extends JavaPlugin {

    @Override
    public void onEnable() {
        FileManager.loadConfig(this);
        this.getServer().getPluginManager().registerEvents(new PlayerXPEvent(), this);
        Bukkit.getConsoleSender().sendMessage("§abalbXPItem - §fPlugin ativado com sucesso!");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§abalbXPItem - §fPlugin §cdesativado§f com sucesso!");
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   package me.balbucio.free.xpitem;

import me.balbucio.free.xpitem.events.PlayerXPEvent;
import me.balbucio.free.xpitem.files.FileManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Spigot extends JavaPlugin {

    @Override
    public void onEnable() {
        FileManager.loadConfig(this);
        this.getServer().getPluginManager().registerEvents(new PlayerXPEvent(), this);
        Bukkit.getConsoleSender().sendMessage("§abalbXPItem - §fPlugin ativado com sucesso!");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§abalbXPItem - §fPlugin §cdesativado§f com sucesso!");
    }
}
