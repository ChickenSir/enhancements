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

		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.RED_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.BLUE_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.YELLOW_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.GREEN_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.LIME_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.CYAN_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.LIGHT_BLUE_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.ORANGE_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.MAGENTA_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.PURPLE_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.PINK_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.BROWN_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.LIGHT_GRAY_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.GRAY_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.BLACK_TABLE_CLOTH, RenderType.cutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockRegistry.CRAFTING_TABLE_CLOTH, RenderType.cutout());
	}
}