package icecreammod;

import icecreammod.init.ConfigurationHandler;
import icecreammod.init.ICMItems;
import icecreammod.lib.ModInfo;
import icecreammod.proxy.IProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = icecreammod.lib.ModInfo.DEFAULT_VERSION)
public class IceCreamMod
{
	
	public static CreativeTabs IceCreamTab;
  
	@Instance(ModInfo.MOD_ID)
	public static IceCreamMod	instance;
	
	//@SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.SERVER_PROXY)
	//public static IProxy proxy;
	
  @EventHandler public void preInit(FMLPreInitializationEvent event) {
  	
  	ConfigurationHandler.init(event.getSuggestedConfigurationFile());
  	
  	IceCreamTab = new CreativeTabs(ModInfo.MOD_ID) {
			@Override
			public Item getTabIconItem() {
				//TODO: Add in the Vanilla Ice Cream Item once it is done
				return Items.apple;
			}
  	};
  	
  	ICMItems.init();
  	
  }
  
  @EventHandler public void init(FMLInitializationEvent event) {
  }
  
  @EventHandler public void postInit(FMLPostInitializationEvent event) {
  }
}
