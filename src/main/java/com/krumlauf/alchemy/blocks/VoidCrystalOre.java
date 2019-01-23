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

public class VoidCrystalOre extends BlockBase{

	public VoidCrystalOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3);
		setResistance(15);
		setHarvestLevel("pickaxe", 3); //setHarvestLevel(toolUsed, required level of tool)

	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return ModItems.VOID_CRYSTAL; //for vanilla items ITEMS.*Choose item*
	}

}
