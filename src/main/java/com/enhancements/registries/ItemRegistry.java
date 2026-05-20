package com.enhancements.registries;

import java.util.function.Function;

import com.enhancements.Enhancements;
import com.enhancements.item.HammerItem;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;

public class ItemRegistry {

    public static final ResourceKey<CreativeModeTab> VA_ITEM_GROUP_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "va_item_group"));
    public static final CreativeModeTab VA_ITEM_GROUP = FabricItemGroup.builder()
    .icon(() -> new ItemStack(BlockRegistry.ANDESITE_BRICKS.asItem()))
    .title(Component.translatable("enhancements.item_group"))
    .build();

    public static final Item WOODEN_HAMMER = register((settings) -> new HammerItem(ToolMaterial.WOOD, 6.0f, -3.2f, settings), new Item.Properties(), "wooden_hammer");
    public static final Item STONE_HAMMER = register((settings) -> new HammerItem(ToolMaterial.STONE, 7.0f, -3.2f, settings), new Item.Properties(), "stone_hammer");
    public static final Item IRON_HAMMER = register((settings) -> new HammerItem(ToolMaterial.IRON, 6.0f, -3.1f, settings), new Item.Properties(), "iron_hammer");
    public static final Item GOLDEN_HAMMER = register((settings) -> new HammerItem(ToolMaterial.GOLD, 6.0f, -3.0f, settings), new Item.Properties(), "golden_hammer");
    public static final Item DIAMOND_HAMMER = register((settings) -> new HammerItem(ToolMaterial.DIAMOND, 5.0f, -3.0f, settings), new Item.Properties(), "diamond_hammer");
    public static final Item NETHERITE_HAMMER = register((settings) -> new HammerItem(ToolMaterial.NETHERITE, 5.0f, -3.0f, settings), new Item.Properties().fireResistant(), "netherite_hammer");
    
    public static Item register(Function<Item.Properties, Item> itemFactory, Item.Properties settings, String name) {
        // Create the item key
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Enhancements.modID, name));

        // Create the item
        Item item = itemFactory.apply(settings.setId(itemKey));

        // Register the item
        return Registry.register(BuiltInRegistries.ITEM, itemKey, item);
    }

    public static void registerItems() {
        // Register item group
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, VA_ITEM_GROUP_KEY, VA_ITEM_GROUP);

        // Add items to item group
        ItemGroupEvents.modifyEntriesEvent(VA_ITEM_GROUP_KEY).register(itemGroup -> {
            // Granite Set
            itemGroup.accept(BlockRegistry.COBBLED_GRANITE.asItem());
            itemGroup.accept(BlockRegistry.COBBLED_GRANITE_STAIRS.asItem());
            itemGroup.accept(BlockRegistry.COBBLED_GRANITE_SLAB.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_GRANITE.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_GRANITE_STAIRS.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_GRANITE_SLAB.asItem());
            itemGroup.accept(BlockRegistry.GRANITE_BRICKS.asItem());
            itemGroup.accept(BlockRegistry.GRANITE_BRICK_STAIRS.asItem());
            itemGroup.accept(BlockRegistry.GRANITE_BRICK_SLAB.asItem());

            // Diorite Set
            itemGroup.accept(BlockRegistry.COBBLED_DIORITE.asItem());
            itemGroup.accept(BlockRegistry.COBBLED_DIORITE_STAIRS.asItem());
            itemGroup.accept(BlockRegistry.COBBLED_DIORITE_SLAB.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_DIORITE.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_DIORITE_STAIRS.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_DIORITE_SLAB.asItem());
            itemGroup.accept(BlockRegistry.DIORITE_BRICKS.asItem());
            itemGroup.accept(BlockRegistry.DIORITE_BRICK_STAIRS.asItem());
            itemGroup.accept(BlockRegistry.DIORITE_BRICK_SLAB.asItem());

            // Andesite Set
            itemGroup.accept(BlockRegistry.COBBLED_ANDESITE.asItem());
            itemGroup.accept(BlockRegistry.COBBLED_ANDESITE_STAIRS.asItem());
            itemGroup.accept(BlockRegistry.COBBLED_ANDESITE_SLAB.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_ANDESITE.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_ANDESITE_STAIRS.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_ANDESITE_SLAB.asItem());
            itemGroup.accept(BlockRegistry.ANDESITE_BRICKS.asItem());
            itemGroup.accept(BlockRegistry.ANDESITE_BRICK_STAIRS.asItem());
            itemGroup.accept(BlockRegistry.ANDESITE_BRICK_SLAB.asItem());

            // Log Stack Set
            itemGroup.accept(BlockRegistry.OAK_LOG_STACK.asItem());
            itemGroup.accept(BlockRegistry.BIRCH_LOG_STACK.asItem());
            itemGroup.accept(BlockRegistry.SPRUCE_LOG_STACK.asItem());
            itemGroup.accept(BlockRegistry.JUNGLE_LOG_STACK.asItem());
            itemGroup.accept(BlockRegistry.ACACIA_LOG_STACK.asItem());
            itemGroup.accept(BlockRegistry.DARK_OAK_LOG_STACK.asItem());
            itemGroup.accept(BlockRegistry.CHERRY_LOG_STACK.asItem());
            itemGroup.accept(BlockRegistry.MANGROVE_LOG_STACK.asItem());
            itemGroup.accept(BlockRegistry.PALE_OAK_LOG_STACK.asItem());
            itemGroup.accept(BlockRegistry.BAMBOO_STACK.asItem());
            itemGroup.accept(BlockRegistry.CRIMSON_STEM_STACK.asItem());
            itemGroup.accept(BlockRegistry.WARPED_STEM_STACK.asItem());

            // Crate Set
            itemGroup.accept(BlockRegistry.OAK_CRATE.asItem());
            itemGroup.accept(BlockRegistry.BIRCH_CRATE.asItem());
            itemGroup.accept(BlockRegistry.SPRUCE_CRATE.asItem());
            itemGroup.accept(BlockRegistry.JUNGLE_CRATE.asItem());
            itemGroup.accept(BlockRegistry.ACACIA_CRATE.asItem());
            itemGroup.accept(BlockRegistry.DARK_OAK_CRATE.asItem());
            itemGroup.accept(BlockRegistry.CHERRY_CRATE.asItem());
            itemGroup.accept(BlockRegistry.MANGROVE_CRATE.asItem());
            itemGroup.accept(BlockRegistry.PALE_OAK_CRATE.asItem());
            itemGroup.accept(BlockRegistry.BAMBOO_CRATE.asItem());
            itemGroup.accept(BlockRegistry.CRIMSON_CRATE.asItem());
            itemGroup.accept(BlockRegistry.WARPED_CRATE.asItem());

            // Mob Head Set
            itemGroup.accept(BlockRegistry.ALLAY_HEAD.asItem());
            itemGroup.accept(BlockRegistry.BEE_HEAD.asItem());
            itemGroup.accept(BlockRegistry.BREEZE_HEAD.asItem());
            itemGroup.accept(BlockRegistry.BROWN_MOOSHROOM_HEAD.asItem());
            itemGroup.accept(BlockRegistry.CAMEL_HEAD.asItem());
            itemGroup.accept(BlockRegistry.COLD_CHICKEN_HEAD.asItem());
            itemGroup.accept(BlockRegistry.COLD_COW_HEAD.asItem());
            itemGroup.accept(BlockRegistry.IRON_GOLEM_HEAD.asItem());
            itemGroup.accept(BlockRegistry.POLARBEAR_HEAD.asItem());
            itemGroup.accept(BlockRegistry.RED_MOOSHROOM_HEAD.asItem());
            itemGroup.accept(BlockRegistry.TEMPERATE_CHICKEN_HEAD.asItem());
            itemGroup.accept(BlockRegistry.TEMPERATE_COW_HEAD.asItem());
            itemGroup.accept(BlockRegistry.WARM_CHICKEN_HEAD.asItem());
            itemGroup.accept(BlockRegistry.WARM_COW_HEAD.asItem());

            // Hammer Set
            itemGroup.accept(WOODEN_HAMMER);
            itemGroup.accept(STONE_HAMMER);
            itemGroup.accept(IRON_HAMMER);
            itemGroup.accept(GOLDEN_HAMMER);
            itemGroup.accept(DIAMOND_HAMMER);
            itemGroup.accept(NETHERITE_HAMMER);

            // Sandstone Set
            itemGroup.accept(BlockRegistry.COBBLED_SANDSTONE.asItem());
            itemGroup.accept(BlockRegistry.COBBLED_RED_SANDSTONE.asItem());

            // Reinforced Planks Set
            itemGroup.accept(BlockRegistry.REINFORCED_OAK_PLANKS.asItem());
            itemGroup.accept(BlockRegistry.REINFORCED_BIRCH_PLANKS.asItem());
            itemGroup.accept(BlockRegistry.REINFORCED_SPRUCE_PLANKS.asItem());
            itemGroup.accept(BlockRegistry.REINFORCED_JUNGLE_PLANKS.asItem());
            itemGroup.accept(BlockRegistry.REINFORCED_ACACIA_PLANKS.asItem());
            itemGroup.accept(BlockRegistry.REINFORCED_DARK_OAK_PLANKS.asItem());
            itemGroup.accept(BlockRegistry.REINFORCED_CHERRY_PLANKS.asItem());
            itemGroup.accept(BlockRegistry.REINFORCED_MANGROVE_PLANKS.asItem());
            itemGroup.accept(BlockRegistry.REINFORCED_PALE_OAK_PLANKS.asItem());
            itemGroup.accept(BlockRegistry.REINFORCED_BAMBOO_PLANKS.asItem());
            itemGroup.accept(BlockRegistry.REINFORCED_CRIMSON_PLANKS.asItem());
            itemGroup.accept(BlockRegistry.REINFORCED_WARPED_PLANKS.asItem());
        });
    }
}
