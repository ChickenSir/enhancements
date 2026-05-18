package com.enhancements.registries;

import java.util.function.Function;

import com.enhancements.Enhancements;
import com.enhancements.block.LogStackBlock;

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
import net.minecraft.world.level.block.SoundType;
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

    public static final Block GRANITE_BRICKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE), "granite_bricks", true);
    public static final Block GRANITE_BRICK_STAIRS = registerStair(GRANITE_BRICKS, "granite_brick_stairs");
    public static final Block GRANITE_BRICK_SLAB = register(SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GRANITE_SLAB), "granite_brick_slab", true);

    // Diorite Set
    public static final Block COBBLED_DIORITE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE), "cobbled_diorite", true);
    public static final Block COBBLED_DIORITE_STAIRS = registerStair(COBBLED_DIORITE, "cobbled_diorite_stairs");
    public static final Block COBBLED_DIORITE_SLAB = register(SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE_SLAB), "cobbled_diorite_slab", true);

    public static final Block SMOOTH_DIORITE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE), "smooth_diorite", true);
    public static final Block SMOOTH_DIORITE_STAIRS = registerStair(SMOOTH_DIORITE, "smooth_diorite_stairs");
    public static final Block SMOOTH_DIORITE_SLAB = register(SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE_SLAB), "smooth_diorite_slab", true);

    public static final Block DIORITE_BRICKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE), "diorite_bricks", true);
    public static final Block DIORITE_BRICK_STAIRS = registerStair(DIORITE_BRICKS, "diorite_brick_stairs");
    public static final Block DIORITE_BRICK_SLAB = register(SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.DIORITE_SLAB), "diorite_brick_slab", true);

    // Andesite Set
    public static final Block COBBLED_ANDESITE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE), "cobbled_andesite", true);
    public static final Block COBBLED_ANDESITE_STAIRS = registerStair(COBBLED_ANDESITE, "cobbled_andesite_stairs");
    public static final Block COBBLED_ANDESITE_SLAB = register(SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE_SLAB), "cobbled_andesite_slab", true);

    public static final Block SMOOTH_ANDESITE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE), "smooth_andesite", true);
    public static final Block SMOOTH_ANDESITE_STAIRS = registerStair(SMOOTH_ANDESITE, "smooth_andesite_stairs");
    public static final Block SMOOTH_ANDESITE_SLAB = register(SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE_SLAB), "smooth_andesite_slab", true);

    public static final Block ANDESITE_BRICKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE), "andesite_bricks", true);
    public static final Block ANDESITE_BRICK_STAIRS = registerStair(ANDESITE_BRICKS, "andesite_brick_stairs");
    public static final Block ANDESITE_BRICK_SLAB = register(SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE_SLAB), "andesite_brick_slab", true);

    // Log Stack Set
    public static final Block OAK_LOG_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion(), "oak_log_stack", true);
    public static final Block BIRCH_LOG_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).noOcclusion(), "birch_log_stack", true);
    public static final Block SPRUCE_LOG_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).noOcclusion(), "spruce_log_stack", true);
    public static final Block JUNGLE_LOG_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).noOcclusion(), "jungle_log_stack", true);
    public static final Block ACACIA_LOG_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).noOcclusion(), "acacia_log_stack", true);
    public static final Block DARK_OAK_LOG_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).noOcclusion(), "dark_oak_log_stack", true);
    public static final Block CHERRY_LOG_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).noOcclusion(), "cherry_log_stack", true);
    public static final Block MANGROVE_LOG_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).noOcclusion(), "mangrove_log_stack", true);
    public static final Block PALE_OAK_LOG_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS).noOcclusion(), "pale_oak_log_stack", true);
    public static final Block BAMBOO_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS).noOcclusion(), "bamboo_stack", true);
    public static final Block CRIMSON_STEM_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion(), "crimson_stem_stack", true);
    public static final Block WARPED_STEM_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion(), "warped_stem_stack", true);

    // Crate Set
    public static final Block OAK_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).sound(SoundType.STONE), "oak_crate", true);
    public static final Block BIRCH_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS).sound(SoundType.STONE), "birch_crate", true);
    public static final Block SPRUCE_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS).sound(SoundType.STONE), "spruce_crate", true);
    public static final Block JUNGLE_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS).sound(SoundType.STONE), "jungle_crate", true);
    public static final Block ACACIA_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS).sound(SoundType.STONE), "acacia_crate", true);
    public static final Block DARK_OAK_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS).sound(SoundType.STONE), "dark_oak_crate", true);
    public static final Block CHERRY_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS).sound(SoundType.STONE), "cherry_crate", true);
    public static final Block MANGROVE_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS).sound(SoundType.STONE), "mangrove_crate", true);
    public static final Block PALE_OAK_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS).sound(SoundType.STONE), "pale_oak_crate", true);
    public static final Block BAMBOO_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS).sound(SoundType.STONE), "bamboo_crate", true);
    public static final Block CRIMSON_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).sound(SoundType.STONE), "crimson_crate", true);
    public static final Block WARPED_CRATE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).sound(SoundType.STONE), "warped_crate", true);
    
    public static Block register(Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, String name, boolean registerItem) {
        // Create block resource key
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Enhancements.modID, name));

        Block block = blockFactory.apply(settings.setId(blockKey));

        if (registerItem) {
            // Create item resource key
            ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Enhancements.modID, name));

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
