package icecreammod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {
	
	private final Item item;
	private final int damage;

	public CreativeTab(String label, Item item, int damage) {
		super(label);
		this.item = item;
		this.damage = damage;
	}

	@Override
	public Item getTabIconItem() {
		return this.item;
	}
	
	public int func_151243_f()
  {
      return this.damage;
  }

}
