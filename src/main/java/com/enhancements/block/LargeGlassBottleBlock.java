package com.enhancements.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LargeGlassBottleBlock extends Block {
    public static final VoxelShape blockShape = Block.box(6, 0, 6, 10, 15, 10);

    public LargeGlassBottleBlock(Properties properties) {
        super(properties);
    }
    
    protected VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext collisionContext) {
        return blockShape;
    }

}
