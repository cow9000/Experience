package me.DerekV.experience;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;





public class Experience extends JavaPlugin{
	//Start
	public static Experience plugin;
	public final Logger logger = Logger.getLogger("Minecraft");
	public final onJoin oj = new onJoin();
	public final onKill xp = new onKill(this);
	public static boolean value = false;
	//Temp
	
	
	public final BlockData c = new BlockData();
	public final checkWeaponLevel cwl = new checkWeaponLevel();
	public final medicClass mc = new medicClass();
	public final rangerClass rc = new rangerClass();
	public final onClickCommand occ = new onClickCommand(this);
	public final foodClass fc = new foodClass();
	public final critListner cl = new critListner();
	//public final Think check = new Think(this);
	//public final Think check = new Think();
	
	
	static File ExpFile;
	static FileConfiguration Exp;
	
	@Override
	public void onDisable(){
		this.logger.info("Experience version V.1 has been disabled");
		saveStats();
		
		
	}
	@Override
	public void onEnable(){
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version" + pdfFile.getVersion() + " Has been Enabled!");
		getConfig().options().copyDefaults(true);
		saveConfig();
		PluginManager pm = getServer().getPluginManager();
		//pm.registerEvents(this.thing, this);
		pm.registerEvents(this.xp, this);
		pm.registerEvents(this.oj, this);
		pm.registerEvents(this.c, this);
		pm.registerEvents(this.cwl, this);
		pm.registerEvents(this.mc, this);
		pm.registerEvents(this.rc, this);
		pm.registerEvents(this.occ, this);
		pm.registerEvents(this.fc, this);
		pm.registerEvents(this.cl, this);
		ExpFile = new File(getDataFolder(), "Exp.yml");
		Exp = YamlConfiguration.loadConfiguration(ExpFile);
		saveStats();
		
		if(getConfig().getList("Towns") == null){
			getConfig().set("Towns", "");
			saveConfig();
		}
		
		
	}
	
	
	public void saveStats(){
		try {
		Exp.save(ExpFile);
		} catch (Exception e) {
			
		}
		}
	
