package init;

import FalloutEquestria.Reference;
import items.CustomIngot;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemInit {

	public static Item steel_ingot;
	
	public static void init() {
		
		steel_ingot = new CustomIngot("steel_ingot");
		
	}
	
	public static void register() {
		
		registerItem(steel_ingot);
		
	}
	
	public static void registerItem(Item item) {
		
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
	
}
