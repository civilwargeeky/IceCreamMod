package icecreammod.items;

import icecreammod.lib.ModInfo;
import icecreammod.lib.Reference;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class IceCream extends BaseFood {
	
	public String displayName; //This is for texture assignment
	public String[] subnames;
	public IIcon[] texture;

	public IceCream(String displayName, String[] subnames, int amountFood, float saturation) {
		super(Reference.sanitize(displayName), amountFood, saturation); //Just sanitize the display name for unlocalized :D
		this.subnames = subnames;
		this.displayName = displayName;
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
		this.texture = new IIcon[subnames.length];
	}
	
  @Override
	public void registerIcons(IIconRegister register) {
		for (int i=0; i < this.subnames.length; i++) {
			this.texture[i] = register.registerIcon(ModInfo.MOD_ID + ":" + Reference.sanitize(this.subnames[i]) + this.name.substring(0, 1).toUpperCase() + this.name.substring(1));
		}
	}
	
  @Override
	public IIcon getIconFromDamage(int par1) {
		return this.texture[par1];
	}
	
		
	@Override
	public void getSubItems(Item item, CreativeTabs tab, List list) {
		for(int i=0; i < this.subnames.length; i++) {
			list.add(new ItemStack(item, 1, i));		
		}
	}
	
	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		return this.subnames[stack.getItemDamage()] + " " + this.displayName; //e.g. "Chocolate" + " " + "Ice Cream"
	}
}

