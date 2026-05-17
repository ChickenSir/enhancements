package com.vanillaadditions.registries;

import com.vanillaadditions.VanillaAdditions;

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

    public static final ResourceKey<CreativeModeTab> VA_ITEM_GROUP_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(VanillaAdditions.modID, "va_item_group"));
    public static final CreativeModeTab VA_ITEM_GROUP = FabricItemGroup.builder()
    .icon(() -> new ItemStack(BlockRegistry.COBBLED_GRANITE.asItem()))
    .title(Component.translatable("vanilla-additions.item_group"))
    .build();
    
    public static Item register(Item.Properties settings, String name) {
        // Create the item key
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(VanillaAdditions.modID, name));

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
            itemGroup.accept(BlockRegistry.COBBLED_GRANITE.asItem());
            itemGroup.accept(BlockRegistry.COBBLED_GRANITE_STAIRS.asItem());
            itemGroup.accept(BlockRegistry.COBBLED_GRANITE_SLAB.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_GRANITE.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_GRANITE_STAIRS.asItem());
            itemGroup.accept(BlockRegistry.SMOOTH_GRANITE_SLAB.asItem());
        });
    }
}
