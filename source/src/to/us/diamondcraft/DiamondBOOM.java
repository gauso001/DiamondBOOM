package to.us.diamondcraft;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiamondBOOM extends JavaPlugin {

	public void onEnable(){
		getLogger().info("DiamondBOOM V1.0 by gauso001 has started! BOOM!");
	}
 
	public void onDisable(){
		getLogger().info("DiamondBOOM V1.0 by gauso001 has stopped! ssssssSSSSSS...");
	}
	

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
	    if(cmd.getName().equalsIgnoreCase("boom")){
	    	float explosionPower = 9F; //This is the explosion power - TNT explosions are 4F by default
	        Player target = sender.getServer().getPlayer(args[0]);
	        target.getWorld().createExplosion(target.getLocation(), explosionPower);
	        target.setHealth(0); 
	    }
	    return false;
	}}
