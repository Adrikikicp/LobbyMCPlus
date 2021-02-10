import java.io.File;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.lobbymc.events.AlEntrar;
import org.lobbymc.events.ScoreboardAdmin;

@SuppressWarnings("unused")
public class LobbyMCPlus extends JavaPlugin{
	
	
	
	
	private PluginDescriptionFile pdffile = getDescription();
private  String version = pdffile.getVersion();
private  String name = pdffile.getName();
private List<String> author = pdffile.getAuthors();

private String rutaConfig;


public void onEnable() {
	
	
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',  "&4+++++++++++++++++++++++++++++++++++++++"));
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',  "&2[LobbyMC] &cLobbyMC has been enabled"));
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',  "&2[LobbyMC] &3Version &c1.0"));
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',  "&4+++++++++++++++++++++++++++++++++++++++"));
	

	registerEvents();
	registerConfig();
		
	ScoreboardAdmin scoreboard = new ScoreboardAdmin(this);
	scoreboard.crearScoreboard(Integer.valueOf(getConfig().getString("Scoreboard.ticks")));


	
	
	
	
	
	
}
	

public void onDisable() {
	
	
	
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',  "&4+++++++++++++++++++++++++++++++++++++++"));
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',  "&2[LobbyMC] &cLobbyMC has been disabled"));
	Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',  "&4+++++++++++++++++++++++++++++++++++++++"));
	
	
	
}
	
	
	
	

		
		
		
		
		
		
		
		
		
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
public boolean onCommand(CommandSender sender, Command comando, String label, String[] args) {
		
		
		
		
		
		
		
		
		
		
		Player jugador = (Player) sender;
		
		
		
		{
	
			FileConfiguration config = getConfig();
			
			if(comando.getName().equalsIgnoreCase("spawn")){	
			
				jugador.sendMessage(ChatColor.RED+"Version of plugin: 1.0");
				
				
		
			
			} else if(comando.getName().equalsIgnoreCase("spawn")) {	
					
					
					if(config.contains("Spawn.x")) {
						
						World world = getServer().getWorld(config.getString("Spawn.world"));
						double x = Double.valueOf(config.getString("Spawn.X"));
						double y = Double.valueOf(config.getString("Spawn.Y"));
						double z = Double.valueOf(config.getString("Spawn.Z"));
						float yaw = Float.valueOf(config.getString("Spawn.YAW"));
						float pitch = Float.valueOf(config.getString("Spawn.PITCH"));
						Location l = new Location(world, x, y , z, yaw, pitch);
						jugador.teleport(l);
						
			
			
			
		}else if(((String) args[0]).equalsIgnoreCase("reload"));
			
			reloadConfig();
			jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cConfiguration reloaded"));
			if(jugador.hasPermission("lobbymc.addspawn")) {
				
				
				
			
			}else if(comando.getName().equalsIgnoreCase("setspawn"));
				
				Location l = jugador.getLocation();
				double x = l.getX();
				double y = l.getY();
				double z = l.getZ();
				float yaw = l.getYaw();
				float pitch = l.getPitch();
				
				config.set("Spawn.X", x);
				config.set("Spawn.Y", y);
				config.set("Spawn.Z", z);
				config.set("Spawn.YAW", yaw);
				config.set("Spawn.PITCH", pitch);
				saveConfig();
				jugador.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cSpawn setted"));
		


		
	
		return false;
		}else {
			
			
			
			
			
			
			
			
			
			
			
		}
		
		}
		return true;
}



		
	
	
	



	
		
		
		
		
		
		
	

		
		
		
		
		
		




	





















































		
		
		
		
		
		
		
		
		
		
		
		
	


public void registerEvents() {
	
	PluginManager pm = getServer().getPluginManager();
	
	pm.registerEvents(new AlEntrar(this), this);
	
	
}









public void registerConfig(){
	File config = new File(this.getDataFolder(),"config.yml");
	  rutaConfig = config.getPath();
	if(!config.exists()){
		this.getConfig().options().copyDefaults(true);
		saveConfig();





}

}


























}
