package com.kyanite.deeperdarker.registry.world.features;

import com.kyanite.deeperdarker.DeeperAndDarker;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class DDFeatures {
    public static SculkGleamFeature SCULK_GLEAM_BLOB = new SculkGleamFeature(NoneFeatureConfiguration.CODEC);
    public static SculkVinesFeature SCULK_VINES = new SculkVinesFeature(NoneFeatureConfiguration.CODEC);
    public static OthersidePillarFeature OTHERSIDE_PILLAR = new OthersidePillarFeature(NoneFeatureConfiguration.CODEC);
    public static EchoTreeFeature ECHO_TREE = new EchoTreeFeature(NoneFeatureConfiguration.CODEC);

    public static void registerFeatures() {
        Registry.register(Registry.FEATURE, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_gleam_blob"), SCULK_GLEAM_BLOB);
        Registry.register(Registry.FEATURE, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_vines"), SCULK_VINES);
        Registry.register(Registry.FEATURE, new ResourceLocation(DeeperAndDarker.MOD_ID, "otherside_pillar"), OTHERSIDE_PILLAR);
        Registry.register(Registry.FEATURE, new ResourceLocation(DeeperAndDarker.MOD_ID, "echo_tree"), ECHO_TREE);
    }
}
