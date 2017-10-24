package me.DerekV.experience;

import org.bukkit.ChatColor;
import org.bukkit.Effect;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class critListner implements Listener {
	
	@EventHandler
	public void critListen(EntityDamageByEntityEvent e){
		
		if(e.getDamager() instanceof Player){
		
		Player player = (Player) e.getDamager();
		Entity entity = (Entity) e.getEntity();
		double random = Math.round(Math.random() * 200 + 1);
		
		
		
		
		if(random >= 198){
			
			e.setDamage(e.getDamage() + 3);
			((Player) player).playEffect(entity.getLocation(), Effect.ENDER_SIGNAL, 40);
			((Player) player).playEffect(entity.getLocation(), Effect.GHAST_SHRIEK, 40);
			player.sendMessage(ChatColor.GREEN + "Critical!");
			
		}
		
		}
		
		
	}
	
	
	
	
	
	
}
