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
        translationBuilder.add("vanilla-additions.item_group", "Vanilla Additions");

        translationBuilder.add("item.vanilla-additions.cobbled_granite", "Cobbled Granite");
        translationBuilder.add("item.vanilla-additions.cobbled_granite_stairs", "Cobbled Granite Stairs");
        translationBuilder.add("item.vanilla-additions.cobbled_granite_slab", "Cobbled Granite Slab");
        translationBuilder.add("item.vanilla-additions.smooth_granite", "Smooth Granite");
        translationBuilder.add("item.vanilla-additions.smooth_granite_stairs", "Smooth Granite Stairs");
        translationBuilder.add("item.vanilla-additions.smooth_granite_slab", "Smooth Granite Slab");
        translationBuilder.add("item.vanilla-additions.granite_bricks", "Granite Bricks");
        translationBuilder.add("item.vanilla-additions.granite_brick_stairs", "Granite Brick Stairs");
        translationBuilder.add("item.vanilla-additions.granite_brick_slab", "Granite Brick Slab");
    }
    
}
