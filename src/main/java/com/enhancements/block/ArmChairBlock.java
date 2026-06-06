package com.enhancements.block;

import java.util.HashMap;
import java.util.Map;

import com.enhancements.property.Cushion;
import com.enhancements.property.ENHBlockStateProperties;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.gameevent.GameEvent.Context;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ArmChairBlock extends Block {
    public static final VoxelShape blockShape = Block.box(2, 0, 2, 14, 16, 14);
    public static final EnumProperty<Direction> FACING;
    public static final EnumProperty<Cushion> CUSHION;

    private static final HashMap<String, Cushion> colours = new HashMap<String, Cushion>(Map.ofEntries(
        Map.entry("Red Wool", Cushion.RED),
        Map.entry("Blue Wool", Cushion.BLUE),
        Map.entry("Yellow Wool", Cushion.YELLOW),
        Map.entry("Green Wool", Cushion.GREEN),
        Map.entry("Lime Wool", Cushion.LIME),
        Map.entry("Cyan Wool", Cushion.CYAN),
        Map.entry("Light Blue Wool", Cushion.LIGHT_BLUE),
        Map.entry("Orange Wool", Cushion.ORANGE),
        Map.entry("Purple Wool", Cushion.PURPLE),
        Map.entry("Magenta Wool", Cushion.MAGENTA),
        Map.entry("Pink Wool", Cushion.PINK),
        Map.entry("Brown Wool", Cushion.BROWN),
        Map.entry("Light Gray Wool", Cushion.LIGHT_GRAY),
        Map.entry("Gray Wool", Cushion.GRAY),
        Map.entry("Black Wool", Cushion.BLACK),
        Map.entry("White Wool", Cushion.WHITE)
    ));

    private static final HashMap<Cushion, Item> cushionToWool = new HashMap<Cushion, Item>(Map.ofEntries(
        Map.entry(Cushion.RED, Items.RED_WOOL),
        Map.entry(Cushion.BLUE, Items.BLUE_WOOL),
        Map.entry(Cushion.YELLOW, Items.YELLOW_WOOL),
        Map.entry(Cushion.GREEN, Items.GREEN_WOOL),
        Map.entry(Cushion.LIME, Items.LIME_WOOL),
        Map.entry(Cushion.CYAN, Items.CYAN_WOOL),
        Map.entry(Cushion.LIGHT_BLUE, Items.LIGHT_BLUE_WOOL),
        Map.entry(Cushion.ORANGE, Items.ORANGE_WOOL),
        Map.entry(Cushion.PURPLE, Items.PURPLE_WOOL),
        Map.entry(Cushion.MAGENTA, Items.MAGENTA_WOOL),
        Map.entry(Cushion.PINK, Items.PINK_WOOL),
        Map.entry(Cushion.BROWN, Items.BROWN_WOOL),
        Map.entry(Cushion.LIGHT_GRAY, Items.LIGHT_GRAY_WOOL),
        Map.entry(Cushion.GRAY, Items.GRAY_WOOL),
        Map.entry(Cushion.BLACK, Items.BLACK_WOOL),
        Map.entry(Cushion.WHITE, Items.WHITE_WOOL)
    ));

    public ArmChairBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState().setValue(FACING, Direction.NORTH).setValue(CUSHION, Cushion.NONE));
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        return InteractionResult.PASS;
    }

    @Override
    public InteractionResult useItemOn(ItemStack itemStack, BlockState blockState, Level world, BlockPos pos, Player player, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        if (!world.isClientSide()) {
            // Check if item is wool block
            if (itemStack.is(ItemTags.WOOL)) {
                // Get wool type on arm chair
                Item wool = cushionToWool.get(blockState.getValue(CUSHION));
                
                // Wool on arm chair is a different wool colour
                if (itemStack.getItem() != wool) {
                    // Get item name
                    String itemName = itemStack.getItem().getName().getString();

                    // Get cushion colour
                    Cushion cushionColour = colours.get(itemName);

                    // Set updated block state
                    BlockState updatedBlockState = blockState.setValue(CUSHION, cushionColour);

                    // Set cushion property
                    world.setBlockAndUpdate(pos, updatedBlockState);

                    // Set game event
                    world.gameEvent(GameEvent.BLOCK_CHANGE, pos, Context.of(player, updatedBlockState));

                    // Remove wool from player inventory
                    itemStack.consume(1, player);

                    // Play sound
                    world.playSound(null, pos, SoundEvents.WOOL_PLACE, SoundSource.PLAYERS, 1, 1);

                    return InteractionResult.CONSUME;
                }
            }
            if (itemStack.is(Items.SHEARS) && blockState.getValue(CUSHION) != Cushion.NONE) {
                // Get wool item from cushion
                Item wool = cushionToWool.get(blockState.getValue(CUSHION));

                // Set updated block state
                BlockState updatedBlockState = blockState.setValue(CUSHION, Cushion.NONE);

                // Set cushion property
                world.setBlockAndUpdate(pos, updatedBlockState);

                // Set game event
                world.gameEvent(GameEvent.BLOCK_CHANGE, pos, Context.of(player, updatedBlockState));

                // Give player wool item
                player.getInventory().add(new ItemStack(wool));

                // Play sound
                world.playSound(null, pos, SoundEvents.WOOL_BREAK, SoundSource.PLAYERS, 1, 1);

                return InteractionResult.SUCCESS;
            }
        }

        return InteractionResult.PASS;
    }
    
    public BlockState getStateForPlacement(BlockPlaceContext blockPlaceContext) {
        // Returns the block state from the blocks placement direction
        return defaultBlockState().setValue(FACING, blockPlaceContext.getHorizontalDirection().getOpposite().getClockWise()).setValue(CUSHION, Cushion.NONE);
    }
    
    protected VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext collisionContext) {
        return blockShape;
    }

    protected BlockState rotate(BlockState blockState, Rotation rotation) {
        // Updates the facing property based on direction
        return blockState.setValue(FACING, rotation.rotate((Direction)blockState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        // Adds the facing and cushion property to the block state definition
        builder.add(new Property[]{FACING, CUSHION});
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
        CUSHION = ENHBlockStateProperties.CUSHION;
    }
}
