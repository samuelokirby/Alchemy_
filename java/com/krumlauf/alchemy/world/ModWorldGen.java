package com.krumlauf.alchemy.world;

import java.util.Random;

import com.krumlauf.alchemy.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) {
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(ModBlocks.LESSER_FLUX_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(6) + 3, 15); //last 2 args: cluster of ore (max-min), and how common
		generateOre(ModBlocks.SPELLBOUND_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 55, random.nextInt(6) + 3, 9); //last 2 args: cluster of ore (max-min), and how common
		generateOre(ModBlocks.VOID_CRYSTAL_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 35, random.nextInt(2) + 1, 15); //last 2 args: cluster of ore (max-min), and how common

		// generateOre(ModBlocks.ORE_NAME.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 64, random.nextInt(6) + 3, 14); //HOW YOU ADD MORE ORE and CHANGE LAST 2 ARGS
		//...mininmum y, maximum y (keep below 64), clusters of ore, how common (1 = rarest, higher = common))
	}
	
	
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
		
		for (int i = 0; i < chances; i ++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world,  random,  pos);
		}
	}
}
