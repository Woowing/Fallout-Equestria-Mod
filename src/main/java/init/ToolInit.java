package init;

import init.tools.CustomAxe;
import init.tools.CustomHoe;
import init.tools.CustomPickaxe;
import init.tools.CustomShovel;
import init.tools.CustomSword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ToolInit {

	public static final ToolMaterial steel = EnumHelper.addToolMaterial("steel", 2, 2000, 6.0F, 5.0F, 50);
	
	public static Item steel_pickaxe;
	public static Item steel_axe;
	public static Item steel_sword;
	public static Item steel_hoe;
	public static Item steel_shovel;
	
	public static void init() {
		
		steel_pickaxe = new CustomPickaxe("steel_pickaxe", steel);
		steel_axe = new CustomAxe("steel_axe", steel);
		steel_sword = new CustomSword("steel_sword", steel);
		steel_hoe = new CustomHoe("steel_hoe", steel);
		steel_shovel = new CustomShovel("steel_shovel", steel);
		
	}
	
	public static void register() {
		
		registerItem(steel_pickaxe);
		registerItem(steel_axe);
		registerItem(steel_sword);
		registerItem(steel_hoe);
		registerItem(steel_shovel);
		
	}
	
	public static void registerItem(Item item) {
		
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
	
}
