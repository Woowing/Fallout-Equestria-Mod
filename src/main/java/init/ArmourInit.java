package init;

import FalloutEquestria.Reference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import init.armour.CustomArmour;

public class ArmourInit {

	public static final ArmorMaterial steel = EnumHelper.addArmorMaterial("steel", Reference.MODID + ":steel", 20, new int[]{2, 3, 5, 1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
	
	public static Item steel_helmet;
	public static Item steel_chestplate;
	public static Item steel_leggings;
	public static Item steel_boots;
	
	public static void init() {
		
		steel_helmet = new CustomArmour("steel_helmet", steel, 1, EntityEquipmentSlot.HEAD);
		steel_chestplate = new CustomArmour("steel_chestplate", steel, 1, EntityEquipmentSlot.CHEST);
		steel_leggings = new CustomArmour("steel_leggings", steel, 1, EntityEquipmentSlot.LEGS);
		steel_boots = new CustomArmour("steel_boots", steel, 1, EntityEquipmentSlot.FEET);
		
	}
	
	public static void register() {
		
		registerItem(steel_helmet);
		registerItem(steel_chestplate);
		registerItem(steel_leggings);
		registerItem(steel_helmet);
		
	}
	
	public static void registerItem(Item item) {
		
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
	
}
