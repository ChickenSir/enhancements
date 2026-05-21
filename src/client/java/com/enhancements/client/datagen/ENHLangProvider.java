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
        translationBuilder.add("item.enhancements.cobbled_granite", "Cobbled Granite");
        translationBuilder.add("item.enhancements.cobbled_granite_stairs", "Cobbled Granite Stairs");
        translationBuilder.add("item.enhancements.cobbled_granite_slab", "Cobbled Granite Slab");
        translationBuilder.add("item.enhancements.smooth_granite", "Smooth Granite");
        translationBuilder.add("item.enhancements.smooth_granite_stairs", "Smooth Granite Stairs");
        translationBuilder.add("item.enhancements.smooth_granite_slab", "Smooth Granite Slab");
        translationBuilder.add("item.enhancements.granite_bricks", "Granite Bricks");
        translationBuilder.add("item.enhancements.granite_brick_stairs", "Granite Brick Stairs");
        translationBuilder.add("item.enhancements.granite_brick_slab", "Granite Brick Slab");

        // Diorite Set
        translationBuilder.add("item.enhancements.cobbled_diorite", "Cobbled Diorite");
        translationBuilder.add("item.enhancements.cobbled_diorite_stairs", "Cobbled Diorite Stairs");
        translationBuilder.add("item.enhancements.cobbled_diorite_slab", "Cobbled Diorite Slab");
        translationBuilder.add("item.enhancements.smooth_diorite", "Smooth Diorite");
        translationBuilder.add("item.enhancements.smooth_diorite_stairs", "Smooth Diorite Stairs");
        translationBuilder.add("item.enhancements.smooth_diorite_slab", "Smooth Diorite Slab");
        translationBuilder.add("item.enhancements.diorite_bricks", "Diorite Bricks");
        translationBuilder.add("item.enhancements.diorite_brick_stairs", "Diorite Brick Stairs");
        translationBuilder.add("item.enhancements.diorite_brick_slab", "Diorite Brick Slab");

        // Andesite Set
        translationBuilder.add("item.enhancements.cobbled_andesite", "Cobbled Andesite");
        translationBuilder.add("item.enhancements.cobbled_andesite_stairs", "Cobbled Andesite Stairs");
        translationBuilder.add("item.enhancements.cobbled_andesite_slab", "Cobbled Andesite Slab");
        translationBuilder.add("item.enhancements.smooth_andesite", "Smooth Andesite");
        translationBuilder.add("item.enhancements.smooth_andesite_stairs", "Smooth Andesite Stairs");
        translationBuilder.add("item.enhancements.smooth_andesite_slab", "Smooth Andesite Slab");
        translationBuilder.add("item.enhancements.andesite_bricks", "Andesite Bricks");
        translationBuilder.add("item.enhancements.andesite_brick_stairs", "Andesite Brick Stairs");
        translationBuilder.add("item.enhancements.andesite_brick_slab", "Andesite Brick Slab");

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

        // Hammer Set
        translationBuilder.add("item.enhancements.wooden_hammer", "Wooden Hammer");
        translationBuilder.add("item.enhancements.stone_hammer", "Stone Hammer");
        translationBuilder.add("item.enhancements.iron_hammer", "Iron Hammer");
        translationBuilder.add("item.enhancements.golden_hammer", "Golden Hammer");
        translationBuilder.add("item.enhancements.diamond_hammer", "Diamond Hammer");
        translationBuilder.add("item.enhancements.netherite_hammer", "Netherite Hammer");
    }
    
}
