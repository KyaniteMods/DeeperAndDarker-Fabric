package com.kyanite.deeperdarker.registry.blocks;

import com.kyanite.deeperdarker.DeeperAndDarker;
import com.kyanite.deeperdarker.miscellaneous.DDCreativeModeTab;
import com.kyanite.deeperdarker.registry.items.DDItems;
import com.kyanite.deeperdarker.registry.sounds.DDSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

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
