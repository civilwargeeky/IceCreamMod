package icecreammod.items;

import icecreammod.IceCreamMod;
import icecreammod.lib.ModInfo;
import icecreammod.lib.Reference;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BaseItem extends Item {

	public String name;
	public String displayName;
	
	public BaseItem(String unlocalizedName) {
		super();
		this.displayName = unlocalizedName;
		this.name = Reference.sanitize(unlocalizedName); //Copy changes to BaseFood
		this.setUnlocalizedName(this.name);
		this.setCreativeTab(IceCreamMod.IceCreamTab);
		this.setTextureName(ModInfo.MOD_ID + ":" + this.name);
	}
	
	public String getItemStackDisplayName(ItemStack stack) { //This is just because I am lazy
		return this.displayName;
	}
	
}
