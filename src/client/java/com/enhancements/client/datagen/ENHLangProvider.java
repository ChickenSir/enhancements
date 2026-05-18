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
    }
    
}
