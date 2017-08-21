package items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import FalloutEquestria.FalloutEquestria;

public class CustomIngot extends Item {

	public CustomIngot(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(FalloutEquestria.FalloutEquestriaTab);
		
	}
	
}
