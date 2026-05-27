package com.enhancements.client.datagen;

import java.util.concurrent.CompletableFuture;

import com.enhancements.registries.BlockRegistry;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

public class ENHTagProvider extends FabricTagProvider<Block> {

    public ENHTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, Registries.BLOCK, registriesFuture);
    }

    @Override
    protected void addTags(Provider wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.STAIRS)
            .add(BlockRegistry.COBBLED_GRANITE_STAIRS)
            .add(BlockRegistry.COBBLED_DIORITE_STAIRS)
            .add(BlockRegistry.COBBLED_ANDESITE_STAIRS)
            .add(BlockRegistry.COBBLESTONE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
            .add(BlockRegistry.COBBLED_GRANITE_SLAB)
            .add(BlockRegistry.COBBLED_DIORITE_SLAB)
            .add(BlockRegistry.COBBLED_ANDESITE_SLAB)
            .add(BlockRegistry.COBBLESTONE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(BlockRegistry.COBBLESTONE_BRICK_WALL);
    }
    
}
