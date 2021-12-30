package me.boxergamerpw.spacehelmet;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import me.boxergamerpw.spacehelmet.SpaceHelmet;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class SpaceHelmetCmd implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length >= 1){

            String playerName = args[0];
            Player targetPlayer = Bukkit.getPlayer(playerName);

            return true;
        }

        if (sender instanceof Player) {
            Player player = (Player) sender;

            ItemStack itemStack = new ItemStack(Material.RED_STAINED_GLASS );

            ItemMeta itemMeta = itemStack.getItemMeta();
            itemMeta.setDisplayName(ChatColor.RED + "Boxer's Space Helmet" );
            ArrayList<String> lore = new ArrayList<String> ();
            lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "A rare space helmet forged");
            lore.add(ChatColor.GRAY + "" + ChatColor.ITALIC + "from shards of moon.");
            lore.add("");
            lore.add(ChatColor.DARK_GRAY + "To: " + ChatColor.RED + "[BT] " + player.getDisplayName());
            lore.add(ChatColor.DARK_GRAY + "From: " + ChatColor.RED + "[ADMIN] Boxer_GamerBoy");
            lore.add("");
            lore.add(ChatColor.DARK_GRAY + "Edition #1");
            lore.add(ChatColor.DARK_GRAY + "January 2022");
            lore.add("");
            lore.add(ChatColor.DARK_GRAY + "This item can be reforged!");
            lore.add(ChatColor.RED + "" + ChatColor.BOLD + "SPECIAL HELMET");
            itemMeta.setLore(lore);

            itemStack.setItemMeta(itemMeta);
            player.getInventory().setHelmet(new ItemStack(itemStack));
            player.sendMessage(ChatColor.GREEN + "You received one " + ChatColor.RED + "Boxer's Space Helmet");


        }
        return true;
    }
}

