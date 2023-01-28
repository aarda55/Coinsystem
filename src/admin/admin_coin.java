package admin;

import java.io.IOException;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import c_data.C_data;

public class admin_coin implements Listener {
	
	@EventHandler
	public void onPlayer1(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		String UUID = p.getUniqueId().toString();
		@SuppressWarnings("unused")
		int coins = C_data.cfg2.getInt("amount." + UUID + ".coins");
		if(p.hasPermission("coins.*")){
			if(e.getMessage().equalsIgnoreCase("/coins inf")){
				C_data.cfg.set("amount." + UUID + ".coins", 999999999);
				try {
					C_data.cfg.save(C_data.file);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
			}
				p.sendMessage("§2You set your Coins to §4infinity!");
			}	
			}
	}
}
