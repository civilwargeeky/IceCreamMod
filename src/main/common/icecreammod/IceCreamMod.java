package icecreammod;

import icecreammod.handlers.ConfigurationHandler;
import icecreammod.init.CreativeTab;
import icecreammod.init.ModItems;
import icecreammod.init.Recipes;
import icecreammod.lib.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.DEFAULT_VERSION, guiFactory = ModInfo.GUI_FACTORY)
public class IceCreamMod
{
	
	public static CreativeTabs IceCreamTab;
  
	@Instance(ModInfo.MOD_ID)
	public static IceCreamMod	instance;
	
	//@SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
	//public static IProxy proxy;
	
  @EventHandler 
  public void preInit(FMLPreInitializationEvent event) {
  	
  	ConfigurationHandler.init(event.getSuggestedConfigurationFile());
  	ConfigurationHandler.loadConfig();
  	
  	IceCreamTab = new CreativeTab(ModInfo.MOD_ID, ModItems.iceCreamBowl, 1);
  	
  	ModItems.init();
  	
  }
  
  @EventHandler 
  public void init(FMLInitializationEvent event) {
  	FMLCommonHandler.instance().bus().register(instance);
  	
  	Recipes.init();
  }
  
  @EventHandler 
  public void postInit(FMLPostInitializationEvent event) {
  }
}
