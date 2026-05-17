package com.vanillaadditions.registries;

import com.vanillaadditions.VanillaAdditions;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class BlockRegistry {

    public static final Block TEST_BLOCK = register(BlockBehaviour.Properties.of(), "test_block", true);
    
    public static Block register(BlockBehaviour.Properties settings, String name, boolean registerItem) {
        // Create block resource key
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(VanillaAdditions.modID, name));

        Block block = new Block(settings.setId(blockKey));

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

    public static void registerBlocks() {}
}
