package com.github.jdkorv11.skyrimmc.armory;

import com.github.jdkorv11.skyrimmc.help.Reference;
import com.github.jdkorv11.skyrimmc.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

public class ItemSkyrimMCAxe extends ItemAxe {
	public final ToolMaterial toolMaterial;

	public ItemSkyrimMCAxe(ToolMaterial material) {
		super(material);
		toolMaterial = material;
		setCreativeTab(ModTabs.tabSkyrimMC);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}
