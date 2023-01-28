package parkour;

import java.io.IOException;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import c_data.C_data;

public class parkour_set implements Listener {

	@EventHandler
	public void onPlayer(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("lobbysystem.setspawn")){
			if(e.getMessage().equalsIgnoreCase("/setparc spawn")){
				Location loc = p.getLocation();
				C_data.cfg2.set("parc1.X", loc.getX());
				C_data.cfg2.set("parc1.Y", loc.getY());
				C_data.cfg2.set("parc1.Z", loc.getZ());
				C_data.cfg2.set("parc1.WeltName", loc.getWorld().getName());
				try {
					C_data.cfg2.save(C_data.file2);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				C_data.parc1 = loc;
				p.sendMessage("§6You set parcour spawn 1!");
			}
			}
}
	@EventHandler
	public void onPlayer1(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("lobbysystem.setspawn")){
			if(e.getMessage().equalsIgnoreCase("/setparc2 spawn")){
				Location loc = p.getLocation();
				C_data.cfg2.set("parc2.X", loc.getX());
				C_data.cfg2.set("parc2.Y", loc.getY());
				C_data.cfg2.set("parc2.Z", loc.getZ());
				C_data.cfg2.set("parc2.WeltName", loc.getWorld().getName());
				try {
					C_data.cfg2.save(C_data.file2);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				C_data.parc2 = loc;
				p.sendMessage("§6You set parcour spawn 2!");
			}
			}
}
	
	@EventHandler
	public void onPlayer2(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("lobbysystem.setspawn")){
			if(e.getMessage().equalsIgnoreCase("/setparc3 spawn")){
				Location loc = p.getLocation();
				C_data.cfg2.set("parc3.X", loc.getX());
				C_data.cfg2.set("parc3.Y", loc.getY());
				C_data.cfg2.set("parc3.Z", loc.getZ());
				C_data.cfg2.set("parc3.WeltName", loc.getWorld().getName());
				try {
					C_data.cfg2.save(C_data.file2);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				C_data.parc3 = loc;
				p.sendMessage("§6You set parcour spawn 3!");
			}
			}
}
	
	@EventHandler
	public void onPlayer3(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("lobbysystem.setspawn")){
			if(e.getMessage().equalsIgnoreCase("/setparc4 spawn")){
				Location loc = p.getLocation();
				C_data.cfg2.set("parc4.X", loc.getX());
				C_data.cfg2.set("parc4.Y", loc.getY());
				C_data.cfg2.set("parc4.Z", loc.getZ());
				C_data.cfg2.set("parc4.WeltName", loc.getWorld().getName());
				try {
					C_data.cfg2.save(C_data.file2);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				C_data.parc4 = loc;
				p.sendMessage("§6You set parcour spawn 4!");
			}
			}
}
	
	@EventHandler
	public void onPlayer4(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("lobbysystem.setspawn")){
			if(e.getMessage().equalsIgnoreCase("/setparc5 spawn")){
				Location loc = p.getLocation();
				C_data.cfg2.set("parc5.X", loc.getX());
				C_data.cfg2.set("parc5.Y", loc.getY());
				C_data.cfg2.set("parc5.Z", loc.getZ());
				C_data.cfg2.set("parc5.WeltName", loc.getWorld().getName());
				try {
					C_data.cfg2.save(C_data.file2);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				C_data.parc5 = loc;
				p.sendMessage("§6You set parcour spawn 5!");
			}
			}
}
	
	@EventHandler
	public void onPlayer5(PlayerCommandPreprocessEvent e){
		Player p = e.getPlayer();
		if(p.hasPermission("lobbysystem.setspawn")){
			if(e.getMessage().equalsIgnoreCase("/setparc6 spawn")){
				Location loc = p.getLocation();
				C_data.cfg2.set("parc6.X", loc.getX());
				C_data.cfg2.set("parc6.Y", loc.getY());
				C_data.cfg2.set("parc6.Z", loc.getZ());
				C_data.cfg2.set("parc6.WeltName", loc.getWorld().getName());
				try {
					C_data.cfg2.save(C_data.file2);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				C_data.parc6 = loc;
				p.sendMessage("§6You set spawn 6!");
			}
			}
}
}
