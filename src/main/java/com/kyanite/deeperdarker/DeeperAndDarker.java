package com.kyanite.deeperdarker;

import com.kyanite.deeperdarker.miscellaneous.DDTypes;
import com.kyanite.deeperdarker.registry.blocks.DDBlocks;
import com.kyanite.deeperdarker.registry.blocks.entity.DDBlockEntityTypes;
import com.kyanite.deeperdarker.registry.effects.DDEffects;
import com.kyanite.deeperdarker.registry.enchantments.DDEnchantments;
import com.kyanite.deeperdarker.registry.entities.DDEntities;
import com.kyanite.deeperdarker.registry.entities.custom.SculkLeechEntity;
import com.kyanite.deeperdarker.registry.entities.custom.SculkSnapperEntity;
import com.kyanite.deeperdarker.registry.entities.custom.SculkWormEntity;
import com.kyanite.deeperdarker.registry.entities.custom.ShatteredEntity;
import com.kyanite.deeperdarker.registry.items.DDItems;
import com.kyanite.deeperdarker.registry.potions.DDPotions;
import com.kyanite.deeperdarker.registry.sounds.DDSounds;
import com.kyanite.deeperdarker.registry.world.biomes.OthersideBiomes;
import com.kyanite.deeperdarker.registry.world.dimension.DDDimensions;
import com.kyanite.deeperdarker.registry.world.features.DDConfiguredFeatures;
import com.kyanite.deeperdarker.registry.world.features.DDFeatures;
import com.kyanite.deeperdarker.registry.world.features.DDPlacedFeatures;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.kyrptonaught.customportalapi.CustomPortalBlock;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.kyrptonaught.customportalapi.portal.PortalIgnitionSource;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.levelgen.Heightmap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class DeeperAndDarker implements ModInitializer {
    public static final String MOD_ID = "deeperdarker";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        GeckoLib.initialize();

        DDTypes.registerTypes();
        // Features
        DDFeatures.registerFeatures();
        DDConfiguredFeatures.registerConfiguredFeatures();
        DDPlacedFeatures.registerPlacedFeatures();
        DDDimensions.dimension();
        OthersideBiomes.createBiomes();

        // Content
        DDEffects.registerEffects();
        DDPotions.registerPotions();
        DDEntities.registerEntities();
        DDBlocks.registerBlocks();
        DDItems.registerItems();
        DDSounds.registerSounds();
        DDEnchantments.registerEnchantments();

        // Entity attributes
        FabricDefaultAttributeRegistry.register(DDEntities.SHATTERED, ShatteredEntity.attributes());
        FabricDefaultAttributeRegistry.register(DDEntities.SCULK_LEECH, SculkLeechEntity.attributes());
        FabricDefaultAttributeRegistry.register(DDEntities.SCULK_WORM, SculkWormEntity.attributes());
        FabricDefaultAttributeRegistry.register(DDEntities.SCULK_SNAPPER, SculkSnapperEntity.attributes());

        // Portal ignition
        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.REINFORCED_DEEPSLATE)
                .customIgnitionSource(PortalIgnitionSource.ItemUseSource(DDItems.HEART_OF_THE_DEEP))
                .destDimID(new ResourceLocation(DeeperAndDarker.MOD_ID, "otherside"))
                .tintColor(5, 98, 93)
                .customPortalBlock((CustomPortalBlock) DDBlocks.OTHERSIDE_PORTAL)
                .forcedSize(20, 6)
                .registerPortal();

        // Other
        ComposterBlock.COMPOSTABLES.put(DDBlocks.ECHO_LEAVES.asItem(), 0.3f);
        ComposterBlock.COMPOSTABLES.put(DDBlocks.SCULK_GLEAM.asItem(), 0.65f);
        ComposterBlock.COMPOSTABLES.put(DDBlocks.SCULK_VINES.asItem(), 0.5f);

        PotionBrewing.addMix(Potions.INVISIBILITY, DDItems.SOUL_DUST, DDPotions.SCULK_AFFINITY);
        // Spawn placements
        SpawnPlacements.register(DDEntities.SCULK_SNAPPER, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);
        SpawnPlacements.register(DDEntities.SHATTERED, SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Mob::checkMobSpawnRules);
    }
}
