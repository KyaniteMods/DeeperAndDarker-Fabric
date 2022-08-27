package com.kyanite.deeperdarker.registry.items;

import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.miscellaneous.DDArmorMaterials;
import com.kyanite.deeperdarker.miscellaneous.DDCreativeModeTab;
import com.kyanite.deeperdarker.registry.items.custom.SculkTransmitterItem;
import com.kyanite.deeperdarker.registry.items.custom.WardenArmorItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DDItems {
    public static final Map<String, Item> REGISTERED_ITEMS = new HashMap<>();
    public static final Item HEART_OF_THE_DEEP = registerItem("heart_of_the_deep", new Item(new FabricItemSettings().group(DDCreativeModeTab.TAB).stacksTo(1).rarity(Rarity.EPIC).fireResistant()));
    public static final Item REINFORCED_ECHO_SHARD = registerItem("reinforced_echo_shard", new Item(new FabricItemSettings().group(DDCreativeModeTab.TAB).rarity(Rarity.EPIC).fireResistant()));
    public static final Item WARDEN_CARAPACE = registerItem("warden_carapace", new Item(new FabricItemSettings().group(DDCreativeModeTab.TAB).rarity(Rarity.EPIC).fireResistant()));
    public static final Item SOUL_DUST = registerItem("soul_dust", new Item(new FabricItemSettings().group(DDCreativeModeTab.TAB).rarity(Rarity.EPIC).fireResistant()));
    public static final Item SCULK_TRANSMITTER = registerItem("sculk_transmitter", new SculkTransmitterItem(new FabricItemSettings().group(DDCreativeModeTab.TAB).stacksTo(1).rarity(Rarity.EPIC).fireResistant()));

    public static final Item WARDEN_HELMET = registerItem("warden_helmet", new WardenArmorItem(DDArmorMaterials.WARDEN, EquipmentSlot.HEAD, new FabricItemSettings().group(DDCreativeModeTab.TAB).rarity(Rarity.EPIC).fireResistant()));
    public static final Item WARDEN_CHESTPLATE = registerItem("warden_chestplate", new WardenArmorItem(DDArmorMaterials.WARDEN, EquipmentSlot.CHEST, new FabricItemSettings().group(DDCreativeModeTab.TAB).rarity(Rarity.EPIC).fireResistant()));
    public static final Item WARDEN_LEGGINGS = registerItem("warden_leggings", new WardenArmorItem(DDArmorMaterials.WARDEN, EquipmentSlot.LEGS, new FabricItemSettings().group(DDCreativeModeTab.TAB).rarity(Rarity.EPIC).fireResistant()));
    public static final Item WARDEN_BOOTS = registerItem("warden_boots", new WardenArmorItem(DDArmorMaterials.WARDEN, EquipmentSlot.FEET, new FabricItemSettings().group(DDCreativeModeTab.TAB).rarity(Rarity.EPIC).fireResistant()));
    public static Item registerItem(String name, Item item) {
        Item result = Registry.register(Registry.ITEM, new ResourceLocation(DeeperAndDarker.MOD_ID, name), item);
        REGISTERED_ITEMS.put(name, result);
        return result;
    }
    public static void registerItems() {
        DeeperAndDarker.LOGGER.info("Deeper And Darker items have been registered");
    }
}
