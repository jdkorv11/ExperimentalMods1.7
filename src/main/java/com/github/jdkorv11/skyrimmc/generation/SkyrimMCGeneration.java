package com.github.jdkorv11.skyrimmc.generation;

import java.util.Random;

import com.github.jdkorv11.skyrimmc.init.ModBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class SkyrimMCGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
			break;
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			break;
		default:
			// should never be here
		}

	}

	private void generateNether(World world, Random random, int x, int z) {

	}

	private void generateSurface(World world, Random random, int x, int z) {
		addOreSpawn(ModBlocks.rustaniumOre, Blocks.air, world, random, x, z, 10 + random.nextInt(3), 30, 0, 200);
	}

	private void generateEnd(World world, Random random, int x, int z) {

	}

	/**
	 * Generates a given block in the specified world
	 * 
	 * @param block The type block to spawn
	 * @param spawnBlock The type of block to be replaced
	 * @param world The world to spawn the block in
	 * @param random The Random used for RNG
	 * @param blockXPos The chunk X position
	 * @param blockZPos The chunk Z position
	 * @param maxVeinSize The maximum vein size
	 * @param chanceToSpawn How many times the spawn is attempted
	 * @param minY The minimum height the block will spawn at
	 * @param maxY The maximum height the block will spawn at
	 */
	private void addOreSpawn(Block block, Block spawnBlock, World world, Random random, int blockXPos, int blockZPos,
			int maxVeinSize, int chanceToSpawn, int minY, int maxY) {

		for (int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(16);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(16);
			new WorldGenMinable(block, maxVeinSize, spawnBlock).generate(world, random, posX, posY, posZ);
			
		}
	}
}
