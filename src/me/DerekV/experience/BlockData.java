package me.DerekV.experience;

import org.bukkit.ChatColor;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class BlockData implements Listener{
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event){
		Player p = event.getPlayer();
		if(! p.isOp()) {event.setCancelled(true); p.sendMessage(ChatColor.RED + "You are not able to modify blocks!"); //p.playSound(p.getLocation(), "custom.soundtrack1", 2, 1);
			}
		}
	
	@EventHandler
	public void itemFrames(EntityDamageByEntityEvent e){
		if(e.getDamager() instanceof Arrow){
			if( e.getEntityType() == EntityType.ITEM_FRAME){
			Projectile pro = (Projectile) e.getDamager();
			@SuppressWarnings("deprecation")
			LivingEntity shoot = pro.getShooter();
			if(shoot instanceof Player){
			EntityType itemFrame = e.getEntityType();
			Player player = (Player) shoot;
			if(itemFrame == EntityType.ITEM_FRAME && ! player.isOp()){
					e.setCancelled(true);
					player.sendMessage(ChatColor.RED + "You are not able to modify blocks!");
				}
			}
		}
		}
		
		if(e.getDamager() instanceof Player){
		Player player = (Player) e.getDamager();
		EntityType itemFrame = e.getEntityType();
		if(itemFrame == EntityType.ITEM_FRAME && ! player.isOp()){
				e.setCancelled(true);
				player.sendMessage(ChatColor.RED + "You are not able to modify blocks!");
			}
		
		}
		}
		
	

	
	
}
