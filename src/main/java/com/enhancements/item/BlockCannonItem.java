package com.enhancements.item;

import com.enhancements.component.ENHDataComponents;
import com.enhancements.projectile.BlockCannonProjectile;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.SlotAccess;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.Level;

public class BlockCannonItem extends Item {
    public static final float DEFAULT_PROJECTILE_SPEED = 1.0f;

    public BlockCannonItem(Properties properties) {
        super(properties.tool(ToolMaterial.IRON, BlockTags.AIR, 0.0f, 1.0f, 0));
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand interactionHand) {
        if (!level.isClientSide()) {
            // Get item in off hand and block cannon
            ItemStack offhandItem = player.getOffhandItem();
            ItemStack blockCannon = player.getMainHandItem();

            // Player has item in off hand
            if (!offhandItem.isEmpty()) {
                if (offhandItem.getItem() instanceof BlockItem) {
                    if (!blockCannon.has(ENHDataComponents.BLOCK_CANNON_AMMO)) {
                        // Set ammo component to off hand item, remove from inventory
                        blockCannon.set(ENHDataComponents.BLOCK_CANNON_AMMO, offhandItem);
                        player.getInventory().removeItem(offhandItem);

                        // Play loading sound
                        level.playSound(null, player.getOnPos().above(), SoundEvents.ITEM_FRAME_ADD_ITEM, SoundSource.PLAYERS, 1, 1);
                    } else {
                        ItemStack ammo = blockCannon.get(ENHDataComponents.BLOCK_CANNON_AMMO);
                        if (ammo.getItem() == offhandItem.getItem() && ammo.getCount() < 64) {
                            int ammoCount = ammo.getCount();
                            ammo.setCount(ammoCount + offhandItem.getCount());

                            player.getInventory().removeItem(offhandItem);

                            // Play loading sound
                            level.playSound(null, player.getOnPos().above(), SoundEvents.ITEM_FRAME_ADD_ITEM, SoundSource.PLAYERS, 1, 1);
                        }
                    }
                }
            } else {
                // Block cannon has ammo
                if (blockCannon.has(ENHDataComponents.BLOCK_CANNON_AMMO)) {
                    if (level instanceof ServerLevel serverLevel) {
                        // Get the block cannons ammo
                        ItemStack blockCannonAmmo = blockCannon.get(ENHDataComponents.BLOCK_CANNON_AMMO);
                        if (blockCannonAmmo.getCount() > 0) {
                            // Spawn projectile
                            Projectile.spawnProjectileFromRotation(BlockCannonProjectile::new, serverLevel, blockCannonAmmo, player, 0.0f, DEFAULT_PROJECTILE_SPEED, 0.0f);

                            // Reduce block cannon ammo
                            blockCannonAmmo.setCount(blockCannonAmmo.getCount() - 1);

                            // Play firing sound
                            level.playSound(null, player.getOnPos().above(), SoundEvents.DISPENSER_LAUNCH, SoundSource.PLAYERS, 1, 1);

                            if (blockCannonAmmo.getCount() == 0) {
                                // No ammo, remove data component
                                blockCannon.remove(ENHDataComponents.BLOCK_CANNON_AMMO);
                            }
                        }
                    }
                }

                // Play empty sound
                level.playSound(null, player.getOnPos().above(), SoundEvents.DISPENSER_FAIL, SoundSource.PLAYERS, 1, 1);
            }
        }

        return InteractionResult.PASS;
    }

    public boolean overrideOtherStackedOnMe(ItemStack itemStack, ItemStack otherItemStack, Slot slot, ClickAction clickAction, Player player, SlotAccess slotAccess) {
        if (itemStack.has(ENHDataComponents.BLOCK_CANNON_AMMO)) {
            // Get and remove block cannon ammo
            ItemStack removedItem = itemStack.remove(ENHDataComponents.BLOCK_CANNON_AMMO);

            // Player left clicks on block cannon in inventory
            if (clickAction == ClickAction.SECONDARY && otherItemStack.isEmpty()) {
                // Put removed block cannon ammo in inventory
                slotAccess.set(removedItem);

                return true;
            }
        }

        return false;
    }

    public ItemUseAnimation getUseAnimation(ItemStack itemStack) {
        return ItemUseAnimation.BLOCK;
    }
}