package com.enhancements.client.datagen;

import java.util.concurrent.CompletableFuture;

import com.enhancements.registries.TagRegistry;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ENHItemTagProvider extends FabricTagProvider<Item> {

    public ENHItemTagProvider(FabricDataOutput output, CompletableFuture<Provider> registriesFuture) {
        super(output, Registries.ITEM, registriesFuture);
    }

    @Override
    protected void addTags(Provider wrapperLookup) {
        getOrCreateTagBuilder(TagRegistry.BLOCK_CANNON_ITEM_AMMO)
            .add(Items.WATER_BUCKET)
            .add(Items.LAVA_BUCKET)
            .add(Items.POWDER_SNOW_BUCKET);
    }
    
}
