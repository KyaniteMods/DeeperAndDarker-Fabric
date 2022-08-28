package com.kyanite.deeperdarker.registry.blocks.entity;

import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.registry.blocks.DDBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class DDBlockEntityTypes {
    public static BlockEntityType<DDSignBlockEntity> SIGN_BLOCK_ENTITIES;

    public static void registerBlockEntities() {
        DeeperAndDarker.LOGGER.info("Deeper And Darker block entities have been registered");
   //     SIGN_BLOCK_ENTITIES = Registry.register(Registry.BLOCK_ENTITY_TYPE,
   //             new ResourceLocation(DeeperAndDarker.MOD_ID, "sign_block_entities"),
      //          FabricBlockEntityTypeBuilder.create(DDSignBlockEntity::new, DDBlocks.ECHO_WALL_SIGN, DDBlocks.ECHO_SIGN).build(null));
    }
}