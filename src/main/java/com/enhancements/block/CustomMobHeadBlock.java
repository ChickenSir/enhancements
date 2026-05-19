package com.enhancements.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CustomMobHeadBlock extends Block {
    public static final EnumProperty<Direction> FACING;
    public VoxelShape blockShape;

    public CustomMobHeadBlock(Properties properties, float x, float y, float z) {
        super(properties);
        blockShape = column(x, y, z);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
    }

    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        // Returns the block state from the blocks placement direction
        return (BlockState)this.defaultBlockState().setValue(FACING, blockPlaceContext.getHorizontalDirection().getOpposite().getClockWise());
    }
    
    protected VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext collisionContext) {
        return blockShape;
    }

    protected BlockState rotate(BlockState blockState, Rotation rotation) {
        // Updates the facing property based on direction
        return (BlockState)blockState.setValue(FACING, rotation.rotate((Direction)blockState.getValue(FACING)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        // Adds the facing property to the block state definition
        builder.add(new Property[]{FACING});
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
    }

}
