package com.vanillaadditions.registries;

import java.util.function.Function;

import com.vanillaadditions.VanillaAdditions;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class BlockRegistry {

    // Granite Set
    public static final Block COBBLED_GRANITE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE), "cobbled_granite", true);
    public static final Block COBBLED_GRANITE_STAIRS = registerStair(COBBLED_GRANITE, "cobbled_granite_stairs");
    public static final Block COBBLED_GRANITE_SLAB = register(SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB), "cobbled_granite_slab", true);

    public static final Block SMOOTH_GRANITE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE), "smooth_granite", true);
    public static final Block SMOOTH_GRANITE_STAIRS = registerStair(SMOOTH_GRANITE, "smooth_granite_stairs");
    public static final Block SMOOTH_GRANITE_SLAB = register(SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB), "smooth_granite_slab", true);
    
    public static Block register(Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, String name, boolean registerItem) {
        // Create block resource key
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(VanillaAdditions.modID, name));

        Block block = blockFactory.apply(settings.setId(blockKey));

        if (registerItem) {
            // Create item resource key
            ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(VanillaAdditions.modID, name));

            // Create block item
            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey));

            // Register block item
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }

        // Register block
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    public static Block registerStair(Block block, String name) {
        // Register stair block
        return register((properties) -> new StairBlock(block.defaultBlockState(), properties), Properties.ofFullCopy(block), name, true);
    }

    public static void registerBlocks() {}
}
