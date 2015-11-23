package com.github.jdkorv11.skyrimmc.items.tools;

import com.github.jdkorv11.skyrimmc.help.Reference;
import com.github.jdkorv11.skyrimmc.tabs.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemSkyrimMCSword extends ItemSword {

	public final ToolMaterial toolMaterial;

	public ItemSkyrimMCSword(ToolMaterial material) {
		super(material);
		toolMaterial = material;
		setCreativeTab(ModTabs.tabSkyrimMC);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister
				.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player) {
		stack.damageItem(1, player);
		enemy.addPotionEffect(new PotionEffect(Potion.poison.id, 20 * 5, 0));
		return true;
	}
	

}
