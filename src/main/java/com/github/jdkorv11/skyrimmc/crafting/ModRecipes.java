package com.github.jdkorv11.skyrimmc.crafting;

import com.github.jdkorv11.skyrimmc.init.ModArmory;
import com.github.jdkorv11.skyrimmc.init.ModBlocks;
import com.github.jdkorv11.skyrimmc.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModRecipes {

	public static void init() {
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.rustaniumIngot),
				new Object[] { "a", "b", 'a', Blocks.clay, 'b', Items.iron_ingot });
		GameRegistry.addSmelting(ModBlocks.rustaniumOre, new ItemStack(ModItems.rustaniumIngot),
				0.5F);
		addPickRecipe(new ItemStack(ModArmory.rustaniumPick), ModItems.rustaniumIngot);
		addAxeRecipe(new ItemStack(ModArmory.rustaniumAxe), ModItems.rustaniumIngot);
		addSwordRecipe(new ItemStack(ModArmory.rustaniumSword), ModItems.rustaniumIngot);
		addShovelRecipe(new ItemStack(ModArmory.rustaniumShovel), ModItems.rustaniumIngot);
		addHoeRecipe(new ItemStack(ModArmory.rustaniumHoe), ModItems.rustaniumIngot);
	}

	private static void addPickRecipe(ItemStack crafted, Item material) {
		GameRegistry.addShapedRecipe(crafted,
				new Object[] { "aaa", " b ", " b ", 'a', material, 'b', Items.stick });
	}

	private static void addAxeRecipe(ItemStack crafted, Item material) {
		GameRegistry.addShapedRecipe(crafted, new Object[] { " aa", " ba", " b ", "aa ", "ab ",
				" b ", 'a', material, 'b', Items.stick });
	}

	private static void addSwordRecipe(ItemStack crafted, Item material) {
		GameRegistry.addShapedRecipe(crafted,
				new Object[] { "a", "a", "b", 'a', material, 'b', Items.stick });
	}

	private static void addShovelRecipe(ItemStack crafted, Item material) {
		GameRegistry.addShapedRecipe(crafted,
				new Object[] { " a ", " b ", " b ", 'a', material, 'b', Items.stick });
	}

	private static void addHoeRecipe(ItemStack crafted, Item material) {
		GameRegistry.addShapedRecipe(crafted, new Object[] { " aa", " b ", " b ", "aa ", " b ",
				" b ", 'a', material, 'b', Items.stick });
	}
}
