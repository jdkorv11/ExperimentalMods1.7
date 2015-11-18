package com.github.jdkorv11.skyrimmc.init;

import com.github.jdkorv11.skyrimmc.blocks.BlockTitaniumOre;
import com.github.jdkorv11.skyrimmc.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks
{
	public static Block titaniumOre = new BlockTitaniumOre();

	public static void init()
	{
		RegisterHelper.registerBlock(titaniumOre);
	}
}
