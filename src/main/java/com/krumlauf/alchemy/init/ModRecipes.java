package com.krumlauf.alchemy.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.SPELLBOUND_ORE, new ItemStack(ModItems.SPELLBOUND_INGOT, 1), 1.5f);
		
	}
}
