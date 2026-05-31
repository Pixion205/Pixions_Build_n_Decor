package net.pixion.pixions_bnd.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pixion.pixions_bnd.PixionsBnD;
import net.pixion.pixions_bnd.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PixionsBnD.MODID);

    // --- OAK ---
    public static final RegistryObject<Block> OAK_LUMBER = registerBlock("oak_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> OAK_TRIM = registerBlock("oak_trim",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> OAK_MOSAIC = registerBlock("oak_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",
            () -> new StairBlock(() -> ModBlocks.OAK_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    // --- SPRUCE ---
    public static final RegistryObject<Block> SPRUCE_LUMBER = registerBlock("spruce_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG)));

    public static final RegistryObject<Block> SPRUCE_TRIM = registerBlock("spruce_trim",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs",
            () -> new StairBlock(() -> ModBlocks.SPRUCE_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    // --- BIRCH ---
    public static final RegistryObject<Block> BIRCH_LUMBER = registerBlock("birch_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG)));

    public static final RegistryObject<Block> BIRCH_TRIM = registerBlock("birch_trim",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> BIRCH_MOSAIC = registerBlock("birch_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs",
            () -> new StairBlock(() -> ModBlocks.BIRCH_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    // --- JUNGLE ---
    public static final RegistryObject<Block> JUNGLE_LUMBER = registerBlock("jungle_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG)));

    public static final RegistryObject<Block> JUNGLE_TRIM = registerBlock("jungle_trim",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> JUNGLE_MOSAIC = registerBlock("jungle_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> JUNGLE_MOSAIC_STAIRS = registerBlock("jungle_mosaic_stairs",
            () -> new StairBlock(() -> ModBlocks.JUNGLE_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> JUNGLE_MOSAIC_SLAB = registerBlock("jungle_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));

    // --- ACACIA ---
    public static final RegistryObject<Block> ACACIA_LUMBER = registerBlock("acacia_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG)));

    public static final RegistryObject<Block> ACACIA_TRIM = registerBlock("acacia_trim",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> ACACIA_MOSAIC = registerBlock("acacia_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs",
            () -> new StairBlock(() -> ModBlocks.ACACIA_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    // --- DARK OAK ---
    public static final RegistryObject<Block> DARK_OAK_LUMBER = registerBlock("dark_oak_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG)));

    public static final RegistryObject<Block> DARK_OAK_TRIM = registerBlock("dark_oak_trim",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_OAK_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    // --- MANGROVE ---
    public static final RegistryObject<Block> MANGROVE_LUMBER = registerBlock("mangrove_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG)));

    public static final RegistryObject<Block> MANGROVE_TRIM = registerBlock("mangrove_trim",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs",
            () -> new StairBlock(() -> ModBlocks.MANGROVE_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    // --- CHERRY ---
    public static final RegistryObject<Block> CHERRY_LUMBER = registerBlock("cherry_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG)));

    public static final RegistryObject<Block> CHERRY_TRIM = registerBlock("cherry_trim",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> CHERRY_MOSAIC = registerBlock("cherry_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CHERRY_MOSAIC_STAIRS = registerBlock("cherry_mosaic_stairs",
            () -> new StairBlock(() -> ModBlocks.CHERRY_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CHERRY_MOSAIC_SLAB = registerBlock("cherry_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    // --- CRIMSON ---
    public static final RegistryObject<Block> CRIMSON_LUMBER = registerBlock("crimson_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM)));

    public static final RegistryObject<Block> CRIMSON_TRIM = registerBlock("crimson_trim",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> CRIMSON_MOSAIC = registerBlock("crimson_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_MOSAIC_STAIRS = registerBlock("crimson_mosaic_stairs",
            () -> new StairBlock(() -> ModBlocks.CRIMSON_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_MOSAIC_SLAB = registerBlock("crimson_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    // --- WARPED ---
    public static final RegistryObject<Block> WARPED_LUMBER = registerBlock("warped_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_STEM)));

    public static final RegistryObject<Block> WARPED_TRIM = registerBlock("warped_trim",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> WARPED_MOSAIC = registerBlock("warped_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
    public static final RegistryObject<Block> WARPED_MOSAIC_STAIRS = registerBlock("warped_mosaic_stairs",
            () -> new StairBlock(() -> ModBlocks.WARPED_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));
    public static final RegistryObject<Block> WARPED_MOSAIC_SLAB = registerBlock("warped_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
