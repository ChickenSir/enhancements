package com.enhancements.client.datagen;

import java.util.Optional;

import com.enhancements.Enhancements;
import com.enhancements.block.ArmChairBlock;
import com.enhancements.block.CenterStairBlock;
import com.enhancements.block.ChairBlock;
import com.enhancements.block.ChimneyBlock;
import com.enhancements.block.LogStackBlock;
import com.enhancements.block.TableBlock;
import com.enhancements.property.CenterStairShape;
import com.enhancements.property.ChimneySection;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.Half;

public class ENHCustomModelGenerator {

    // Center Stair Set
    public static final ModelTemplate CENTER_STAIR = block("center_stair", TextureSlot.ALL);
    public static final ModelTemplate CENTER_STAIR_FRONT = block("center_stair_front", "_front", TextureSlot.ALL);
    public static final ModelTemplate CENTER_STAIR_BACK = block("center_stair_back", "_back", TextureSlot.ALL);
    public static final ModelTemplate CENTER_STAIR_CROSS = block("center_stair_cross", "_cross", TextureSlot.ALL);

    // Log Stack Set
    public static final ModelTemplate LOG_STACK = block("log_stack", TextureSlot.ALL);

    // Chair Set
    public static final ModelTemplate CHAIR = block("chair", TextureSlot.ALL);
    public static final ModelTemplate ARMCHAIR = block("armchair", TextureSlot.ALL);

    // Table Set
    public static final ModelTemplate TABLE = block("table", TextureSlot.ALL);
    public static final ModelTemplate TABLE_CLOTH = block("table_cloth", TextureSlot.ALL);

    // Chimney Set
    public static final ModelTemplate CHIMNEY = block("chimney", TextureSlot.ALL);
    public static final ModelTemplate CHIMNEY_BOTTOM = block("chimney_bottom", "_bottom", TextureSlot.ALL);
    
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

    public static void registerLogStack(BlockModelGenerators generator, Block logStackBlock, String texture) {
        ResourceLocation baseTexture = ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block/" + texture);
        ResourceLocation logStackModel = LOG_STACK.create(logStackBlock, TextureMapping.cube(baseTexture), generator.modelOutput);
        generator.blockStateOutput.accept(createLogStackBlockStates(logStackBlock, logStackModel));
        generator.registerSimpleItemModel(logStackBlock, logStackModel);
    }

    public static void registerChair(BlockModelGenerators generator, Block chairBlock, String texture) {
        ResourceLocation baseTexture = ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block/" + texture);
        ResourceLocation chairModel = CHAIR.create(chairBlock, TextureMapping.cube(baseTexture), generator.modelOutput);
        generator.blockStateOutput.accept(createChairBlockStates(chairBlock, chairModel));
        generator.registerSimpleItemModel(chairBlock, chairModel);
    }

    public static void registerArmchair(BlockModelGenerators generator, Block armchairBlock, String texture) {
        ResourceLocation baseTexture = ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block/" + texture);
        ResourceLocation armchairModel = ARMCHAIR.create(armchairBlock, TextureMapping.cube(baseTexture), generator.modelOutput);
        generator.blockStateOutput.accept(createArmchairBlockStates(armchairBlock, armchairModel));
        generator.registerSimpleItemModel(armchairBlock, armchairModel);
    }

    public static void registerTable(BlockModelGenerators generator, Block tableBlock, String texture) {
        ResourceLocation baseTexture = ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block/" + texture);
        ResourceLocation tableModel = TABLE.create(tableBlock, TextureMapping.cube(baseTexture), generator.modelOutput);
        generator.blockStateOutput.accept(createTableBlockStates(tableBlock, tableModel));
        generator.registerSimpleItemModel(tableBlock, tableModel);
    }

    public static void registerTableCloth(BlockModelGenerators generator, Block tableclothBlock, String texture) {
        ResourceLocation baseTexture = ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block/" + texture);
        ResourceLocation tableclothModel = TABLE_CLOTH.create(tableclothBlock, TextureMapping.cube(baseTexture), generator.modelOutput);
        generator.blockStateOutput.accept(createTableClothBlockStates(tableclothBlock, tableclothModel));
        generator.registerSimpleItemModel(tableclothBlock, tableclothModel);
    }

    public static void registerChimney(BlockModelGenerators generator, Block chimneyBlock, Block baseBlock) {
        ResourceLocation chimneyModel = CHIMNEY.create(chimneyBlock, TextureMapping.cube(baseBlock), generator.modelOutput);
        ResourceLocation chimneyBottomModel = CHIMNEY_BOTTOM.create(chimneyBlock, TextureMapping.cube(baseBlock), generator.modelOutput);
        generator.blockStateOutput.accept(createChimneyBlockStates(chimneyBlock, chimneyModel, chimneyBottomModel));
        generator.registerSimpleItemModel(chimneyBlock, chimneyModel);
    }

