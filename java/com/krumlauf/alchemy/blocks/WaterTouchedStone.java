package com.krumlauf.alchemy.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

//Hardness: http://minecraftmodcustomstuff.wikia.com/wiki/Hardness
//Resistance: https://minecraft.gamepedia.com/Explosion
//Harvest Level: http://minecraftmodcustomstuff.wikia.com/wiki/HarvestLevel
//Light Level: https://minecraft.gamepedia.com/Light

public class WaterTouchedStone extends BlockBase{

	public WaterTouchedStone(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3);
		setResistance(15);
		setHarvestLevel("pickaxe", 1); //setHarvestLevel(toolUsed, required level of tool)
	}

}
