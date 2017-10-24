package me.DerekV.experience;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.ItemStack;

public class onClickCommand implements Listener{
	
	
	Experience plugin;
	 
	public onClickCommand(Experience instance) {
	plugin = instance;
	}
	
	
	
	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		Player player = (Player) event.getWhoClicked();
		ItemStack item = event.getCurrentItem();
		if(item.hasItemMeta()){
		if(plugin.getConfig().getList("Towns").contains(item.getItemMeta().getDisplayName())){	
		event.setCancelled(true);
		player.closeInventory();
		
		//Test command
		//Bukkit.dispatchCommand(player, "/help");
		Location location = new Location(Bukkit.getWorld("world"), plugin.getConfig().getInt("Location." + item.getItemMeta().getDisplayName() + "x"), plugin.getConfig().getInt("Location." + item.getItemMeta().getDisplayName() + "y"), plugin.getConfig().getInt("Location." + item.getItemMeta().getDisplayName() + "z"),plugin.getConfig().getInt("Location." + item.getItemMeta().getDisplayName() + "yaw"),plugin.getConfig().getInt("Location." + item.getItemMeta().getDisplayName() + "p"));
		player.teleport(location);
		}
		}
	}
	@EventHandler
	public void onInventoryDrag(InventoryDragEvent event) {
		String item = event.getCursor().getItemMeta().getDisplayName();
		if(item.equals("town1")){	
		event.setCancelled(true);
		}
	}
		
	
}
