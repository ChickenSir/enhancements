package com.vanillaadditions.client.datagen;

import com.vanillaadditions.registries.BlockRegistry;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class VAModelProvider extends FabricModelProvider {

    public VAModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        blockStateModelGenerator.family(BlockRegistry.COBBLED_GRANITE)
            .stairs(BlockRegistry.COBBLED_GRANITE_STAIRS)
            .slab(BlockRegistry.COBBLED_GRANITE_SLAB);

        blockStateModelGenerator.family(BlockRegistry.SMOOTH_GRANITE)
            .stairs(BlockRegistry.SMOOTH_GRANITE_STAIRS)
            .slab(BlockRegistry.SMOOTH_GRANITE_SLAB);

        blockStateModelGenerator.family(BlockRegistry.GRANITE_BRICKS)
            .stairs(BlockRegistry.GRANITE_BRICK_STAIRS)
            .slab(BlockRegistry.GRANITE_BRICK_SLAB);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        
    }
    
}
