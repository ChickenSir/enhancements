package com.enhancements.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TableClothBlock extends Block {
    public static final VoxelShape blockShape = Block.box(0, 0, 0, 16, 1, 16);

    public TableClothBlock(Properties properties) {
        super(properties);
    }
    
    protected VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext collisionContext) {
        return blockShape;
    }
    
}
