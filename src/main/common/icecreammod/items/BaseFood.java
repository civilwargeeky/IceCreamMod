package icecreammod.items;

import icecreammod.IceCreamMod;
import icecreammod.lib.ModInfo;
import net.minecraft.item.ItemFood;

public class BaseFood extends ItemFood {
	
	public String name;

	public BaseFood(String unlocalizedName, int amountFood, float saturation) {
		super(amountFood, saturation, false);
		this.name = unlocalizedName; //Copied from base item
		this.setUnlocalizedName(this.name);
		this.setCreativeTab(IceCreamMod.IceCreamTab);
		this.setTextureName(ModInfo.MOD_ID + ":" + this.name);
	}


}
