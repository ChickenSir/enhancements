package com.enhancements.item;

import com.enhancements.component.ENHDataComponents;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.entity.BarrelBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CardboardBoxItem extends Item {

    public CardboardBoxItem(Properties properties) {
        super(properties);
        this.getDefaultInstance().set(ENHDataComponents.BLOCK_STORED, false);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (!context.getLevel().isClientSide()) {
            // Get the cardboard box item
            ItemStack cardboardBox = context.getItemInHand();

            // Get the player
            Player player = context.getPlayer();

            if (!cardboardBox.has(ENHDataComponents.STORED_BLOCK)) {
                // Get the clicked position
                BlockPos blockPos = context.getClickedPos();

                if (context.getLevel().getBlockEntity(blockPos) != null) {
                    // Get block entity from storage block
                    BlockEntity blockEntity = context.getLevel().getBlockEntity(blockPos);

                    if (blockEntity instanceof ChestBlockEntity || blockEntity instanceof BarrelBlockEntity) {
                        // Get the block state
                        BlockState storedBlockState = context.getLevel().getBlockState(blockPos);

                        // Store block state and components in cardboard box
                        cardboardBox.set(ENHDataComponents.STORED_BLOCK, storedBlockState);
                        cardboardBox.set(ENHDataComponents.STORED_COMPONENTS, blockEntity.collectComponents());
                        cardboardBox.set(ENHDataComponents.BLOCK_STORED, true);

                        // Remove the block
                        context.getLevel().removeBlockEntity(blockPos);
                        context.getLevel().removeBlock(blockPos, false);

                        // Play storing sound
                        context.getLevel().playSound(null, player.getOnPos().above(), SoundEvents.BUNDLE_INSERT, SoundSource.PLAYERS, 1, 1);
                    }
                }
            } else {
                // Get position above clicked position
                BlockPos clickedPos = context.getClickedPos().above();

                // Get stored block and components from cardboard box
                BlockState storedBlock = cardboardBox.remove(ENHDataComponents.STORED_BLOCK);
                DataComponentMap storedComponents = cardboardBox.remove(ENHDataComponents.STORED_COMPONENTS);
                cardboardBox.set(ENHDataComponents.BLOCK_STORED, false);

                // Set block to stored block and apply components
                context.getLevel().setBlock(clickedPos, storedBlock, 0);
                context.getLevel().getBlockEntity(clickedPos).applyComponents(storedComponents, cardboardBox.getComponentsPatch());

                // Play placing sound
                context.getLevel().playSound(null, player.getOnPos().above(), SoundEvents.BUNDLE_REMOVE_ONE, SoundSource.PLAYERS, 1, 1);
            }
        }

        return InteractionResult.SUCCESS;
    }
    
}
