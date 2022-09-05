package com.kyanite.deeperdarker.datagen.models;

import com.eliotlash.mclib.math.functions.classic.Mod;
import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.registry.blocks.DDBlocks;
import com.kyanite.deeperdarker.registry.items.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.client.model.Model;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.BlockModelGenerators.WoodProvider;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;

public class DDModelProvider extends FabricModelProvider {
    public DDModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        createSign(blockStateModelGenerator, DDBlocks.ECHO_SIGN, DDBlocks.ECHO_WALL_SIGN, DDBlocks.ECHO_PLANKS);

        blockStateModelGenerator.createTrivialCube(DDBlocks.ECHO_PLANKS);
        blockStateModelGenerator.createTrivialCube(DDBlocks.ECHO_LEAVES);
        blockStateModelGenerator.createTrivialCube(DDBlocks.ANCIENT_VASE);
        blockStateModelGenerator.createTrivialCube(DDBlocks.OTHERSIDE_PORTAL);

        blockStateModelGenerator.woodProvider(DDBlocks.ECHO_LOG).logWithHorizontal(DDBlocks.ECHO_LOG).wood(DDBlocks.ECHO_WOOD);
        blockStateModelGenerator.woodProvider(DDBlocks.STRIPPED_ECHO_LOG).logWithHorizontal(DDBlocks.STRIPPED_ECHO_LOG).wood(DDBlocks.STRIPPED_ECHO_WOOD);

        createSlab(blockStateModelGenerator, DDBlocks.ECHO_SLAB, DDBlocks.ECHO_PLANKS);
        createStairs(blockStateModelGenerator, DDBlocks.ECHO_STAIRS, DDBlocks.ECHO_PLANKS);
        createWall(blockStateModelGenerator, DDBlocks.ECHO_WALL, DDBlocks.ECHO_PLANKS);
        createFence(blockStateModelGenerator, DDBlocks.ECHO_FENCE, DDBlocks.ECHO_PLANKS);
        createFenceGate(blockStateModelGenerator, DDBlocks.ECHO_FENCE_GATE, DDBlocks.ECHO_PLANKS);
        createPressurePlate(blockStateModelGenerator, DDBlocks.ECHO_PRESSURE_PLATE, DDBlocks.ECHO_PLANKS);
        createButton(blockStateModelGenerator, DDBlocks.ECHO_BUTTON, DDBlocks.ECHO_PLANKS);
        blockStateModelGenerator.createDoor(DDBlocks.ECHO_DOOR);
        blockStateModelGenerator.createTrapdoor(DDBlocks.ECHO_TRAPDOOR);
        blockStateModelGenerator.createTrivialCube(DDBlocks.ECHO_SOIL);
        blockStateModelGenerator.createTrivialCube(DDBlocks.INFESTED_SCULK);

        blockStateModelGenerator.createTrivialCube(DDBlocks.SCULK_STONE);
        createSlab(blockStateModelGenerator, DDBlocks.SCULK_STONE_SLAB, DDBlocks.SCULK_STONE);
        createStairs(blockStateModelGenerator, DDBlocks.SCULK_STONE_STAIRS, DDBlocks.SCULK_STONE);
        createWall(blockStateModelGenerator, DDBlocks.SCULK_STONE_WALL, DDBlocks.SCULK_STONE);

        blockStateModelGenerator.createTrivialCube(DDBlocks.COBBLED_SCULK_STONE);
        createSlab(blockStateModelGenerator, DDBlocks.COBBLED_SCULK_STONE_SLAB, DDBlocks.COBBLED_SCULK_STONE);
        createStairs(blockStateModelGenerator, DDBlocks.COBBLED_SCULK_STONE_STAIRS, DDBlocks.COBBLED_SCULK_STONE);
        createWall(blockStateModelGenerator, DDBlocks.COBBLED_SCULK_STONE_WALL, DDBlocks.COBBLED_SCULK_STONE);

        blockStateModelGenerator.createTrivialCube(DDBlocks.POLISHED_SCULK_STONE);
        createSlab(blockStateModelGenerator, DDBlocks.POLISHED_SCULK_STONE_SLAB, DDBlocks.POLISHED_SCULK_STONE);
        createStairs(blockStateModelGenerator, DDBlocks.POLISHED_SCULK_STONE_STAIRS, DDBlocks.POLISHED_SCULK_STONE);
        createWall(blockStateModelGenerator, DDBlocks.POLISHED_SCULK_STONE_WALL, DDBlocks.POLISHED_SCULK_STONE);

        blockStateModelGenerator.createTrivialCube(DDBlocks.SCULK_STONE_BRICKS);
        createSlab(blockStateModelGenerator, DDBlocks.SCULK_STONE_BRICK_SLAB, DDBlocks.SCULK_STONE_BRICKS);
        createStairs(blockStateModelGenerator, DDBlocks.SCULK_STONE_BRICK_STAIRS, DDBlocks.SCULK_STONE_BRICKS);
        createWall(blockStateModelGenerator, DDBlocks.SCULK_STONE_BRICK_WALL, DDBlocks.SCULK_STONE_BRICKS);

