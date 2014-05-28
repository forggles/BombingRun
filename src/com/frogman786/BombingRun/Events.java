package com.frogman786.BombingRun;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Events implements Listener {
	@EventHandler
	public void onPlayerPunch(EntityDamageByEntityEvent evt){//this is obviously a stub for testing
		//it will get changed to chek if the player being hit is the ballholder if so they will drop the ball if neither
		//player is the ballholder then the hit player will get hit with knockback 1
		//(just to give the runner a little disadvantage and make the game slightly more difficult)
		//(it's so the defending team can knock the protectors away from the runner)
		Player attacker = null;
		Player damaged = null;
		if(evt.getDamager().getType().equals(EntityType.PLAYER)&&evt.getEntity().getType().equals(EntityType.PLAYER)){
			attacker = (Player) evt.getDamager();
			damaged = (Player) evt.getEntity();
		}
		if
		Bukkit.broadcastMessage(attacker.getName() + " hit " + damaged.getName());
	}
}
