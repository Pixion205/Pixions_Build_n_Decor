package net.pixion.pixions_bnd.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
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

    public static final RegistryObject<Block> TRIMMED_OAK_PLANKS = registerBlock("trimmed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_BOARDS = registerBlock("oak_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_OAK_BOARDS = registerBlock("trimmed_oak_boards",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_MOSAIC = registerBlock("oak_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_PANEL = registerBlock("oak_panel",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> TRIMMED_OAK_PLANKS_STAIRS = registerBlock("trimmed_oak_planks_stairs",
            () -> new StairBlock(() -> modBlocks.TRIMMED_OAK_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_OAK_PLANKS_SLAB = registerBlock("trimmed_oak_planks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_BOARDS_STAIRS = registerBlock("oak_boards_stairs",
            () -> new StairBlock(() -> modBlocks.OAK_BOARDS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_BOARDS_SLAB = registerBlock("oak_boards_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_OAK_BOARDS_STAIRS = registerBlock("trimmed_oak_boards_stairs",
            () -> new StairBlock(() -> modBlocks.TRIMMED_OAK_BOARDS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> TRIMMED_OAK_BOARDS_SLAB = registerBlock("trimmed_oak_boards_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_MOSAIC_STAIRS = registerBlock("oak_mosaic_stairs",
            () -> new StairBlock(() -> modBlocks.OAK_MOSAIC.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_MOSAIC_SLAB = registerBlock("oak_mosaic_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_PANEL_STAIRS = registerBlock("oak_panel_stairs",
            () -> new StairBlock(() -> modBlocks.OAK_PANEL.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> OAK_PANEL_SLAB = registerBlock("oak_panel_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> AZURE_PLANKS = registerBlock("azure_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_STAIRS = registerBlock("azure_stairs",
            () -> new StairBlock(() -> modBlocks.AZURE_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_SLAB = registerBlock("azure_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));

    public static final RegistryObject<Block> AZURE_DOOR = registerBlock("azure_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion(), BlockSetType.CHERRY));
    public static final RegistryObject<Block> AZURE_TRAPDOOR = registerBlock("azure_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).noOcclusion(), BlockSetType.CHERRY));

    public static final RegistryObject<Block> AZURE_FENCE = registerBlock("azure_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> AZURE_FENCE_GATE = registerBlock("azure_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));

    public static final RegistryObject<Block> AZURE_BUTTON = registerBlock("trimmed_azure_planks",
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
