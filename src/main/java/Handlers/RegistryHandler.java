package Handlers;

import FalloutEquestria.gen.SteelOreGen;
import init.ArmourInit;
import init.BlockInit;
import init.ItemInit;
import init.ToolInit;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler {

	public static void Client() {
		
		
		
	}
	
	public static void Common() {
		
		ItemInit.init();
		ItemInit.register();
		
		ArmourInit.register();
		ToolInit.register();
		
		
		BlockInit.init();
		BlockInit.register();
		
		RecipeHandler.registerCrafting();
		RecipeHandler.registerSmelting();
		
		GameRegistry.registerWorldGenerator(new SteelOreGen(), 0);
		
	}
	
}
