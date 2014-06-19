package icecreammod.items;

import icecreammod.lib.ModInfo;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class TypedIceCream extends BaseItem {
	
	private static String[] dispNames = {"Vanilla", "Chocolate", "Strawberry"};
	private static String[] subnames = {"vanilla", "chocolate", "strawberry" };
	private static final int numTypes = subnames.length;
	public String DisplayName;
	public IIcon[] texture;

	public TypedIceCream(String unlocalizedName, String displayName) {
		super(unlocalizedName);
		this.DisplayName = displayName;
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	
	@Override
	public void registerIcons(IIconRegister register) {
		texture = new IIcon[numTypes];
		for (int i=0; i < numTypes; i++) {
			texture[i] = register.registerIcon(ModInfo.MOD_ID + ":" + subnames[i] + this.name.substring(0, 1).toUpperCase() + this.name.substring(1));
		}
	}
	
	@Override
	public IIcon getIconFromDamage(int par1) {
		return texture[par1];
	}
	
		
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for(int i=0; i < numTypes; i++) {
			list.add(new ItemStack(item, 1, i));		
		}
	}
	
	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		return dispNames[stack.getItemDamage()] + " " + this.DisplayName;
	}
}
