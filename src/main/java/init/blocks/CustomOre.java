package init.blocks;

import net.minecraft.block.Block;
import FalloutEquestria.FalloutEquestria;

public class CustomOre extends CustomBlock {

	public CustomOre(String name, float hardness, float resistance, int harvestLevel) {
		
		super(name, hardness, resistance);
		setHarvestLevel("pickaxe", harvestLevel);
	}
	
}
