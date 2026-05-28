package com.enhancements.block;

import com.enhancements.property.CenterStairShape;
import com.enhancements.property.ENHBlockStateProperties;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CenterStairBlock extends Block implements SimpleWaterloggedBlock {
    public static final VoxelShape OUTLINE_SHAPE_TOP = Block.box(0, 8, 0, 16, 16, 16);
    public static final VoxelShape OUTLINE_SHAPE_BOTTOM = Block.box(0, 0, 0, 16, 8, 16);
    public static final EnumProperty<Direction> FACING;
    public static final EnumProperty<Half> HALF;
    public static final EnumProperty<CenterStairShape> SHAPE;
    public static final BooleanProperty WATERLOGGED;

    public CenterStairBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH)).setValue(HALF, Half.BOTTOM)).setValue(SHAPE, CenterStairShape.STRAIGHT)).setValue(WATERLOGGED, false));
    }

    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        // Gets the direction of the blocks placement
        Direction direction = blockPlaceContext.getClickedFace();

        // Gets the position of the block
        BlockPos blockPos = blockPlaceContext.getClickedPos();

        // Gets the waterlogged state of the block
        FluidState fluidState = blockPlaceContext.getLevel().getFluidState(blockPos);

        // Set the direction, half, and waterlogged values
        BlockState blockState = (BlockState)((BlockState)((BlockState)this.defaultBlockState()
            .setValue(FACING, blockPlaceContext.getHorizontalDirection()))
            .setValue(HALF, direction != Direction.DOWN && (direction == Direction.UP || !(blockPlaceContext.getClickLocation().y - (double)blockPos.getY() > (double)0.5f)) ? Half.BOTTOM : Half.TOP))
            .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);

        // Set the block shape based on orientation and direction
        return (BlockState)blockState.setValue(SHAPE, getCenterStairShape(blockState, blockPlaceContext.getLevel(), blockPos));
    }

    protected BlockState updateShape(BlockState blockState, LevelReader levelReader, ScheduledTickAccess scheduledTickAccess, BlockPos blockPos, Direction direction, BlockPos blockPos2, BlockState blockState2, RandomSource randomSource) {
        // Update block shape
        if ((Boolean)blockState.getValue(WATERLOGGED)) {
            scheduledTickAccess.scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickDelay(levelReader));
        }

        return direction.getAxis().isHorizontal() ? (BlockState)blockState.setValue(SHAPE, getCenterStairShape(blockState, levelReader, blockPos)) : super.updateShape(blockState, levelReader, scheduledTickAccess, blockPos, direction, blockPos2, blockState2, randomSource);
    }

    private static CenterStairShape getCenterStairShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        // The direction of the center stair block
        Direction blockDirection = (Direction)blockState.getValue(FACING);

        Boolean blockInFront = false;
        Boolean blockBehind = false;

        // Get the block state of the block in front
        BlockState frontBlockState = blockGetter.getBlockState(blockPos.relative(blockDirection));

        // Block in front is a center stair and has same half value
        if (isCenterStair(frontBlockState) && blockState.getValue(HALF) == frontBlockState.getValue(HALF)) {
            // Get the direction of the block in front
            Direction frontBlockDirection = (Direction)frontBlockState.getValue(FACING);

            // Block in front is facing different direction
            if (frontBlockDirection.getAxis() != blockDirection.getAxis()) {
                // Can connect to block in front
                blockInFront = true;
            }
        }

        // Get block state for back block
        BlockState backBlockState = blockGetter.getBlockState(blockPos.relative(blockDirection.getOpposite()));

        // Back block is center stair block and has same half value
        if (isCenterStair(backBlockState) && blockState.getValue(HALF) == backBlockState.getValue(HALF)) {
            // Get direction of back block
            Direction backBlockDirection = (Direction)backBlockState.getValue(FACING);

            // Back block is facing different direction
            if (backBlockDirection.getAxis() != blockDirection.getAxis()) {
                // Can connect to back block
                blockBehind = true;
            }
        }

        // Can connect to both blocks
        if (blockInFront && blockBehind) return CenterStairShape.CROSS;

        if (blockInFront) return CenterStairShape.FRONT;
        if (blockBehind) return CenterStairShape.BACK;

        return CenterStairShape.STRAIGHT;
    }

    private static boolean isCenterStair(BlockState blockState) {
        return blockState.getBlock() instanceof CenterStairBlock;
    }
    
    protected VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext collisionContext) {
        return state.getValue(HALF) == Half.BOTTOM ? OUTLINE_SHAPE_BOTTOM : OUTLINE_SHAPE_TOP;
    }

    protected BlockState rotate(BlockState blockState, Rotation rotation) {
        // Updates the facing property based on direction
        return (BlockState)blockState.setValue(FACING, rotation.rotate((Direction)blockState.getValue(FACING)));
    }

    protected FluidState getFluidState(BlockState blockState) {
        return (Boolean)blockState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(blockState);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        // Adds the facing property to the block state definition
        builder.add(new Property[]{FACING, HALF, SHAPE, WATERLOGGED});
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
        HALF = BlockStateProperties.HALF;
        SHAPE = ENHBlockStateProperties.CENTER_STAIR_SHAPE;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
    
}
