package icecreammod.items;

import java.util.ArrayList;
import java.util.Arrays;

import icecreammod.IceCreamMod;
import icecreammod.lib.ModInfo;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BaseItem extends Item {

	public String name;
	
	public BaseItem(String unlocalizedName) {
		super();
		this.name = unlocalizedName;
		this.setUnlocalizedName(this.name);
		this.setCreativeTab(IceCreamMod.IceCreamTab);
		this.setTextureName(ModInfo.MOD_ID + ":" + this.name);
	}
}
