package icecreammod.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class TypedIceCream extends BaseItem {
	
	private static final int numTypes = 3;
	private static String[] subnames = {"Vanilla", "Chocolate", "Strawberry" };
	public String DisplayName;

	public TypedIceCream(String unlocalizedName, String displayName) {
		super(unlocalizedName);
		this.DisplayName = displayName;
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
		
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for(int i=0; i < numTypes; i++) {
			list.add(new ItemStack(item, 1, i));		
		}
			
	}
	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		return subnames[stack.getItemDamage()] + " " + this.DisplayName;
	}
	
}
