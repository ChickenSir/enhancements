package com.enhancements.item;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;

public class HammerItem extends Item {
    public static final int cooldown = 1;
    public TagKey<Block> cannotDestroy;

    public HammerItem(ToolMaterial toolMaterial, float f, float g, Properties properties) {
        super(properties.tool(toolMaterial, BlockTags.AIR, f, g, 0));
        cannotDestroy = toolMaterial.incorrectBlocksForDrops();
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (!context.getLevel().isClientSide()) {
            // Get position of block
            BlockPos block = context.getClickedPos();

            // Get the player
            Player player = context.getPlayer();

            // Check if the block can be destroyed by tool
            boolean canDestroy = !context.getLevel().getBlockState(block).is(cannotDestroy) 
                               && context.getLevel().getBlockState(block).is(BlockTags.MINEABLE_WITH_PICKAXE)
                               || context.getLevel().getBlockState(block).is(BlockTags.MINEABLE_WITH_AXE)
                               || context.getLevel().getBlockState(block).is(BlockTags.MINEABLE_WITH_SHOVEL)
                               || context.getLevel().getBlockState(block).is(BlockTags.MINEABLE_WITH_HOE);

            if (canDestroy) {
                // Destroy block
                context.getLevel().destroyBlock(block, true);

                // Play breaking sound
                context.getLevel().playSound(null, block, SoundEvents.MACE_SMASH_GROUND, SoundSource.PLAYERS, 1, 1);

                if (player != null) {
                    // Decrease durability
                    ItemStack itemStack = context.getItemInHand();
                    itemStack.hurtAndBreak(1, player, LivingEntity.getSlotForHand(context.getHand()));
                }
            } else {
                // Cannot destroy block
                context.getLevel().playSound(null, block, SoundEvents.SHIELD_BLOCK.value(), SoundSource.PLAYERS, 1, 1);
            }
        }

        return InteractionResult.SUCCESS;
    }
    
}
