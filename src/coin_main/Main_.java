package coin_main;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import admin.Coin_com;
import admin.admin_coin;
import c_data.C_data;
import parkour.parkour_set;

public class Main_ extends JavaPlugin implements Listener{
		public void onEnable(){
			getCommand("coins").setExecutor(new Coin_com());
			Bukkit.getConsoleSender().sendMessage("§6Coinsystem activates...");
			Bukkit.getPluginManager().registerEvents(this, this);
			Bukkit.getPluginManager().registerEvents(new admin_coin(), this);
			Bukkit.getPluginManager().registerEvents(new parkour_set(), this);
		}
		
		public void onDisable(){
			
			Bukkit.getConsoleSender().sendMessage("§6Coinsystem deactivates...");
			
	}
		public void loadLocations(){
			File file = new File("plugins//CoinSystem//parkcour.yml");
			YamlConfiguration cfg2 = YamlConfiguration.loadConfiguration(file);
	        String w = cfg2.getString("parc1.WeltName");
	        double x = cfg2.getDouble("parc1.X");
	        double y = cfg2.getDouble("parc1.Y");
	        double z = cfg2.getDouble("parc1.Z");
	        Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
	        C_data.parc1 = loc;

		}
		public void load1(){
			File file = new File("plugins//CoinSystem//parkcour.yml");
			YamlConfiguration cfg2 = YamlConfiguration.loadConfiguration(file);
	        String w = cfg2.getString("parc2.WeltName");
	        double x = cfg2.getDouble("parc2.X");
	        double y = cfg2.getDouble("parc2.Y");
	        double z = cfg2.getDouble("parc2.Z");
	        Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
	        C_data.parc2 = loc;
		}
	public void load2(){
		File file = new File("plugins//CoinSystem//parkcour.yml");
		YamlConfiguration cfg2 = YamlConfiguration.loadConfiguration(file);
	    String w = cfg2.getString("parc3.WeltName");
	    double x = cfg2.getDouble("parc3.X");
	    double y = cfg2.getDouble("pacr3.Y");
	    double z = cfg2.getDouble("parc3.Z");
	    Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
	    C_data.parc3 = loc;
		}
	public void load3(){
		File file = new File("plugins//CoinSystem//parkcour.yml");
		YamlConfiguration cfg2 = YamlConfiguration.loadConfiguration(file);
	    String w = cfg2.getString("parc4.WeltName");
	    double x = cfg2.getDouble("parc4.X");
	    double y = cfg2.getDouble("parc4.Y");
	    double z = cfg2.getDouble("parc4.Z");
	    Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
	    C_data.parc4 = loc;
	}
	public void load4(){
		File file = new File("plugins//CoinSystem//parkcour.yml");
		YamlConfiguration cfg2 = YamlConfiguration.loadConfiguration(file);
	    String w = cfg2.getString("parc5.WeltName");
	    double x = cfg2.getDouble("parc5.X");
	    double y = cfg2.getDouble("parc5.Y");
	    double z = cfg2.getDouble("parc5.Z");
	    Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
	    C_data.parc5 = loc;
	}
	public void load5(){
		File file = new File("plugins//CoinSystem//parkcour.yml");
		YamlConfiguration cfg2 = YamlConfiguration.loadConfiguration(file);
	    String w = cfg2.getString("parc6.WeltName");
	    double x = cfg2.getDouble("parc6.X");
	    double y = cfg2.getDouble("parc6.Y");
	    double z = cfg2.getDouble("parc6.Z");
	    Location loc = new Location(Bukkit.getWorld((String)w), x, y, z);
	    C_data.parc6 = loc;
	}
	@EventHandler
	public void onJ(PlayerJoinEvent e) {
	Player p = e.getPlayer();
	String uuid = p.getUniqueId().toString();
	if(p.hasPlayedBefore()) {
	} else {
		C_data.cfg.set("amount." + uuid + ".coins", 1000);
		try {
			C_data.cfg.save(C_data.file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	}
	@EventHandler
	public void onMove(PlayerMoveEvent e) throws IOException {
		Player p = e.getPlayer();
		String UUID = p.getUniqueId().toString();
		int coins = C_data.cfg.getInt("amount." + UUID + ".coins");
		if(p.getLocation() == C_data.parc1) {
		C_data.cfg.set("amount." + UUID + ".coins", coins +100);
		C_data.cfg.save(C_data.file);
		}
		if(p.getLocation() == C_data.parc2) {
			C_data.cfg.set("amount." + UUID + ".coins", coins +110);
			C_data.cfg.save(C_data.file);
			}
		if(p.getLocation() == C_data.parc3) {
			C_data.cfg.set("amount." + UUID + ".coins", coins +120);
			C_data.cfg.save(C_data.file);
			}
		if(p.getLocation() == C_data.parc4) {
			C_data.cfg.set("amount." + UUID + ".coins", coins +130);
			C_data.cfg.save(C_data.file);
			}
		if(p.getLocation() == C_data.parc5) {
			C_data.cfg.set("amount." + UUID + ".coins", coins +140);
			C_data.cfg.save(C_data.file);
			}
		if(p.getLocation() == C_data.parc6) {
			C_data.cfg.set("amount." + UUID + ".coins", coins +150);
			C_data.cfg.save(C_data.file);
			}
	}

}
