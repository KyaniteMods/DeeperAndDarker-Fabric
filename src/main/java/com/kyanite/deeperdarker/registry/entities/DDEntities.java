package com.kyanite.deeperdarker.registry.entities;

import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.registry.entities.custom.*;
import com.kyanite.deeperdarker.registry.entities.custom.ai.SculkLeechMelee;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;

public class DDEntities {
    public static final Map<String, EntityType> ENTITIES = new HashMap<>();
    public static final EntityType<ShatteredEntity> SHATTERED = Registry.register(
            Registry.ENTITY_TYPE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "shattered"),
            FabricEntityTypeBuilder.create(MobCategory.MONSTER, ShatteredEntity::new).dimensions(EntityDimensions.fixed(0.85f, 2.45f)).build()
    );

    public static final EntityType<SculkLeechEntity> SCULK_LEECH = Registry.register(
            Registry.ENTITY_TYPE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_leech"),
            FabricEntityTypeBuilder.create(MobCategory.CREATURE, SculkLeechEntity::new).dimensions(EntityDimensions.fixed(0.3f, 0.2f)).build()
    );

    public static final EntityType<SculkSnapperEntity> SCULK_SNAPPER = Registry.register(
            Registry.ENTITY_TYPE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_snapper"),
            FabricEntityTypeBuilder.create(MobCategory.MONSTER, SculkSnapperEntity::new).dimensions(EntityDimensions.fixed(1, 1)).build()
    );

    public static final EntityType<SculkWormEntity> SCULK_WORM = Registry.register(
            Registry.ENTITY_TYPE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "shriek_worm"),
            FabricEntityTypeBuilder.create(MobCategory.MONSTER, SculkWormEntity::new).dimensions(EntityDimensions.fixed(1.5f, 5.7f)).build()
    );

    public static final EntityType<DDBoat> BOAT = Registry.register(
            Registry.ENTITY_TYPE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "boat"),
            FabricEntityTypeBuilder.create(MobCategory.MISC, DDBoat::new).dimensions(EntityDimensions.fixed(1.375F, 0.5625F)).build()
    );

    public static final EntityType<DDChestBoat> CHEST_BOAT = Registry.register(
            Registry.ENTITY_TYPE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "chest_boat"),
            FabricEntityTypeBuilder.create(MobCategory.MISC, DDChestBoat::new).dimensions(EntityDimensions.fixed(1.375F, 0.5625F)).build()
    );

    public static void registerEntities() {
        ENTITIES.put("shattered", SHATTERED);
        ENTITIES.put("sculk_leech", SCULK_LEECH);
        ENTITIES.put("sculk_snapper", SCULK_SNAPPER);

        DeeperAndDarker.LOGGER.info("Deeper And Darker entities have been registered");
    }
}
