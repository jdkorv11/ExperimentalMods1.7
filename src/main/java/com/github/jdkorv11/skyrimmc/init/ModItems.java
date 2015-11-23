package com.github.jdkorv11.skyrimmc.init;

import com.github.jdkorv11.skyrimmc.help.RegisterHelper;
import com.github.jdkorv11.skyrimmc.items.SkyrimMCItem;

import net.minecraft.item.Item;

public class ModItems {

	public static Item rustaniumIngot = new SkyrimMCItem().setUnlocalizedName("rustaniumIngot");
	
	public static void init(){
		RegisterHelper.registerItem(rustaniumIngot);
	}
}
