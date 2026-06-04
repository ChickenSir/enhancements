package com.enhancements.projectile;

import com.enhancements.registries.BlockRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Level.ExplosionInteraction;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class BlockCannonProjectile extends ThrowableItemProjectile {

    public BlockCannonProjectile(Level level, LivingEntity livingEntity, ItemStack itemStack) {
        super(EntityType.SNOWBALL, livingEntity, level, itemStack);

        if (itemStack.getItem() == Items.WATER_BUCKET) {
            super.setItem(new ItemStack(BlockRegistry.WATER_BLOCK.asItem()));
        } else if (itemStack.getItem() == Items.LAVA_BUCKET) {
            super.setItem(new ItemStack(BlockRegistry.LAVA_BLOCK.asItem()));
        } else if (itemStack.getItem() == Items.POWDER_SNOW_BUCKET) {
            super.setItem(new ItemStack(BlockRegistry.POWDERED_SNOW_BLOCK.asItem()));
        } else {
            super.setItem(itemStack);
        }
    }

    @Override
    protected Item getDefaultItem() {
        return Blocks.AIR.asItem();
    }
    
    protected void onHitEntity(EntityHitResult entityHitResult) {
        super.onHitEntity(entityHitResult);
        Entity hitEntity = entityHitResult.getEntity();
        
        int damage = 4;
        if (hitEntity.level() instanceof ServerLevel serverLevel) {
             hitEntity.hurtServer(serverLevel, this.damageSources().thrown(this, this.getOwner()), (float)damage);
        }
    }

    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);

        if (!this.level().isClientSide()) {
            // Block is any block
            this.level().broadcastEntityEvent(this, (byte)3);

            // Check ammo item
            Item item = this.getItem().getItem();

            // Projectile Position
            int x = (int)hitResult.getLocation().x;
            int y = (int)hitResult.getLocation().y;
            int z = (int)hitResult.getLocation().z;

            BlockPos pos = new BlockPos(x, y, z);

            if (item == Items.TNT) {
                float explosionPower = 4.0f;
                this.level().explode(this, this.getX(), this.getY(), this.getZ(), explosionPower, ExplosionInteraction.NONE);
            }
            if (item == BlockRegistry.WATER_BLOCK.asItem()) {
                
            }
            if (item == BlockRegistry.LAVA_BLOCK.asItem()) {
                
            }
            if (item == BlockRegistry.POWDERED_SNOW_BLOCK.asItem()) {
                
            }

            this.discard();
        }
    }
}
