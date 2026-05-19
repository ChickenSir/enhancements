package com.enhancements.registries;

import com.enhancements.Enhancements;

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

public class ItemRegistry {

    public static final ResourceKey<CreativeModeTab> VA_ITEM_GROUP_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "va_item_group"));
    public static final CreativeModeTab VA_ITEM_GROUP = FabricItemGroup.builder()
    .icon(() -> new ItemStack(BlockRegistry.ANDESITE_BRICKS.asItem()))
    .title(Component.translatable("enhancements.item_group"))
    .build();
    
    public static Item register(Item.Properties settings, String name) {
        // Create the item key
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Enhancements.modID, name));

        // Create the item
        Item item = new Item(settings.setId(itemKey));

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
        });
    }
}
