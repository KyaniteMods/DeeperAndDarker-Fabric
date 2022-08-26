package com.kyanite.deeperdarker.miscellaneous;

import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.registry.items.DDItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class DDCreativeModeTab {
    public static final CreativeModeTab TAB = FabricItemGroupBuilder.build(
            new ResourceLocation(DeeperAndDarker.MOD_ID, "deeperdarkertab"), () -> new ItemStack(DDItems.HEART_OF_THE_DEEP));
}
