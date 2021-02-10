import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.lobbymc.LobbyMCPlus;

public class AlEntrar implements Listener{

	
private LobbyMCPlus plugin; 
	
	public AlEntrar(LobbyMCPlus plugin) {
		{
			
			
			
			
		}
	this.plugin = plugin;
	

	}
	

@EventHandler
public void alEntrar(PlayerJoinEvent event) {
	
	
	Player jugador = event.getPlayer();
	
	FileConfiguration config = plugin.getConfig();
	
	if(config.contains("Spawn.x")) {
		
		World world = plugin.getServer().getWorld(config.getString("Spawn.world"));
		double x = Double.valueOf(config.getString("Spawn.X"));
		double y = Double.valueOf(config.getString("Spawn.Y"));
		double z = Double.valueOf(config.getString("Spawn.Z"));
		float yaw = Float.valueOf(config.getString("Spawn.YAW"));
		float pitch = Float.valueOf(config.getString("Spawn.PITCH"));
		Location l = new Location(world, x, y , z, yaw, pitch);
		jugador.teleport(l);
	
}



String path = ("Config.welcome-message");
if(config.getString(path).equals("true")) {
	
	jugador.sendMessage(ChatColor.translateAlternateColorCodes('&',  config.getString("Config.welcome-message-text")));
	
	
	
	
	
	
	
}

return;




}

}
