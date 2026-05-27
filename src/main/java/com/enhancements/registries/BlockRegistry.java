package com.enhancements.registries;

import java.util.function.Function;

import com.enhancements.Enhancements;
import com.enhancements.block.MobHeadBlock;
import com.enhancements.block.TableBlock;
import com.enhancements.block.TableClothBlock;
import com.enhancements.block.ArmChairBlock;
import com.enhancements.block.ChairBlock;
import com.enhancements.block.LogStackBlock;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;

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
    public static final Block CRIMSON_STEM_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS).noOcclusion().sound(SoundType.STEM), "crimson_stem_stack", true);
    public static final Block WARPED_STEM_STACK = register(LogStackBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS).noOcclusion().sound(SoundType.STEM), "warped_stem_stack", true);

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

    // Mod Head Set
    public static final Block ALLAY_HEAD = registerMobHead("allay_head", 5, 5, 5, true);
    public static final Block BEE_HEAD = registerMobHead("bee_head", 7, 7, 10, true);
    public static final Block BREEZE_HEAD = registerMobHead("breeze_head", 8, 8, 8, true);
    public static final Block BROWN_MOOSHROOM_HEAD = registerMobHead("brown_mooshroom_head", 8, 8, 6, false);
    public static final Block CAMEL_HEAD = registerMobHead("camel_head", 7, 14, 7, true);
    public static final Block COLD_CHICKEN_HEAD = registerMobHead("cold_chicken_head", 4, 6, 3, false);
    public static final Block COLD_COW_HEAD = registerMobHead("cold_cow_head", 8, 8, 6, false);
    public static final Block IRON_GOLEM_HEAD = registerMobHead("iron_golem_head", 8, 10, 8, true);
    public static final Block POLARBEAR_HEAD = registerMobHead("polarbear_head", 7, 7, 7, true);
    public static final Block RED_MOOSHROOM_HEAD = registerMobHead("red_mooshroom_head", 8, 8, 6, false);
    public static final Block TEMPERATE_CHICKEN_HEAD = registerMobHead("temperate_chicken_head", 4,6, 3, false);
    public static final Block TEMPERATE_COW_HEAD = registerMobHead("temperate_cow_head", 8, 8, 6, false);
    public static final Block WARM_CHICKEN_HEAD = registerMobHead("warm_chicken_head", 4, 6, 3, false);
    public static final Block WARM_COW_HEAD = registerMobHead("warm_cow_head", 8, 8, 6, false);

    // Sandstone Set
    public static final Block COBBLED_SANDSTONE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE), "cobbled_sandstone", true);
    public static final Block COBBLED_RED_SANDSTONE = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_SANDSTONE), "cobbled_red_sandstone", true);

    // Cobblestone Bricks Set
    public static final Block COBBLESTONE_BRICKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE), "cobblestone_bricks", true);
    public static final Block COBBLESTONE_BRICK_STAIRS = registerStair(COBBLESTONE_BRICKS, "cobblestone_brick_stairs");
    public static final Block COBBLESTONE_BRICK_SLAB = register(SlabBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE), "cobblestone_brick_slab", true);
    public static final Block COBBLESTONE_BRICK_WALL = register(WallBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE), "cobblestone_brick_wall", true);

    // Reinforced Planks Set
    public static final Block REINFORCED_OAK_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS), "reinforced_oak_planks", true);
    public static final Block REINFORCED_BIRCH_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS), "reinforced_birch_planks", true);
    public static final Block REINFORCED_SPRUCE_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS), "reinforced_spruce_planks", true);
    public static final Block REINFORCED_JUNGLE_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS), "reinforced_jungle_planks", true);
    public static final Block REINFORCED_ACACIA_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS), "reinforced_acacia_planks", true);
    public static final Block REINFORCED_DARK_OAK_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS), "reinforced_dark_oak_planks", true);
    public static final Block REINFORCED_CHERRY_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS), "reinforced_cherry_planks", true);
    public static final Block REINFORCED_MANGROVE_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS), "reinforced_mangrove_planks", true);
    public static final Block REINFORCED_PALE_OAK_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS), "reinforced_pale_oak_planks", true);
    public static final Block REINFORCED_BAMBOO_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS), "reinforced_bamboo_planks", true);
    public static final Block REINFORCED_CRIMSON_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS), "reinforced_crimson_planks", true);
    public static final Block REINFORCED_WARPED_PLANKS = register(Block::new, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS), "reinforced_warped_planks", true);

    // Chair Set
    public static final Block OAK_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS), "oak_chair", true);
    public static final Block BIRCH_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_PLANKS), "birch_chair", true);
    public static final Block SPRUCE_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_PLANKS), "spruce_chair", true);
    public static final Block JUNGLE_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_PLANKS), "jungle_chair", true);
    public static final Block ACACIA_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_PLANKS), "acacia_chair", true);
    public static final Block DARK_OAK_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_PLANKS), "dark_oak_chair", true);
    public static final Block CHERRY_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_PLANKS), "cherry_chair", true);
    public static final Block MANGROVE_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_PLANKS), "mangrove_chair", true);
    public static final Block PALE_OAK_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PALE_OAK_PLANKS), "pale_oak_chair", true);
    public static final Block BAMBOO_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BAMBOO_PLANKS), "bamboo_chair", true);
    public static final Block CRIMSON_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_PLANKS), "crimson_chair", true);
    public static final Block WARPED_CHAIR = register(ChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_PLANKS), "warped_chair", true);

    public static final Block OAK_ARMCHAIR = register(ArmChairBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS), "oak_armchair", true);

    // Table Set
    public static final Block OAK_TABLE = register(TableBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS).noOcclusion(), "oak_table", true);

    // Table Cloth Set
    public static final Block RED_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL).noOcclusion(), "red_table_cloth", true);
    public static final Block BLUE_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL).noOcclusion(), "blue_table_cloth", true);
    public static final Block YELLOW_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL).noOcclusion(), "yellow_table_cloth", true);
    public static final Block GREEN_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_WOOL).noOcclusion(), "green_table_cloth", true);
    public static final Block LIME_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_WOOL).noOcclusion(), "lime_table_cloth", true);
    public static final Block LIGHT_BLUE_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_WOOL).noOcclusion(), "light_blue_table_cloth", true);
    public static final Block CYAN_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_WOOL).noOcclusion(), "cyan_table_cloth", true);
    public static final Block ORANGE_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_WOOL).noOcclusion(), "orange_table_cloth", true);
    public static final Block MAGENTA_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_WOOL).noOcclusion(), "magenta_table_cloth", true);
    public static final Block PURPLE_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL).noOcclusion(), "purple_table_cloth", true);
    public static final Block PINK_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL).noOcclusion(), "pink_table_cloth", true);
    public static final Block BROWN_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL).noOcclusion(), "brown_table_cloth", true);
    public static final Block LIGHT_GRAY_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_WOOL).noOcclusion(), "light_gray_table_cloth", true);
    public static final Block GRAY_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_WOOL).noOcclusion(), "gray_table_cloth", true);
    public static final Block BLACK_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL).noOcclusion(), "black_table_cloth", true);
    public static final Block CRAFTING_TABLE_CLOTH = register(TableClothBlock::new, BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL).noOcclusion(), "crafting_table_cloth", true);
    
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

    public static Block registerMobHead(String name, int w, int h, int d, boolean wearable) {
        // Create block resource key
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Enhancements.modID, name));

        // Create block properties and mob head block
        BlockBehaviour.Properties settings = Properties.of().setId(blockKey).instrument(NoteBlockInstrument.ZOMBIE).strength(1.0f).pushReaction(PushReaction.DESTROY);
        MobHeadBlock block = new MobHeadBlock(settings, w, h, d);

        // Create item resource key
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Enhancements.modID, name));

        // Create block item
        Item.Properties itemSettings = new Item.Properties().setId(itemKey);

        if (wearable) itemSettings.equippableUnswappable(EquipmentSlot.HEAD);

        BlockItem blockItem = new BlockItem(block, itemSettings);

        // Register block item
        Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);

        // Register block
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    public static void registerBlocks() {}
}
