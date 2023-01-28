package c_data;

import java.io.File;

import org.bukkit.Location;
import org.bukkit.configuration.file.YamlConfiguration;

public class C_data {
	public static File file = new File("plugins//CoinSystem//amounts.yml");
	public static File file2 = new File("plugins//CoinSystem//parcour.yml");
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	public static YamlConfiguration cfg2 = YamlConfiguration.loadConfiguration(file2);

	public static Location parc1;
	public static Location parc2;
	public static Location parc3;
	public static Location parc4;
	public static Location parc5;
	public static Location parc6;
}
