package com.kyanite.deeperdarker.client;

import com.kyanite.deeperdarker.client.rendering.armor.WardenArmorRenderer;
import com.kyanite.deeperdarker.client.rendering.entity.*;
import com.kyanite.deeperdarker.registry.blocks.DDBlocks;
import com.kyanite.deeperdarker.registry.entities.DDEntities;
import com.kyanite.deeperdarker.registry.entities.custom.SculkWormEntity;
import com.kyanite.deeperdarker.registry.items.DDItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import software.bernie.example.registry.EntityRegistry;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Environment(EnvType.CLIENT)
public class DeeperAndDarkerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SCULK_VINES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SCULK_VINES_PLANT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.ECHO_DOOR, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.ECHO_TRAPDOOR, RenderType.translucent());

        EntityRendererRegistry.register(DDEntities.SHATTERED, ShatteredRenderer::new);
        EntityRendererRegistry.register(DDEntities.SCULK_LEECH, SculkLeechRenderer::new);
        EntityRendererRegistry.register(DDEntities.SCULK_SNAPPER, SculkSnapperRenderer::new);
        EntityRendererRegistry.register(DDEntities.SCULK_WORM, SculkWormRenderer::new);

        DDBoatModels.registerLayers();

        EntityRendererRegistry.register(DDEntities.BOAT, context -> new DDBoatRenderer<>(context, false));
        EntityRendererRegistry.register(DDEntities.CHEST_BOAT, context -> new DDBoatRenderer<>(context, true));

        GeoArmorRenderer.registerArmorRenderer(new WardenArmorRenderer(), DDItems.WARDEN_HELMET,
                DDItems.WARDEN_CHESTPLATE, DDItems.WARDEN_LEGGINGS, DDItems.WARDEN_BOOTS);
    }
}
