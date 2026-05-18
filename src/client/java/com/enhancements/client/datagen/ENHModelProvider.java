package com.enhancements.client.datagen;

import com.enhancements.registries.BlockRegistry;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class ENHModelProvider extends FabricModelProvider {

    public ENHModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        // Granite Set
        blockStateModelGenerator.family(BlockRegistry.COBBLED_GRANITE)
            .stairs(BlockRegistry.COBBLED_GRANITE_STAIRS)
            .slab(BlockRegistry.COBBLED_GRANITE_SLAB);

        blockStateModelGenerator.family(BlockRegistry.SMOOTH_GRANITE)
            .stairs(BlockRegistry.SMOOTH_GRANITE_STAIRS)
            .slab(BlockRegistry.SMOOTH_GRANITE_SLAB);

        blockStateModelGenerator.family(BlockRegistry.GRANITE_BRICKS)
            .stairs(BlockRegistry.GRANITE_BRICK_STAIRS)
            .slab(BlockRegistry.GRANITE_BRICK_SLAB);

        // Diorite Set
        blockStateModelGenerator.family(BlockRegistry.COBBLED_DIORITE)
            .stairs(BlockRegistry.COBBLED_DIORITE_STAIRS)
            .slab(BlockRegistry.COBBLED_DIORITE_SLAB);

        blockStateModelGenerator.family(BlockRegistry.SMOOTH_DIORITE)
            .stairs(BlockRegistry.SMOOTH_DIORITE_STAIRS)
            .slab(BlockRegistry.SMOOTH_DIORITE_SLAB);

        blockStateModelGenerator.family(BlockRegistry.DIORITE_BRICKS)
            .stairs(BlockRegistry.DIORITE_BRICK_STAIRS)
            .slab(BlockRegistry.DIORITE_BRICK_SLAB);

        // Andesite Set
        blockStateModelGenerator.family(BlockRegistry.COBBLED_ANDESITE)
            .stairs(BlockRegistry.COBBLED_ANDESITE_STAIRS)
            .slab(BlockRegistry.COBBLED_ANDESITE_SLAB);

        blockStateModelGenerator.family(BlockRegistry.SMOOTH_ANDESITE)
            .stairs(BlockRegistry.SMOOTH_ANDESITE_STAIRS)
            .slab(BlockRegistry.SMOOTH_ANDESITE_SLAB);

        blockStateModelGenerator.family(BlockRegistry.ANDESITE_BRICKS)
            .stairs(BlockRegistry.ANDESITE_BRICK_STAIRS)
            .slab(BlockRegistry.ANDESITE_BRICK_SLAB);

        // Crate Set
        blockStateModelGenerator.createTrivialCube(BlockRegistry.OAK_CRATE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.BIRCH_CRATE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.SPRUCE_CRATE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.JUNGLE_CRATE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.ACACIA_CRATE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.DARK_OAK_CRATE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.CHERRY_CRATE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.MANGROVE_CRATE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.PALE_OAK_CRATE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.BAMBOO_CRATE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.CRIMSON_CRATE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.WARPED_CRATE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        
    }
    
}
