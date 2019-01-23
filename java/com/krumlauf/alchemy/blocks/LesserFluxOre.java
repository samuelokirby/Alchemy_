package com.krumlauf.alchemy.blocks;

import java.util.Random;

import com.krumlauf.alchemy.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

//Hardness: http://minecraftmodcustomstuff.wikia.com/wiki/Hardness
//Resistance: https://minecraft.gamepedia.com/Explosion
//Harvest Level: http://minecraftmodcustomstuff.wikia.com/wiki/HarvestLevel
//Light Level: https://minecraft.gamepedia.com/Light

public class LesserFluxOre extends BlockBase{

	public LesserFluxOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3);
		setResistance(15);
		setHarvestLevel("pickaxe", 1); //setHarvestLevel(toolUsed, required level of tool)
	}
	
	//Delete the following if you just want the block mined to dropped the block in question
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.LESSER_FLUX; //for vanilla items ITEMS.*Choose item*
	}

	//generates a random num to drop
	@Override
	public int quantityDropped(Random rand) {
		//return # if want static drop
		int max = 5;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}
