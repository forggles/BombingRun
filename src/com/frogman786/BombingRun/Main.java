package com.frogman786.BombingRun;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;

import com.frogman786.BombingRun.Scheduled;

 
public class Main extends JavaPlugin{
   
    private static Plugin plugin;
    public static Map<String, String> lobbylist = new HashMap<String, String>();
    public static Map<String, String> Ingame = new HashMap<String, String>();
    public static Map<String, String> configmap = new HashMap<String, String>();
    public static String ballholder = null;
	
    public void onEnable() {
        plugin = this;
        registerEvents(this, new Events());
        configini();
        commandini();
        scheduleini();
    }
   
    public void onDisable() {
       
    }
    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {
        for (Listener listener : listeners) {
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }
    }
    public static Plugin getPlugin() {
        return plugin;
    }
    
    private void configini(){
    	FileConfiguration config = getConfig();
		config.options().copyDefaults(true);
		saveConfig();
		for(String word: getConfig().getStringList("ranks")){
			//map/array.add(word);
		}
    }
    
    private void commandini(){
    	getCommand("bombingrun").setExecutor(new maincommand());
    }
   private void scheduleini(){
	   BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
       scheduler.scheduleSyncRepeatingTask(this, new Runnable() {
           @Override
           public void run() {
        	   Scheduled.count();
        	   Scheduled.execute();
           }
       }, 0L, 20L);
   }
   
   
 
}