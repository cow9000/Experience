	package me.DerekV.experience;

import java.io.IOException;

import org.bukkit.ChatColor;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Horse;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Pig;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Witch;
import org.bukkit.entity.Wither;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class onKill implements Listener{
	
	private Experience plugin;
	 
	public onKill(Experience plugin){
	this.plugin=plugin;
	}
	
	
	
	@EventHandler
    public void ZombieKills(EntityDeathEvent event) {
		
        Entity entity = event.getEntity();
        if (entity instanceof Bat) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("bat");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        			 if(Experience.Exp.getInt(player.getName() + ".Level") == 15){
        				 player.sendMessage(ChatColor.GOLD + "You may now choose a subclass!");
        			 }
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Chicken) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("chicken");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Cow) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("cow");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof MushroomCow) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("mooshroom");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Horse) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("horse");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Ocelot) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("ocelot");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Pig) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("pig");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Sheep) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("sheep");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Squid) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("squid");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Villager) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("villager");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Bat) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("bat");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof IronGolem) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("irongolem");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Snowman) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("snowgolem");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Bat) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("bat");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof EnderDragon) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("enderdragon");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Wither) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("wither");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Creeper) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("creeper");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Skeleton) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("skeleton");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Zombie) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("zombie");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Enderman) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("enderman");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Spider) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("spider");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof CaveSpider) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("cavespider");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Wolf) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("bat");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof PigZombie) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("zombiepig");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Blaze) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("blaze");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Silverfish) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("silverfish");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Slime) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("slime");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
        if (entity instanceof Witch) {
        	if(((LivingEntity) entity).getKiller() instanceof Player){
        		 Player player = (Player) event.getEntity().getKiller();
        		 int Exp = plugin.getConfig().getInt("witch");
        		 player.sendMessage(ChatColor.GREEN + "You have earned - " + ChatColor.GOLD + Exp + " Exp");
        		 int currentExp = Experience.Exp.getInt(player.getName() + ".Exp");
        		 Experience.Exp.set(player.getName() + ".Exp", (Exp + currentExp));
        		 if( Experience.Exp.getInt(player.getName() + ".Exp") >= Experience.Exp.getInt(player.getName() + ".RequiredExp")){
        			 Experience.Exp.set(player.getName() + ".RequiredExp", (Experience.Exp.getInt(player.getName() + ".Exp") + Experience.Exp.getInt(player.getName() + ".RequiredExp")));
        			 Experience.Exp.set(player.getName() + ".statsPoints", (Experience.Exp.getInt(player.getName() + ".statsPoints") + 2));
        			 Experience.Exp.set(player.getName() + ".Level", (Experience.Exp.getInt(player.getName() + ".Level") + 1));
        			 player.sendMessage(ChatColor.GOLD + "You have leveled up to - " + Experience.Exp.getInt(player.getName() + ".Level"));
        		 }
        		 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
	}
    
    
}
   		
