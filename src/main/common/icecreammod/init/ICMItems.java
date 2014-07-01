package icecreammod.init;

import icecreammod.items.IceCreamBase;
import icecreammod.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


public class ICMItems {
	
	public static IceCreamBase iceCreamBase = new IceCreamBase("Ice Cream");
	
	public static void init() {
		GameRegistry.registerItem(iceCreamBase, iceCreamBase.name);
		
	}
}
