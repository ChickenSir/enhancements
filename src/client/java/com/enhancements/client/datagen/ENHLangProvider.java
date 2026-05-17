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

        translationBuilder.add("item.enhancements.cobbled_granite", "Cobbled Granite");
        translationBuilder.add("item.enhancements.cobbled_granite_stairs", "Cobbled Granite Stairs");
        translationBuilder.add("item.enhancements.cobbled_granite_slab", "Cobbled Granite Slab");
        translationBuilder.add("item.enhancements.smooth_granite", "Smooth Granite");
        translationBuilder.add("item.enhancements.smooth_granite_stairs", "Smooth Granite Stairs");
        translationBuilder.add("item.enhancements.smooth_granite_slab", "Smooth Granite Slab");
        translationBuilder.add("item.enhancements.granite_bricks", "Granite Bricks");
        translationBuilder.add("item.enhancements.granite_brick_stairs", "Granite Brick Stairs");
        translationBuilder.add("item.enhancements.granite_brick_slab", "Granite Brick Slab");
    }
    
}
