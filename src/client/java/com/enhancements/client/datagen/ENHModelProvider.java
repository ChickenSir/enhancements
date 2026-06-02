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

        // Log Stack Set
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.OAK_LOG_STACK, "oak_log_stack");
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.BIRCH_LOG_STACK, "birch_log_stack");
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.SPRUCE_LOG_STACK, "spruce_log_stack");
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.JUNGLE_LOG_STACK, "jungle_log_stack");
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.ACACIA_LOG_STACK, "acacia_log_stack");
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.DARK_OAK_LOG_STACK, "dark_oak_log_stack");
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.CHERRY_LOG_STACK, "cherry_log_stack");
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.MANGROVE_LOG_STACK, "mangrove_log_stack");
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.PALE_OAK_LOG_STACK, "pale_oak_log_stack");
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.BAMBOO_STACK, "bamboo_stack");
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.CRIMSON_STEM_STACK, "crimson_stem_stack");
        ENHCustomModelGenerator.registerLogStack(blockStateModelGenerator, BlockRegistry.WARPED_STEM_STACK, "warped_stem_stack");

        // Chair Set
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.OAK_CHAIR, "reinforced_oak_planks");
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.BIRCH_CHAIR, "reinforced_birch_planks");
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.SPRUCE_CHAIR, "reinforced_spruce_planks");
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.JUNGLE_CHAIR, "reinforced_jungle_planks");
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.ACACIA_CHAIR, "reinforced_acacia_planks");
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.DARK_OAK_CHAIR, "reinforced_dark_oak_planks");
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.CHERRY_CHAIR, "reinforced_cherry_planks");
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.MANGROVE_CHAIR, "reinforced_mangrove_planks");
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.PALE_OAK_CHAIR, "reinforced_pale_oak_planks");
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.BAMBOO_CHAIR, "reinforced_bamboo_planks");
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.CRIMSON_CHAIR, "reinforced_crimson_planks");
        ENHCustomModelGenerator.registerChair(blockStateModelGenerator, BlockRegistry.WARPED_CHAIR, "reinforced_warped_planks");

        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.OAK_ARMCHAIR, "reinforced_oak_planks");
        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.BIRCH_ARMCHAIR, "reinforced_birch_planks");
        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.SPRUCE_ARMCHAIR, "reinforced_spruce_planks");
        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.JUNGLE_ARMCHAIR, "reinforced_jungle_planks");
        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.ACACIA_ARMCHAIR, "reinforced_acacia_planks");
        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.DARK_OAK_ARMCHAIR, "reinforced_dark_oak_planks");
        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.CHERRY_ARMCHAIR, "reinforced_cherry_planks");
        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.MANGROVE_ARMCHAIR, "reinforced_mangrove_planks");
        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.PALE_OAK_ARMCHAIR, "reinforced_pale_oak_planks");
        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.BAMBOO_ARMCHAIR, "reinforced_bamboo_planks");
        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.CRIMSON_ARMCHAIR, "reinforced_crimson_planks");
        ENHCustomModelGenerator.registerArmchair(blockStateModelGenerator, BlockRegistry.WARPED_ARMCHAIR, "reinforced_warped_planks");

        // Table Set
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.OAK_TABLE, "reinforced_oak_planks");
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.BIRCH_TABLE, "reinforced_birch_planks");
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.SPRUCE_TABLE, "reinforced_spruce_planks");
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.JUNGLE_TABLE, "reinforced_jungle_planks");
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.ACACIA_TABLE, "reinforced_acacia_planks");
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.DARK_OAK_TABLE, "reinforced_dark_oak_planks");
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.CHERRY_TABLE, "reinforced_cherry_planks");
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.MANGROVE_TABLE, "reinforced_mangrove_planks");
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.PALE_OAK_TABLE, "reinforced_pale_oak_planks");
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.BAMBOO_TABLE, "reinforced_bamboo_planks");
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.CRIMSON_TABLE, "reinforced_crimson_planks");
        ENHCustomModelGenerator.registerTable(blockStateModelGenerator, BlockRegistry.WARPED_TABLE, "reinforced_warped_planks");

        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.RED_TABLE_CLOTH, "red_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.BLUE_TABLE_CLOTH, "blue_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.YELLOW_TABLE_CLOTH, "yellow_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.GREEN_TABLE_CLOTH, "green_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.LIME_TABLE_CLOTH, "lime_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.CYAN_TABLE_CLOTH, "cyan_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.LIGHT_BLUE_TABLE_CLOTH, "light_blue_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.ORANGE_TABLE_CLOTH, "orange_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.MAGENTA_TABLE_CLOTH, "magenta_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.PURPLE_TABLE_CLOTH, "purple_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.PINK_TABLE_CLOTH, "pink_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.BROWN_TABLE_CLOTH, "brown_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.LIGHT_GRAY_TABLE_CLOTH, "light_gray_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.GRAY_TABLE_CLOTH, "gray_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.BLACK_TABLE_CLOTH, "black_table_cloth");
        ENHCustomModelGenerator.registerTableCloth(blockStateModelGenerator, BlockRegistry.CRAFTING_TABLE_CLOTH, "crafting_table_cloth");

        // Chimney Set
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.STONE_CHIMNEY, Blocks.STONE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.COBBLESTONE_CHIMNEY, Blocks.COBBLESTONE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.STONE_BRICK_CHIMNEY, Blocks.STONE_BRICKS);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.SMOOTH_STONE_CHIMNEY, Blocks.SMOOTH_STONE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.GRANITE_CHIMNEY, Blocks.GRANITE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.POLISHED_GRANITE_CHIMNEY, Blocks.POLISHED_GRANITE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.SMOOTH_GRANITE_CHIMNEY, BlockRegistry.SMOOTH_GRANITE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.GRANITE_BRICK_CHIMNEY, BlockRegistry.GRANITE_BRICKS);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.DIORITE_CHIMNEY, Blocks.DIORITE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.POLISHED_DIORITE_CHIMNEY, Blocks.POLISHED_DIORITE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.SMOOTH_DIORITE_CHIMNEY, BlockRegistry.SMOOTH_DIORITE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.DIORITE_BRICK_CHIMNEY, BlockRegistry.DIORITE_BRICKS);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.ANDESITE_CHIMNEY, Blocks.ANDESITE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.POLISHED_ANDESITE_CHIMNEY, Blocks.POLISHED_ANDESITE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.SMOOTH_ANDESITE_CHIMNEY, BlockRegistry.SMOOTH_ANDESITE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.ANDESITE_BRICK_CHIMNEY, BlockRegistry.ANDESITE_BRICKS);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.SANDSTONE_CHIMNEY, Blocks.SANDSTONE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.SMOOTH_SANDSTONE_CHIMNEY, "sandstone_top");
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.COBBLED_SANDSTONE_CHIMNEY, BlockRegistry.COBBLED_SANDSTONE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.RED_SANDSTONE_CHIMNEY, Blocks.RED_SANDSTONE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.SMOOTH_RED_SANDSTONE_CHIMNEY, "red_sandstone_top");
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.COBBLED_RED_SANDSTONE_CHIMNEY, BlockRegistry.COBBLED_RED_SANDSTONE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.DEEPSLATE_CHIMNEY, Blocks.DEEPSLATE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.COBBLED_DEEPSLATE_CHIMNEY, Blocks.COBBLED_DEEPSLATE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.POLISHED_DEEPSLATE_CHIMNEY, Blocks.POLISHED_DEEPSLATE);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.DEEPSLATE_BRICK_CHIMNEY, Blocks.DEEPSLATE_BRICKS);
        ENHCustomModelGenerator.registerChimney(blockStateModelGenerator, BlockRegistry.DEEPSLATE_TILE_CHIMNEY, Blocks.DEEPSLATE_TILES);
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        
    }
    
}
