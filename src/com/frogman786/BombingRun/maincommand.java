package com.frogman786.BombingRun;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class maincommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,String[] args) {
		if(args.length == 0){
			sender.sendMessage(helptopic.gethelp());
			return true;
		}else{
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("join")){
					//TODO join stuffs
					//add player to lobby list
					// call enough players yet method
					return true;
				}
				if(args[0].equalsIgnoreCase("quit")){
					//TODO anti join stuffs
					//check if in game or lobby
						//if in game
							//if has ball
								//util.dropball()
								//util.teleport("lobby",player)
						//remove from whichever
					//else send not in game message
					return true;
				}
				if(args[0].equalsIgnoreCase("help")){
					sender.sendMessage(helptopic.gethelp());
					return true;
				}
			}
		}
		return false;
	}

}
