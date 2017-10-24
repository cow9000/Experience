
package me.DerekV.experience;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class foodClass implements Listener{

	@EventHandler
	@SuppressWarnings("deprecation")
	public void onEat(PlayerInteractEvent event){
		Player player = (Player) event.getPlayer();
		if (player.getInventory().getItemInHand().equals(Material.AIR)){
		List<String> loreItem = event.getItem().getItemMeta().getLore();
		
		if(loreItem != null){
			//sets line to loreItem.
			for(String line : loreItem) {
			if (line.startsWith("Regen:")) {
				//This could cause errors
                String damageString = line.substring("Regen:".length()).trim();
                int regen = Integer.valueOf(damageString);
			
			player.sendMessage(ChatColor.LIGHT_PURPLE + "You will regenerate hearts for - " + regen + " seconds!");
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, regen * 20, 1));
			ItemStack inHand = event.getItem();
				int inHandAmount = inHand.getAmount();
					if(inHandAmount != 1){
						inHand.setAmount((inHandAmount - 1));
					}else{
						player.setItemInHand(new ItemStack(Material.AIR));
						player.updateInventory();
					}
					}
				}
			}
		}
		
	}
	
	
}