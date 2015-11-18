package com.github.jdkorv11.skyrimmc.blocks;

import com.github.jdkorv11.skyrimmc.help.Reference;
import com.github.jdkorv11.skyrimmc.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTitaniumOre extends Block {

	public BlockTitaniumOre() {
		super(Material.iron);
		setBlockName("titaniumOre");
		setBlockTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabSkyrimMC);
		setStepSound(soundTypeMetal);
		setHardness(2.5F);
		setResistance(10.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(10.0F);
	}

}
