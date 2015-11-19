package com.github.jdkorv11.skyrimmc;

import com.github.jdkorv11.skyrimmc.crafting.ModRecipes;
import com.github.jdkorv11.skyrimmc.generation.SkyrimMCGeneration;
import com.github.jdkorv11.skyrimmc.help.Reference;
import com.github.jdkorv11.skyrimmc.init.ModArmory;
import com.github.jdkorv11.skyrimmc.init.ModBlocks;
import com.github.jdkorv11.skyrimmc.init.ModItems;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME,
		version = Reference.VERSION)
public class SkyrimMC
{
	SkyrimMCGeneration eventWorldGen = new SkyrimMCGeneration();

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
		ModArmory.init();
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		ModRecipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}

}
