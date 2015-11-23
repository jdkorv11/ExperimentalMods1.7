package com.github.jdkorv11.skyrimmc.init;

import com.github.jdkorv11.skyrimmc.help.RegisterHelper;
import com.github.jdkorv11.skyrimmc.items.armor.ItemRustaniumArmor;
import com.github.jdkorv11.skyrimmc.items.tools.ItemSkyrimMCAxe;
import com.github.jdkorv11.skyrimmc.items.tools.ItemSkyrimMCHoe;
import com.github.jdkorv11.skyrimmc.items.tools.ItemSkyrimMCPickaxe;
import com.github.jdkorv11.skyrimmc.items.tools.ItemSkyrimMCShovel;
import com.github.jdkorv11.skyrimmc.items.tools.ItemSkyrimMCSword;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmory {
	static Item.ToolMaterial RUSTANIUM = EnumHelper.addToolMaterial("RUSTANIUM", 2, 512, 2.0F, 2.0F,
			14);
	static ArmorMaterial ARUSTANIUM = EnumHelper.addArmorMaterial("ARUSTANIUM", 20,
			new int[] { 3, 7, 5, 2 }, 14);

	public static Item rustaniumSword = new ItemSkyrimMCSword(RUSTANIUM)
			.setUnlocalizedName("rustaniumSword");
	public static Item rustaniumPick = new ItemSkyrimMCPickaxe(RUSTANIUM)
			.setUnlocalizedName("rustaniumPick");
	public static Item rustaniumShovel = new ItemSkyrimMCShovel(RUSTANIUM)
			.setUnlocalizedName("rustaniumShovel");
	public static Item rustaniumAxe = new ItemSkyrimMCAxe(RUSTANIUM)
			.setUnlocalizedName("rustaniumAxe");
	public static Item rustaniumHoe = new ItemSkyrimMCHoe(RUSTANIUM)
			.setUnlocalizedName("rustaniumHoe");
	public static Item rustaniumHelm = new ItemRustaniumArmor(ARUSTANIUM, 0, "rustaniumHelm");
	public static Item rustaniumPlate = new ItemRustaniumArmor(ARUSTANIUM, 1, "rustaniumPlate");
	public static Item rustaniumPants = new ItemRustaniumArmor(ARUSTANIUM, 2, "rustaniumPants");
	public static Item rustaniumBoots = new ItemRustaniumArmor(ARUSTANIUM, 3, "rustaniumBoots");

	public static void init() {
		//register tools
		RegisterHelper.registerItem(rustaniumSword);
		RegisterHelper.registerItem(rustaniumPick);
		RegisterHelper.registerItem(rustaniumShovel);
		RegisterHelper.registerItem(rustaniumAxe);
		RegisterHelper.registerItem(rustaniumHoe);
		
		//register armors
		RegisterHelper.registerItem(rustaniumHelm);
		RegisterHelper.registerItem(rustaniumPlate);
		RegisterHelper.registerItem(rustaniumPants);
		RegisterHelper.registerItem(rustaniumBoots);
	}
}
