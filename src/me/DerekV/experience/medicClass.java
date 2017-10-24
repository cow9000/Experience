package me.DerekV.experience;

import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_7_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class medicClass implements Listener{
	
	@EventHandler
	public void playerHeal(EntityDamageByEntityEvent event){
        if(event.getDamager() instanceof Player && event.getEntity() instanceof Player){
            Player damager = (Player) event.getDamager();
            Player damaged = (Player) event.getEntity();
            if(Experience.Exp.getString(damager.getName() + ".class" ).contains("medic")){
            	if(damager.getInventory().getItemInHand().getType().equals(Material.GOLD_SWORD) ){
            	double damagedHealth = ((CraftPlayer) damaged).getHealth();
            	event.setCancelled(true);
            	if(damagedHealth !=20){
            	damaged.setHealth(damagedHealth + .5);
            	event.setCancelled(true);
            	}
            	}else{
            		
            	}
            }
            
            
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
