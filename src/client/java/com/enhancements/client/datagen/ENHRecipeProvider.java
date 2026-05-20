package com.enhancements.client.datagen;

import java.util.concurrent.CompletableFuture;

import com.enhancements.registries.BlockRegistry;
import com.enhancements.registries.ItemRegistry;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class ENHRecipeProvider extends FabricRecipeProvider {

    public ENHRecipeProvider(FabricDataOutput output, CompletableFuture<Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public String getName() {
        return "EnhancementsRecipeProvider";
    }

    @Override
    protected RecipeProvider createRecipeProvider(Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                HolderLookup.RegistryLookup<Item> itemLookup = registries.lookupOrThrow(Registries.ITEM);

                // Granite Set
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_GRANITE_SLAB.asItem(), 6)
                    .pattern("ggg")
                    .define('g', BlockRegistry.COBBLED_GRANITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.COBBLED_GRANITE.asItem()), has(BlockRegistry.COBBLED_GRANITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_GRANITE_STAIRS.asItem(), 4)
                    .pattern("g  ")
                    .pattern("gg ")
                    .pattern("ggg")
                    .define('g', BlockRegistry.COBBLED_GRANITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.COBBLED_GRANITE.asItem()), has(BlockRegistry.COBBLED_GRANITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE_SLAB.asItem(), 6)
                    .pattern("sss")
                    .define('s', BlockRegistry.SMOOTH_GRANITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.SMOOTH_GRANITE.asItem()), has(BlockRegistry.SMOOTH_GRANITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE_STAIRS.asItem(), 4)
                    .pattern("s  ")
                    .pattern("ss ")
                    .pattern("sss")
                    .define('s', BlockRegistry.SMOOTH_GRANITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.SMOOTH_GRANITE.asItem()), has(BlockRegistry.SMOOTH_GRANITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICK_SLAB.asItem(), 6)
                    .pattern("ggg")
                    .define('g', BlockRegistry.GRANITE_BRICKS.asItem())
                    .unlockedBy(getHasName(BlockRegistry.GRANITE_BRICKS.asItem()), has(BlockRegistry.GRANITE_BRICKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICK_STAIRS.asItem(), 4)
                    .pattern("g  ")
                    .pattern("gg ")
                    .pattern("ggg")
                    .define('g', BlockRegistry.GRANITE_BRICKS.asItem())
                    .unlockedBy(getHasName(BlockRegistry.GRANITE_BRICKS.asItem()), has(BlockRegistry.GRANITE_BRICKS.asItem()))
                    .save(output);
                
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.GRANITE.asItem(), BlockRegistry.COBBLED_GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE.asItem(), BlockRegistry.COBBLED_GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICKS.asItem(), BlockRegistry.COBBLED_GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_GRANITE_SLAB.asItem(), BlockRegistry.COBBLED_GRANITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_GRANITE_STAIRS.asItem(), BlockRegistry.COBBLED_GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE_SLAB.asItem(), BlockRegistry.COBBLED_GRANITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE_STAIRS.asItem(), BlockRegistry.COBBLED_GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICK_SLAB.asItem(), BlockRegistry.COBBLED_GRANITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICK_STAIRS.asItem(), BlockRegistry.COBBLED_GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE_SLAB.asItem(), BlockRegistry.SMOOTH_GRANITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE_STAIRS.asItem(), BlockRegistry.SMOOTH_GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICK_SLAB.asItem(), BlockRegistry.GRANITE_BRICKS.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICK_STAIRS.asItem(), BlockRegistry.GRANITE_BRICKS.asItem());

                // Diorite Set
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_DIORITE_SLAB.asItem(), 6)
                    .pattern("ddd")
                    .define('d', BlockRegistry.COBBLED_DIORITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.COBBLED_DIORITE.asItem()), has(BlockRegistry.COBBLED_DIORITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_DIORITE_STAIRS.asItem(), 4)
                    .pattern("d  ")
                    .pattern("dd ")
                    .pattern("ddd")
                    .define('d', BlockRegistry.COBBLED_DIORITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.COBBLED_DIORITE.asItem()), has(BlockRegistry.COBBLED_DIORITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE_SLAB.asItem(), 6)
                    .pattern("sss")
                    .define('s', BlockRegistry.SMOOTH_DIORITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.SMOOTH_DIORITE.asItem()), has(BlockRegistry.SMOOTH_DIORITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE_STAIRS.asItem(), 4)
                    .pattern("s  ")
                    .pattern("ss ")
                    .pattern("sss")
                    .define('s', BlockRegistry.SMOOTH_DIORITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.SMOOTH_DIORITE.asItem()), has(BlockRegistry.SMOOTH_DIORITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICK_SLAB.asItem(), 6)
                    .pattern("ddd")
                    .define('d', BlockRegistry.DIORITE_BRICKS.asItem())
                    .unlockedBy(getHasName(BlockRegistry.DIORITE_BRICKS.asItem()), has(BlockRegistry.DIORITE_BRICKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICK_STAIRS.asItem(), 4)
                    .pattern("d  ")
                    .pattern("dd ")
                    .pattern("ddd")
                    .define('d', BlockRegistry.DIORITE_BRICKS.asItem())
                    .unlockedBy(getHasName(BlockRegistry.DIORITE_BRICKS.asItem()), has(BlockRegistry.DIORITE_BRICKS.asItem()))
                    .save(output);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.DIORITE.asItem(), BlockRegistry.COBBLED_DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE.asItem(), BlockRegistry.COBBLED_DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICKS.asItem(), BlockRegistry.COBBLED_DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_DIORITE_SLAB.asItem(), BlockRegistry.COBBLED_DIORITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_DIORITE_STAIRS.asItem(), BlockRegistry.COBBLED_DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE_SLAB.asItem(), BlockRegistry.COBBLED_DIORITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE_STAIRS.asItem(), BlockRegistry.COBBLED_DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICK_SLAB.asItem(), BlockRegistry.COBBLED_DIORITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICK_STAIRS.asItem(), BlockRegistry.COBBLED_DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE_SLAB.asItem(), BlockRegistry.SMOOTH_DIORITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE_STAIRS.asItem(), BlockRegistry.SMOOTH_DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICK_SLAB.asItem(), BlockRegistry.DIORITE_BRICKS.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICK_STAIRS.asItem(), BlockRegistry.DIORITE_BRICKS.asItem());

                // Andesite Set
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_ANDESITE_SLAB.asItem(), 6)
                    .pattern("aaa")
                    .define('a', BlockRegistry.COBBLED_ANDESITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.COBBLED_ANDESITE.asItem()), has(BlockRegistry.COBBLED_ANDESITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_ANDESITE_STAIRS.asItem(), 4)
                    .pattern("a  ")
                    .pattern("aa ")
                    .pattern("aaa")
                    .define('a', BlockRegistry.COBBLED_ANDESITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.COBBLED_ANDESITE.asItem()), has(BlockRegistry.COBBLED_ANDESITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE_SLAB.asItem(), 6)
                    .pattern("sss")
                    .define('s', BlockRegistry.SMOOTH_ANDESITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.SMOOTH_ANDESITE.asItem()), has(BlockRegistry.SMOOTH_ANDESITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE_STAIRS.asItem(), 4)
                    .pattern("s  ")
                    .pattern("ss ")
                    .pattern("sss")
                    .define('s', BlockRegistry.SMOOTH_ANDESITE.asItem())
                    .unlockedBy(getHasName(BlockRegistry.SMOOTH_ANDESITE.asItem()), has(BlockRegistry.SMOOTH_ANDESITE.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICK_SLAB.asItem(), 6)
                    .pattern("aaa")
                    .define('a', BlockRegistry.ANDESITE_BRICKS.asItem())
                    .unlockedBy(getHasName(BlockRegistry.ANDESITE_BRICKS.asItem()), has(BlockRegistry.ANDESITE_BRICKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICK_STAIRS.asItem(), 4)
                    .pattern("a  ")
                    .pattern("aa ")
                    .pattern("aaa")
                    .define('a', BlockRegistry.ANDESITE_BRICKS.asItem())
                    .unlockedBy(getHasName(BlockRegistry.ANDESITE_BRICKS.asItem()), has(BlockRegistry.ANDESITE_BRICKS.asItem()))
                    .save(output);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, Blocks.ANDESITE.asItem(), BlockRegistry.COBBLED_ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE.asItem(), BlockRegistry.COBBLED_ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICKS.asItem(), BlockRegistry.COBBLED_ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_ANDESITE_SLAB.asItem(), BlockRegistry.COBBLED_ANDESITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_ANDESITE_STAIRS.asItem(), BlockRegistry.COBBLED_ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE_SLAB.asItem(), BlockRegistry.COBBLED_ANDESITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE_STAIRS.asItem(), BlockRegistry.COBBLED_ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICK_SLAB.asItem(), BlockRegistry.COBBLED_ANDESITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICK_STAIRS.asItem(), BlockRegistry.COBBLED_ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE_SLAB.asItem(), BlockRegistry.SMOOTH_ANDESITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE_STAIRS.asItem(), BlockRegistry.SMOOTH_ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICK_SLAB.asItem(), BlockRegistry.ANDESITE_BRICKS.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICK_STAIRS.asItem(), BlockRegistry.ANDESITE_BRICKS.asItem());

                // Log Stack Set
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.OAK_LOG_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.OAK_LOG.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.OAK_LOG.asItem()), has(Blocks.OAK_LOG.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.BIRCH_LOG_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.BIRCH_LOG.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.BIRCH_LOG.asItem()), has(Blocks.BIRCH_LOG.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SPRUCE_LOG_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.SPRUCE_LOG.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.SPRUCE_LOG.asItem()), has(Blocks.SPRUCE_LOG.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.JUNGLE_LOG_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.JUNGLE_LOG.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.JUNGLE_LOG.asItem()), has(Blocks.JUNGLE_LOG.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ACACIA_LOG_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.ACACIA_LOG.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.ACACIA_LOG.asItem()), has(Blocks.ACACIA_LOG.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DARK_OAK_LOG_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.DARK_OAK_LOG.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.DARK_OAK_LOG.asItem()), has(Blocks.DARK_OAK_LOG.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.CHERRY_LOG_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.CHERRY_LOG.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.CHERRY_LOG.asItem()), has(Blocks.CHERRY_LOG.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.MANGROVE_LOG_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.MANGROVE_LOG.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.MANGROVE_LOG.asItem()), has(Blocks.MANGROVE_LOG.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.PALE_OAK_LOG_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.PALE_OAK_LOG.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.PALE_OAK_LOG.asItem()), has(Blocks.PALE_OAK_LOG.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.BAMBOO_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.BAMBOO_BLOCK.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.BAMBOO_BLOCK.asItem()), has(Blocks.BAMBOO_BLOCK.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.CRIMSON_STEM_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.CRIMSON_STEM.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.CRIMSON_STEM.asItem()), has(Blocks.CRIMSON_STEM.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.WARPED_STEM_STACK.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', Blocks.WARPED_STEM.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.WARPED_STEM.asItem()), has(Blocks.WARPED_STEM.asItem()))
                    .save(output);

                // Crate Set
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.OAK_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.OAK_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.OAK_PLANKS.asItem()), has(Blocks.OAK_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.BIRCH_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.BIRCH_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.BIRCH_PLANKS.asItem()), has(Blocks.BIRCH_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SPRUCE_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.SPRUCE_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.SPRUCE_PLANKS.asItem()), has(Blocks.SPRUCE_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.JUNGLE_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.JUNGLE_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS.asItem()), has(Blocks.JUNGLE_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ACACIA_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.ACACIA_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.ACACIA_PLANKS.asItem()), has(Blocks.ACACIA_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DARK_OAK_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.DARK_OAK_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS.asItem()), has(Blocks.DARK_OAK_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.CHERRY_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.CHERRY_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.CHERRY_PLANKS.asItem()), has(Blocks.CHERRY_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.MANGROVE_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.MANGROVE_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS.asItem()), has(Blocks.MANGROVE_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.PALE_OAK_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.PALE_OAK_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.PALE_OAK_PLANKS.asItem()), has(Blocks.PALE_OAK_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.BAMBOO_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.BAMBOO_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.BAMBOO_PLANKS.asItem()), has(Blocks.BAMBOO_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.CRIMSON_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.CRIMSON_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS.asItem()), has(Blocks.CRIMSON_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.WARPED_CRATE.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', Blocks.WARPED_PLANKS.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(Blocks.WARPED_PLANKS.asItem()), has(Blocks.WARPED_PLANKS.asItem()))
                    .save(output);

                // Sandstone Set
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_SANDSTONE.asItem(), Blocks.SANDSTONE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_RED_SANDSTONE.asItem(), Blocks.RED_SANDSTONE.asItem());

                // Reinforced Planks Set
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_OAK_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.OAK_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.OAK_PLANKS.asItem()), has(Blocks.OAK_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_BIRCH_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.BIRCH_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.BIRCH_PLANKS.asItem()), has(Blocks.BIRCH_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_SPRUCE_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.SPRUCE_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.SPRUCE_PLANKS.asItem()), has(Blocks.SPRUCE_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_JUNGLE_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.JUNGLE_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.JUNGLE_PLANKS.asItem()), has(Blocks.JUNGLE_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_ACACIA_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.ACACIA_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.ACACIA_PLANKS.asItem()), has(Blocks.ACACIA_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_DARK_OAK_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.DARK_OAK_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.DARK_OAK_PLANKS.asItem()), has(Blocks.DARK_OAK_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_CHERRY_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.CHERRY_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.CHERRY_PLANKS.asItem()), has(Blocks.CHERRY_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_MANGROVE_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.MANGROVE_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.MANGROVE_PLANKS.asItem()), has(Blocks.MANGROVE_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_PALE_OAK_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.PALE_OAK_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.PALE_OAK_PLANKS.asItem()), has(Blocks.PALE_OAK_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_BAMBOO_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.BAMBOO_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.BAMBOO_PLANKS.asItem()), has(Blocks.BAMBOO_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_CRIMSON_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.CRIMSON_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.CRIMSON_PLANKS.asItem()), has(Blocks.CRIMSON_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.REINFORCED_WARPED_PLANKS.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', Blocks.WARPED_PLANKS.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.WARPED_PLANKS.asItem()), has(Blocks.WARPED_PLANKS.asItem()))
                    .save(output);

                // Hammer Set
                shaped(RecipeCategory.TOOLS, ItemRegistry.WOODEN_HAMMER, 1)
                    .pattern("ppp")
                    .pattern("psp")
                    .pattern(" s ")
                    .define('p', ItemTags.PLANKS)
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.OAK_PLANKS.asItem()), has(Blocks.OAK_PLANKS.asItem()))
                    .save(output);
                shaped(RecipeCategory.TOOLS, ItemRegistry.STONE_HAMMER, 1)
                    .pattern("ccc")
                    .pattern("csc")
                    .pattern(" s ")
                    .define('c', Items.COBBLESTONE)
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Blocks.COBBLESTONE.asItem()), has(Blocks.COBBLESTONE.asItem()))
                    .save(output);
                shaped(RecipeCategory.TOOLS, ItemRegistry.IRON_HAMMER, 1)
                    .pattern("iii")
                    .pattern("isi")
                    .pattern(" s ")
                    .define('i', Items.IRON_INGOT)
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                    .save(output);
                shaped(RecipeCategory.TOOLS, ItemRegistry.GOLDEN_HAMMER, 1)
                    .pattern("ggg")
                    .pattern("gsg")
                    .pattern(" s ")
                    .define('g', Items.GOLD_INGOT)
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Items.GOLD_INGOT.asItem()), has(Items.GOLD_INGOT.asItem()))
                    .save(output);
                shaped(RecipeCategory.TOOLS, ItemRegistry.DIAMOND_HAMMER, 1)
                    .pattern("ddd")
                    .pattern("dsd")
                    .pattern(" s ")
                    .define('d', Items.DIAMOND)
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(Items.DIAMOND.asItem()), has(Items.DIAMOND.asItem()))
                    .save(output);

                netheriteSmithing(ItemRegistry.DIAMOND_HAMMER, RecipeCategory.TOOLS, ItemRegistry.NETHERITE_HAMMER);
            }
        };
    }
    
}
