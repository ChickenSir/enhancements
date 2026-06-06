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
import net.minecraft.world.level.block.Block;
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
                createStairRecipe(BlockRegistry.SMOOTH_GRANITE, BlockRegistry.SMOOTH_GRANITE_STAIRS);
                createStairRecipe(BlockRegistry.GRANITE_BRICKS, BlockRegistry.GRANITE_BRICK_STAIRS);

                createSlabRecipe(BlockRegistry.SMOOTH_GRANITE, BlockRegistry.SMOOTH_GRANITE_SLAB);
                createSlabRecipe(BlockRegistry.GRANITE_BRICKS, BlockRegistry.GRANITE_BRICK_SLAB);
                
                createWallRecipe(BlockRegistry.SMOOTH_GRANITE, BlockRegistry.SMOOTH_GRANITE_WALL);
                createWallRecipe(BlockRegistry.GRANITE_BRICKS, BlockRegistry.GRANITE_BRICK_WALL);
                
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE.asItem(), Blocks.GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICKS.asItem(), Blocks.GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_GRANITE_SLAB.asItem(), Blocks.GRANITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_GRANITE_STAIRS.asItem(), Blocks.GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE_SLAB.asItem(), Blocks.GRANITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE_STAIRS.asItem(), Blocks.GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICK_SLAB.asItem(), Blocks.GRANITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICK_STAIRS.asItem(), Blocks.GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE_SLAB.asItem(), BlockRegistry.SMOOTH_GRANITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_GRANITE_STAIRS.asItem(), BlockRegistry.SMOOTH_GRANITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICK_SLAB.asItem(), BlockRegistry.GRANITE_BRICKS.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.GRANITE_BRICK_STAIRS.asItem(), BlockRegistry.GRANITE_BRICKS.asItem());

                // Diorite Set
                createStairRecipe(BlockRegistry.SMOOTH_DIORITE, BlockRegistry.SMOOTH_DIORITE_STAIRS);
                createStairRecipe(BlockRegistry.DIORITE_BRICKS, BlockRegistry.DIORITE_BRICK_STAIRS);

                createSlabRecipe(BlockRegistry.SMOOTH_DIORITE, BlockRegistry.SMOOTH_DIORITE_SLAB);
                createSlabRecipe(BlockRegistry.DIORITE_BRICKS, BlockRegistry.DIORITE_BRICK_SLAB);

                createWallRecipe(BlockRegistry.SMOOTH_DIORITE, BlockRegistry.SMOOTH_DIORITE_WALL);
                createWallRecipe(BlockRegistry.DIORITE_BRICKS, BlockRegistry.DIORITE_BRICK_WALL);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE.asItem(), Blocks.DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICKS.asItem(), Blocks.DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_DIORITE_SLAB.asItem(), Blocks.DIORITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_DIORITE_STAIRS.asItem(), Blocks.DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE_SLAB.asItem(), Blocks.DIORITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE_STAIRS.asItem(), Blocks.DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICK_SLAB.asItem(), Blocks.DIORITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICK_STAIRS.asItem(), Blocks.DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE_SLAB.asItem(), BlockRegistry.SMOOTH_DIORITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_DIORITE_STAIRS.asItem(), BlockRegistry.SMOOTH_DIORITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICK_SLAB.asItem(), BlockRegistry.DIORITE_BRICKS.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.DIORITE_BRICK_STAIRS.asItem(), BlockRegistry.DIORITE_BRICKS.asItem());

                // Andesite Set
                createStairRecipe(BlockRegistry.SMOOTH_ANDESITE, BlockRegistry.SMOOTH_ANDESITE_STAIRS);
                createStairRecipe(BlockRegistry.ANDESITE_BRICKS, BlockRegistry.ANDESITE_BRICK_STAIRS);

                createSlabRecipe(BlockRegistry.SMOOTH_ANDESITE, BlockRegistry.SMOOTH_ANDESITE_SLAB);
                createSlabRecipe(BlockRegistry.ANDESITE_BRICKS, BlockRegistry.ANDESITE_BRICK_SLAB);

                createWallRecipe(BlockRegistry.SMOOTH_ANDESITE, BlockRegistry.SMOOTH_ANDESITE_WALL);
                createWallRecipe(BlockRegistry.ANDESITE_BRICKS, BlockRegistry.ANDESITE_BRICK_WALL);

                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE.asItem(), Blocks.ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICKS.asItem(), Blocks.ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_ANDESITE_SLAB.asItem(), Blocks.ANDESITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_ANDESITE_STAIRS.asItem(), Blocks.ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE_SLAB.asItem(), Blocks.ANDESITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE_STAIRS.asItem(), Blocks.ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICK_SLAB.asItem(), Blocks.ANDESITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICK_STAIRS.asItem(), Blocks.ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE_SLAB.asItem(), BlockRegistry.SMOOTH_ANDESITE.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SMOOTH_ANDESITE_STAIRS.asItem(), BlockRegistry.SMOOTH_ANDESITE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICK_SLAB.asItem(), BlockRegistry.ANDESITE_BRICKS.asItem(), 2);
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ANDESITE_BRICK_STAIRS.asItem(), BlockRegistry.ANDESITE_BRICKS.asItem());

                // Log Stack Set
                createLogStackRecipe(Blocks.OAK_LOG, BlockRegistry.OAK_LOG_STACK);
                createLogStackRecipe(Blocks.BIRCH_LOG, BlockRegistry.BIRCH_LOG_STACK);
                createLogStackRecipe(Blocks.SPRUCE_LOG, BlockRegistry.SPRUCE_LOG_STACK);
                createLogStackRecipe(Blocks.JUNGLE_LOG, BlockRegistry.JUNGLE_LOG_STACK);
                createLogStackRecipe(Blocks.ACACIA_LOG, BlockRegistry.ACACIA_LOG_STACK);
                createLogStackRecipe(Blocks.DARK_OAK_LOG, BlockRegistry.DARK_OAK_LOG_STACK);
                createLogStackRecipe(Blocks.CHERRY_LOG, BlockRegistry.CHERRY_LOG_STACK);
                createLogStackRecipe(Blocks.MANGROVE_LOG, BlockRegistry.MANGROVE_LOG_STACK);
                createLogStackRecipe(Blocks.PALE_OAK_LOG, BlockRegistry.PALE_OAK_LOG_STACK);
                createLogStackRecipe(Blocks.BAMBOO_BLOCK, BlockRegistry.BAMBOO_STACK);
                createLogStackRecipe(Blocks.CRIMSON_STEM, BlockRegistry.CRIMSON_STEM_STACK);
                createLogStackRecipe(Blocks.WARPED_STEM, BlockRegistry.WARPED_STEM_STACK);

                // Crate Set
                createCrateRecipe(Blocks.OAK_PLANKS, BlockRegistry.OAK_CRATE);
                createCrateRecipe(Blocks.BIRCH_PLANKS, BlockRegistry.BIRCH_CRATE);
                createCrateRecipe(Blocks.SPRUCE_PLANKS, BlockRegistry.SPRUCE_CRATE);
                createCrateRecipe(Blocks.JUNGLE_PLANKS, BlockRegistry.JUNGLE_CRATE);
                createCrateRecipe(Blocks.ACACIA_PLANKS, BlockRegistry.ACACIA_CRATE);
                createCrateRecipe(Blocks.DARK_OAK_PLANKS, BlockRegistry.DARK_OAK_CRATE);
                createCrateRecipe(Blocks.CHERRY_PLANKS, BlockRegistry.CHERRY_CRATE);
                createCrateRecipe(Blocks.MANGROVE_PLANKS, BlockRegistry.MANGROVE_CRATE);
                createCrateRecipe(Blocks.PALE_OAK_PLANKS, BlockRegistry.PALE_OAK_CRATE);
                createCrateRecipe(Blocks.BAMBOO_PLANKS, BlockRegistry.BAMBOO_CRATE);
                createCrateRecipe(Blocks.CRIMSON_PLANKS, BlockRegistry.CRIMSON_CRATE);
                createCrateRecipe(Blocks.WARPED_PLANKS, BlockRegistry.WARPED_CRATE);

                // Sandstone Set
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_SANDSTONE.asItem(), Blocks.SANDSTONE.asItem());
                stonecutterResultFromBase(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.COBBLED_RED_SANDSTONE.asItem(), Blocks.RED_SANDSTONE.asItem());

                // Reinforced Planks Set
                createReinforcedPlanksRecipe(Blocks.OAK_PLANKS, BlockRegistry.REINFORCED_OAK_PLANKS);
                createReinforcedPlanksRecipe(Blocks.BIRCH_PLANKS, BlockRegistry.REINFORCED_BIRCH_PLANKS);
                createReinforcedPlanksRecipe(Blocks.SPRUCE_PLANKS, BlockRegistry.REINFORCED_SPRUCE_PLANKS);
                createReinforcedPlanksRecipe(Blocks.JUNGLE_PLANKS, BlockRegistry.REINFORCED_JUNGLE_PLANKS);
                createReinforcedPlanksRecipe(Blocks.ACACIA_PLANKS, BlockRegistry.REINFORCED_ACACIA_PLANKS);
                createReinforcedPlanksRecipe(Blocks.DARK_OAK_PLANKS, BlockRegistry.REINFORCED_DARK_OAK_PLANKS);
                createReinforcedPlanksRecipe(Blocks.CHERRY_PLANKS, BlockRegistry.REINFORCED_CHERRY_PLANKS);
                createReinforcedPlanksRecipe(Blocks.MANGROVE_PLANKS, BlockRegistry.REINFORCED_MANGROVE_PLANKS);
                createReinforcedPlanksRecipe(Blocks.PALE_OAK_PLANKS, BlockRegistry.REINFORCED_PALE_OAK_PLANKS);
                createReinforcedPlanksRecipe(Blocks.BAMBOO_PLANKS, BlockRegistry.REINFORCED_BAMBOO_PLANKS);
                createReinforcedPlanksRecipe(Blocks.CRIMSON_PLANKS, BlockRegistry.REINFORCED_CRIMSON_PLANKS);
                createReinforcedPlanksRecipe(Blocks.WARPED_PLANKS, BlockRegistry.REINFORCED_WARPED_PLANKS);

                // Chair Set
                createChairRecipe(Blocks.OAK_PLANKS, BlockRegistry.OAK_CHAIR);
                createChairRecipe(Blocks.BIRCH_PLANKS, BlockRegistry.BIRCH_CHAIR);
                createChairRecipe(Blocks.SPRUCE_PLANKS, BlockRegistry.SPRUCE_CHAIR);
                createChairRecipe(Blocks.JUNGLE_PLANKS, BlockRegistry.JUNGLE_CHAIR);
                createChairRecipe(Blocks.ACACIA_PLANKS, BlockRegistry.ACACIA_CHAIR);
                createChairRecipe(Blocks.DARK_OAK_PLANKS, BlockRegistry.DARK_OAK_CHAIR);
                createChairRecipe(Blocks.CHERRY_PLANKS, BlockRegistry.CHERRY_CHAIR);
                createChairRecipe(Blocks.MANGROVE_PLANKS, BlockRegistry.MANGROVE_CHAIR);
                createChairRecipe(Blocks.PALE_OAK_PLANKS, BlockRegistry.PALE_OAK_CHAIR);
                createChairRecipe(Blocks.BAMBOO_PLANKS, BlockRegistry.BAMBOO_CHAIR);
                createChairRecipe(Blocks.CRIMSON_PLANKS, BlockRegistry.CRIMSON_CHAIR);
                createChairRecipe(Blocks.WARPED_PLANKS, BlockRegistry.WARPED_CHAIR);

                // Arm Chair Set
                createArmChairRecipe(Blocks.OAK_PLANKS, BlockRegistry.OAK_ARMCHAIR);
                createArmChairRecipe(Blocks.BIRCH_PLANKS, BlockRegistry.BIRCH_ARMCHAIR);
                createArmChairRecipe(Blocks.SPRUCE_PLANKS, BlockRegistry.SPRUCE_ARMCHAIR);
                createArmChairRecipe(Blocks.JUNGLE_PLANKS, BlockRegistry.JUNGLE_ARMCHAIR);
                createArmChairRecipe(Blocks.ACACIA_PLANKS, BlockRegistry.ACACIA_ARMCHAIR);
                createArmChairRecipe(Blocks.DARK_OAK_PLANKS, BlockRegistry.DARK_OAK_ARMCHAIR);
                createArmChairRecipe(Blocks.CHERRY_PLANKS, BlockRegistry.CHERRY_ARMCHAIR);
                createArmChairRecipe(Blocks.MANGROVE_PLANKS, BlockRegistry.MANGROVE_ARMCHAIR);
                createArmChairRecipe(Blocks.PALE_OAK_PLANKS, BlockRegistry.PALE_OAK_ARMCHAIR);
                createArmChairRecipe(Blocks.BAMBOO_PLANKS, BlockRegistry.BAMBOO_ARMCHAIR);
                createArmChairRecipe(Blocks.CRIMSON_PLANKS, BlockRegistry.CRIMSON_ARMCHAIR);
                createArmChairRecipe(Blocks.WARPED_PLANKS, BlockRegistry.WARPED_ARMCHAIR);

                // Table Set
                createTableRecipe(Blocks.OAK_PLANKS, BlockRegistry.OAK_TABLE);
                createTableRecipe(Blocks.BIRCH_PLANKS, BlockRegistry.BIRCH_TABLE);
                createTableRecipe(Blocks.SPRUCE_PLANKS, BlockRegistry.SPRUCE_TABLE);
                createTableRecipe(Blocks.JUNGLE_PLANKS, BlockRegistry.JUNGLE_TABLE);
                createTableRecipe(Blocks.ACACIA_PLANKS, BlockRegistry.ACACIA_TABLE);
                createTableRecipe(Blocks.DARK_OAK_PLANKS, BlockRegistry.DARK_OAK_TABLE);
                createTableRecipe(Blocks.CHERRY_PLANKS, BlockRegistry.CHERRY_TABLE);
                createTableRecipe(Blocks.MANGROVE_PLANKS, BlockRegistry.MANGROVE_TABLE);
                createTableRecipe(Blocks.PALE_OAK_PLANKS, BlockRegistry.PALE_OAK_TABLE);
                createTableRecipe(Blocks.BAMBOO_PLANKS, BlockRegistry.BAMBOO_TABLE);
                createTableRecipe(Blocks.CRIMSON_PLANKS, BlockRegistry.CRIMSON_TABLE);
                createTableRecipe(Blocks.WARPED_PLANKS, BlockRegistry.WARPED_TABLE);

                // Table Cloth Set
                createTableClothRecipe(Blocks.RED_CARPET, BlockRegistry.RED_TABLE_CLOTH);
                createTableClothRecipe(Blocks.BLUE_CARPET, BlockRegistry.BLUE_TABLE_CLOTH);
                createTableClothRecipe(Blocks.YELLOW_CARPET, BlockRegistry.YELLOW_TABLE_CLOTH);
                createTableClothRecipe(Blocks.GREEN_CARPET, BlockRegistry.GREEN_TABLE_CLOTH);
                createTableClothRecipe(Blocks.LIME_CARPET, BlockRegistry.LIME_TABLE_CLOTH);
                createTableClothRecipe(Blocks.CYAN_CARPET, BlockRegistry.CYAN_TABLE_CLOTH);
                createTableClothRecipe(Blocks.LIGHT_BLUE_CARPET, BlockRegistry.LIGHT_BLUE_TABLE_CLOTH);
                createTableClothRecipe(Blocks.ORANGE_CARPET, BlockRegistry.ORANGE_TABLE_CLOTH);
                createTableClothRecipe(Blocks.PURPLE_CARPET, BlockRegistry.PURPLE_TABLE_CLOTH);
                createTableClothRecipe(Blocks.MAGENTA_CARPET, BlockRegistry.MAGENTA_TABLE_CLOTH);
                createTableClothRecipe(Blocks.PINK_CARPET, BlockRegistry.PINK_TABLE_CLOTH);
                createTableClothRecipe(Blocks.BROWN_CARPET, BlockRegistry.BROWN_TABLE_CLOTH);
                createTableClothRecipe(Blocks.LIGHT_GRAY_CARPET, BlockRegistry.LIGHT_GRAY_TABLE_CLOTH);
                createTableClothRecipe(Blocks.GRAY_CARPET, BlockRegistry.GRAY_TABLE_CLOTH);
                createTableClothRecipe(Blocks.BLACK_CARPET, BlockRegistry.BLACK_TABLE_CLOTH);

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

                // Block Cannon Set
                shaped(RecipeCategory.TOOLS, ItemRegistry.BLOCK_CANNON, 1)
                    .pattern("iid")
                    .pattern(" is")
                    .define('i', Items.IRON_INGOT)
                    .define('s', Items.STICK)
                    .define('d', Items.DISPENSER)
                    .unlockedBy(getHasName(Items.IRON_INGOT.asItem()), has(Items.IRON_INGOT.asItem()))
                    .save(output);

                // Cardboard Set
                shaped(RecipeCategory.MISC, ItemRegistry.CARDBOARD, 3)
                    .pattern("bbb")
                    .define('b', Items.BAMBOO)
                    .unlockedBy(getHasName(Items.BAMBOO.asItem()), has(Items.BAMBOO.asItem()))
                    .save(output);

                shaped(RecipeCategory.MISC, ItemRegistry.CARDBOARD_BOX, 1)
                    .pattern("ccc")
                    .pattern("c c")
                    .pattern("ccc")
                    .define('c', ItemRegistry.CARDBOARD)
                    .unlockedBy(getHasName(ItemRegistry.CARDBOARD), has(ItemRegistry.CARDBOARD))
                    .save(output);

                createMaterialBlockRecipe(ItemRegistry.CARDBOARD, BlockRegistry.CARDBOARD_BLOCK);

                // Paper Set
                createMaterialBlockRecipe(Items.PAPER, BlockRegistry.PAPER_BLOCK);
            }

            private void createStairRecipe(Block inputBlock, Block outputBlock) {
                shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock.asItem(), 4)
                    .pattern("m  ")
                    .pattern("mm ")
                    .pattern("mmm")
                    .define('m', inputBlock.asItem())
                    .unlockedBy(getHasName(inputBlock.asItem()), has(inputBlock.asItem()))
                    .save(output);
            }

            private void createSlabRecipe(Block inputBlock, Block outputBlock) {
                shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock.asItem(), 6)
                    .pattern("mmm")
                    .define('m', inputBlock.asItem())
                    .unlockedBy(getHasName(inputBlock.asItem()), has(inputBlock.asItem()))
                    .save(output);
            }

            private void createWallRecipe(Block inputBlock, Block outputBlock) {
                shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock.asItem(), 6)
                    .pattern("mmm")
                    .pattern("mmm")
                    .define('m', inputBlock.asItem())
                    .unlockedBy(getHasName(inputBlock.asItem()), has(inputBlock.asItem()))
                    .save(output);
            }

            private void createLogStackRecipe(Block inputBlock, Block outputBlock) {
                shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock.asItem(), 8)
                    .pattern("lsl")
                    .pattern("s s")
                    .pattern("lsl")
                    .define('l', inputBlock.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(inputBlock.asItem()), has(inputBlock.asItem()))
                    .save(output);
            }

            private void createCrateRecipe(Block inputBlock, Block outputBlock) {
                shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock.asItem(), 8)
                    .pattern("ipi")
                    .pattern("ppp")
                    .pattern("ipi")
                    .define('p', inputBlock.asItem())
                    .define('i', Items.IRON_INGOT)
                    .unlockedBy(getHasName(inputBlock.asItem()), has(inputBlock.asItem()))
                    .save(output);
            }

            private void createReinforcedPlanksRecipe(Block inputBlock, Block outputBlock) {
                shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock.asItem(), 4)
                    .pattern("sss")
                    .pattern("sps")
                    .pattern("sss")
                    .define('p', inputBlock.asItem())
                    .define('s', Items.STICK)
                    .unlockedBy(getHasName(inputBlock.asItem()), has(inputBlock.asItem()))
                    .save(output);
            }

            private void createChairRecipe(Block inputBlock, Block outputBlock) {
                shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock.asItem(), 4)
                    .pattern("p  ")
                    .pattern("ppp")
                    .pattern("p p")
                    .define('p', inputBlock.asItem())
                    .unlockedBy(getHasName(inputBlock.asItem()), has(inputBlock.asItem()))
                    .save(output);
            }

            private void createArmChairRecipe(Block inputBlock, Block outputBlock) {
                shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock.asItem(), 4)
                    .pattern("p p")
                    .pattern("ppp")
                    .pattern("p p")
                    .define('p', inputBlock.asItem())
                    .unlockedBy(getHasName(inputBlock.asItem()), has(inputBlock.asItem()))
                    .save(output);
            }

            private void createTableRecipe(Block inputBlock, Block outputBlock) {
                shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock.asItem(), 4)
                    .pattern("ppp")
                    .pattern("p p")
                    .pattern("p p")
                    .define('p', inputBlock.asItem())
                    .unlockedBy(getHasName(inputBlock.asItem()), has(inputBlock.asItem()))
                    .save(output);
            }

            private void createTableClothRecipe(Block inputBlock, Block outputBlock) {
                shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock.asItem(), 4)
                    .pattern("ccc")
                    .define('c', inputBlock.asItem())
                    .unlockedBy(getHasName(inputBlock.asItem()), has(inputBlock.asItem()))
                    .save(output);
            }

            private void createMaterialBlockRecipe(Item inputItem, Block outputBlock) {
                shaped(RecipeCategory.BUILDING_BLOCKS, outputBlock.asItem(), 1)
                    .pattern("mmm")
                    .pattern("mmm")
                    .pattern("mmm")
                    .define('m', inputItem)
                    .unlockedBy(getHasName(inputItem), has(inputItem))
                    .save(output);
            }
        };
    }
    
}
