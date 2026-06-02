package com.enhancements.block;

import com.enhancements.property.ChimneySection;
import com.enhancements.property.ENHBlockStateProperties;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ChimneyBlock extends Block implements SimpleWaterloggedBlock {
    public static final VoxelShape OUTLINE_SHAPE_TOP = Block.box(0, 0, 0, 16, 16, 16);
    public static final VoxelShape OUTLINE_SHAPE_BOTTOM = Block.box(2, 0, 2, 14, 16, 14);
    public static final EnumProperty<ChimneySection> SECTION;
    public static final BooleanProperty WATERLOGGED;

    public ChimneyBlock(Properties properties) {
        super(properties);
        this.registerDefaultState((BlockState)((BlockState)((BlockState)this.stateDefinition.any()).setValue(SECTION, ChimneySection.TOP)).setValue(WATERLOGGED, false));
    }

    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        // Get the block above
        BlockPos aboveBlockPos = blockPlaceContext.getClickedPos().above();
        BlockState aboveBlock = blockPlaceContext.getLevel().getBlockState(aboveBlockPos);

        // Set chimney section value
        ChimneySection section = isChimney(aboveBlock) ? ChimneySection.BOTTOM : ChimneySection.TOP;

        // Gets the waterlogged state of the block
        FluidState fluidState = blockPlaceContext.getLevel().getFluidState(blockPlaceContext.getClickedPos());

        // Set block state values
        BlockState blockState = (BlockState)this.defaultBlockState()
            .setValue(SECTION, section)
            .setValue(WATERLOGGED, fluidState.getType() == Fluids.WATER);
        
        return blockState;
    }

    public void animateTick(BlockState blockState, Level level, BlockPos blockPos, RandomSource randomSource) {
        if (blockState.getValue(SECTION) == ChimneySection.TOP) {
            // Create smoke particles
            double x = (double)blockPos.getX() + (double)0.5f;
            double y = (double)blockPos.getY() + (double)0.75f;
            double z = (double)blockPos.getZ() + (double)0.5f;

            level.addAlwaysVisibleParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, (double)0.0f, (double)0.1f, (double)0.0f);
        }
    }

    protected BlockState updateShape(BlockState blockState, LevelReader levelReader, ScheduledTickAccess scheduledTickAccess, BlockPos blockPos, Direction direction, BlockPos blockPos2, BlockState blockState2, RandomSource randomSource) {
        // Update block shape
        if ((Boolean)blockState.getValue(WATERLOGGED)) {
            scheduledTickAccess.scheduleTick(blockPos, Fluids.WATER, Fluids.WATER.getTickDelay(levelReader));
        }

        return (BlockState)blockState.setValue(SECTION, isChimney(levelReader.getBlockState(blockPos.above())) ? ChimneySection.BOTTOM : ChimneySection.TOP);
    }

    private static boolean isChimney(BlockState blockState) {
        return blockState.getBlock() instanceof ChimneyBlock;
    }
    
    protected VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext collisionContext) {
        return state.getValue(SECTION) == ChimneySection.TOP ? OUTLINE_SHAPE_TOP : OUTLINE_SHAPE_BOTTOM;
    }

    protected FluidState getFluidState(BlockState blockState) {
        return (Boolean)blockState.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(blockState);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        // Adds the facing property to the block state definition
        builder.add(new Property[]{SECTION, WATERLOGGED});
    }

    static {
        SECTION = ENHBlockStateProperties.CHIMNEY_SECTION;
        WATERLOGGED = BlockStateProperties.WATERLOGGED;
    }
    
}
