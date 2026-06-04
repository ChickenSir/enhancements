package com.enhancements.registries;

import com.enhancements.Enhancements;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class TagRegistry {

    // Block Cannon Tags
    public static final TagKey<Item> BLOCK_CANNON_ITEM_AMMO = TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block_cannon_item_ammo"));
    
    public static void createTags() {}
}