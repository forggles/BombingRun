package com.frogman786.BombingRun;


import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

import com.frogman786.BombingRun.Main;

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
		World world = Bukkit.getWorld("gameworld");
		Location lobby = new Location(world,-3214,5,1729,180,0);
		Location[] blue = {};
		if(place.equalsIgnoreCase("lobby")){
			location = lobby;
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
		
		
		//firing ball

		Item dropped = (Item) p.getWorld().spawnEntity(p.getLocation(), EntityType.DROPPED_ITEM);
	}
	public static void Broadcast(String team, String message){
		if(team.equalsIgnoreCase("all")){

		}
		if(team.equalsIgnoreCase("red")){
			
		}
		if(team.equalsIgnoreCase("blue")){
			
		}
	}
}
