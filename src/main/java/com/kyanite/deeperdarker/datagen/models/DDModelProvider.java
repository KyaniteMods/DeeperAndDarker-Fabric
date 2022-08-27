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

    public ResourceLocation blockLoc(String name) {
        return new ResourceLocation(DeeperAndDarker.MOD_ID, "block/" + name);
    }
}
