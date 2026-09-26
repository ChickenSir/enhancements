package com.enhancements.client.datagen;

import java.util.concurrent.CompletableFuture;

import com.enhancements.registries.ItemRegistry;
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

        getOrCreateTagBuilder(TagRegistry.CUSHION)
            .add(ItemRegistry.RED_CUSHION)
            .add(ItemRegistry.BLUE_CUSHION)
            .add(ItemRegistry.YELLOW_CUSHION)
            .add(ItemRegistry.GREEN_CUSHION)
            .add(ItemRegistry.LIME_CUSHION)
            .add(ItemRegistry.CYAN_CUSHION)
            .add(ItemRegistry.LIGHT_BLUE_CUSHION)
            .add(ItemRegistry.ORANGE_CUSHION)
            .add(ItemRegistry.MAGENTA_CUSHION)
            .add(ItemRegistry.PURPLE_CUSHION)
            .add(ItemRegistry.PINK_CUSHION)
            .add(ItemRegistry.BROWN_CUSHION)
            .add(ItemRegistry.LIGHT_GRAY_CUSHION)
            .add(ItemRegistry.GRAY_CUSHION)
            .add(ItemRegistry.BLACK_CUSHION)
            .add(ItemRegistry.WHITE_CUSHION);
    }
    
}
