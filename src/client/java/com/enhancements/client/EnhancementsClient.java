package com.enhancements.client;

import com.enhancements.registries.BlockRegistry;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public class EnhancementsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.BREEZE_HEAD, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.COLD_CHICKEN_HEAD, RenderType.cutout());
	}
}