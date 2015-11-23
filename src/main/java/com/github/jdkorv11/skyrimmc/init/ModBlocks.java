package com.github.jdkorv11.skyrimmc.init;

import com.github.jdkorv11.skyrimmc.blocks.BlockRustaniumOre;
import com.github.jdkorv11.skyrimmc.help.RegisterHelper;

import net.minecraft.block.Block;

public class ModBlocks
{
	public static Block rustaniumOre = new BlockRustaniumOre();

	public static void init()
	{
		RegisterHelper.registerBlock(rustaniumOre);
	}
}
