package com.enhancements.projectile;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;

public class BlockCannonProjectile extends ThrowableItemProjectile {

    public BlockCannonProjectile(Level level, LivingEntity livingEntity, ItemStack itemStack) {
        super(EntityType.SNOWBALL, livingEntity, level, itemStack);
        super.setItem(itemStack);
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
            this.level().broadcastEntityEvent(this, (byte)3);
            this.discard();
        }
    }
}
