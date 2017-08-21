package FalloutEquestria.tabs;

import init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FalloutEquestriaTab extends CreativeTabs {

	public FalloutEquestriaTab(String label) {
		
		super("FalloutEquestriaTab");
		
	}
	
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ItemInit.steel_ingot);	
		
	}
	
}
