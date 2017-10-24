package me.DerekV.experience;

import java.io.IOException;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class onJoin implements Listener{
	
	 @EventHandler
	public void onPlayerJoin(PlayerLoginEvent event){
		Player p = event.getPlayer();
		if(Experience.Exp.getString(p.getName() + ".Level") == null){
			Experience.Exp.set(p.getName() + ".Level", 1);
			Experience.Exp.set(p.getName() + ".Exp", 0);
			Experience.Exp.set(p.getName() + ".statsPoints", 0);
			Experience.Exp.set(p.getName() + ".hasStats", "");
			Experience.Exp.set(p.getName() + ".RequiredExp", 150);
			Experience.Exp.set(p.getName() + ".race", "Human");
			Experience.Exp.set(p.getName() + ".class", "none");
			p.sendMessage("Your config has been set up!");
			 try {
					Experience.Exp.save(Experience.ExpFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		}
	
		p.sendMessage(Experience.Exp.getString(p.getName() + ".Level"));
	}
	
	
	
	
	
}
