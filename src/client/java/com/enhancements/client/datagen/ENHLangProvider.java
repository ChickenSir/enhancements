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
    }
    
}
