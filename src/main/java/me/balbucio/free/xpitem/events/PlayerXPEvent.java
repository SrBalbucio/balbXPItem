package me.balbucio.free.xpitem.events;

import me.balbucio.free.xpitem.files.FileManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerXPEvent implements Listener {

    @EventHandler
    public void onPlayerXP(PlayerLevelChangeEvent evt){
        Player player = evt.getPlayer();
        for(String key : FileManager.returnRewards().getKeys(false)){
            if(Integer.parseInt(key) == player.getLevel()){
                if(Material.getMaterial(FileManager.returnRewards().getInt(key)) != null){
                    Material m = Material.getMaterial(FileManager.returnRewards().getInt(key));
                    ItemStack item = new ItemStack(m, 1);
                    player.getInventory().addItem(item);
                    player.sendMessage(FileManager.returnConfig().getString("reward").replace("&", "§").replace("%item", m.name()));
                }
            }
        }
    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         package me.balbucio.free.xpitem.events;

import me.balbucio.free.xpitem.files.FileManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerXPEvent implements Listener {

    @EventHandler
    public void onPlayerXP(PlayerLevelChangeEvent evt){
        Player player = evt.getPlayer();
        for(String key : FileManager.returnRewards().getKeys(false)){
            if(Integer.parseInt(key) == player.getLevel()){
                if(Material.getMaterial(FileManager.returnRewards().getInt(key)) != null){
                    Material m = Material.getMaterial(FileManager.returnRewards().getInt(key));
                    ItemStack item = new ItemStack(m, 1);
                    player.getInventory().addItem(item);
                    player.sendMessage(FileManager.returnConfig().getString("reward").replace("&", "§").replace("%item", m.name()));
                }
            }
        }
    }
}
