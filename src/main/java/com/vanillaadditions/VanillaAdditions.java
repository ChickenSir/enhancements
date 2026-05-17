package com.vanillaadditions;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vanillaadditions.registries.BlockRegistry;
import com.vanillaadditions.registries.ItemRegistry;

public class VanillaAdditions implements ModInitializer {
	public static final String modID = "vanilla-additions";
	public static final String modName = "Vanilla Additions";
	public static final Logger LOGGER = LoggerFactory.getLogger(modID);

	@Override
	public void onInitialize() {
		// Register Blocks
		BlockRegistry.registerBlocks();
		LOGGER.info("Registering Blocks!");

		// Register Items
		ItemRegistry.registerItems();
		LOGGER.info("Registering Items!");
	}
}