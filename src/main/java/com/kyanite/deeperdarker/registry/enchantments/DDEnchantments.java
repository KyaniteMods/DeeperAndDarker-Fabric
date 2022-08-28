package com.kyanite.deeperdarker.registry.enchantments;

import com.kyanite.deeperdarker.DeeperAndDarker;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class DDEnchantments {
    public static void registerEnchantments() {
        Registry.register(Registry.ENCHANTMENT, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_smite"), new SculkSmiteEnchant(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
    }
}
