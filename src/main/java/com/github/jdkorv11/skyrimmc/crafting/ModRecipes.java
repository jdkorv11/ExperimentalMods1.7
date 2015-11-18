package com.github.jdkorv11.skyrimmc.crafting;

import com.github.jdkorv11.skyrimmc.init.ModItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ModRecipes {

	public static void init() {
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ebonyIngot),
				new Object[] { "a", "b", 'a', Blocks.dirt, 'b', Blocks.cobblestone });
	}
}
