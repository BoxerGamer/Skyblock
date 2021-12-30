package me.boxergamerpw.spacehelmet;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class SpaceHelmetListener implements Listener {

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent e){

            if(e.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals(ChatColor.RED + "Boxer's Space Helmet")){
                e.getPlayer().sendMessage("§cSorry! You can't place this item");

                e.setCancelled(true);
            }
        }
    }

