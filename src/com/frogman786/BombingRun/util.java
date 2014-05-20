package com.frogman786.BombingRun;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class util {
	
	
	public static Boolean hasball(Player p){
		if(Main.ballholder.equals(p.getName())){
			return true;
		}else{
		return false;
		}
	}
	
	
	public static void teleport(String place, Player player){
		Location location = null;
		if(place.equalsIgnoreCase("lobby")){
			//TODO work out locations and assing coords
		}
		if(place.equalsIgnoreCase("randomblue")){
			//TODO random selection of spawn from list
		}
		if(place.equalsIgnoreCase("randomred")){
			//TODO same thing
		}
		player.teleport(location);
	}
	
	
	public static void dropball(){
		Player p = Bukkit.getPlayer(Main.ballholder);
		//get inventory and drop the ball
		//return nothing
	}
}
