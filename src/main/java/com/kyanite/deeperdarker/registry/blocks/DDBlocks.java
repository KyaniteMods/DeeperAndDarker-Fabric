package com.kyanite.deeperdarker.registry.blocks;

import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.miscellaneous.DDCreativeModeTab;
import com.kyanite.deeperdarker.registry.blocks.custom.SculkJawBlock;
import com.kyanite.deeperdarker.registry.blocks.custom.vines.sculkvines.SculkVinesBlock;
import com.kyanite.deeperdarker.registry.blocks.custom.vines.sculkvines.SculkVinesPlantBlock;
import com.kyanite.deeperdarker.registry.items.DDItems;
import com.kyanite.deeperdarker.registry.sounds.DDSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;

import java.util.HashMap;
import java.util.Map;

public class DDBlocks {
    public static final Map<String, Block> BLOCKS = new HashMap<>();

    // Sculk Stone
    public static final Block SCULK_STONE = registerBlock("sculk_stone", true, new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(DDSounds.SCULK_STONE).requiresCorrectToolForDrops()));
    public static final Block SCULK_STONE_SLAB = registerBlock("sculk_stone_slab", true, new SlabBlock(BlockBehaviour.Properties.copy(SCULK_STONE)));
    public static final Block SCULK_STONE_STAIRS = registerBlock("sculk_stone_stairs", true, new StairBlock(SCULK_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(SCULK_STONE)));
    public static final Block SCULK_STONE_WALL = registerBlock("sculk_stone_wall", true, new WallBlock(BlockBehaviour.Properties.copy(SCULK_STONE)));

    // Cobbled
    public static final Block COBBLED_SCULK_STONE = registerBlock("cobbled_sculk_stone", true, new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(DDSounds.SCULK_STONE).requiresCorrectToolForDrops()));
    public static final Block COBBLED_SCULK_STONE_SLAB = registerBlock("cobbled_sculk_stone_slab", true, new SlabBlock(BlockBehaviour.Properties.copy(COBBLED_SCULK_STONE)));
    public static final Block COBBLED_SCULK_STONE_STAIRS = registerBlock("cobbled_sculk_stone_stairs", true, new StairBlock(COBBLED_SCULK_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(COBBLED_SCULK_STONE)));
    public static final Block COBBLED_SCULK_STONE_WALL = registerBlock("cobbled_sculk_stone_wall", true, new WallBlock(BlockBehaviour.Properties.copy(COBBLED_SCULK_STONE)));

    // Polished
    public static final Block POLISHED_SCULK_STONE = registerBlock("polished_sculk_stone", true, new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(DDSounds.SCULK_STONE).requiresCorrectToolForDrops()));
    public static final Block POLISHED_SCULK_STONE_SLAB = registerBlock("polished_sculk_stone_slab", true, new SlabBlock(BlockBehaviour.Properties.copy(POLISHED_SCULK_STONE)));
    public static final Block POLISHED_SCULK_STONE_STAIRS = registerBlock("polished_sculk_stone_stairs", true, new StairBlock(POLISHED_SCULK_STONE.defaultBlockState(), BlockBehaviour.Properties.copy(POLISHED_SCULK_STONE)));
    public static final Block POLISHED_SCULK_STONE_WALL = registerBlock("polished_sculk_stone_wall", true, new WallBlock(BlockBehaviour.Properties.copy(POLISHED_SCULK_STONE)));

    // Bricks
    public static final Block SCULK_STONE_BRICKS = registerBlock("sculk_stone_bricks", true, new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(DDSounds.SCULK_STONE).requiresCorrectToolForDrops()));
    public static final Block SCULK_STONE_BRICK_SLAB = registerBlock("sculk_stone_brick_slab", true, new SlabBlock(BlockBehaviour.Properties.copy(SCULK_STONE_BRICKS)));
    public static final Block SCULK_STONE_BRICK_STAIRS = registerBlock("sculk_stone_brick_stairs", true, new StairBlock(SCULK_STONE_BRICKS.defaultBlockState(), BlockBehaviour.Properties.copy(SCULK_STONE_BRICKS)));
    public static final Block SCULK_STONE_BRICK_WALL = registerBlock("sculk_stone_brick_wall", true, new WallBlock(BlockBehaviour.Properties.copy(SCULK_STONE_BRICKS)));

    // Sculk Stone Ores
    public static final Block SCULK_STONE_COAL_ORE = registerBlock("sculk_stone_coal_ore", true, new DropExperienceBlock(BlockBehaviour.Properties.copy(DDBlocks.SCULK_STONE), UniformInt.of(2, 4)));
    public static final Block SCULK_STONE_IRON_ORE = registerBlock("sculk_stone_iron_ore", true, new DropExperienceBlock(BlockBehaviour.Properties.copy(DDBlocks.SCULK_STONE), UniformInt.of(2, 4)));
    public static final Block SCULK_STONE_COPPER_ORE = registerBlock("sculk_stone_copper_ore", true, new DropExperienceBlock(BlockBehaviour.Properties.copy(DDBlocks.SCULK_STONE), UniformInt.of(2, 4)));
    public static final Block SCULK_STONE_GOLD_ORE = registerBlock("sculk_stone_gold_ore", true, new DropExperienceBlock(BlockBehaviour.Properties.copy(DDBlocks.SCULK_STONE), UniformInt.of(2, 4)));
    public static final Block SCULK_STONE_REDSTONE_ORE = registerBlock("sculk_stone_redstone_ore", true, new RedStoneOreBlock(BlockBehaviour.Properties.copy(DDBlocks.SCULK_STONE).randomTicks().lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 9 : 0)));
    public static final Block SCULK_STONE_EMERALD_ORE = registerBlock("sculk_stone_emerald_ore", true, new DropExperienceBlock(BlockBehaviour.Properties.copy(DDBlocks.SCULK_STONE), UniformInt.of(6, 14)));
    public static final Block SCULK_STONE_LAPIS_ORE = registerBlock("sculk_stone_lapis_ore", true, new DropExperienceBlock(BlockBehaviour.Properties.copy(DDBlocks.SCULK_STONE), UniformInt.of(4, 10)));
    public static final Block SCULK_STONE_DIAMOND_ORE = registerBlock("sculk_stone_diamond_ore", true, new DropExperienceBlock(BlockBehaviour.Properties.copy(DDBlocks.SCULK_STONE), UniformInt.of(6, 14)));

    // Vegetation
    public static final Block SCULK_VINES = registerBlock("sculk_vines", true, new SculkVinesBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.SCULK).noCollission().instabreak().randomTicks()));
    public static final Block SCULK_VINES_PLANT = registerBlock("sculk_vines_plant", false, new SculkVinesPlantBlock(BlockBehaviour.Properties.of(Material.PLANT).sound(SoundType.SCULK).noCollission().instabreak()));
    public static final Block SCULK_GLEAM = registerBlock("sculk_gleam", true, new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).lightLevel(state -> 15)));

    // Miscellaneous
    public static final Block SCULK_JAW = registerBlock("sculk_jaw", true, new SculkJawBlock(BlockBehaviour.Properties.copy(Blocks.SCULK).strength(6f)));
    public static Block registerBlock(String name, boolean createBlockItem, Block block) {
        Block result = Registry.register(Registry.BLOCK, new ResourceLocation(DeeperAndDarker.MOD_ID, name), block);
        BLOCKS.put(name, result);
        if(createBlockItem) DDItems.registerItem(name, new BlockItem(result, new FabricItemSettings().group(DDCreativeModeTab.TAB)));
        return result;
    }

    public static void registerBlocks() {
        DeeperAndDarker.LOGGER.info("Deeper And Darker blocks have been registered");
    }
}
