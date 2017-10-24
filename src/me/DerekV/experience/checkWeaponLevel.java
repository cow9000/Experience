package me.DerekV.experience;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class checkWeaponLevel implements Listener{
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
		Player p = event.getPlayer();
		ItemStack hand = p.getInventory().getItemInHand();
		if(! p.hasPermission("rc.bypasslevel")){
		if (event.getAction() == Action.LEFT_CLICK_BLOCK || event.getAction() == Action.LEFT_CLICK_AIR && ! p.isOp()) {
		if(hand.getType() != Material.AIR || hand.getType() != null){
		if(Experience.checkLevel(p) == true){
			p.sendMessage("You are at the required level!");
		
			
		}else if(Experience.checkLevel(p) == false){
			
			event.setCancelled(true);
			p.sendMessage(ChatColor.RED + "You are not the required level.");
			}
			}
			}
		}	
		
		
		
		
		
		
			
		}
		
	

	
	@EventHandler()
	public void eventInventoryClose(final InventoryCloseEvent event)
	{
		PlayerInventory inventory = event.getPlayer().getInventory();
		HumanEntity p = event.getPlayer();
		Player player = (Player) p;
		if(! player.hasPermission("rc.bypasslevel")){
		if(inventory.getHelmet() != null){
			ItemMeta im = inventory.getHelmet().getItemMeta();
			if(im.getLore() != null){
				List<String> loreList = im.getLore();
				
				for(String line : loreList) {
                    if (line.startsWith("Level:")) {
                        String damageString = line.substring("Level:".length()).trim(); // remove "Damage:" from the begining of the string and trim surrounding spaces
                        int Level = Integer.valueOf(damageString);
                        if(Level > Experience.Exp.getInt(".Exp")) {
                        		inventory.addItem(inventory.getHelmet());
                        		inventory.setHelmet(null);
                        	}
                    }
                } 
				
			}
			
		}
		if(inventory.getChestplate() != null){
			ItemMeta im = inventory.getChestplate().getItemMeta();
			if(im.getLore() != null){
				List<String> loreList = im.getLore();
				
				for(String line : loreList) {
                    if (line.startsWith("Level:")) {
                        String damageString = line.substring("Level:".length()).trim(); // remove "Damage:" from the begining of the string and trim surrounding spaces
                        int Level = Integer.valueOf(damageString);
                        if(Level > Experience.Exp.getInt(".Exp")) {
                        		inventory.addItem(inventory.getChestplate());
                        		inventory.setChestplate(null);
                        	}
                    }
                } 
				
			}
			
		}
		if(inventory.getLeggings() != null){
			ItemMeta im = inventory.getLeggings().getItemMeta();
			if(im.getLore() != null){
				List<String> loreList = im.getLore();
				
				for(String line : loreList) {
                    if (line.startsWith("Level:")) {
                        String damageString = line.substring("Level:".length()).trim(); // remove "Damage:" from the begining of the string and trim surrounding spaces
                        int Level = Integer.valueOf(damageString);
                        if(Level > Experience.Exp.getInt(".Exp")) {
                        		inventory.addItem(inventory.getLeggings());
                        		inventory.setLeggings(null);
                        	}
                    }
                } 
				
			}
			
		}
		if(inventory.getBoots() != null){
			ItemMeta im = inventory.getBoots().getItemMeta();
			if(im.getLore() != null){
				List<String> loreList = im.getLore();
				
				for(String line : loreList) {
                    if (line.startsWith("Level:")) {
                        String damageString = line.substring("Level:".length()).trim(); // remove "Damage:" from the begining of the string and trim surrounding spaces
                        int Level = Integer.valueOf(damageString);
                        if(Level > Experience.Exp.getInt(".Exp")) {
                        		inventory.addItem(inventory.getBoots());
                        		inventory.setBoots(null);
                        	}
                    }
                } 
				
			}
			
		}
		
		}
		
	}

		
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event){
PlayerInventory inventory = event.getPlayer().getInventory();
		Player player = event.getPlayer();
		if(! player.hasPermission("rc.bypasslevel")){
		if(inventory.getHelmet() != null){
			ItemMeta im = inventory.getHelmet().getItemMeta();
			if(im.getLore() != null){
				List<String> loreList = im.getLore();
				
				for(String line : loreList) {
                    if (line.startsWith("Level:")) {
                        String damageString = line.substring("Level:".length()).trim(); // remove "Damage:" from the begining of the string and trim surrounding spaces
                        int Level = Integer.valueOf(damageString);
                        if(Level > Experience.Exp.getInt(".Exp")) {
                        		inventory.addItem(inventory.getHelmet());
                        		inventory.setHelmet(null);
                        		player.sendMessage(ChatColor.RED + "You are not the required level.");
                        	}
                    }
                } 
				
			}
			
		}
		if(inventory.getChestplate() != null){
			ItemMeta im = inventory.getChestplate().getItemMeta();
			if(im.getLore() != null){
				List<String> loreList = im.getLore();
				
				for(String line : loreList) {
                    if (line.startsWith("Level:")) {
                        String damageString = line.substring("Level:".length()).trim(); // remove "Damage:" from the begining of the string and trim surrounding spaces
                        int Level = Integer.valueOf(damageString);
                        if(Level > Experience.Exp.getInt(".Exp")) {
                        		inventory.addItem(inventory.getChestplate());
                        		inventory.setChestplate(null);
                        		player.sendMessage(ChatColor.RED + "You are not the required level.");
                        	}
                    }
                } 
				
			}
			
		}
		if(inventory.getLeggings() != null){
			ItemMeta im = inventory.getLeggings().getItemMeta();
			if(im.getLore() != null){
				List<String> loreList = im.getLore();
				
				for(String line : loreList) {
                    if (line.startsWith("Level:")) {
                        String damageString = line.substring("Level:".length()).trim(); // remove "Damage:" from the begining of the string and trim surrounding spaces
                        int Level = Integer.valueOf(damageString);
                        if(Level > Experience.Exp.getInt(".Exp")) {
                        		inventory.addItem(inventory.getLeggings());
                        		inventory.setLeggings(null);
                        		player.sendMessage(ChatColor.RED + "You are not the required level.");
                        	}
                    }
                } 
				
			}
			
		}
		if(inventory.getBoots() != null){
			ItemMeta im = inventory.getBoots().getItemMeta();
			if(im.getLore() != null){
				List<String> loreList = im.getLore();
				
				for(String line : loreList) {
                    if (line.startsWith("Level:")) {
                        String damageString = line.substring("Level:".length()).trim(); // remove "Damage:" from the begining of the string and trim surrounding spaces
                        int Level = Integer.valueOf(damageString);
                        if(Level > Experience.Exp.getInt(".Exp")) {
                        		inventory.addItem(inventory.getBoots());
                        		inventory.setBoots(null);
                        		player.sendMessage(ChatColor.RED + "You are not the required level.");
                        	}
                    }
                } 
				
			}
			
		}
		
		
		}
	}
		
	
	
}
