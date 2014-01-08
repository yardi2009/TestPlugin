package com.github.yardi2009.TestPlugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.inventory.*;
public final class TestPlugin extends JavaPlugin
{
	public void OnEnable()
	{
		getLogger().info("TestPlugin has been enabled");
	}
	public void OnDisable()
	{
		getLogger().info("TestPlugin has been disabled");
	}
    public boolean onCommand(CommandSender sender,Command cmd,String label,String[] args)
    {
    	if(cmd.getName().equalsIgnoreCase("diamonds"))
    	{
    		Player player=(Player)sender;
    		ItemStack diamonds=new ItemStack(Material.DIAMOND,64);
    		if(player.isOp())
    		{
    			player.getInventory().addItem(diamonds);
    		}
    		else
    			sender.sendMessage("You have to be an operator to use that command");
    		return true;
    	}
    	return false; 
    }
}
