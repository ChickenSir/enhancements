package com.enhancements.block;

import java.util.HashMap;
import java.util.Map;

import com.enhancements.property.Cushion;
import com.enhancements.property.ENHBlockStateProperties;
import com.enhancements.registries.ItemRegistry;
import com.enhancements.registries.TagRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
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
        Map.entry("Red Cushion", Cushion.RED),
        Map.entry("Blue Cushion", Cushion.BLUE),
        Map.entry("Yellow Cushion", Cushion.YELLOW),
        Map.entry("Green Cushion", Cushion.GREEN),
        Map.entry("Lime Cushion", Cushion.LIME),
        Map.entry("Cyan Cushion", Cushion.CYAN),
        Map.entry("Light Blue Cushion", Cushion.LIGHT_BLUE),
        Map.entry("Orange Cushion", Cushion.ORANGE),
        Map.entry("Purple Cushion", Cushion.PURPLE),
        Map.entry("Magenta Cushion", Cushion.MAGENTA),
        Map.entry("Pink Cushion", Cushion.PINK),
        Map.entry("Brown Cushion", Cushion.BROWN),
        Map.entry("Light Gray Cushion", Cushion.LIGHT_GRAY),
        Map.entry("Gray Cushion", Cushion.GRAY),
        Map.entry("Black Cushion", Cushion.BLACK),
        Map.entry("White Cushion", Cushion.WHITE)
    ));

    private static final HashMap<Cushion, Item> cushionToItem = new HashMap<Cushion, Item>(Map.ofEntries(
        Map.entry(Cushion.RED, ItemRegistry.RED_CUSHION),
        Map.entry(Cushion.BLUE, ItemRegistry.BLUE_CUSHION),
        Map.entry(Cushion.YELLOW, ItemRegistry.YELLOW_CUSHION),
        Map.entry(Cushion.GREEN, ItemRegistry.GREEN_CUSHION),
        Map.entry(Cushion.LIME, ItemRegistry.LIME_CUSHION),
        Map.entry(Cushion.CYAN, ItemRegistry.CYAN_CUSHION),
        Map.entry(Cushion.LIGHT_BLUE, ItemRegistry.LIGHT_BLUE_CUSHION),
        Map.entry(Cushion.ORANGE, ItemRegistry.ORANGE_CUSHION),
        Map.entry(Cushion.PURPLE, ItemRegistry.PURPLE_CUSHION),
        Map.entry(Cushion.MAGENTA, ItemRegistry.MAGENTA_CUSHION),
        Map.entry(Cushion.PINK, ItemRegistry.PINK_CUSHION),
        Map.entry(Cushion.BROWN, ItemRegistry.BROWN_CUSHION),
        Map.entry(Cushion.LIGHT_GRAY, ItemRegistry.LIGHT_GRAY_CUSHION),
        Map.entry(Cushion.GRAY, ItemRegistry.GRAY_CUSHION),
        Map.entry(Cushion.BLACK, ItemRegistry.BLACK_CUSHION),
        Map.entry(Cushion.WHITE, ItemRegistry.WHITE_CUSHION)
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
            // Check if item is cushion
            if (itemStack.is(TagRegistry.CUSHION)) {
                // Get cushion type on arm chair
                Item cushion = cushionToItem.get(blockState.getValue(CUSHION));
                
                // Cushion on arm chair is a different colour
                if (itemStack.getItem() != cushion) {
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

                    // Remove cushion from player inventory
                    itemStack.consume(1, player);

                    // Play sound
                    world.playSound(null, pos, SoundEvents.WOOL_PLACE, SoundSource.PLAYERS, 1, 1);

                    return InteractionResult.CONSUME;
                }
            }
            if (itemStack.is(Items.SHEARS) && blockState.getValue(CUSHION) != Cushion.NONE) {
                // Get cushion item from cushion
                Item cushion = cushionToItem.get(blockState.getValue(CUSHION));

                // Set updated block state
                BlockState updatedBlockState = blockState.setValue(CUSHION, Cushion.NONE);

                // Set cushion property
                world.setBlockAndUpdate(pos, updatedBlockState);

                // Set game event
                world.gameEvent(GameEvent.BLOCK_CHANGE, pos, Context.of(player, updatedBlockState));

                // Give player cushion item
                player.getInventory().add(new ItemStack(cushion));

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
