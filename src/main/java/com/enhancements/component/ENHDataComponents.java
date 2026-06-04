package com.enhancements.component;

import com.enhancements.Enhancements;
import com.mojang.serialization.Codec;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;

public class ENHDataComponents {

    // Block Cannon Data Components
    public static final DataComponentType<ItemStack> BLOCK_CANNON_AMMO = Registry.register(
        BuiltInRegistries.DATA_COMPONENT_TYPE,
        ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block_cannon_ammo"),
        DataComponentType.<ItemStack>builder().persistent(ItemStack.CODEC).build()
    );

    // Cardboard Box Data Components
    public static final DataComponentType<BlockState> STORED_BLOCK = Registry.register(
        BuiltInRegistries.DATA_COMPONENT_TYPE,
        ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "stored_block"),
        DataComponentType.<BlockState>builder().persistent(BlockState.CODEC).build()
    );

    public static final DataComponentType<DataComponentMap> STORED_COMPONENTS = Registry.register(
        BuiltInRegistries.DATA_COMPONENT_TYPE,
        ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "stored_components"),
        DataComponentType.<DataComponentMap>builder().persistent(DataComponentMap.CODEC).build()
    );

    public static final DataComponentType<Boolean> BLOCK_STORED = Registry.register(
        BuiltInRegistries.DATA_COMPONENT_TYPE,
        ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block_stored"),
        DataComponentType.<Boolean>builder().persistent(Codec.BOOL).build()
    );
    
    public static void registerComponents() {}
}
