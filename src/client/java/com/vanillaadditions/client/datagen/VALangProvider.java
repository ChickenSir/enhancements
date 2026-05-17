package com.vanillaadditions.client.datagen;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup.Provider;

public class VALangProvider extends FabricLanguageProvider {

    protected VALangProvider(FabricDataOutput dataOutput, CompletableFuture<Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(Provider registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("vanilla-additions.item_group", "Vanilla Additions");

        translationBuilder.add("item.vanilla-additions.cobbled_granite", "Cobbled Granite");
        translationBuilder.add("item.vanilla-additions.cobbled_granite_stairs", "Cobbled Granite Stairs");
        translationBuilder.add("item.vanilla-additions.cobbled_granite_slab", "Cobbled Granite Slab");
    }
    
}
