package com.enhancements.item;

import com.enhancements.registries.BlockRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.gameevent.GameEvent.Context;


public class LargeGlassBottleItem extends Item {

    public LargeGlassBottleItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (!context.getLevel().isClientSide()) {
            // Get the player
            Player player = context.getPlayer();

            if (player.isCrouching()) {
                // Player is crouching

                // Get the level
                Level level = context.getLevel();

                // Get position above block
                BlockPos blockPos = context.getClickedPos().above();

                // Set block to large glass bottle block
                level.setBlock(blockPos, BlockRegistry.LARGE_GLASS_BOTTLE.defaultBlockState(), 1);
                level.playSound(player, blockPos, SoundEvents.GLASS_PLACE, SoundSource.NEUTRAL, 1.0f, 1.0f);

                // Register game event and block state
                BlockState blockState = level.getBlockState(blockPos);
                level.gameEvent(GameEvent.BLOCK_PLACE, blockPos, Context.of(player, blockState));

                // Remove one item from inventory
                ItemStack itemStack = context.getItemInHand();
                itemStack.consume(1, player);

                return InteractionResult.SUCCESS;
            }
        }

        return InteractionResult.PASS;
    }
    
}
