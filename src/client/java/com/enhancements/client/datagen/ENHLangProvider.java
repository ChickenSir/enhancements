package com.enhancements.client.datagen;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup.Provider;

public class ENHLangProvider extends FabricLanguageProvider {

    protected ENHLangProvider(FabricDataOutput dataOutput, CompletableFuture<Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("enhancements.item_group", "Enhancements");

        // Granite Set
        translationBuilder.add("item.enhancements.smooth_granite", "Smooth Granite");
        translationBuilder.add("item.enhancements.smooth_granite_stairs", "Smooth Granite Stairs");
        translationBuilder.add("item.enhancements.smooth_granite_slab", "Smooth Granite Slab");
        translationBuilder.add("item.enhancements.smooth_granite_wall", "Smooth Granite Wall");
        translationBuilder.add("item.enhancements.granite_bricks", "Granite Bricks");
        translationBuilder.add("item.enhancements.granite_brick_stairs", "Granite Brick Stairs");
        translationBuilder.add("item.enhancements.granite_brick_slab", "Granite Brick Slab");
        translationBuilder.add("item.enhancements.granite_brick_wall", "Granite Brick Wall");

        // Diorite Set
        translationBuilder.add("item.enhancements.smooth_diorite", "Smooth Diorite");
        translationBuilder.add("item.enhancements.smooth_diorite_stairs", "Smooth Diorite Stairs");
        translationBuilder.add("item.enhancements.smooth_diorite_slab", "Smooth Diorite Slab");
        translationBuilder.add("item.enhancements.smooth_diorite_wall", "Smooth Diorite Wall");
        translationBuilder.add("item.enhancements.diorite_bricks", "Diorite Bricks");
        translationBuilder.add("item.enhancements.diorite_brick_stairs", "Diorite Brick Stairs");
        translationBuilder.add("item.enhancements.diorite_brick_slab", "Diorite Brick Slab");
        translationBuilder.add("item.enhancements.diorite_brick_wall", "Diorite Brick Wall");

        // Andesite Set
        translationBuilder.add("item.enhancements.smooth_andesite", "Smooth Andesite");
        translationBuilder.add("item.enhancements.smooth_andesite_stairs", "Smooth Andesite Stairs");
        translationBuilder.add("item.enhancements.smooth_andesite_slab", "Smooth Andesite Slab");
        translationBuilder.add("item.enhancements.smooth_andesite_wall", "Smooth Andesite Wall");
        translationBuilder.add("item.enhancements.andesite_bricks", "Andesite Bricks");
        translationBuilder.add("item.enhancements.andesite_brick_stairs", "Andesite Brick Stairs");
        translationBuilder.add("item.enhancements.andesite_brick_slab", "Andesite Brick Slab");
        translationBuilder.add("item.enhancements.andesite_brick_wall", "Andesite Brick Wall");

        // Log Stack Set
        translationBuilder.add("item.enhancements.oak_log_stack", "Oak Log Stack");
        translationBuilder.add("item.enhancements.birch_log_stack", "Birch Log Stack");
        translationBuilder.add("item.enhancements.spruce_log_stack", "Spruce Log Stack");
        translationBuilder.add("item.enhancements.jungle_log_stack", "Jungle Log Stack");
        translationBuilder.add("item.enhancements.acacia_log_stack", "Acacia Log Stack");
        translationBuilder.add("item.enhancements.dark_oak_log_stack", "Dark Oak Log Stack");
        translationBuilder.add("item.enhancements.cherry_log_stack", "Cherry Log Stack");
        translationBuilder.add("item.enhancements.mangrove_log_stack", "Mangrove Log Stack");
        translationBuilder.add("item.enhancements.pale_oak_log_stack", "Pale Oak Log Stack");
        translationBuilder.add("item.enhancements.bamboo_stack", "Bamboo Stack");
        translationBuilder.add("item.enhancements.crimson_stem_stack", "Crimson Stem Stack");
        translationBuilder.add("item.enhancements.warped_stem_stack", "Warped Stem Stack");

        // Crate Set
        translationBuilder.add("item.enhancements.oak_crate", "Oak Crate");
        translationBuilder.add("item.enhancements.birch_crate", "Birch Crate");
        translationBuilder.add("item.enhancements.spruce_crate", "Spruce Crate");
        translationBuilder.add("item.enhancements.jungle_crate", "Jungle Crate");
        translationBuilder.add("item.enhancements.acacia_crate", "Acacia Crate");
        translationBuilder.add("item.enhancements.dark_oak_crate", "Dark Oak Crate");
        translationBuilder.add("item.enhancements.cherry_crate", "Cherry Crate");
        translationBuilder.add("item.enhancements.mangrove_crate", "Mangrove Crate");
        translationBuilder.add("item.enhancements.pale_oak_crate", "Pale Oak Crate");
        translationBuilder.add("item.enhancements.bamboo_crate", "Bamboo Crate");
        translationBuilder.add("item.enhancements.crimson_crate", "Crimson Crate");
        translationBuilder.add("item.enhancements.warped_crate", "Warped Crate");

        // Mob Head Set
        translationBuilder.add("item.enhancements.allay_head", "Allay Head");
        translationBuilder.add("item.enhancements.bee_head", "Bee Head");
        translationBuilder.add("item.enhancements.breeze_head", "Breeze Head");
        translationBuilder.add("item.enhancements.brown_mooshroom_head", "Brown Mooshroom Head");
        translationBuilder.add("item.enhancements.camel_head", "Camel Head");
        translationBuilder.add("item.enhancements.cold_chicken_head", "Cold Chicken Head");
        translationBuilder.add("item.enhancements.cold_cow_head", "Cold Cow Head");
        translationBuilder.add("item.enhancements.iron_golem_head", "Iron Golem Head");
        translationBuilder.add("item.enhancements.polarbear_head", "Polar Bear Head");
        translationBuilder.add("item.enhancements.red_mooshroom_head", "Red Mooshroom Head");
        translationBuilder.add("item.enhancements.temperate_chicken_head", "Chicken Head");
        translationBuilder.add("item.enhancements.temperate_cow_head", "Cow Head");
        translationBuilder.add("item.enhancements.warm_chicken_head", "Warm Chicken Head");
        translationBuilder.add("item.enhancements.warm_cow_head", "Warm Cow Head");

        // Sandstone Set
        translationBuilder.add("item.enhancements.cobbled_sandstone", "Cobbled Sandstone");
        translationBuilder.add("item.enhancements.cobbled_red_sandstone", "Cobbled Red Sandstone");

        // Cobblestone Bricks Set
        translationBuilder.add("item.enhancements.cobblestone_bricks", "Cobblestone Bricks");
        translationBuilder.add("item.enhancements.cobblestone_brick_stairs", "Cobblestone Brick Stairs");
        translationBuilder.add("item.enhancements.cobblestone_brick_slab", "Cobblestone Brick Slab");
        translationBuilder.add("item.enhancements.cobblestone_brick_wall", "Cobblestone Brick Wall");

        // Reinforced Planks Set
        translationBuilder.add("item.enhancements.reinforced_oak_planks", "Reinforced Oak Planks");
        translationBuilder.add("item.enhancements.reinforced_birch_planks", "Reinforced Birch Planks");
        translationBuilder.add("item.enhancements.reinforced_spruce_planks", "Reinforced Spruce Planks");
        translationBuilder.add("item.enhancements.reinforced_jungle_planks", "Reinforced Jungle Planks");
        translationBuilder.add("item.enhancements.reinforced_acacia_planks", "Reinforced Acacia Planks");
        translationBuilder.add("item.enhancements.reinforced_dark_oak_planks", "Reinforced Dark Oak Planks");
        translationBuilder.add("item.enhancements.reinforced_cherry_planks", "Reinforced Cherry Planks");
        translationBuilder.add("item.enhancements.reinforced_mangrove_planks", "Reinforced Mangrove Planks");
        translationBuilder.add("item.enhancements.reinforced_pale_oak_planks", "Reinforced Pale Oak Planks");
        translationBuilder.add("item.enhancements.reinforced_bamboo_planks", "Reinforced Bamboo Planks");
        translationBuilder.add("item.enhancements.reinforced_crimson_planks", "Reinforced Crimson Planks");
        translationBuilder.add("item.enhancements.reinforced_warped_planks", "Reinforced Warped Planks");

        // Center Stair Set
        translationBuilder.add("item.enhancements.stone_center_stair", "Stone Center Stair");
        translationBuilder.add("item.enhancements.smooth_stone_center_stair", "Smooth Stone Center Stair");
        translationBuilder.add("item.enhancements.stone_brick_center_stair", "Stone Brick Center Stair");
        translationBuilder.add("item.enhancements.cobblestone_center_stair", "Cobblestone Center Stair");
        translationBuilder.add("item.enhancements.mossy_cobblestone_center_stair", "Mossy Cobblestone Center Stair");
        translationBuilder.add("item.enhancements.granite_center_stair", "Granite Center Stair");
        translationBuilder.add("item.enhancements.polished_granite_center_stair", "Polished Granite Center Stair");
        translationBuilder.add("item.enhancements.smooth_granite_center_stair", "Smooth Granite Center Stair");
        translationBuilder.add("item.enhancements.granite_brick_center_stair", "Granite Brick Center Stair");
        translationBuilder.add("item.enhancements.diorite_center_stair", "Diorite Center Stair");
        translationBuilder.add("item.enhancements.polished_diorite_center_stair", "Polished Diorite Center Stair");
        translationBuilder.add("item.enhancements.smooth_diorite_center_stair", "Smooth Diorite Center Stair");
        translationBuilder.add("item.enhancements.diorite_brick_center_stair", "Diorite Brick Center Stair");
        translationBuilder.add("item.enhancements.andesite_center_stair", "Andesite Center Stair");
        translationBuilder.add("item.enhancements.polished_andesite_center_stair", "Polished Andesite Center Stair");
        translationBuilder.add("item.enhancements.smooth_andesite_center_stair", "Smooth Andesite Center Stair");
        translationBuilder.add("item.enhancements.andesite_brick_center_stair", "Andesite Brick Center Stair");
        translationBuilder.add("item.enhancements.deepslate_center_stair", "Deepslate Center Stair");
        translationBuilder.add("item.enhancements.cobbled_deepslate_center_stair", "Cobbled Deepslate Center Stair");
        translationBuilder.add("item.enhancements.polished_deepslate_center_stair", "Polished Deepslate Center Stair");
        translationBuilder.add("item.enhancements.deepslate_brick_center_stair", "Deepslate Brick Center Stair");
        translationBuilder.add("item.enhancements.deepslate_tiles_center_stair", "Deepslate Tiles Center Stair");
        translationBuilder.add("item.enhancements.sandstone_center_stair", "Sandstone Center Stair");
        translationBuilder.add("item.enhancements.cobbled_sandstone_center_stair", "Cobbled Sandstone Center Stair");
        translationBuilder.add("item.enhancements.red_sandstone_center_stair", "Red Sandstone Center Stair");
        translationBuilder.add("item.enhancements.cobbled_red_sandstone_center_stair", "Cobbled Red Sandstone Center Stair");
        translationBuilder.add("item.enhancements.prismarine_center_stair", "Prismarine Center Stair");
        translationBuilder.add("item.enhancements.prismarine_brick_center_stair", "Prismarine Brick Center Stair");
        translationBuilder.add("item.enhancements.dark_prismarine_center_stair", "Dark Prismarine Center Stair");
        translationBuilder.add("item.enhancements.nether_brick_center_stair", "Nether Brick Center Stair");
        translationBuilder.add("item.enhancements.blackstone_center_stair", "Blackstone Center Stair");
        translationBuilder.add("item.enhancements.polished_blackstone_brick_center_stair", "Polished Blackstone Brick Center Stair");
        translationBuilder.add("item.enhancements.polished_blackstone_center_stair", "Polished Blackstone Center Stair");
        translationBuilder.add("item.enhancements.quartz_center_stair", "Quartz Center Stair");
        translationBuilder.add("item.enhancements.quartz_brick_center_stair", "Quartz Brick Center Stair");
        translationBuilder.add("item.enhancements.oak_center_stair", "Oak Center Stair");
        translationBuilder.add("item.enhancements.birch_center_stair", "Birch Center Stair");
        translationBuilder.add("item.enhancements.spruce_center_stair", "Spruce Center Stair");
        translationBuilder.add("item.enhancements.jungle_center_stair", "Jungle Center Stair");
        translationBuilder.add("item.enhancements.acacia_center_stair", "Acacia Center Stair");
        translationBuilder.add("item.enhancements.dark_oak_center_stair", "Dark Oak Center Stair");
        translationBuilder.add("item.enhancements.cherry_center_stair", "Cherry Center Stair");
        translationBuilder.add("item.enhancements.mangrove_center_stair", "Mangrove Center Stair");
        translationBuilder.add("item.enhancements.pale_oak_center_stair", "Pale Oak Center Stair");
        translationBuilder.add("item.enhancements.bamboo_center_stair", "Bamboo Center Stair");
        translationBuilder.add("item.enhancements.crimson_center_stair", "Crimson Center Stair");
        translationBuilder.add("item.enhancements.warped_center_stair", "Warped Center Stair");

        // Chair Set
        translationBuilder.add("item.enhancements.oak_chair", "Oak Chair");
        translationBuilder.add("item.enhancements.birch_chair", "Birch Chair");
        translationBuilder.add("item.enhancements.spruce_chair", "Spruce Chair");
        translationBuilder.add("item.enhancements.jungle_chair", "Jungle Chair");
        translationBuilder.add("item.enhancements.acacia_chair", "Acacia Chair");
        translationBuilder.add("item.enhancements.dark_oak_chair", "Dark Oak Chair");
        translationBuilder.add("item.enhancements.cherry_chair", "Cherry Chair");
        translationBuilder.add("item.enhancements.mangrove_chair", "Mangrove Chair");
        translationBuilder.add("item.enhancements.pale_oak_chair", "Pale Oak Chair");
        translationBuilder.add("item.enhancements.bamboo_chair", "Bamboo Chair");
        translationBuilder.add("item.enhancements.crimson_chair", "Crimson Chair");
        translationBuilder.add("item.enhancements.warped_chair", "Warped Chair");

        translationBuilder.add("item.enhancements.oak_armchair", "Oak Arm Chair");
        translationBuilder.add("item.enhancements.birch_armchair", "Birch Arm Chair");
        translationBuilder.add("item.enhancements.spruce_armchair", "Spruce Arm Chair");
        translationBuilder.add("item.enhancements.jungle_armchair", "Jungle Arm Chair");
        translationBuilder.add("item.enhancements.acacia_armchair", "Acacia Arm Chair");
        translationBuilder.add("item.enhancements.dark_oak_armchair", "Dark Oak Arm Chair");
        translationBuilder.add("item.enhancements.cherry_armchair", "Cherry Arm Chair");
        translationBuilder.add("item.enhancements.mangrove_armchair", "Mangrove Arm Chair");
        translationBuilder.add("item.enhancements.pale_oak_armchair", "Pale Oak Arm Chair");
        translationBuilder.add("item.enhancements.bamboo_armchair", "Bamboo Arm Chair");
        translationBuilder.add("item.enhancements.crimson_armchair", "Crimson Arm Chair");
        translationBuilder.add("item.enhancements.warped_armchair", "Warped Arm Chair");

        // Table Set
        translationBuilder.add("item.enhancements.oak_table", "Oak Table");
        translationBuilder.add("item.enhancements.birch_table", "Birch Table");
        translationBuilder.add("item.enhancements.spruce_table", "Spruce Table");
        translationBuilder.add("item.enhancements.jungle_table", "Jungle Table");
        translationBuilder.add("item.enhancements.acacia_table", "Acacia Table");
        translationBuilder.add("item.enhancements.dark_oak_table", "Dark Oak Table");
        translationBuilder.add("item.enhancements.cherry_table", "Cherry Table");
        translationBuilder.add("item.enhancements.mangrove_table", "Mangrove Table");
        translationBuilder.add("item.enhancements.pale_oak_table", "Pale Oak Table");
        translationBuilder.add("item.enhancements.bamboo_table", "Bamboo Table");
        translationBuilder.add("item.enhancements.crimson_table", "Crimson Table");
        translationBuilder.add("item.enhancements.warped_table", "Warped Table");

        // Table Cloth Set
        translationBuilder.add("item.enhancements.red_table_cloth", "Red Table Cloth");
        translationBuilder.add("item.enhancements.blue_table_cloth", "Blue Table Cloth");
        translationBuilder.add("item.enhancements.yellow_table_cloth", "Yellow Table Cloth");
        translationBuilder.add("item.enhancements.green_table_cloth", "Green Table Cloth");
        translationBuilder.add("item.enhancements.lime_table_cloth", "Lime Table Cloth");
        translationBuilder.add("item.enhancements.cyan_table_cloth", "Cyan Table Cloth");
        translationBuilder.add("item.enhancements.light_blue_table_cloth", "Light Blue Table Cloth");
        translationBuilder.add("item.enhancements.orange_table_cloth", "Orange Table Cloth");
        translationBuilder.add("item.enhancements.magenta_table_cloth", "Magenta Table Cloth");
        translationBuilder.add("item.enhancements.purple_table_cloth", "Purple Table Cloth");
        translationBuilder.add("item.enhancements.pink_table_cloth", "Pink Table Cloth");
        translationBuilder.add("item.enhancements.brown_table_cloth", "Brown Table Cloth");
        translationBuilder.add("item.enhancements.light_gray_table_cloth", "Light Gray Table Cloth");
        translationBuilder.add("item.enhancements.gray_table_cloth", "Gray Table Cloth");
        translationBuilder.add("item.enhancements.black_table_cloth", "Black Table Cloth");
        translationBuilder.add("item.enhancements.crafting_table_cloth", "Crafting Table Cloth");

        // Hammer Set
        translationBuilder.add("item.enhancements.wooden_hammer", "Wooden Hammer");
        translationBuilder.add("item.enhancements.stone_hammer", "Stone Hammer");
        translationBuilder.add("item.enhancements.iron_hammer", "Iron Hammer");
        translationBuilder.add("item.enhancements.golden_hammer", "Golden Hammer");
        translationBuilder.add("item.enhancements.diamond_hammer", "Diamond Hammer");
        translationBuilder.add("item.enhancements.netherite_hammer", "Netherite Hammer");
    }
    
}
