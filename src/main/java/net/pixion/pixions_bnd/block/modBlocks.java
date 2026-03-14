package net.pixion.pixions_bnd.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.levelgen.Column;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pixion.pixions_bnd.PixionsBnD;
import net.pixion.pixions_bnd.item.modItems;

import java.util.function.Supplier;

public class modBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PixionsBnD.MODID);

    // --- OAK ---
    public static final RegistryObject<Block> OAK_LUMBER = registerBlock("oak_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));

    public static final RegistryObject<Block> TRIMMED_OAK_PLANKS = registerBlock("trimmed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> OAK_BOARDS = registerBlock("oak_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_BOARDS_STAIRS = registerBlock("oak_boards_stairs",
            () -> new StairBlock(() -> modBlocks.OAK_BOARDS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_BOARDS_SLAB = registerBlock("oak_boards_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_OAK_BOARDS = registerBlock("trimmed_oak_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> OAK_PANELS = registerBlock("oak_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_PANELS_STAIRS = registerBlock("oak_panels_stairs",
            () -> new StairBlock(() -> modBlocks.OAK_PANELS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_PANELS_SLAB = registerBlock("oak_panels_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_OAK_PANELS = registerBlock("trimmed_oak_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> OAK_MOSAIC = registerBlock("oak_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",
            () -> new StairBlock(() -> modBlocks.OAK_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    // --- SPRUCE ---
    public static final RegistryObject<Block> SPRUCE_LUMBER = registerBlock("spruce_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG)));

    public static final RegistryObject<Block> TRIMMED_SPRUCE_PLANKS = registerBlock("trimmed_spruce_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> SPRUCE_BOARDS = registerBlock("spruce_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_BOARDS_STAIRS = registerBlock("spruce_boards_stairs",
            () -> new StairBlock(() -> modBlocks.SPRUCE_BOARDS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_BOARDS_SLAB = registerBlock("spruce_boards_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_SPRUCE_BOARDS = registerBlock("trimmed_spruce_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> SPRUCE_PANELS = registerBlock("spruce_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_PANELS_STAIRS = registerBlock("spruce_panels_stairs",
            () -> new StairBlock(() -> modBlocks.SPRUCE_PANELS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_PANELS_SLAB = registerBlock("spruce_panels_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_SPRUCE_PANELS = registerBlock("trimmed_spruce_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    public static final RegistryObject<Block> SPRUCE_MOSAIC = registerBlock("spruce_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_MOSAIC_STAIRS = registerBlock("spruce_mosaic_stairs",
            () -> new StairBlock(() -> modBlocks.SPRUCE_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_MOSAIC_SLAB = registerBlock("spruce_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));

    // --- BIRCH ---
    public static final RegistryObject<Block> BIRCH_LUMBER = registerBlock("birch_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG)));

    public static final RegistryObject<Block> TRIMMED_BIRCH_PLANKS = registerBlock("trimmed_birch_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> BIRCH_BOARDS = registerBlock("birch_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_BOARDS_STAIRS = registerBlock("birch_boards_stairs",
            () -> new StairBlock(() -> modBlocks.BIRCH_BOARDS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_BOARDS_SLAB = registerBlock("birch_boards_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_BIRCH_BOARDS = registerBlock("trimmed_birch_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> BIRCH_PANELS = registerBlock("birch_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_PANELS_STAIRS = registerBlock("birch_panels_stairs",
            () -> new StairBlock(() -> modBlocks.BIRCH_PANELS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_PANELS_SLAB = registerBlock("birch_panels_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_BIRCH_PANELS = registerBlock("trimmed_birch_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    public static final RegistryObject<Block> BIRCH_MOSAIC = registerBlock("birch_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_MOSAIC_STAIRS = registerBlock("birch_mosaic_stairs",
            () -> new StairBlock(() -> modBlocks.BIRCH_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> BIRCH_MOSAIC_SLAB = registerBlock("birch_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));

    // --- ACACIA ---
    public static final RegistryObject<Block> ACACIA_LUMBER = registerBlock("acacia_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG)));

    public static final RegistryObject<Block> TRIMMED_ACACIA_PLANKS = registerBlock("trimmed_acacia_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> ACACIA_BOARDS = registerBlock("acacia_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_BOARDS_STAIRS = registerBlock("acacia_boards_stairs",
            () -> new StairBlock(() -> modBlocks.ACACIA_BOARDS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_BOARDS_SLAB = registerBlock("acacia_boards_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_ACACIA_BOARDS = registerBlock("trimmed_acacia_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> ACACIA_PANELS = registerBlock("acacia_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_PANELS_STAIRS = registerBlock("acacia_panels_stairs",
            () -> new StairBlock(() -> modBlocks.ACACIA_PANELS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_PANELS_SLAB = registerBlock("acacia_panels_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_ACACIA_PANELS = registerBlock("trimmed_acacia_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    public static final RegistryObject<Block> ACACIA_MOSAIC = registerBlock("acacia_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_MOSAIC_STAIRS = registerBlock("acacia_mosaic_stairs",
            () -> new StairBlock(() -> modBlocks.ACACIA_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> ACACIA_MOSAIC_SLAB = registerBlock("acacia_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));

    // --- DARK OAK ---
    public static final RegistryObject<Block> DARK_OAK_LUMBER = registerBlock("dark_oak_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG)));

    public static final RegistryObject<Block> TRIMMED_DARK_OAK_PLANKS = registerBlock("trimmed_dark_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> DARK_OAK_BOARDS = registerBlock("dark_oak_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_BOARDS_STAIRS = registerBlock("dark_oak_boards_stairs",
            () -> new StairBlock(() -> modBlocks.DARK_OAK_BOARDS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_BOARDS_SLAB = registerBlock("dark_oak_boards_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_DARK_OAK_BOARDS = registerBlock("trimmed_dark_oak_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> DARK_OAK_PANELS = registerBlock("dark_oak_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_PANELS_STAIRS = registerBlock("dark_oak_panels_stairs",
            () -> new StairBlock(() -> modBlocks.DARK_OAK_PANELS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_PANELS_SLAB = registerBlock("dark_oak_panels_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_DARK_OAK_PANELS = registerBlock("trimmed_dark_oak_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    public static final RegistryObject<Block> DARK_OAK_MOSAIC = registerBlock("dark_oak_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC_STAIRS = registerBlock("dark_oak_mosaic_stairs",
            () -> new StairBlock(() -> modBlocks.DARK_OAK_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC_SLAB = registerBlock("dark_oak_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));

    // --- MANGROVE ---
    public static final RegistryObject<Block> MANGROVE_LUMBER = registerBlock("mangrove_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG)));

    public static final RegistryObject<Block> TRIMMED_MANGROVE_PLANKS = registerBlock("trimmed_mangrove_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    public static final RegistryObject<Block> MANGROVE_BOARDS = registerBlock("mangrove_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_BOARDS_STAIRS = registerBlock("mangrove_boards_stairs",
            () -> new StairBlock(() -> modBlocks.MANGROVE_BOARDS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_BOARDS_SLAB = registerBlock("mangrove_boards_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_MANGROVE_BOARDS = registerBlock("trimmed_mangrove_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    public static final RegistryObject<Block> MANGROVE_PANELS = registerBlock("mangrove_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_PANELS_STAIRS = registerBlock("mangrove_panels_stairs",
            () -> new StairBlock(() -> modBlocks.MANGROVE_PANELS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_PANELS_SLAB = registerBlock("mangrove_panels_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_MANGROVE_PANELS = registerBlock("trimmed_mangrove_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    public static final RegistryObject<Block> MANGROVE_MOSAIC = registerBlock("mangrove_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_MOSAIC_STAIRS = registerBlock("mangrove_mosaic_stairs",
            () -> new StairBlock(() -> modBlocks.MANGROVE_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_MOSAIC_SLAB = registerBlock("mangrove_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));

    // --- AZURE ---
    public static final RegistryObject<Block> AZURE_LUMBER = registerBlock("azure_lumber",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG)));

    public static final RegistryObject<Block> AZURE_PLANKS = registerBlock("azure_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_STAIRS = registerBlock("azure_stairs",
            () -> new StairBlock(() -> modBlocks.AZURE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_SLAB = registerBlock("azure_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_AZURE_PLANKS = registerBlock("trimmed_azure_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    public static final RegistryObject<Block> AZURE_BOARDS = registerBlock("azure_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_BOARDS_STAIRS = registerBlock("azure_boards_stairs",
            () -> new StairBlock(() -> modBlocks.AZURE_BOARDS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_BOARDS_SLAB = registerBlock("azure_boards_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_AZURE_BOARDS = registerBlock("trimmed_azure_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    public static final RegistryObject<Block> AZURE_PANELS = registerBlock("azure_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_PANELS_STAIRS = registerBlock("azure_panels_stairs",
            () -> new StairBlock(() -> modBlocks.AZURE_PANELS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_PANELS_SLAB = registerBlock("azure_panels_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_AZURE_PANELS = registerBlock("trimmed_azure_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    public static final RegistryObject<Block> AZURE_MOSAIC = registerBlock("azure_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_MOSAIC_STAIRS = registerBlock("azure_mosaic_stairs",
            () -> new StairBlock(() -> modBlocks.AZURE_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_MOSAIC_SLAB = registerBlock("azure_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    public static final RegistryObject<Block> AZURE_DOOR = registerBlock("azure_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion(), BlockSetType.CHERRY));
    public static final RegistryObject<Block> AZURE_TRAPDOOR = registerBlock("azure_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion(), BlockSetType.CHERRY));

    public static final RegistryObject<Block> AZURE_FENCE = registerBlock("azure_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_FENCE_GATE = registerBlock("azure_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> AZURE_BUTTON = registerBlock("azure_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_BUTTON),
                    BlockSetType.CHERRY, 10, true));
    public static final RegistryObject<Block> AZURE_PRESSURE_PLATE = registerBlock("azure_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,  BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS),
                    BlockSetType.CHERRY));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return modItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
