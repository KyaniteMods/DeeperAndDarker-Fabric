package com.kyanite.deeperdarker.datagen.tags;

import com.kyanite.deeperdarker.miscellaneous.DDTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class DDBlockTagsProvider extends FabricTagProvider<Block> {
    public DDBlockTagsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.BLOCK);
    }

    @Override
    protected void generateTags() {
        tag(DDTags.Blocks.TRANSMITTABLE).add(Blocks.CHEST, Blocks.FURNACE, Blocks.BLAST_FURNACE, Blocks.BARREL, Blocks.SMOKER, Blocks.STONECUTTER);
    }
}
