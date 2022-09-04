package com.kyanite.deeperdarker.datagen.recipes;

import com.google.common.collect.ImmutableList;
import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.miscellaneous.DDTags;
import com.kyanite.deeperdarker.registry.blocks.DDBlocks;
import com.kyanite.deeperdarker.registry.items.DDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class CraftingRecipeProvider extends FabricRecipeProvider {
    public CraftingRecipeProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<FinishedRecipe> exporter) {
        woodFromLogs(exporter, DDBlocks.ECHO_WOOD, DDBlocks.ECHO_LOG);
        woodFromLogs(exporter, DDBlocks.STRIPPED_ECHO_WOOD, DDBlocks.STRIPPED_ECHO_LOG);
        planksFromLogs(exporter, DDBlocks.ECHO_PLANKS, DDTags.Items.ECHO_LOGS);
        slabBuilder(DDBlocks.ECHO_SLAB, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy("has_echo_planks", has(DDBlocks.ECHO_PLANKS)).save(exporter);
        stairBuilder(DDBlocks.ECHO_STAIRS, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy("has_echo_planks", has(DDBlocks.ECHO_PLANKS)).save(exporter);
        fenceBuilder(DDBlocks.ECHO_FENCE, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy("has_echo_planks", has(DDBlocks.ECHO_PLANKS)).save(exporter);
        buttonBuilder(DDBlocks.ECHO_BUTTON, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy("has_echo_planks", has(DDBlocks.ECHO_PLANKS)).save(exporter);
        pressurePlateBuilder(DDBlocks.ECHO_PRESSURE_PLATE, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy("has_echo_planks", has(DDBlocks.ECHO_PLANKS)).save(exporter);
        doorBuilder(DDBlocks.ECHO_DOOR, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy("has_echo_planks", has(DDBlocks.ECHO_PLANKS)).save(exporter);
        trapdoorBuilder(DDBlocks.ECHO_TRAPDOOR, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy("has_echo_planks", has(DDBlocks.ECHO_PLANKS)).save(exporter);
        fenceGateBuilder(DDBlocks.ECHO_FENCE_GATE, Ingredient.of(DDBlocks.ECHO_PLANKS)).unlockedBy("has_echo_planks", has(DDBlocks.ECHO_PLANKS)).save(exporter);
        woodenBoat(exporter, DDItems.ECHO_BOAT, DDBlocks.ECHO_PLANKS);
        ShapelessRecipeBuilder.shapeless(DDItems.ECHO_CHEST_BOAT).requires(Blocks.CHEST).requires(DDItems.ECHO_BOAT).group("chest_boat").unlockedBy("has_boat", has(ItemTags.BOATS)).save(exporter);

        slabBuilder(DDBlocks.SCULK_STONE_SLAB, Ingredient.of(DDBlocks.SCULK_STONE)).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter);
        stairBuilder(DDBlocks.SCULK_STONE_STAIRS, Ingredient.of(DDBlocks.SCULK_STONE)).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter);
        wallBuilder(DDBlocks.SCULK_STONE_WALL, Ingredient.of(DDBlocks.SCULK_STONE)).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter);

        slabBuilder(DDBlocks.COBBLED_SCULK_STONE_SLAB, Ingredient.of(DDBlocks.COBBLED_SCULK_STONE)).unlockedBy("has_cobbled_sculk_stone", has(DDBlocks.COBBLED_SCULK_STONE)).save(exporter);
        stairBuilder(DDBlocks.COBBLED_SCULK_STONE_STAIRS, Ingredient.of(DDBlocks.COBBLED_SCULK_STONE)).unlockedBy("has_cobbled_sculk_stone", has(DDBlocks.COBBLED_SCULK_STONE)).save(exporter);
        wallBuilder(DDBlocks.COBBLED_SCULK_STONE_WALL, Ingredient.of(DDBlocks.COBBLED_SCULK_STONE)).unlockedBy("has_cobbled_sculk_stone", has(DDBlocks.COBBLED_SCULK_STONE)).save(exporter);

        polishedBuilder(DDBlocks.POLISHED_SCULK_STONE, Ingredient.of(DDBlocks.SCULK_STONE)).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter);
        slabBuilder(DDBlocks.POLISHED_SCULK_STONE_SLAB, Ingredient.of(DDBlocks.POLISHED_SCULK_STONE)).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE)).save(exporter);
        stairBuilder(DDBlocks.POLISHED_SCULK_STONE_STAIRS, Ingredient.of(DDBlocks.POLISHED_SCULK_STONE)).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE)).save(exporter);
        wallBuilder(DDBlocks.POLISHED_SCULK_STONE_WALL, Ingredient.of(DDBlocks.POLISHED_SCULK_STONE)).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE)).save(exporter);

        polishedBuilder(DDBlocks.SCULK_STONE_BRICKS, Ingredient.of(DDBlocks.POLISHED_SCULK_STONE)).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE)).save(exporter);
        slabBuilder(DDBlocks.SCULK_STONE_BRICK_SLAB, Ingredient.of(DDBlocks.SCULK_STONE_BRICKS)).unlockedBy("has_sculk_stone_bricks", has(DDBlocks.SCULK_STONE_BRICKS)).save(exporter);
        stairBuilder(DDBlocks.SCULK_STONE_BRICK_STAIRS, Ingredient.of(DDBlocks.SCULK_STONE_BRICKS)).unlockedBy("has_sculk_stone_bricks", has(DDBlocks.SCULK_STONE_BRICKS)).save(exporter);
        wallBuilder(DDBlocks.SCULK_STONE_BRICK_WALL, Ingredient.of(DDBlocks.SCULK_STONE_BRICKS)).unlockedBy("has_sculk_stone_bricks", has(DDBlocks.SCULK_STONE_BRICKS)).save(exporter);

        ShapedRecipeBuilder.shaped(DDItems.REINFORCED_ECHO_SHARD, 1)
                .define('P', Items.PHANTOM_MEMBRANE)
                .define('E', Items.ECHO_SHARD)
                .define('C', DDItems.WARDEN_CARAPACE)
                .pattern("PEP")
                .pattern("ECE")
                .pattern("PEP")
                .unlockedBy("has_warden_carapace", has(DDItems.WARDEN_CARAPACE)).save(exporter);

        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_HELMET), Ingredient.of(DDItems.REINFORCED_ECHO_SHARD), DDItems.WARDEN_HELMET).unlocks("has_reinforced_echo_shard", has(DDItems.REINFORCED_ECHO_SHARD)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "warden_helmet_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_CHESTPLATE), Ingredient.of(DDItems.REINFORCED_ECHO_SHARD), DDItems.WARDEN_CHESTPLATE).unlocks("has_reinforced_echo_shard", has(DDItems.REINFORCED_ECHO_SHARD)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "warden_chestplate_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_LEGGINGS), Ingredient.of(DDItems.REINFORCED_ECHO_SHARD), DDItems.WARDEN_LEGGINGS).unlocks("has_reinforced_echo_shard", has(DDItems.REINFORCED_ECHO_SHARD)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "warden_leggings_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_BOOTS), Ingredient.of(DDItems.REINFORCED_ECHO_SHARD), DDItems.WARDEN_BOOTS).unlocks("has_reinforced_echo_shard", has(DDItems.REINFORCED_ECHO_SHARD)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "warden_boots_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_SWORD), Ingredient.of(DDItems.REINFORCED_ECHO_SHARD), DDItems.WARDEN_SWORD).unlocks("has_reinforced_echo_shard", has(DDItems.REINFORCED_ECHO_SHARD)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "warden_sword_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_SHOVEL), Ingredient.of(DDItems.REINFORCED_ECHO_SHARD), DDItems.WARDEN_SHOVEL).unlocks("has_reinforced_echo_shard", has(DDItems.REINFORCED_ECHO_SHARD)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "warden_shovel_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_PICKAXE), Ingredient.of(DDItems.REINFORCED_ECHO_SHARD), DDItems.WARDEN_PICKAXE).unlocks("has_reinforced_echo_shard", has(DDItems.REINFORCED_ECHO_SHARD)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "warden_pickaxe_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_AXE), Ingredient.of(DDItems.REINFORCED_ECHO_SHARD), DDItems.WARDEN_AXE).unlocks("has_reinforced_echo_shard", has(DDItems.REINFORCED_ECHO_SHARD)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "warden_axe_smithing"));
        UpgradeRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_HOE), Ingredient.of(DDItems.REINFORCED_ECHO_SHARD), DDItems.WARDEN_HOE).unlocks("has_reinforced_echo_shard", has(DDItems.REINFORCED_ECHO_SHARD)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "warden_hoe_smithing"));

        oreSmelting(exporter, ImmutableList.of(DDBlocks.COBBLED_SCULK_STONE), DDBlocks.SCULK_STONE, 0.1F, 200, "sculk_stone");
        oreSmelting(exporter, ImmutableList.of(DDBlocks.COBBLED_SCULK_STONE_SLAB), DDBlocks.SCULK_STONE_SLAB, 0.1F, 200, "sculk_stone_slab");
        oreSmelting(exporter, ImmutableList.of(DDBlocks.COBBLED_SCULK_STONE_STAIRS), DDBlocks.SCULK_STONE_STAIRS, 0.1F, 200, "sculk_stone_stairs");
        oreSmelting(exporter, ImmutableList.of(DDBlocks.COBBLED_SCULK_STONE_WALL), DDBlocks.SCULK_STONE_WALL, 0.1F, 200, "sculk_stone_wall");

        oreSmelting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_COAL_ORE), Items.COAL, 0.2F, 200, "coal");
        oreSmelting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_IRON_ORE), Items.IRON_INGOT, 1.4F, 200, "iron_ingot");
        oreSmelting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_COPPER_ORE), Items.COPPER_INGOT, 1.4F, 200, "copper_ingot");
        oreSmelting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_GOLD_ORE), Items.GOLD_INGOT, 2.0F, 200, "gold_ingot");
        oreSmelting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_REDSTONE_ORE), Items.REDSTONE, 1.4F, 200, "redstone");
        oreSmelting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_EMERALD_ORE), Items.EMERALD, 2.0F, 200, "emerald");
        oreSmelting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_LAPIS_ORE), Items.LAPIS_LAZULI, 0.4F, 200, "lapis_lazuli");
        oreSmelting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_DIAMOND_ORE), Items.DIAMOND, 2.0F, 200, "diamond");

        oreBlasting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_COAL_ORE), Items.COAL, 0.2F, 100, "coal");
        oreBlasting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_IRON_ORE), Items.IRON_INGOT, 1.4F, 100, "iron_ingot");
        oreBlasting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_COPPER_ORE), Items.COPPER_INGOT, 1.4F, 100, "copper_ingot");
        oreBlasting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_GOLD_ORE), Items.GOLD_INGOT, 2.0F, 100, "gold_ingot");
        oreBlasting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_REDSTONE_ORE), Items.REDSTONE, 1.4F, 100, "redstone");
        oreBlasting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_EMERALD_ORE), Items.EMERALD, 2.0F, 100, "emerald");
        oreBlasting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_LAPIS_ORE), Items.LAPIS_LAZULI, 0.4F, 100, "lapis_lazuli");
        oreBlasting(exporter, ImmutableList.of(DDBlocks.SCULK_STONE_DIAMOND_ORE), Items.DIAMOND, 2.0F, 100, "diamond");

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE), DDBlocks.SCULK_STONE_SLAB, 2).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_slab_from_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE), DDBlocks.SCULK_STONE_STAIRS, 1).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_stairs_from_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE), DDBlocks.SCULK_STONE_WALL, 1).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_wall_from_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE), DDBlocks.POLISHED_SCULK_STONE, 1).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "polished_sculk_stone_from_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE), DDBlocks.POLISHED_SCULK_STONE_SLAB, 2).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "polished_sculk_stone_slab_from_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE), DDBlocks.POLISHED_SCULK_STONE_STAIRS, 1).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "polished_sculk_stone_stairs_from_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE), DDBlocks.POLISHED_SCULK_STONE_WALL, 1).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "polished_sculk_stone_wall_from_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE), DDBlocks.SCULK_STONE_BRICKS, 1).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_bricks_from_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE), DDBlocks.SCULK_STONE_BRICK_SLAB, 2).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_brick_slab_from_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE), DDBlocks.SCULK_STONE_BRICK_STAIRS, 1).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_brick_stairs_from_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE), DDBlocks.SCULK_STONE_BRICK_WALL, 1).unlockedBy("has_sculk_stone", has(DDBlocks.SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_brick_wall_from_sculk_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.COBBLED_SCULK_STONE), DDBlocks.COBBLED_SCULK_STONE_SLAB, 2).unlockedBy("has_cobbled_sculk_stone", has(DDBlocks.COBBLED_SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "cobbled_sculk_stone_slab_from_cobbled_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.COBBLED_SCULK_STONE), DDBlocks.COBBLED_SCULK_STONE_STAIRS, 1).unlockedBy("has_cobbled_sculk_stone", has(DDBlocks.COBBLED_SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "cobbled_sculk_stone_stairs_from_cobbled_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.COBBLED_SCULK_STONE), DDBlocks.COBBLED_SCULK_STONE_WALL, 1).unlockedBy("has_cobbled_sculk_stone", has(DDBlocks.COBBLED_SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "cobbled_sculk_stone_wall_from_cobbled_sculk_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.POLISHED_SCULK_STONE), DDBlocks.POLISHED_SCULK_STONE_SLAB, 2).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "polished_sculk_stone_slab_from_polished_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.POLISHED_SCULK_STONE), DDBlocks.POLISHED_SCULK_STONE_STAIRS, 1).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "polished_sculk_stone_stairs_from_polished_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.POLISHED_SCULK_STONE), DDBlocks.POLISHED_SCULK_STONE_WALL, 1).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "polished_sculk_stone_wall_from_polished_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.POLISHED_SCULK_STONE), DDBlocks.SCULK_STONE_BRICKS, 1).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_bricks_from_polished_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.POLISHED_SCULK_STONE), DDBlocks.SCULK_STONE_BRICK_SLAB, 2).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_brick_slab_from_polished_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.POLISHED_SCULK_STONE), DDBlocks.SCULK_STONE_BRICK_STAIRS, 1).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_brick_stairs_from_polished_sculk_stone_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.POLISHED_SCULK_STONE), DDBlocks.SCULK_STONE_BRICK_WALL, 1).unlockedBy("has_polished_sculk_stone", has(DDBlocks.POLISHED_SCULK_STONE)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_brick_wall_from_polished_sculk_stone_stonecutting"));

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE_BRICKS), DDBlocks.SCULK_STONE_BRICK_SLAB, 2).unlockedBy("has_sculk_stone_bricks", has(DDBlocks.SCULK_STONE_BRICKS)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_brick_slab_from_sculk_stone_bricks_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE_BRICKS), DDBlocks.SCULK_STONE_BRICK_STAIRS, 1).unlockedBy("has_sculk_stone_bricks", has(DDBlocks.SCULK_STONE_BRICKS)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_brick_stairs_from_sculk_stone_bricks_stonecutting"));
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(DDBlocks.SCULK_STONE_BRICKS), DDBlocks.SCULK_STONE_BRICK_WALL, 1).unlockedBy("has_sculk_stone_bricks", has(DDBlocks.SCULK_STONE_BRICKS)).save(exporter, new ResourceLocation(DeeperAndDarker.MOD_ID, "sculk_stone_brick_wall_from_sculk_stone_bricks_stonecutting"));

    }
}
