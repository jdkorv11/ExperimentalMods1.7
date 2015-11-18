package com.github.jdkorv11.skyrimmc.tabs;

import com.github.jdkorv11.skyrimmc.init.ModItems;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SkyrimMCTab extends CreativeTabs {

	String name;

	public SkyrimMCTab(int par1, String par2Str) {
		super(par1, par2Str);
		this.name = par2Str;
	}

	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() {
		if (this.name == "tabSkyrimMC") {
			return ModItems.ebonyIngot;
		}
		return null;
	}
}
