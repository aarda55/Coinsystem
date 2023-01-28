package admin;

import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import c_data.C_data;

public class Coin_com implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String arg2, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("coins.*")) {
				if (args.length > 0) {
					Player target = Bukkit.getPlayerExact(args[1]);
	    			int coins2 = Integer.valueOf(args[2]).intValue();
	    			if (args[0].equalsIgnoreCase("add")) {
	    				if (coins2 == 0) {
	    					player.sendMessage("§cYou need to enter a higher amount!");
    						return true;
	    				} else {
	    				String UUID = target.getUniqueId().toString();
	    				int coins = C_data.cfg.getInt("amount." + UUID + ".coins");
	    				int total = coins + coins2;
	    				C_data.cfg.set("amount." + UUID + ".coins", total);
	    				target.sendMessage("You got " + coins2 + "coins in to your account account");
	    				try {
							C_data.cfg.save(C_data.file);
						} catch (IOException e) {
							e.printStackTrace();
						}
	    				}
	    			}
				}
			}
		}
		
		return false;
	}


}
