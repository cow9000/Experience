package me.DerekV.experience;

import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class rangerClass implements Listener{
	
	  @EventHandler(priority = EventPriority.HIGH)
	  public void damageListener(EntityDamageEvent e) {
	    if (e.isCancelled()) return;
	 
	    if (e instanceof EntityDamageByEntityEvent) {
	      EntityDamageByEntityEvent evt = (EntityDamageByEntityEvent)e;
	 
	      if (evt.getEntity() instanceof LivingEntity) {
	        LivingEntity ent = (LivingEntity)evt.getEntity();
	        
	        Entity entity = evt.getDamager();
	 
	        if (entity instanceof Arrow) {
	          @SuppressWarnings("deprecation")
			LivingEntity player = ((Arrow) entity).getShooter();
	          if(player instanceof Player){
	        	  if(Experience.Exp.getString(((HumanEntity) player).getName() + ".class") == "ranger"){
	        		  if(Experience.Exp.getInt(((HumanEntity) player).getName() + ".Level") >= 5)
	        		  ent.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 40, 1));
	          	  }
	          }
	          
	        }
	      }
	    }
	 }
	
	
	
}
