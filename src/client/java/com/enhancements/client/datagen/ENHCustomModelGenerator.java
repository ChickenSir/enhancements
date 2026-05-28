package com.enhancements.client.datagen;

import java.util.Optional;

import com.enhancements.Enhancements;
import com.enhancements.block.CenterStairBlock;
import com.enhancements.property.CenterStairShape;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.Half;

public class ENHCustomModelGenerator {

    public static final ModelTemplate CENTER_STAIR = block("center_stair", TextureSlot.ALL);
    public static final ModelTemplate CENTER_STAIR_FRONT = block("center_stair_front", "_front", TextureSlot.ALL);
    public static final ModelTemplate CENTER_STAIR_BACK = block("center_stair_back", "_back", TextureSlot.ALL);
    public static final ModelTemplate CENTER_STAIR_CROSS = block("center_stair_cross", "_cross", TextureSlot.ALL);
    
    public static void registerCenterStair(BlockModelGenerators generator, Block centerStairBlock, Block baseBlock) {
        ResourceLocation centerStairModel = CENTER_STAIR.create(centerStairBlock, TextureMapping.cube(baseBlock), generator.modelOutput);
        ResourceLocation centerStairFrontModel = CENTER_STAIR_FRONT.create(centerStairBlock, TextureMapping.cube(baseBlock), generator.modelOutput);
        ResourceLocation centerStairBackModel = CENTER_STAIR_BACK.create(centerStairBlock, TextureMapping.cube(baseBlock), generator.modelOutput);
        ResourceLocation centerStairCrossModel = CENTER_STAIR_CROSS.create(centerStairBlock, TextureMapping.cube(baseBlock), generator.modelOutput);
        generator.blockStateOutput.accept(createCenterStairBlockStates(centerStairBlock, centerStairModel, centerStairFrontModel, centerStairBackModel, centerStairCrossModel));
        generator.registerSimpleItemModel(centerStairBlock, centerStairModel);
    }

    public static void registerCenterStair(BlockModelGenerators generator, Block centerStairBlock, String baseBlockTexture) {
        ResourceLocation baseTexture = ResourceLocation.withDefaultNamespace("block/" + baseBlockTexture);
        ResourceLocation centerStairModel = CENTER_STAIR.create(centerStairBlock, TextureMapping.cube(baseTexture), generator.modelOutput);
        ResourceLocation centerStairFrontModel = CENTER_STAIR_FRONT.create(centerStairBlock, TextureMapping.cube(baseTexture), generator.modelOutput);
        ResourceLocation centerStairBackModel = CENTER_STAIR_BACK.create(centerStairBlock, TextureMapping.cube(baseTexture), generator.modelOutput);
        ResourceLocation centerStairCrossModel = CENTER_STAIR_CROSS.create(centerStairBlock, TextureMapping.cube(baseTexture), generator.modelOutput);
        generator.blockStateOutput.accept(createCenterStairBlockStates(centerStairBlock, centerStairModel, centerStairFrontModel, centerStairBackModel, centerStairCrossModel));
        generator.registerSimpleItemModel(centerStairBlock, centerStairModel);
    }

    private static BlockModelDefinitionGenerator createCenterStairBlockStates(Block centerStair, ResourceLocation centerStairId, ResourceLocation centerStairFrontId, ResourceLocation centerStairBackId, ResourceLocation centerStairCrossId) {
        MultiVariant centerStairModel = BlockModelGenerators.plainVariant(centerStairId);
        MultiVariant centerStairFrontModel = BlockModelGenerators.plainVariant(centerStairFrontId);
        MultiVariant centerStairBackModel = BlockModelGenerators.plainVariant(centerStairBackId);
        MultiVariant centerStairCrossModel = BlockModelGenerators.plainVariant(centerStairCrossId);
        return MultiVariantGenerator.dispatch(centerStair)
            .with(PropertyDispatch.initial(CenterStairBlock.FACING, CenterStairBlock.HALF, CenterStairBlock.SHAPE)
                .select(Direction.NORTH, Half.BOTTOM, CenterStairShape.STRAIGHT, centerStairModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.EAST, Half.BOTTOM, CenterStairShape.STRAIGHT, centerStairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.SOUTH, Half.BOTTOM, CenterStairShape.STRAIGHT, centerStairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.WEST, Half.BOTTOM, CenterStairShape.STRAIGHT, centerStairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.NORTH, Half.BOTTOM, CenterStairShape.FRONT, centerStairFrontModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.EAST, Half.BOTTOM, CenterStairShape.FRONT, centerStairFrontModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.SOUTH, Half.BOTTOM, CenterStairShape.FRONT, centerStairFrontModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.WEST, Half.BOTTOM, CenterStairShape.FRONT, centerStairFrontModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.NORTH, Half.BOTTOM, CenterStairShape.BACK, centerStairBackModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.EAST, Half.BOTTOM, CenterStairShape.BACK, centerStairBackModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.SOUTH, Half.BOTTOM, CenterStairShape.BACK, centerStairBackModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.WEST, Half.BOTTOM, CenterStairShape.BACK, centerStairBackModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.NORTH, Half.BOTTOM, CenterStairShape.CROSS, centerStairCrossModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.EAST, Half.BOTTOM, CenterStairShape.CROSS, centerStairCrossModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.SOUTH, Half.BOTTOM, CenterStairShape.CROSS, centerStairCrossModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.WEST, Half.BOTTOM, CenterStairShape.CROSS, centerStairCrossModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.NORTH, Half.TOP, CenterStairShape.STRAIGHT, centerStairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.EAST, Half.TOP, CenterStairShape.STRAIGHT, centerStairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.SOUTH, Half.TOP, CenterStairShape.STRAIGHT, centerStairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.WEST, Half.TOP, CenterStairShape.STRAIGHT, centerStairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.NORTH, Half.TOP, CenterStairShape.FRONT, centerStairBackModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.EAST, Half.TOP, CenterStairShape.FRONT, centerStairBackModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.SOUTH, Half.TOP, CenterStairShape.FRONT, centerStairBackModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.WEST, Half.TOP, CenterStairShape.FRONT, centerStairBackModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.NORTH, Half.TOP, CenterStairShape.BACK, centerStairFrontModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.EAST, Half.TOP, CenterStairShape.BACK, centerStairFrontModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.SOUTH, Half.TOP, CenterStairShape.BACK, centerStairFrontModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.WEST, Half.TOP, CenterStairShape.BACK, centerStairFrontModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.NORTH, Half.TOP, CenterStairShape.CROSS, centerStairCrossModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.EAST, Half.TOP, CenterStairShape.CROSS, centerStairCrossModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.SOUTH, Half.TOP, CenterStairShape.CROSS, centerStairCrossModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180).with(BlockModelGenerators.X_ROT_180))
                .select(Direction.WEST, Half.TOP, CenterStairShape.CROSS, centerStairCrossModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270).with(BlockModelGenerators.X_ROT_180))
            );
    }

    private static ModelTemplate block(String parent, TextureSlot... requiredTextureKeys) {
        return new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static ModelTemplate block(String parent, String variant, TextureSlot... requiredTextureKeys) {
        return new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
