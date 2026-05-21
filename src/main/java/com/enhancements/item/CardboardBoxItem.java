package com.enhancements.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.entity.BarrelBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CardboardBoxItem extends Item {
    public static DataComponentMap storedBlockComponents;
    public static BlockState storedBlockState;
    public static boolean hasStoredBlock;

    public CardboardBoxItem(Properties properties) {
        super(properties);
        hasStoredBlock = false;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (!context.getLevel().isClientSide()) {
            if (!hasStoredBlock) {
                BlockPos blockPos = context.getClickedPos();

                if (context.getLevel().getBlockEntity(blockPos) != null) {
                    BlockEntity blockEntity = context.getLevel().getBlockEntity(blockPos);

                    if (blockEntity instanceof ChestBlockEntity || blockEntity instanceof BarrelBlockEntity) {
                        storedBlockState = context.getLevel().getBlockState(blockPos);
                        hasStoredBlock = true;
                    }
                }
            } else {
                BlockPos clickedPos = context.getClickedPos().above();
                context.getLevel().setBlock(clickedPos, storedBlockState, 0);
            }
        }

        return InteractionResult.SUCCESS;
    }
    
}
