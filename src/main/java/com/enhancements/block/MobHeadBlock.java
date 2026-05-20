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

public class MobHeadBlock extends Block {
    public static final EnumProperty<Direction> FACING;
    public VoxelShape blockShape;

    public MobHeadBlock(Properties properties, float w, float h, float d) {
        super(properties);
        blockShape = calculateShape(w, h, d);
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
    }

    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        // Returns the block state from the blocks placement direction
        return (BlockState)this.defaultBlockState().setValue(FACING, blockPlaceContext.getHorizontalDirection().getOpposite().getClockWise());
    }

    private VoxelShape calculateShape(float w, float h, float d) {
        // The maximum size of a mob head
        float size = 16;

        // The position of the first corner of the mob head
        float x1 = (size - w) / 2;
        float z1 = (size - d) / 2;

        // Return the final mob head outline shape
        return box(x1, 0, z1, x1 + w, h, z1 + d);
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
