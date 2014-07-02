package icecreammod.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {

	public static void init() {
		GameRegistry.addRecipe(new ItemStack(Items.diamond, 2), new Object[] { "DDD", "DDD", "DDD", 'D', Blocks.dirt});
	}

}
