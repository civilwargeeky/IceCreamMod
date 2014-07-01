package icecreammod.items;

import icecreammod.IceCreamMod;
import icecreammod.lib.ModInfo;
import net.minecraft.item.Item;

public class BaseItem extends Item {

	public String name;
	
	public BaseItem(String unlocalizedName) {
		super();
		this.name = unlocalizedName; //Copy changes to BaseFood
		this.setUnlocalizedName(this.name);
		this.setCreativeTab(IceCreamMod.IceCreamTab);
		this.setTextureName(ModInfo.MOD_ID + ":" + this.name);
	}
}
