package com.github.jdkorv11.skyrimmc.items.armor;

import com.github.jdkorv11.skyrimmc.help.Reference;
import com.github.jdkorv11.skyrimmc.init.ModArmory;
import com.github.jdkorv11.skyrimmc.tabs.ModTabs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemRustaniumArmor extends ItemArmor {

	public ItemRustaniumArmor(ArmorMaterial material, int armorType, String name) {
		super(material, 0, armorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		setCreativeTab(ModTabs.tabSkyrimMC);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if (stack.getItem() == ModArmory.rustaniumHelm
				|| stack.getItem() == ModArmory.rustaniumPlate
				|| stack.getItem() == ModArmory.rustaniumBoots) {
			return Reference.MODID + ":models/armor/rustanium_layer1.png";
		} else if (stack.getItem() == ModArmory.rustaniumPants) {
			return Reference.MODID + ":models/armor/rustanium_layer2.png";
		} else {
			return null;
		}
	}

	boolean hi = false;

	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack) {
		if (player.getCurrentArmor(0) != null
				&& player.getCurrentArmor(0).getItem().equals(ModArmory.rustaniumBoots)
				&& player.getCurrentArmor(1) != null
				&& player.getCurrentArmor(1).getItem().equals(ModArmory.rustaniumPants)
				&& player.getCurrentArmor(2) != null
				&& player.getCurrentArmor(2).getItem().equals(ModArmory.rustaniumPlate)
				&& player.getCurrentArmor(3) != null
				&& player.getCurrentArmor(3).getItem().equals(ModArmory.rustaniumHelm)) {
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 20 * 1));
			if (hi) {
				System.out.println("boost added");
				hi = false;
			}
		} else {
			if (!hi) {
				System.out.println("no boost");
				hi = true;
			}
		}
	}
}
