package com.github.jdkorv11.skyrimmc.items.tools;

import com.github.jdkorv11.skyrimmc.help.Reference;
import com.github.jdkorv11.skyrimmc.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;

public class ItemSkyrimMCHoe extends ItemHoe {
	public final ToolMaterial toolMaterial;

	public ItemSkyrimMCHoe(ToolMaterial material) {
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