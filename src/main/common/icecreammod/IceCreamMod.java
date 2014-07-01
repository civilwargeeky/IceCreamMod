package icecreammod;

import icecreammod.init.ICMItems;
import icecreammod.lib.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = icecreammod.lib.ModInfo.DEFAULT_VERSION)
public class IceCreamMod
{
	
	public static CreativeTabs IceCreamTab;
  
	@Instance(ModInfo.MOD_ID)
	public static IceCreamMod	instance;
	
	
  @EventHandler public void preInit(FMLPreInitializationEvent event) {
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
}
