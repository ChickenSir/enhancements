package com.enhancements.client.datagen;

import com.enhancements.registries.BlockRegistry;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.world.level.block.Blocks;

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
            .slab(BlockRegistry.SMOOTH_GRANITE_SLAB)
            .wall(BlockRegistry.SMOOTH_GRANITE_WALL);

        blockStateModelGenerator.family(BlockRegistry.GRANITE_BRICKS)
            .stairs(BlockRegistry.GRANITE_BRICK_STAIRS)
            .slab(BlockRegistry.GRANITE_BRICK_SLAB)
            .wall(BlockRegistry.GRANITE_BRICK_WALL);

        // Diorite Set
        blockStateModelGenerator.family(BlockRegistry.COBBLED_DIORITE)
            .stairs(BlockRegistry.COBBLED_DIORITE_STAIRS)
            .slab(BlockRegistry.COBBLED_DIORITE_SLAB);

        blockStateModelGenerator.family(BlockRegistry.SMOOTH_DIORITE)
            .stairs(BlockRegistry.SMOOTH_DIORITE_STAIRS)
            .slab(BlockRegistry.SMOOTH_DIORITE_SLAB)
            .wall(BlockRegistry.SMOOTH_DIORITE_WALL);

        blockStateModelGenerator.family(BlockRegistry.DIORITE_BRICKS)
            .stairs(BlockRegistry.DIORITE_BRICK_STAIRS)
            .slab(BlockRegistry.DIORITE_BRICK_SLAB)
            .wall(BlockRegistry.DIORITE_BRICK_WALL);

        // Andesite Set
        blockStateModelGenerator.family(BlockRegistry.COBBLED_ANDESITE)
            .stairs(BlockRegistry.COBBLED_ANDESITE_STAIRS)
            .slab(BlockRegistry.COBBLED_ANDESITE_SLAB);

        blockStateModelGenerator.family(BlockRegistry.SMOOTH_ANDESITE)
            .stairs(BlockRegistry.SMOOTH_ANDESITE_STAIRS)
            .slab(BlockRegistry.SMOOTH_ANDESITE_SLAB)
            .wall(BlockRegistry.SMOOTH_ANDESITE_WALL);

        blockStateModelGenerator.family(BlockRegistry.ANDESITE_BRICKS)
            .stairs(BlockRegistry.ANDESITE_BRICK_STAIRS)
            .slab(BlockRegistry.ANDESITE_BRICK_SLAB)
            .wall(BlockRegistry.ANDESITE_BRICK_WALL);

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

        // Sandstone Set
        blockStateModelGenerator.createTrivialCube(BlockRegistry.COBBLED_SANDSTONE);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.COBBLED_RED_SANDSTONE);

        // Cobblestone Bricks Set
        blockStateModelGenerator.family(BlockRegistry.COBBLESTONE_BRICKS)
            .stairs(BlockRegistry.COBBLESTONE_BRICK_STAIRS)
            .slab(BlockRegistry.COBBLESTONE_BRICK_SLAB)
            .wall(BlockRegistry.COBBLESTONE_BRICK_WALL);

        // Reinforced Planks Set
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_OAK_PLANKS);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_BIRCH_PLANKS);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_SPRUCE_PLANKS);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_JUNGLE_PLANKS);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_ACACIA_PLANKS);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_DARK_OAK_PLANKS);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_CHERRY_PLANKS);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_MANGROVE_PLANKS);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_PALE_OAK_PLANKS);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_BAMBOO_PLANKS);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_CRIMSON_PLANKS);
        blockStateModelGenerator.createTrivialCube(BlockRegistry.REINFORCED_WARPED_PLANKS);

        // Center Stair Set
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.STONE_CENTER_STAIR, Blocks.STONE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.SMOOTH_STONE_CENTER_STAIR, Blocks.SMOOTH_STONE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.STONE_BRICK_CENTER_STAIR, Blocks.STONE_BRICKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.COBBLESTONE_CENTER_STAIR, Blocks.COBBLESTONE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.MOSSY_COBBLESTONE_CENTER_STAIR, Blocks.MOSSY_COBBLESTONE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.GRANITE_CENTER_STAIR, Blocks.GRANITE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.POLISHED_GRANITE_CENTER_STAIR, Blocks.POLISHED_GRANITE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.SMOOTH_GRANITE_CENTER_STAIR, BlockRegistry.SMOOTH_GRANITE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.GRANITE_BRICK_CENTER_STAIR, BlockRegistry.GRANITE_BRICKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.DIORITE_CENTER_STAIR, Blocks.DIORITE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.POLISHED_DIORITE_CENTER_STAIR, Blocks.POLISHED_DIORITE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.SMOOTH_DIORITE_CENTER_STAIR, BlockRegistry.SMOOTH_DIORITE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.DIORITE_BRICK_CENTER_STAIR, BlockRegistry.DIORITE_BRICKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.ANDESITE_CENTER_STAIR, Blocks.ANDESITE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.POLISHED_ANDESITE_CENTER_STAIR, Blocks.POLISHED_ANDESITE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.SMOOTH_ANDESITE_CENTER_STAIR, BlockRegistry.SMOOTH_ANDESITE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.ANDESITE_BRICK_CENTER_STAIR, BlockRegistry.ANDESITE_BRICKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.DEEPSLATE_CENTER_STAIR, Blocks.DEEPSLATE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.COBBLED_DEEPSLATE_CENTER_STAIR, Blocks.COBBLED_DEEPSLATE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.POLISHED_DEEPSLATE_CENTER_STAIR, Blocks.POLISHED_DEEPSLATE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.DEEPSLATE_BRICK_CENTER_STAIR, Blocks.DEEPSLATE_BRICKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.DEEPSLATE_TILES_CENTER_STAIR, Blocks.DEEPSLATE_TILES);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.SANDSTONE_CENTER_STAIR, Blocks.SANDSTONE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.COBBLED_SANDSTONE_CENTER_STAIR, BlockRegistry.COBBLED_SANDSTONE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.RED_SANDSTONE_CENTER_STAIR, Blocks.RED_SANDSTONE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.COBBLED_RED_SANDSTONE_CENTER_STAIR, BlockRegistry.COBBLED_RED_SANDSTONE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.PRISMARINE_CENTER_STAIR, Blocks.PRISMARINE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.PRISMARINE_BRICK_CENTER_STAIR, Blocks.PRISMARINE_BRICKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.DARK_PRISMARINE_CENTER_STAIR, Blocks.DARK_PRISMARINE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.NETHER_BRICK_CENTER_STAIR, Blocks.NETHER_BRICKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.BLACKSTONE_CENTER_STAIR, Blocks.BLACKSTONE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.POLISHED_BLACKSTONE_BRICK_CENTER_STAIR, Blocks.POLISHED_BLACKSTONE_BRICKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.POLISHED_BLACKSTONE_CENTER_STAIR, Blocks.POLISHED_BLACKSTONE);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.QUARTZ_CENTER_STAIR, "quartz_block_side");
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.QUARTZ_BRICK_CENTER_STAIR, Blocks.QUARTZ_BRICKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.OAK_CENTER_STAIR, Blocks.OAK_PLANKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.BIRCH_CENTER_STAIR, Blocks.BIRCH_PLANKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.SPRUCE_CENTER_STAIR, Blocks.SPRUCE_PLANKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.JUNGLE_CENTER_STAIR, Blocks.JUNGLE_PLANKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.ACACIA_CENTER_STAIR, Blocks.ACACIA_PLANKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.DARK_OAK_CENTER_STAIR, Blocks.DARK_OAK_PLANKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.CHERRY_CENTER_STAIR, Blocks.CHERRY_PLANKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.MANGROVE_CENTER_STAIR, Blocks.MANGROVE_PLANKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.PALE_OAK_CENTER_STAIR, Blocks.PALE_OAK_PLANKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.BAMBOO_CENTER_STAIR, Blocks.BAMBOO_PLANKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.CRIMSON_CENTER_STAIR, Blocks.CRIMSON_PLANKS);
        ENHCustomModelGenerator.registerCenterStair(blockStateModelGenerator, BlockRegistry.WARPED_CENTER_STAIR, Blocks.WARPED_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        
    }
    
}
