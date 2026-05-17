package com.enhancements;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.enhancements.registries.BlockRegistry;
import com.enhancements.registries.ItemRegistry;

public class Enhancements implements ModInitializer {
	public static final String modID = "enhancements";
	public static final String modName = "Enhancements";
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