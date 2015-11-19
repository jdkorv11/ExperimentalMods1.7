package com.github.jdkorv11.skyrimmc.init;

import com.github.jdkorv11.skyrimmc.armory.ItemSkyrimMCAxe;
import com.github.jdkorv11.skyrimmc.armory.ItemSkyrimMCPickaxe;
import com.github.jdkorv11.skyrimmc.armory.ItemSkyrimMCShovel;
import com.github.jdkorv11.skyrimmc.armory.ItemSkyrimMCSword;
import com.github.jdkorv11.skyrimmc.help.RegisterHelper;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmory {
	static Item.ToolMaterial TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 2, 512, 2.0F, 2.0F, 14);
	
	public static Item titaniumSword = new ItemSkyrimMCSword(TITANIUM).setUnlocalizedName("titaniumSword");
	public static Item titaniumPick = new ItemSkyrimMCPickaxe(TITANIUM).setUnlocalizedName("titaniumPick");
	public static Item titaniumShovel = new ItemSkyrimMCShovel(TITANIUM).setUnlocalizedName("titaniumShovel");
	public static Item titaniumAxe = new ItemSkyrimMCAxe(TITANIUM).setUnlocalizedName("titaniumAxe");
	
	public static void init() {
		RegisterHelper.registerItem(titaniumSword);
		RegisterHelper.registerItem(titaniumPick);
		RegisterHelper.registerItem(titaniumShovel);
		RegisterHelper.registerItem(titaniumAxe);
	}
}
