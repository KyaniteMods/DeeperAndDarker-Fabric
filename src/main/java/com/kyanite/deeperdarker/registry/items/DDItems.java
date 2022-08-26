package com.kyanite.deeperdarker.registry.items;

import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.miscellaneous.DDCreativeModeTab;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import java.util.HashMap;
import java.util.Map;

public class DDItems {
    public static final Item HEART_OF_THE_DEEP = registerItem("heart_of_the_deep", new Item(new FabricItemSettings().group(DDCreativeModeTab.TAB).stacksTo(1).rarity(Rarity.EPIC).fireResistant()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new ResourceLocation(DeeperAndDarker.MOD_ID, name), item);
    }
}
