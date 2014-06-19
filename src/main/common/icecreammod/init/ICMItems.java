package icecreammod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import icecreammod.items.TypedIceCream;


public class ICMItems {
	
	public static TypedIceCream iceCream = new TypedIceCream("iceCream","Ice Cream");
	
	public static void init() {
		GameRegistry.registerItem(iceCream, iceCream.name);
		
	}
}
