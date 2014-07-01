package icecreammod.items;

import icecreammod.lib.Reference;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IceCreamBase extends IceCream {

	public IceCreamBase(String name, int amountHealed, float saturation) {
		super(name, Reference.typeNames, amountHealed, saturation);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) { //I want icon registry, but not food.
		return stack;
	}

}
