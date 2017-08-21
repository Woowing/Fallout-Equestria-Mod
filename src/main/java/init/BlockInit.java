package init;

import FalloutEquestria.FalloutEquestria;
import init.blocks.CustomOre;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockInit {

	public static Block steel_ore;
	
	public static void init() {
		
		steel_ore = new CustomOre("steel_ore", 4.0F, 10.0F, 1);
		
	}
	
	public static void register() {
		
		registerBlock(steel_ore);
	}
	
	public static void registerBlock(Block block) {
		
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(FalloutEquestria.FalloutEquestriaTab);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}

}