        blockStateModelGenerator.createTrivialCube(DDBlocks.SCULK_STONE_COAL_ORE);
        blockStateModelGenerator.createTrivialCube(DDBlocks.SCULK_STONE_IRON_ORE);
        blockStateModelGenerator.createTrivialCube(DDBlocks.SCULK_STONE_COPPER_ORE);
        blockStateModelGenerator.createTrivialCube(DDBlocks.SCULK_STONE_GOLD_ORE);
        blockStateModelGenerator.createTrivialCube(DDBlocks.SCULK_STONE_REDSTONE_ORE);
        blockStateModelGenerator.createTrivialCube(DDBlocks.SCULK_STONE_EMERALD_ORE);
        blockStateModelGenerator.createTrivialCube(DDBlocks.SCULK_STONE_LAPIS_ORE);
        blockStateModelGenerator.createTrivialCube(DDBlocks.SCULK_STONE_DIAMOND_ORE);

        blockStateModelGenerator.createTrivialCube(DDBlocks.SCULK_GLEAM);
        blockStateModelGenerator.createNonTemplateModelBlock(DDBlocks.SCULK_JAW);

        blockStateModelGenerator.createCrossBlock(DDBlocks.SCULK_VINES, BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createCrossBlock(DDBlocks.SCULK_VINES_PLANT, BlockModelGenerators.TintState.NOT_TINTED);

        blockStateModelGenerator.delegateItemModel(DDBlocks.SCULK_VINES, new ResourceLocation(DeeperAndDarker.MOD_ID, "block/sculk_vines_plant"));
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(DDItems.HEART_OF_THE_DEEP, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DDItems.REINFORCED_ECHO_SHARD, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DDItems.WARDEN_CARAPACE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DDItems.SOUL_DUST, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(DDItems.WARDEN_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DDItems.WARDEN_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DDItems.WARDEN_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DDItems.WARDEN_BOOTS, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(DDItems.ECHO_CHEST_BOAT, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(DDItems.ECHO_BOAT, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(DDItems.WARDEN_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(DDItems.WARDEN_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(DDItems.WARDEN_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(DDItems.WARDEN_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(DDItems.WARDEN_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
    private void createSlab(BlockModelGenerators blockModelGenerators, Block block, Block sourceBlock) {
        ResourceLocation resourceLocation = ModelLocationUtils.getModelLocation(sourceBlock);
        TexturedModel texturedModel = TexturedModel.CUBE.get(sourceBlock);
        ResourceLocation resourceLocation2 = ModelTemplates.SLAB_BOTTOM.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation3 = ModelTemplates.SLAB_TOP.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSlab(block  , resourceLocation2, resourceLocation3, resourceLocation));
    }

    private void createButton(BlockModelGenerators blockModelGenerators, Block block, Block sourceBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(sourceBlock);
        ResourceLocation resourceLocation = ModelTemplates.BUTTON.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation2 = ModelTemplates.BUTTON_PRESSED.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createButton(block, resourceLocation, resourceLocation2));
        ResourceLocation resourceLocation3 = ModelTemplates.BUTTON_INVENTORY.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.delegateItemModel(block, resourceLocation3);
    }

    private void createPressurePlate(BlockModelGenerators blockModelGenerators, Block block, Block sourceBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(sourceBlock);
        ResourceLocation resourceLocation = ModelTemplates.PRESSURE_PLATE_UP.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation2 = ModelTemplates.PRESSURE_PLATE_DOWN.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createPressurePlate(block, resourceLocation, resourceLocation2));
    }

    private void createFence(BlockModelGenerators blockModelGenerators, Block block, Block sourceBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(sourceBlock);
        ResourceLocation resourceLocation = ModelTemplates.FENCE_POST.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation2 = ModelTemplates.FENCE_SIDE.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createFence(block, resourceLocation, resourceLocation2));
        ResourceLocation resourceLocation3 = ModelTemplates.FENCE_INVENTORY.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.delegateItemModel(block, resourceLocation3);
    }

    private void createSign(BlockModelGenerators blockModelGenerators, Block block, Block block2, Block sourceBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(sourceBlock);
        ResourceLocation resourceLocation = ModelTemplates.PARTICLE_ONLY.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resourceLocation));
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block2, resourceLocation));
        blockModelGenerators.createSimpleFlatItemModel(block.asItem());
        blockModelGenerators.skipAutoItemBlock(block2);
    }

    private void createFenceGate(BlockModelGenerators blockModelGenerators, Block block, Block sourceBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(sourceBlock);
        ResourceLocation resourceLocation = ModelTemplates.FENCE_GATE_OPEN.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation2 = ModelTemplates.FENCE_GATE_CLOSED.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation3 = ModelTemplates.FENCE_GATE_WALL_OPEN.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation4 = ModelTemplates.FENCE_GATE_WALL_CLOSED.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createFenceGate(block, resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4));
    }

    private void createStairs(BlockModelGenerators blockModelGenerators, Block block, Block sourceBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(sourceBlock);
        ResourceLocation resourceLocation = ModelTemplates.STAIRS_INNER.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation2 = ModelTemplates.STAIRS_STRAIGHT.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation3 = ModelTemplates.STAIRS_OUTER.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createStairs(block, resourceLocation, resourceLocation2, resourceLocation3));
    }

    private void createWall(BlockModelGenerators blockModelGenerators, Block block, Block sourceBlock) {
        TexturedModel texturedModel = TexturedModel.CUBE.get(sourceBlock);
        ResourceLocation resourceLocation = ModelTemplates.WALL_POST.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation2 = ModelTemplates.WALL_LOW_SIDE.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation3 = ModelTemplates.WALL_TALL_SIDE.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createWall(block, resourceLocation, resourceLocation2, resourceLocation3));
        ResourceLocation resourceLocation4 = ModelTemplates.WALL_INVENTORY.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.delegateItemModel(block, resourceLocation4);
    }

}
