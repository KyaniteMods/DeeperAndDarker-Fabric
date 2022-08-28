package com.kyanite.deeperdarker;

import com.kyanite.deeperdarker.registry.blocks.DDBlocks;
import com.kyanite.deeperdarker.registry.blocks.entity.DDBlockEntityTypes;
import com.kyanite.deeperdarker.registry.effects.DDEffects;
import com.kyanite.deeperdarker.registry.enchantments.DDEnchantments;
import com.kyanite.deeperdarker.registry.items.DDItems;
import com.kyanite.deeperdarker.registry.sounds.DDSounds;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class DeeperAndDarker implements ModInitializer {
    public static final String MOD_ID = "deeperdarker";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        GeckoLib.initialize();

        DDItems.registerItems();
        DDBlocks.registerBlocks();
        DDSounds.registerSounds();
        DDBlockEntityTypes.registerBlockEntities();
        DDEnchantments.registerEnchantments();
        DDEffects.registerEffects();
    }
}
