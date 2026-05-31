package net.pixion.pixions_bnd.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pixion.pixions_bnd.PixionsBnD;
import net.pixion.pixions_bnd.item.ModItems;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, PixionsBnD.MODID);

    // --- OAK ---
    public static final RegistryObject<Block> OAK_LUMBER = registerFlammablePillar("oak_lumber", BlockBehaviour.Properties.copy(Blocks.OAK_LOG));
    public static final RegistryObject<Block> OAK_TRIM = registerFlammablePillar("oak_trim", BlockBehaviour.Properties.copy(Blocks.OAK_LOG));
    public static final RegistryObject<Block> OAK_MOSAIC = registerFlammable("oak_mosaic", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> OAK_MOSAIC_STAIRS = registerFlammableStairs("oak_mosaic_stairs", () -> OAK_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> OAK_MOSAIC_SLAB = registerFlammableSlab("oak_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> OAK_BOARDS = registerFlammable("oak_boards", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> OAK_BOARDS_STAIRS = registerFlammableStairs("oak_boards_stairs", () -> OAK_BOARDS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> OAK_BOARDS_SLAB = registerFlammableSlab("oak_boards_slab", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> OAK_PANELS = registerFlammable("oak_panels", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> OAK_PANELS_STAIRS = registerFlammableStairs("oak_panels_stairs", () -> OAK_PANELS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> OAK_PANELS_SLAB = registerFlammableSlab("oak_panels_slab", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> TRIMMED_OAK_PLANKS = registerFlammable("trimmed_oak_planks", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> TRIMMED_OAK_BOARDS = registerFlammable("trimmed_oak_boards", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> TRIMMED_OAK_PANELS = registerFlammable("trimmed_oak_panels", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));

    // --- SPRUCE ---
    public static final RegistryObject<Block> SPRUCE_LUMBER = registerFlammablePillar("spruce_lumber", BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG));
    public static final RegistryObject<Block> SPRUCE_TRIM = registerFlammablePillar("spruce_trim", BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG));
    public static final RegistryObject<Block> SPRUCE_MOSAIC = registerFlammable("spruce_mosaic", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_MOSAIC_STAIRS = registerFlammableStairs("spruce_mosaic_stairs", () -> SPRUCE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_MOSAIC_SLAB = registerFlammableSlab("spruce_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_BOARDS = registerFlammable("spruce_boards", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_BOARDS_STAIRS = registerFlammableStairs("spruce_boards_stairs", () -> SPRUCE_BOARDS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_BOARDS_SLAB = registerFlammableSlab("spruce_boards_slab", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_PANELS = registerFlammable("spruce_panels", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_PANELS_STAIRS = registerFlammableStairs("spruce_panels_stairs", () -> SPRUCE_PANELS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_PANELS_SLAB = registerFlammableSlab("spruce_panels_slab", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> TRIMMED_SPRUCE_PLANKS = registerFlammable("trimmed_spruce_planks", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> TRIMMED_SPRUCE_BOARDS = registerFlammable("trimmed_spruce_boards", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> TRIMMED_SPRUCE_PANELS = registerFlammable("trimmed_spruce_panels", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));

    // --- BIRCH ---
    public static final RegistryObject<Block> BIRCH_LUMBER = registerFlammablePillar("birch_lumber", BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG));
    public static final RegistryObject<Block> BIRCH_TRIM = registerFlammablePillar("birch_trim", BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG));
    public static final RegistryObject<Block> BIRCH_MOSAIC = registerFlammable("birch_mosaic", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_MOSAIC_STAIRS = registerFlammableStairs("birch_mosaic_stairs", () -> BIRCH_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_MOSAIC_SLAB = registerFlammableSlab("birch_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_BOARDS = registerFlammable("birch_boards", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_BOARDS_STAIRS = registerFlammableStairs("birch_boards_stairs", () -> BIRCH_BOARDS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_BOARDS_SLAB = registerFlammableSlab("birch_boards_slab", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_PANELS = registerFlammable("birch_panels", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_PANELS_STAIRS = registerFlammableStairs("birch_panels_stairs", () -> BIRCH_PANELS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_PANELS_SLAB = registerFlammableSlab("birch_panels_slab", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> TRIMMED_BIRCH_PLANKS = registerFlammable("trimmed_birch_planks", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> TRIMMED_BIRCH_BOARDS = registerFlammable("trimmed_birch_boards", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> TRIMMED_BIRCH_PANELS = registerFlammable("trimmed_birch_panels", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));

    // --- JUNGLE ---
    public static final RegistryObject<Block> JUNGLE_LUMBER = registerFlammablePillar("jungle_lumber", BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final RegistryObject<Block> JUNGLE_TRIM = registerFlammablePillar("jungle_trim", BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final RegistryObject<Block> JUNGLE_MOSAIC = registerFlammable("jungle_mosaic", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_MOSAIC_STAIRS = registerFlammableStairs("jungle_mosaic_stairs", () -> JUNGLE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_MOSAIC_SLAB = registerFlammableSlab("jungle_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_BOARDS = registerFlammable("jungle_boards", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_BOARDS_STAIRS = registerFlammableStairs("jungle_boards_stairs", () -> JUNGLE_BOARDS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_BOARDS_SLAB = registerFlammableSlab("jungle_boards_slab", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_PANELS = registerFlammable("jungle_panels", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_PANELS_STAIRS = registerFlammableStairs("jungle_panels_stairs", () -> JUNGLE_PANELS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_PANELS_SLAB = registerFlammableSlab("jungle_panels_slab", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> TRIMMED_JUNGLE_PLANKS = registerFlammable("trimmed_jungle_planks", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> TRIMMED_JUNGLE_BOARDS = registerFlammable("trimmed_jungle_boards", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> TRIMMED_JUNGLE_PANELS = registerFlammable("trimmed_jungle_panels", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));

    // --- ACACIA ---
    public static final RegistryObject<Block> ACACIA_LUMBER = registerFlammablePillar("acacia_lumber", BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG));
    public static final RegistryObject<Block> ACACIA_TRIM = registerFlammablePillar("acacia_trim", BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG));
    public static final RegistryObject<Block> ACACIA_MOSAIC = registerFlammable("acacia_mosaic", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_MOSAIC_STAIRS = registerFlammableStairs("acacia_mosaic_stairs", () -> ACACIA_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_MOSAIC_SLAB = registerFlammableSlab("acacia_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_BOARDS = registerFlammable("acacia_boards", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_BOARDS_STAIRS = registerFlammableStairs("acacia_boards_stairs", () -> ACACIA_BOARDS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_BOARDS_SLAB = registerFlammableSlab("acacia_boards_slab", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_PANELS = registerFlammable("acacia_panels", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_PANELS_STAIRS = registerFlammableStairs("acacia_panels_stairs", () -> ACACIA_PANELS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_PANELS_SLAB = registerFlammableSlab("acacia_panels_slab", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> TRIMMED_ACACIA_PLANKS = registerFlammable("trimmed_acacia_planks", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> TRIMMED_ACACIA_BOARDS = registerFlammable("trimmed_acacia_boards", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> TRIMMED_ACACIA_PANELS = registerFlammable("trimmed_acacia_panels", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));

    // --- DARK OAK ---
    public static final RegistryObject<Block> DARK_OAK_LUMBER = registerFlammablePillar("dark_oak_lumber", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG));
    public static final RegistryObject<Block> DARK_OAK_TRIM = registerFlammablePillar("dark_oak_trim", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC = registerFlammable("dark_oak_mosaic", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC_STAIRS = registerFlammableStairs("dark_oak_mosaic_stairs", () -> DARK_OAK_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC_SLAB = registerFlammableSlab("dark_oak_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_BOARDS = registerFlammable("dark_oak_boards", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_BOARDS_STAIRS = registerFlammableStairs("dark_oak_boards_stairs", () -> DARK_OAK_BOARDS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_BOARDS_SLAB = registerFlammableSlab("dark_oak_boards_slab", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_PANELS = registerFlammable("dark_oak_panels", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_PANELS_STAIRS = registerFlammableStairs("dark_oak_panels_stairs", () -> DARK_OAK_PANELS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_PANELS_SLAB = registerFlammableSlab("dark_oak_panels_slab", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> TRIMMED_DARK_OAK_PLANKS = registerFlammable("trimmed_dark_oak_planks", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> TRIMMED_DARK_OAK_BOARDS = registerFlammable("trimmed_dark_oak_boards", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> TRIMMED_DARK_OAK_PANELS = registerFlammable("trimmed_dark_oak_panels", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));

    // --- MANGROVE ---
    public static final RegistryObject<Block> MANGROVE_LUMBER = registerFlammablePillar("mangrove_lumber", BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG));
    public static final RegistryObject<Block> MANGROVE_TRIM = registerFlammablePillar("mangrove_trim", BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG));
    public static final RegistryObject<Block> MANGROVE_MOSAIC = registerFlammable("mangrove_mosaic", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_MOSAIC_STAIRS = registerFlammableStairs("mangrove_mosaic_stairs", () -> MANGROVE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_MOSAIC_SLAB = registerFlammableSlab("mangrove_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_BOARDS = registerFlammable("mangrove_boards", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_BOARDS_STAIRS = registerFlammableStairs("mangrove_boards_stairs", () -> MANGROVE_BOARDS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_BOARDS_SLAB = registerFlammableSlab("mangrove_boards_slab", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_PANELS = registerFlammable("mangrove_panels", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_PANELS_STAIRS = registerFlammableStairs("mangrove_panels_stairs", () -> MANGROVE_PANELS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_PANELS_SLAB = registerFlammableSlab("mangrove_panels_slab", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> TRIMMED_MANGROVE_PLANKS = registerFlammable("trimmed_mangrove_planks", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> TRIMMED_MANGROVE_BOARDS = registerFlammable("trimmed_mangrove_boards", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> TRIMMED_MANGROVE_PANELS = registerFlammable("trimmed_mangrove_panels", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));

    // --- CHERRY ---
    public static final RegistryObject<Block> CHERRY_LUMBER = registerFlammablePillar("cherry_lumber", BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG));
    public static final RegistryObject<Block> CHERRY_TRIM = registerFlammablePillar("cherry_trim", BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG));
    public static final RegistryObject<Block> CHERRY_MOSAIC = registerFlammable("cherry_mosaic", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_MOSAIC_STAIRS = registerFlammableStairs("cherry_mosaic_stairs", () -> CHERRY_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_MOSAIC_SLAB = registerFlammableSlab("cherry_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_BOARDS = registerFlammable("cherry_boards", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_BOARDS_STAIRS = registerFlammableStairs("cherry_boards_stairs", () -> CHERRY_BOARDS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_BOARDS_SLAB = registerFlammableSlab("cherry_boards_slab", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_PANELS = registerFlammable("cherry_panels", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_PANELS_STAIRS = registerFlammableStairs("cherry_panels_stairs", () -> CHERRY_PANELS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_PANELS_SLAB = registerFlammableSlab("cherry_panels_slab", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> TRIMMED_CHERRY_PLANKS = registerFlammable("trimmed_cherry_planks", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> TRIMMED_CHERRY_BOARDS = registerFlammable("trimmed_cherry_boards", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> TRIMMED_CHERRY_PANELS = registerFlammable("trimmed_cherry_panels", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));

    // --- AZURE ---
    public static final RegistryObject<Block> AZURE_PLANKS = registerFlammable("azure_planks", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> AZURE_STAIRS = registerFlammableStairs("azure_stairs", () -> AZURE_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> AZURE_SLAB = registerFlammableSlab("azure_slab", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> AZURE_DOOR = registerBlock("azure_door", () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> AZURE_TRAPDOOR = registerBlock("azure_trapdoor", () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> AZURE_FENCE = registerBlock("azure_fence", () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> AZURE_FENCE_GATE = registerBlock("azure_fence_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), WoodType.OAK));
    public static final RegistryObject<Block> AZURE_BUTTON = registerBlock("azure_button", () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 30, true));
    public static final RegistryObject<Block> AZURE_PRESSURE_PLATE = registerBlock("azure_pressure_plate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));

    public static final RegistryObject<Block> AZURE_LUMBER = registerFlammablePillar("azure_lumber", BlockBehaviour.Properties.copy(Blocks.OAK_LOG));
    public static final RegistryObject<Block> AZURE_MOSAIC = registerFlammable("azure_mosaic", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> AZURE_MOSAIC_STAIRS = registerFlammableStairs("azure_mosaic_stairs", () -> AZURE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> AZURE_MOSAIC_SLAB = registerFlammableSlab("azure_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> AZURE_BOARDS = registerFlammable("azure_boards", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> AZURE_BOARDS_STAIRS = registerFlammableStairs("azure_boards_stairs", () -> AZURE_BOARDS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> AZURE_BOARDS_SLAB = registerFlammableSlab("azure_boards_slab", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> AZURE_PANELS = registerFlammable("azure_panels", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> AZURE_PANELS_STAIRS = registerFlammableStairs("azure_panels_stairs", () -> AZURE_PANELS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> AZURE_PANELS_SLAB = registerFlammableSlab("azure_panels_slab", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> TRIMMED_AZURE_PLANKS = registerFlammable("trimmed_azure_planks", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> TRIMMED_AZURE_BOARDS = registerFlammable("trimmed_azure_boards", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> TRIMMED_AZURE_PANELS = registerFlammable("trimmed_azure_panels", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));

    // --- CRIMSON ---
    public static final RegistryObject<Block> CRIMSON_LUMBER = registerNetherPillar("crimson_lumber", BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM));
    public static final RegistryObject<Block> CRIMSON_TRIM = registerNetherPillar("crimson_trim", BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM));
    public static final RegistryObject<Block> CRIMSON_MOSAIC = registerNether("crimson_mosaic", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_MOSAIC_STAIRS = registerNetherStairs("crimson_mosaic_stairs", () -> CRIMSON_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_MOSAIC_SLAB = registerNetherSlab("crimson_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_BOARDS = registerNether("crimson_boards", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_BOARDS_STAIRS = registerNetherStairs("crimson_boards_stairs", () -> CRIMSON_BOARDS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_BOARDS_SLAB = registerNetherSlab("crimson_boards_slab", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_PANELS = registerNether("crimson_panels", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_PANELS_STAIRS = registerNetherStairs("crimson_panels_stairs", () -> CRIMSON_PANELS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_PANELS_SLAB = registerNetherSlab("crimson_panels_slab", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> TRIMMED_CRIMSON_PLANKS = registerNether("trimmed_crimson_planks", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> TRIMMED_CRIMSON_BOARDS = registerNether("trimmed_crimson_boards", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> TRIMMED_CRIMSON_PANELS = registerNether("trimmed_crimson_panels", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));

    // --- WARPED ---
    public static final RegistryObject<Block> WARPED_LUMBER = registerNetherPillar("warped_lumber", BlockBehaviour.Properties.copy(Blocks.WARPED_STEM));
    public static final RegistryObject<Block> WARPED_TRIM = registerNetherPillar("warped_trim", BlockBehaviour.Properties.copy(Blocks.WARPED_STEM));
    public static final RegistryObject<Block> WARPED_MOSAIC = registerNether("warped_mosaic", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_MOSAIC_STAIRS = registerNetherStairs("warped_mosaic_stairs", () -> WARPED_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_MOSAIC_SLAB = registerNetherSlab("warped_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_BOARDS = registerNether("warped_boards", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_BOARDS_STAIRS = registerNetherStairs("warped_boards_stairs", () -> WARPED_BOARDS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_BOARDS_SLAB = registerNetherSlab("warped_boards_slab", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_PANELS = registerNether("warped_panels", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_PANELS_STAIRS = registerNetherStairs("warped_panels_stairs", () -> WARPED_PANELS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_PANELS_SLAB = registerNetherSlab("warped_panels_slab", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> TRIMMED_WARPED_PLANKS = registerNether("trimmed_warped_planks", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> TRIMMED_WARPED_BOARDS = registerNether("trimmed_warped_boards", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> TRIMMED_WARPED_PANELS = registerNether("trimmed_warped_panels", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()) {

            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                if (name.contains("crimson") || name.contains("warped")) {
                    return 0;
                }
                return block.get() instanceof SlabBlock ? 150 : 300;
            }
        });
    }

    private static RegistryObject<Block> registerFlammable(String name, BlockBehaviour.Properties props) {
        return registerBlock(name, () -> createFlammableBlock(props));
    }

    private static RegistryObject<Block> registerFlammablePillar(String name, BlockBehaviour.Properties props) {
        return registerBlock(name, () -> createFlammablePillar(props));
    }

    private static RegistryObject<Block> registerFlammableStairs(String name, Supplier<BlockState> state, BlockBehaviour.Properties props) {
        return registerBlock(name, () -> createFlammableStairs(state, props));
    }

    private static RegistryObject<Block> registerFlammableSlab(String name, BlockBehaviour.Properties props) {
        return registerBlock(name, () -> createFlammableSlab(props));
    }

    private static RegistryObject<Block> registerNether(String name, BlockBehaviour.Properties props) {
        return registerBlock(name, () -> new Block(props));
    }

    private static RegistryObject<Block> registerNetherPillar(String name, BlockBehaviour.Properties props) {
        return registerBlock(name, () -> new RotatedPillarBlock(props));
    }

    private static RegistryObject<Block> registerNetherStairs(String name, Supplier<BlockState> state, BlockBehaviour.Properties props) {
        return registerBlock(name, () -> new StairBlock(state, props));
    }

    private static RegistryObject<Block> registerNetherSlab(String name, BlockBehaviour.Properties props) {
        return registerBlock(name, () -> new SlabBlock(props));
    }

    private static Block createFlammableBlock(BlockBehaviour.Properties properties) {
        return new Block(properties) {
            @Override
            public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return true;
            }

            @Override
            public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return 20;
            }

            @Override
            public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return 5;
            }
        };
    }

    private static RotatedPillarBlock createFlammablePillar(BlockBehaviour.Properties properties) {
        return new RotatedPillarBlock(properties) {
            @Override
            public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return true;
            }

            @Override
            public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return 20;
            }

            @Override
            public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return 5;
            }
        };
    }

    private static StairBlock createFlammableStairs(Supplier<BlockState> state, BlockBehaviour.Properties properties) {
        return new StairBlock(state, properties) {
            @Override
            public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return true;
            }

            @Override
            public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return 20;
            }

            @Override
            public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return 5;
            }
        };
    }

    private static SlabBlock createFlammableSlab(BlockBehaviour.Properties properties) {
        return new SlabBlock(properties) {
            @Override
            public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return true;
            }

            @Override
            public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return 20;
            }

            @Override
            public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                return 5;
            }
        };
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}