    public static void registerChimney(BlockModelGenerators generator, Block chimneyBlock, String texture) {
        ResourceLocation baseTexture = ResourceLocation.withDefaultNamespace("block/" + texture);
        ResourceLocation chimneyModel = CHIMNEY.create(chimneyBlock, TextureMapping.cube(baseTexture), generator.modelOutput);
        ResourceLocation chimneyBottomModel = CHIMNEY_BOTTOM.create(chimneyBlock, TextureMapping.cube(baseTexture), generator.modelOutput);
        generator.blockStateOutput.accept(createChimneyBlockStates(chimneyBlock, chimneyModel, chimneyBottomModel));
        generator.registerSimpleItemModel(chimneyBlock, chimneyModel);
    }

    public static void registerBlock(BlockModelGenerators generator, Block block, String texture) {
        ResourceLocation baseTexture = ResourceLocation.withDefaultNamespace("block/" + texture);
        ResourceLocation blockModel = ModelTemplates.CUBE_ALL.create(block, TextureMapping.cube(baseTexture), generator.modelOutput);
        generator.blockStateOutput.accept(createBlockBlockStates(block, blockModel));
        generator.registerSimpleItemModel(block, blockModel);
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

    private static BlockModelDefinitionGenerator createLogStackBlockStates(Block logStack, ResourceLocation logStackId) {
        MultiVariant logStackModel = BlockModelGenerators.plainVariant(logStackId);
        return MultiVariantGenerator.dispatch(logStack)
            .with(PropertyDispatch.initial(LogStackBlock.FACING)
                .select(Direction.NORTH, logStackModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.EAST, logStackModel.with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.SOUTH, logStackModel.with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.WEST, logStackModel.with(BlockModelGenerators.Y_ROT_270))
        );
    }

    private static BlockModelDefinitionGenerator createChairBlockStates(Block chair, ResourceLocation chairId) {
        MultiVariant chairModel = BlockModelGenerators.plainVariant(chairId);
        return MultiVariantGenerator.dispatch(chair)
            .with(PropertyDispatch.initial(ChairBlock.FACING)
                .select(Direction.NORTH, chairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, chairModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, chairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, chairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
        );
    }

    private static BlockModelDefinitionGenerator createArmchairBlockStates(Block armchair, ResourceLocation armchairId) {
        MultiVariant armchairModel = BlockModelGenerators.plainVariant(armchairId);
        return MultiVariantGenerator.dispatch(armchair)
            .with(PropertyDispatch.initial(ArmChairBlock.FACING)
                .select(Direction.NORTH, armchairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, armchairModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, armchairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, armchairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
        );
    }

    private static BlockModelDefinitionGenerator createTableBlockStates(Block table, ResourceLocation tableId) {
        MultiVariant tableModel = BlockModelGenerators.plainVariant(tableId);
        return MultiVariantGenerator.dispatch(table)
            .with(PropertyDispatch.initial(TableBlock.FACING)
                .select(Direction.NORTH, tableModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.EAST, tableModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.SOUTH, tableModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.WEST, tableModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
        );
    }

    private static BlockModelDefinitionGenerator createTableClothBlockStates(Block tableCloth, ResourceLocation tableClothId) {
        MultiVariant tableClothModel = BlockModelGenerators.plainVariant(tableClothId);
        return MultiVariantGenerator.dispatch(tableCloth, tableClothModel);
    }

    private static BlockModelDefinitionGenerator createChimneyBlockStates(Block chimney, ResourceLocation chimneyId, ResourceLocation chimneyBottomId) {
        MultiVariant chimneyModel = BlockModelGenerators.plainVariant(chimneyId);
        MultiVariant chimneyBottomModel = BlockModelGenerators.plainVariant(chimneyBottomId);
        return MultiVariantGenerator.dispatch(chimney)
            .with(PropertyDispatch.initial(ChimneyBlock.SECTION)
                .select(ChimneySection.TOP, chimneyModel)
                .select(ChimneySection.BOTTOM, chimneyBottomModel)
        );
    }

    private static BlockModelDefinitionGenerator createBlockBlockStates(Block block, ResourceLocation blockId) {
        MultiVariant blockModel = BlockModelGenerators.plainVariant(blockId);
        return MultiVariantGenerator.dispatch(block, blockModel);
    }

    private static ModelTemplate block(String parent, TextureSlot... requiredTextureKeys) {
        return new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static ModelTemplate block(String parent, String variant, TextureSlot... requiredTextureKeys) {
        return new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
