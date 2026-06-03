package com.enhancements.component;

import com.enhancements.Enhancements;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class ENHDataComponents {
    public static final DataComponentType<ItemStack> BLOCK_CANNON_AMMO = Registry.register(
        BuiltInRegistries.DATA_COMPONENT_TYPE,
        ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block_cannon_ammo"),
        DataComponentType.<ItemStack>builder().persistent(ItemStack.CODEC).build()
    );
    
    public static void registerComponents() {}
}
