package com.github.jdkorv11.skyrimmc.init;

import com.github.jdkorv11.skyrimmc.help.RegisterHelper;
import com.github.jdkorv11.skyrimmc.items.armor.ItemTitaniumArmor;
import com.github.jdkorv11.skyrimmc.items.tools.ItemSkyrimMCAxe;
import com.github.jdkorv11.skyrimmc.items.tools.ItemSkyrimMCPickaxe;
import com.github.jdkorv11.skyrimmc.items.tools.ItemSkyrimMCShovel;
import com.github.jdkorv11.skyrimmc.items.tools.ItemSkyrimMCSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmory {
	static Item.ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 512, 2.0F, 2.0F,
			14);
	static ArmorMaterial ATITANIUM = EnumHelper.addArmorMaterial("ATITANIUM", 20,
			new int[] { 3, 7, 5, 2 }, 14);

	public static Item titaniumSword = new ItemSkyrimMCSword(TITANIUM)
			.setUnlocalizedName("titaniumSword");
	public static Item titaniumPick = new ItemSkyrimMCPickaxe(TITANIUM)
			.setUnlocalizedName("titaniumPick");
	public static Item titaniumShovel = new ItemSkyrimMCShovel(TITANIUM)
			.setUnlocalizedName("titaniumShovel");
	public static Item titaniumAxe = new ItemSkyrimMCAxe(TITANIUM)
			.setUnlocalizedName("titaniumAxe");
	public static Item titaniumHelm = new ItemTitaniumArmor(ATITANIUM, 0, "titaniumHelm");
	public static Item titaniumPlate = new ItemTitaniumArmor(ATITANIUM, 1, "titaniumPlate");
	public static Item titaniumPants = new ItemTitaniumArmor(ATITANIUM, 2, "titaniumPants");
	public static Item titaniumBoots = new ItemTitaniumArmor(ATITANIUM, 3, "titaniumBoots");

	public static void init() {
		RegisterHelper.registerItem(titaniumSword);
		RegisterHelper.registerItem(titaniumPick);
		RegisterHelper.registerItem(titaniumShovel);
		RegisterHelper.registerItem(titaniumAxe);
		RegisterHelper.registerItem(titaniumHelm);
		RegisterHelper.registerItem(titaniumPlate);
		RegisterHelper.registerItem(titaniumPants);
		RegisterHelper.registerItem(titaniumBoots);
	}
}
