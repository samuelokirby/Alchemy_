package com.krumlauf.alchemy.init;

import java.util.ArrayList;
import java.util.List;

import com.krumlauf.alchemy.blocks.BlockBase;
import com.krumlauf.alchemy.blocks.LavaTouchedStone;
import com.krumlauf.alchemy.blocks.LesserFluxOre;
import com.krumlauf.alchemy.blocks.SpellboundOre;
import com.krumlauf.alchemy.blocks.VoidCrystalOre;
import com.krumlauf.alchemy.blocks.WaterTouchedStone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block LESSER_FLUX_ORE = new LesserFluxOre("lesser_flux_ore", Material.ROCK);
	public static final Block SPELLBOUND_ORE = new SpellboundOre("spellbound_ore", Material.ROCK);
	public static final Block VOID_CRYSTAL_ORE = new VoidCrystalOre("void_crystal_ore", Material.ROCK);	
	public static final Block LAVA_TOUCHED_STONE = new LavaTouchedStone("lava_touched_stone", Material.ROCK);
	public static final Block WATER_TOUCHED_STONE = new WaterTouchedStone("water_touched_stone", Material.ROCK);
}
