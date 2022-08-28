package com.kyanite.deeperdarker.client;

import com.kyanite.deeperdarker.client.rendering.armor.WardenArmorRenderer;
import com.kyanite.deeperdarker.registry.blocks.DDBlocks;
import com.kyanite.deeperdarker.registry.items.DDItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

@Environment(EnvType.CLIENT)
public class DeeperAndDarkerClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SCULK_VINES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.SCULK_VINES_PLANT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.ECHO_DOOR, RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DDBlocks.ECHO_TRAPDOOR, RenderType.translucent());

        GeoArmorRenderer.registerArmorRenderer(new WardenArmorRenderer(), DDItems.WARDEN_HELMET,
                DDItems.WARDEN_CHESTPLATE, DDItems.WARDEN_LEGGINGS, DDItems.WARDEN_BOOTS);
    }
}
