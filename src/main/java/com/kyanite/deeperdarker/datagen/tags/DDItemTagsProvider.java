package com.kyanite.deeperdarker.datagen.tags;

import com.kyanite.deeperdarker.miscellaneous.DDTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.Registry;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;

public class DDItemTagsProvider extends FabricTagProvider<Item> {
    public DDItemTagsProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.ITEM);
    }

    @Override
    protected void generateTags() {

    }
}
