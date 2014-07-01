package icecreammod.items;

import icecreammod.lib.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IceCreamBase extends IceCream {

	public IceCreamBase(String unlocalizedName) {
		super(unlocalizedName, Reference.typeNames, 0, 0);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) { //I want icon registry, but not food.
		return stack;
		
	}

}
