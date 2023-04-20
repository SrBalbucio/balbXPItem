package me.balbucio.free.xpitem.files;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class FileManager {
    public static void loadConfig(Plugin plg){
        File folder = new File("plugins/balbXPItem");
        if(!folder.exists()){
            folder.mkdir();
        }
        File file = new File("plugins/balbXPItem", "lang.yml");
        if(!file.exists()) {
            try (InputStream in = plg.getResource("lang.yml")) {
                Files.copy(in, file.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        file = new File("plugins/balbXPItem", "rewards.yml");
        if(!file.exists()) {
            try{
                file.createNewFile();
                YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
                config.set("1", Material.APPLE.getId());
                config.set("2", Material.DIAMOND_SWORD.getId());
                config.save(filpackage me.balbucio.free.xpitem.files;

import org.bukkit.Material;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class FileManager {
    public static void loadConfig(Plugin plg){
        File folder = new File("plugins/balbXPItem");
        if(!folder.exists()){
            folder.mkdir();
        }
        File file = new File("plugins/balbXPItem", "lang.yml");
        if(!file.exists()) {
            try (InputStream in = plg.getResource("lang.yml")) {
                Files.copy(in, file.toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        file = new File("plugins/balbXPItem", "rewards.yml");
        if(!file.exists()) {
            try{
                file.createNewFile();
                YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
                config.set("1", Material.APPLE.getId());
                config.set("2", Material.DIAMOND_SWORD.getId());
                config.save(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static YamlConfiguration returnConfig(){
        File file = new File("plugins/balbXPItem", "lang.yml");
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        return config;
    }
    public static YamlConfiguration returnRewards(){
        File file = new File("plugins/balbXPItem", "rewards.yml");
        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        return config;
    }
}
