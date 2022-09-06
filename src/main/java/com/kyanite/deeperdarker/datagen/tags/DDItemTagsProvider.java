package com.kyanite.deeperdarker.datagen.tags;

import com.kyanite.deeperdarker.miscellaneous.DDTags;
import com.kyanite.deeperdarker.registry.blocks.DDBlocks;
import com.kyanite.deeperdarker.registry.items.DDItems;
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
        tag(ItemTags.STONE_CRAFTING_MATERIALS).add(DDBlocks.COBBLED_SCULK_STONE.asItem());
        tag(ItemTags.STONE_TOOL_MATERIALS).add(DDBlocks.COBBLED_SCULK_STONE.asItem());

        tag(ItemTags.CHEST_BOATS).add(DDItems.ECHO_CHEST_BOAT);
        tag(ItemTags.BOATS).add(DDItems.ECHO_BOAT);
    }
}
