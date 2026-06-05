package com.enhancements.client.datagen;

import java.util.ArrayList;
import java.util.List;
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
import com.enhancements.property.Cushion;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.BlockModelDefinitionGenerator;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.ModelLocationUtils;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
    public static final ModelTemplate ARMCHAIR_RED_CUSHION = block("armchair_cushion", "_red_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_BLUE_CUSHION = block("armchair_cushion", "_blue_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_YELLOW_CUSHION = block("armchair_cushion", "_yellow_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_GREEN_CUSHION = block("armchair_cushion", "_green_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_LIME_CUSHION = block("armchair_cushion", "_lime_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_CYAN_CUSHION = block("armchair_cushion", "_cyan_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_LIGHT_BLUE_CUSHION = block("armchair_cushion", "_light_blue_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_ORANGE_CUSHION = block("armchair_cushion", "_orange_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_PURPLE_CUSHION = block("armchair_cushion", "_purple_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_MAGENTA_CUSHION = block("armchair_cushion", "_magenta_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_PINK_CUSHION = block("armchair_cushion", "_pink_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_BROWN_CUSHION = block("armchair_cushion", "_brown_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_LIGHT_GRAY_CUSHION = block("armchair_cushion", "_light_gray_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_GRAY_CUSHION = block("armchair_cushion", "_gray_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_BLACK_CUSHION = block("armchair_cushion", "_black_cushion", TextureSlot.ALL, TextureSlot.WOOL);
    public static final ModelTemplate ARMCHAIR_WHITE_CUSHION = block("armchair_cushion", "_white_cushion", TextureSlot.ALL, TextureSlot.WOOL);

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

        List<ResourceLocation> cushionModels = new ArrayList<ResourceLocation>();
        cushionModels.add(ARMCHAIR_RED_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.RED_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_BLUE_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.BLUE_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_YELLOW_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.YELLOW_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_GREEN_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.GREEN_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_LIME_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.LIME_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_CYAN_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.CYAN_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_LIGHT_BLUE_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.LIGHT_BLUE_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_ORANGE_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.ORANGE_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_PURPLE_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.PURPLE_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_MAGENTA_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.MAGENTA_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_PINK_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.PINK_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_BROWN_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.BROWN_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_LIGHT_GRAY_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.LIGHT_GRAY_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_GRAY_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.GRAY_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_BLACK_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.BLACK_WOOL), generator.modelOutput));
        cushionModels.add(ARMCHAIR_WHITE_CUSHION.create(armchairBlock, armChairCushionTextures(baseTexture, Blocks.WHITE_WOOL), generator.modelOutput));

        generator.blockStateOutput.accept(createArmchairBlockStates(armchairBlock, armchairModel, cushionModels));
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

    private static BlockModelDefinitionGenerator createArmchairBlockStates(Block armchair, ResourceLocation armchairId, List<ResourceLocation> armchairCusionIds) {
        MultiVariant armchairModel = BlockModelGenerators.plainVariant(armchairId);
        MultiVariant armchairRedCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairBlueCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairYellowCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairGreenCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairLimeCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairCyanCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairLightBlueCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairOrangeCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairPurpleCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairMagentaCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairPinkCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairBrownCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairLightGrayCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairGrayCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairBlackCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        MultiVariant armchairWhiteCushionModel = BlockModelGenerators.plainVariant(armchairCusionIds.removeFirst());
        return MultiVariantGenerator.dispatch(armchair)
            .with(PropertyDispatch.initial(ArmChairBlock.FACING, ArmChairBlock.CUSHION)
                .select(Direction.NORTH, Cushion.NONE, armchairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.NONE, armchairModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.NONE, armchairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.NONE, armchairModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.RED, armchairRedCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.RED, armchairRedCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.RED, armchairRedCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.RED, armchairRedCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.BLUE, armchairBlueCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.BLUE, armchairBlueCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.BLUE, armchairBlueCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.BLUE, armchairBlueCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.YELLOW, armchairYellowCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.YELLOW, armchairYellowCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.YELLOW, armchairYellowCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.YELLOW, armchairYellowCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.GREEN, armchairGreenCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.GREEN, armchairGreenCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.GREEN, armchairGreenCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.GREEN, armchairGreenCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.LIME, armchairLimeCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.LIME, armchairLimeCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.LIME, armchairLimeCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.LIME, armchairLimeCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.CYAN, armchairCyanCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.CYAN, armchairCyanCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.CYAN, armchairCyanCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.CYAN, armchairCyanCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.LIGHT_BLUE, armchairLightBlueCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.LIGHT_BLUE, armchairLightBlueCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.LIGHT_BLUE, armchairLightBlueCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.LIGHT_BLUE, armchairLightBlueCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.ORANGE, armchairOrangeCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.ORANGE, armchairOrangeCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.ORANGE, armchairOrangeCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.ORANGE, armchairOrangeCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.PURPLE, armchairPurpleCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.PURPLE, armchairPurpleCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.PURPLE, armchairPurpleCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.PURPLE, armchairPurpleCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.MAGENTA, armchairMagentaCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.MAGENTA, armchairMagentaCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.MAGENTA, armchairMagentaCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.MAGENTA, armchairMagentaCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.PINK, armchairPinkCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.PINK, armchairPinkCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.PINK, armchairPinkCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.PINK, armchairPinkCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.BROWN, armchairBrownCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.BROWN, armchairBrownCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.BROWN, armchairBrownCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.BROWN, armchairBrownCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.LIGHT_GRAY, armchairLightGrayCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.LIGHT_GRAY, armchairLightGrayCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.LIGHT_GRAY, armchairLightGrayCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.LIGHT_GRAY, armchairLightGrayCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.GRAY, armchairGrayCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.GRAY, armchairGrayCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.GRAY, armchairGrayCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.GRAY, armchairGrayCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.BLACK, armchairBlackCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.BLACK, armchairBlackCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.BLACK, armchairBlackCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.BLACK, armchairBlackCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
                .select(Direction.NORTH, Cushion.WHITE, armchairWhiteCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_270))
                .select(Direction.EAST, Cushion.WHITE, armchairWhiteCushionModel.with(BlockModelGenerators.UV_LOCK))
                .select(Direction.SOUTH, Cushion.WHITE, armchairWhiteCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_90))
                .select(Direction.WEST, Cushion.WHITE, armchairWhiteCushionModel.with(BlockModelGenerators.UV_LOCK).with(BlockModelGenerators.Y_ROT_180))
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

    private static TextureMapping armChairCushionTextures(ResourceLocation baseTexture, Block wool) {
        return new TextureMapping()
            .put(TextureSlot.ALL, baseTexture)
            .put(TextureSlot.WOOL, ModelLocationUtils.getModelLocation(wool));
    }

    private static ModelTemplate block(String parent, TextureSlot... requiredTextureKeys) {
        return new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block/" + parent)), Optional.empty(), requiredTextureKeys);
    }

    private static ModelTemplate block(String parent, String variant, TextureSlot... requiredTextureKeys) {
        return new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath(Enhancements.modID, "block/" + parent)), Optional.of(variant), requiredTextureKeys);
    }
}