	public static boolean checkLevel(Player player){
		ItemStack item = player.getInventory().getItemInHand();
	if(! item.equals(null) || ! item.getType().equals(Material.AIR)){
		List<String> weaponlore = item.getItemMeta().getLore();
		value = false;
            if (weaponlore != null) {
                for(String line : weaponlore) {
                    if (line.startsWith("Level:")) {
                        String damageString = line.substring("Level:".length()).trim(); // remove "Damage:" from the begining of the string and trim surrounding spaces
                        int Level = Integer.valueOf(damageString);
                        if(Level <= Exp.getInt(player.getName() + ".Level")){
                        	value = true;
                        }else if(Level > Exp.getInt(player.getName() + ".Level") ) value = false;
                    }
                }
            }
		}
		return value;
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player p = (Player) sender;
		if(commandLabel.equalsIgnoreCase("rc")){
			if(args.length == 0){
				sender.sendMessage(ChatColor.RED + "/rc level, /rc exp, /rc statpoints, /rc waypoint");

			}
			else if(args[0].equalsIgnoreCase("level")){
				sender.sendMessage(ChatColor.GOLD + "Level - " + Exp.getInt(p.getName() + ".Level"));
			}else if(args[0].equalsIgnoreCase("exp") || args[0].equalsIgnoreCase("experience")){
				sender.sendMessage(ChatColor.GOLD + "Experience - " + Exp.getInt(p.getName() + ".Exp"));
			}else if(args[0].equalsIgnoreCase("statpoints")){
				sender.sendMessage(ChatColor.GOLD + "Stat points - " + Exp.getInt(p.getName() + ".statsPoints"));
				
			}else if(args[0].equalsIgnoreCase("set") && p.hasPermission("rc.give.lore")){
				if(args.length >= 2){
				if(args[1].equalsIgnoreCase("lore")){
					if(p.getItemInHand() != null || p.getInventory().getItemInHand().equals(Material.AIR)){
						ItemStack hand = p.getInventory().getItemInHand();
						List<String> loreList = new ArrayList<String>();
						ItemMeta im = hand.getItemMeta();
						loreList.add(args[2]);//This is the second line of lore
						im.setLore(loreList);
						hand.setItemMeta(im);
						
					}
				}
			}else{
				p.sendMessage(ChatColor.RED + "Error - There was an error doing this command.");
			}
			}
			else if(args[0].equalsIgnoreCase("class")){
				if(p.hasPermission("rc.class")){
				//Checks of it is just /rc class
				if(args.length == 1){
					p.sendMessage(ChatColor.RED + "/rc class [classname]");
					p.sendMessage(ChatColor.GREEN + "Classes - Medic, Barbarian, Rogue, Ranger, Wizard");
				}
				//If it is /rc class classname, it checks if they already have a class or not
				else if(Exp.get(p.getName() + ".class").equals("none")){
				//If they do not have a class, they can choose Classes
					p.sendMessage(Exp.getString(p.getName() + ".class"));
					if(args[1].equalsIgnoreCase("medic")){
						p.sendMessage(ChatColor.GREEN + "You have chosen medic!");
						Exp.set(p.getName() + ".class", "medic");
						saveStats();
					}
					
					else if(args[1].equalsIgnoreCase("barbarian")){
						p.sendMessage(ChatColor.GREEN + "You have chosen barbarian!");
						Exp.set(p.getName() + ".class", "barbarian");
						saveStats();
					}
					
					
					else if(args[1].equalsIgnoreCase("rogue")){
						p.sendMessage(ChatColor.GREEN + "You have chosen rogue!");
						Exp.set(p.getName() + ".class", "rogue");
						saveStats();
					}
					
					else if(args[1].equalsIgnoreCase("ranger")){
						p.sendMessage(ChatColor.GREEN + "You have chosen ranger!");
						Exp.set(p.getName() + ".class", "ranger");
						saveStats();
					}
					
					else if(args[1].equalsIgnoreCase("wizard")){
						p.sendMessage(ChatColor.GREEN + "You have chosen wizard!");
						Exp.set(p.getName() + ".class", "wizard"); 
						saveStats();
					}
				
					else{
						p.sendMessage(ChatColor.RED + "/rc class [classname]");
						p.sendMessage(ChatColor.GREEN + "Classes - Medic, Barbarian, Rogue, Ranger, Wizard");
					}
				
				}else{
					p.sendMessage(ChatColor.DARK_PURPLE + "You are already the class - " + Exp.getString(p.getName() + ".class"));
					p.sendMessage(ChatColor.GOLD + "Want to get a class change? - Donate at roluikcraft.us/shop");
				}
				
				}else{
					p.sendMessage("You do not have the required Permissions");
				}
			}else if(args[0].equalsIgnoreCase("waypoint")){
				if(p.hasPermission("rc.waypoint")){
				 Inventory inv = p.getPlayer().getServer().createInventory(null, 36, "Waypoints");
				 // 18 is number of slots and must be divisible by 9
				 ItemStack istack = new ItemStack(Material.DIAMOND_BLOCK);
				 ItemMeta imeta = istack.getItemMeta();
				 imeta.setDisplayName("Doon-Dor");
				 List test = new ArrayList();
				 test.add("Teleport to Doon-Dor");
				 test.add("Click to warp.");
				 imeta.setLore(test);
				 istack.setItemMeta(imeta);
				 inv.addItem(istack);
				
				 if(p.hasPermission("rc.waypoint.test")){
				 ItemStack istack2 = new ItemStack(Material.STONE);
				 ItemMeta imeta2 = istack.getItemMeta();
				 imeta2.setDisplayName("test1");
				 List test2 = new ArrayList();
				 test2.add("Teleport to Building of the ravine");
				 test2.add("Click to warp.");
				 imeta2.setLore(test2);
				 istack2.setItemMeta(imeta2);
				 inv.addItem(istack2);
				 p.getPlayer().openInventory(inv);
				 }else{
					 ItemStack istack2 = new ItemStack(Material.STONE);
					 ItemMeta imeta2 = istack.getItemMeta();
					 imeta2.setDisplayName("?");
					 List test2 = new ArrayList();
					 test2.add("?????");
					 test2.add("?");
					 imeta2.setLore(test2);
					 istack2.setItemMeta(imeta2);
					 inv.addItem(istack2);
					 p.getPlayer().openInventory(inv);
				 }
				 
				 if(p.hasPermission("rc.waypoint.farm")){
				 ItemStack istack3 = new ItemStack(Material.WHEAT);
				 ItemMeta imeta3 = istack.getItemMeta();
				 imeta3.setDisplayName("farm");
				 List test3 = new ArrayList();
				 test3.add("Teleport to the farm");
				 test3.add("Click to warp.");
				 imeta3.setLore(test3);
				 istack3.setItemMeta(imeta3);
				 inv.addItem(istack3);
				 p.getPlayer().openInventory(inv);
				 }else{
					 ItemStack istack2 = new ItemStack(Material.STONE);
					 ItemMeta imeta2 = istack.getItemMeta();
					 imeta2.setDisplayName("?");
					 List test2 = new ArrayList();
					 test2.add("?????");
					 test2.add("?????");
					 imeta2.setLore(test2);
					 istack2.setItemMeta(imeta2);
					 inv.addItem(istack2);
					 p.getPlayer().openInventory(inv);
				 }
				}else{
					p.sendMessage("You do not have the required Permissions");
				}
			}
			//Sets a location
			else if(args[0].equalsIgnoreCase("setloc") && p.hasPermission("rc.setloc")){
				if(args[1] != null){
					//x
					this.getConfig().set("Location." + args[1] + "x", p.getLocation().getX());
					//y
					this.getConfig().set("Location." + args[1] + "y", p.getLocation().getY());
					//z
					this.getConfig().set("Location." + args[1] + "z", p.getLocation().getZ());
					//pitch
					this.getConfig().set("Location." + args[1] + "p" , p.getLocation().getPitch());
					//yaw
					this.getConfig().set("Location." + args[1] + "yaw" , p.getLocation().getPitch());
					
					//save the config
					List<String> list = this.getConfig().getStringList("Towns");
					list.add(args[1]);
					this.getConfig().set("Towns", list);
					
					saveConfig();
					p.sendMessage(ChatColor.GREEN + "You set a location!");
				}
			}
		}
					
		
		return false;
	}
	
}