package Handlers;

import init.BlockInit;
import init.ItemInit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {

	public static void registerCrafting() {
		
		GameRegistry.addShapelessRecipe(new ResourceLocation("in"), new ResourceLocation("out"), new ItemStack(ItemInit.steel_ingot), new Ingredient[]{Ingredient.fromItem(Items.COAL), Ingredient.fromItem(Items.IRON_INGOT)});
		
	}
	
	public static void registerSmelting() {
		
		GameRegistry.addSmelting(BlockInit.steel_ore, new ItemStack(ItemInit.steel_ingot), 10);
		
	}
	
}
