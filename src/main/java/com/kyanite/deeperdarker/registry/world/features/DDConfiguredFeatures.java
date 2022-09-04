package com.kyanite.deeperdarker.registry.world.features;

import com.google.common.collect.ImmutableList;
import com.kyanite.deeperdarker.DeeperAndDarker;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;
import java.util.function.Supplier;

public class DDConfiguredFeatures {
    // Features
    public static final ConfiguredFeature EXTRA_SCULK_GLEAM = register("extra_sculk_gleam", DDFeatures.SCULK_GLEAM_BLOB);
    public static final ConfiguredFeature OTHERSIDE_PILLAR = register("otherside_pillar", DDFeatures.OTHERSIDE_PILLAR);
    public static final ConfiguredFeature ECHO_TREE = register("echo_tree", DDFeatures.ECHO_TREE);
    public static final ConfiguredFeature SCULK_VINES = register("sculk_vines", DDFeatures.SCULK_VINES);

    // Decoration Gen
    public static final ConfiguredFeature ORE_SCULK = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_sculk"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.SCULK_TARGET_LIST.get(), 64)));
    public static final ConfiguredFeature ORE_ECHO_SAND = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_echo_sand"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.ECHO_SAND_TARGET_LIST.get(), 32)));
    public static final ConfiguredFeature ORE_INFESTED_SCULK = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_infested_sculk"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.INFESTED_SCULK_TARGET_LIST.get(), 3)));
    public static final ConfiguredFeature ORE_SCULK_JAW = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_sculk_jaw"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.SCULK_JAW_TARGET_LIST.get(), 8)));

    // Otherside Ores
    public static final ConfiguredFeature ORE_COAL_SCULK = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_coal_sculk"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.ORE_COAL_TARGET_LIST.get(), 8, 0.1f)));
    public static final ConfiguredFeature ORE_IRON_SCULK = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_iron_sculk"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.ORE_IRON_TARGET_LIST.get(), 7)));
    public static final ConfiguredFeature ORE_COPPER_SCULK = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_copper_sculk"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.ORE_COPPER_TARGET_LIST.get(), 6, 0.2f)));
    public static final ConfiguredFeature ORE_GOLD_SCULK = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_gold_sculk"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.ORE_IRON_TARGET_LIST.get(), 7)));
    public static final ConfiguredFeature ORE_REDSTONE_SCULK = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_redstone_sculk"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.ORE_REDSTONE_TARGET_LIST.get(), 6, 0.1f)));
    public static final ConfiguredFeature ORE_EMERALD_SCULK = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_emerald_sculk"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.ORE_EMERALD_TARGET_LIST.get(), 6, 0.4f)));
    public static final ConfiguredFeature ORE_LAPIS_SCULK = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_lapis_sculk"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.ORE_LAPIS_TARGET_LIST.get(), 7)));
    public static final ConfiguredFeature ORE_DIAMOND_SCULK = Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
            new ResourceLocation(DeeperAndDarker.MOD_ID, "ore_diamond_sculk"), new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DDTargetLists.ORE_DIAMOND_TARGET_LIST.get(), 5, 0.7f)));

    public static <F extends Feature<NoneFeatureConfiguration>> ConfiguredFeature register(String id, Feature feature) {
        Supplier<NoneFeatureConfiguration> configuration = () -> NoneFeatureConfiguration.INSTANCE;
        ConfiguredFeature configuredFeature = new ConfiguredFeature<>(feature, configuration.get());
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(DeeperAndDarker.MOD_ID, id), configuredFeature);
        return new ConfiguredFeature<>(feature, configuration.get());
    }

    public static void registerConfiguredFeatures() {

    }
}
