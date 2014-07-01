package icecreammod.init;

import icecreammod.items.BaseFood;
import icecreammod.items.BaseItem;
import icecreammod.items.IceCream;
import icecreammod.items.IceCreamBase;
import cpw.mods.fml.common.registry.GameRegistry;


public class ICMItems {
	private static float average(float par1, float par2) {
		return (par1+par2)/2;
	}
	
	public static BaseItem spoon = new BaseItem("Spoon");
	public static BaseFood cone = new BaseFood("Cone", 1, 0.5F);
	
	public static IceCreamBase iceCreamBase = new IceCreamBase("Ice Cream", 0, 0);
	public static IceCream iceCreamCone = new IceCream("Ice Cream Cone", iceCreamBase.heals, average(iceCreamBase.saturation, cone.saturation));
	
	public static void init() {
		GameRegistry.registerItem(spoon, spoon.name);
		GameRegistry.registerItem(cone, cone.name);
		GameRegistry.registerItem(iceCreamBase, iceCreamBase.name);
		GameRegistry.registerItem(iceCreamCone, iceCreamCone.name);
		
	}
}
