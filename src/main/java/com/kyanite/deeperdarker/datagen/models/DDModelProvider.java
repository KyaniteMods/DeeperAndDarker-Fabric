package com.kyanite.deeperdarker.datagen.models;

import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.registry.blocks.DDBlocks;
import com.kyanite.deeperdarker.registry.items.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.SlabType;

public class DDModelProvider extends FabricModelProvider {
    public DDModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
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
    }

    private void createSlab(BlockModelGenerators blockModelGenerators, Block block, Block sourceBlock) {
        ResourceLocation resourceLocation = ModelLocationUtils.getModelLocation(sourceBlock);
        TexturedModel texturedModel = TexturedModel.CUBE.get(sourceBlock);
        ResourceLocation resourceLocation2 = ModelTemplates.SLAB_BOTTOM.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        ResourceLocation resourceLocation3 = ModelTemplates.SLAB_TOP.create(block, texturedModel.getMapping(), blockModelGenerators.modelOutput);
        blockModelGenerators.blockStateOutput.accept(BlockModelGenerators.createSlab(block  , resourceLocation2, resourceLocation3, resourceLocation));
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
