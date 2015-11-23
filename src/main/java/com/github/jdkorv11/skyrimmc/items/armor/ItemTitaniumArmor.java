package com.github.jdkorv11.skyrimmc.items.armor;

import com.github.jdkorv11.skyrimmc.help.Reference;
import com.github.jdkorv11.skyrimmc.init.ModArmory;
import com.github.jdkorv11.skyrimmc.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemTitaniumArmor extends ItemArmor {

	public ItemTitaniumArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabSkyrimMC);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == ModArmory.titaniumHelm || stack.getItem() == ModArmory.titaniumPlate
				|| stack.getItem() == ModArmory.titaniumBoots) {
			return Reference.MODID + ":models/armor/titanium_layer1.png";
		} else if (stack.getItem() == ModArmory.titaniumPants) {
			return Reference.MODID + ":models/armor/titanium_layer2.png";
		} else {
			return null;
		}
	}

}
