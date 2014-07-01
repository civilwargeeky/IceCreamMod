package icecreammod.items;

import icecreammod.IceCreamMod;
import icecreammod.lib.ModInfo;
import icecreammod.lib.Reference;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class BaseFood extends ItemFood {
	
	public String name;
	public String displayName;
	public final int heals;
	public final float saturation;

	public BaseFood(String unlocalizedName, int amountFood, float saturation) {
		super(amountFood, saturation, false);
		this.heals = amountFood;
		this.saturation = saturation;
		this.displayName = unlocalizedName;
		this.name = Reference.sanitize(unlocalizedName); //Copied from base item
		this.setUnlocalizedName(this.name);
		this.setCreativeTab(IceCreamMod.IceCreamTab);
		this.setTextureName(ModInfo.MOD_ID + ":" + this.name);
	}

	public String getItemStackDisplayName(ItemStack stack) { //This is just because I'm lazy
		return this.displayName;
	}

}
