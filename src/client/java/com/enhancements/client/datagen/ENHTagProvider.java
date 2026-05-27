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
            .add(BlockRegistry.SMOOTH_GRANITE_STAIRS)
            .add(BlockRegistry.GRANITE_BRICK_STAIRS)
            .add(BlockRegistry.SMOOTH_DIORITE_STAIRS)
            .add(BlockRegistry.DIORITE_BRICK_STAIRS)
            .add(BlockRegistry.SMOOTH_ANDESITE_STAIRS)
            .add(BlockRegistry.ANDESITE_BRICK_STAIRS)
            .add(BlockRegistry.COBBLESTONE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
            .add(BlockRegistry.SMOOTH_GRANITE_SLAB)
            .add(BlockRegistry.GRANITE_BRICK_SLAB)
            .add(BlockRegistry.SMOOTH_DIORITE_STAIRS)
            .add(BlockRegistry.DIORITE_BRICK_STAIRS)
            .add(BlockRegistry.SMOOTH_ANDESITE_STAIRS)
            .add(BlockRegistry.ANDESITE_BRICK_STAIRS)
            .add(BlockRegistry.COBBLESTONE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.WALLS)
            .add(BlockRegistry.SMOOTH_GRANITE_WALL)
            .add(BlockRegistry.GRANITE_BRICK_WALL)
            .add(BlockRegistry.SMOOTH_DIORITE_WALL)
            .add(BlockRegistry.DIORITE_BRICK_WALL)
            .add(BlockRegistry.SMOOTH_ANDESITE_WALL)
            .add(BlockRegistry.ANDESITE_BRICK_WALL)
            .add(BlockRegistry.COBBLESTONE_BRICK_WALL);
    }
    
}
