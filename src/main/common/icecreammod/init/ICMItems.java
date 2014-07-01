package icecreammod.init;

import icecreammod.items.BaseFood;
import icecreammod.items.BaseItem;
import icecreammod.items.IceCream;
import icecreammod.items.IceCreamBase;
import cpw.mods.fml.common.registry.GameRegistry;


public class ICMItems {
	private static float averageSat(BaseFood par1, BaseFood par2) { //This is a weighted average for calculating saturation
		return (par1.saturation+par2.saturation)*3/4;
	}
	
	public static BaseItem spoon = new BaseItem("Spoon");
	public static BaseFood cone = new BaseFood("Cone", 1, 0.5F);
	public static BaseFood chocolateCracker = new BaseFood("Chocolate Cracker", 1, 0.1F);	
	
	public static IceCreamBase iceCreamBase = new IceCreamBase("Ice Cream", 3, 0.8F);
	public static IceCream iceCreamCone = new IceCream("Ice Cream Cone", iceCreamBase.heals+cone.heals, averageSat(iceCreamBase, cone));
	public static IceCream iceCreamSandwich = new IceCream("Ice Cream Sandwich", iceCreamBase.heals + 2*chocolateCracker.heals, averageSat(iceCreamBase, chocolateCracker));
	public static IceCream iceCreamBowl = new IceCream("Ice Cream Bowl", iceCreamBase.heals, iceCreamBase.saturation);
	
	public static BaseFood debugItem = (BaseFood) new BaseFood("Debug Item", -10, 0).setAlwaysEdible();
	
	public static void init() {
		GameRegistry.registerItem(spoon, spoon.name);
		GameRegistry.registerItem(cone, cone.name);
		GameRegistry.registerItem(chocolateCracker, chocolateCracker.name);
		GameRegistry.registerItem(iceCreamBase, iceCreamBase.name);
		GameRegistry.registerItem(iceCreamCone, iceCreamCone.name);
		GameRegistry.registerItem(iceCreamSandwich, iceCreamSandwich.name);
		GameRegistry.registerItem(iceCreamBowl, iceCreamBowl.name);
		
		GameRegistry.registerItem(debugItem, debugItem.name);
		
	}
}
