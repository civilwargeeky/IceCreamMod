package icecreammod;

import icecreammod.items.BaseItem;
import icecreammod.lib.ModInfo;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = icecreammod.lib.ModInfo.MOD_ID, name = icecreammod.lib.ModInfo.MOD_NAME, version = icecreammod.lib.ModInfo.DEFAULT_VERSION)
public class IceCreamMod
{
	public static CreativeTabs IceCreamTab;
  public static BaseItem test;
  
  @EventHandler public void preInit(FMLPreInitializationEvent event) {
  	IceCreamTab = new CreativeTabs(ModInfo.MOD_ID) {
			@Override
			public Item getTabIconItem() {
				//TODO: Add in the Vanilla Ice Cream Item once it is done
				return Items.apple;
			}
  	};
 	
  	
  	test = new BaseItem("test");
  	GameRegistry.registerItem(test, test.name );
  }
}
