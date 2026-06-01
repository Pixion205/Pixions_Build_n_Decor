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
    public static final RegistryObject<Block> OAK_TILES = registerFlammable("oak_tiles", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> OAK_TILES_STAIRS = registerFlammableStairs("oak_tiles_stairs", () -> OAK_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static final RegistryObject<Block> OAK_TILES_SLAB = registerFlammableSlab("oak_tiles_slab", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));

    // --- SPRUCE ---
    public static final RegistryObject<Block> SPRUCE_LUMBER = registerFlammablePillar("spruce_lumber", BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG));
    public static final RegistryObject<Block> SPRUCE_TRIM = registerFlammablePillar("spruce_trim", BlockBehaviour.Properties.copy(Blocks.SPRUCE_LOG));
    public static final RegistryObject<Block> SPRUCE_MOSAIC = registerFlammable("spruce_mosaic", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_MOSAIC_STAIRS = registerFlammableStairs("spruce_mosaic_stairs", () -> SPRUCE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_MOSAIC_SLAB = registerFlammableSlab("spruce_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_TILES = registerFlammable("spruce_tiles", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_TILES_STAIRS = registerFlammableStairs("spruce_tiles_stairs", () -> SPRUCE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));
    public static final RegistryObject<Block> SPRUCE_TILES_SLAB = registerFlammableSlab("spruce_tiles_slab", BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS));

    // --- BIRCH ---
    public static final RegistryObject<Block> BIRCH_LUMBER = registerFlammablePillar("birch_lumber", BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG));
    public static final RegistryObject<Block> BIRCH_TRIM = registerFlammablePillar("birch_trim", BlockBehaviour.Properties.copy(Blocks.BIRCH_LOG));
    public static final RegistryObject<Block> BIRCH_MOSAIC = registerFlammable("birch_mosaic", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_MOSAIC_STAIRS = registerFlammableStairs("birch_mosaic_stairs", () -> BIRCH_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_MOSAIC_SLAB = registerFlammableSlab("birch_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_TILES = registerFlammable("birch_tiles", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_TILES_STAIRS = registerFlammableStairs("birch_tiles_stairs", () -> BIRCH_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));
    public static final RegistryObject<Block> BIRCH_TILES_SLAB = registerFlammableSlab("birch_tiles_slab", BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS));

    // --- JUNGLE ---
    public static final RegistryObject<Block> JUNGLE_LUMBER = registerFlammablePillar("jungle_lumber", BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final RegistryObject<Block> JUNGLE_TRIM = registerFlammablePillar("jungle_trim", BlockBehaviour.Properties.copy(Blocks.JUNGLE_LOG));
    public static final RegistryObject<Block> JUNGLE_MOSAIC = registerFlammable("jungle_mosaic", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_MOSAIC_STAIRS = registerFlammableStairs("jungle_mosaic_stairs", () -> JUNGLE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_MOSAIC_SLAB = registerFlammableSlab("jungle_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_TILES = registerFlammable("jungle_tiles", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_TILES_STAIRS = registerFlammableStairs("jungle_tiles_stairs", () -> JUNGLE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));
    public static final RegistryObject<Block> JUNGLE_TILES_SLAB = registerFlammableSlab("jungle_tiles_slab", BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS));

    // --- ACACIA ---
    public static final RegistryObject<Block> ACACIA_LUMBER = registerFlammablePillar("acacia_lumber", BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG));
    public static final RegistryObject<Block> ACACIA_TRIM = registerFlammablePillar("acacia_trim", BlockBehaviour.Properties.copy(Blocks.ACACIA_LOG));
    public static final RegistryObject<Block> ACACIA_MOSAIC = registerFlammable("acacia_mosaic", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_MOSAIC_STAIRS = registerFlammableStairs("acacia_mosaic_stairs", () -> ACACIA_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_MOSAIC_SLAB = registerFlammableSlab("acacia_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_TILES = registerFlammable("acacia_tiles", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_TILES_STAIRS = registerFlammableStairs("acacia_tiles_stairs", () -> ACACIA_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));
    public static final RegistryObject<Block> ACACIA_TILES_SLAB = registerFlammableSlab("acacia_tiles_slab", BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS));

    // --- DARK OAK ---
    public static final RegistryObject<Block> DARK_OAK_LUMBER = registerFlammablePillar("dark_oak_lumber", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG));
    public static final RegistryObject<Block> DARK_OAK_TRIM = registerFlammablePillar("dark_oak_trim", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_LOG));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC = registerFlammable("dark_oak_mosaic", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC_STAIRS = registerFlammableStairs("dark_oak_mosaic_stairs", () -> DARK_OAK_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_MOSAIC_SLAB = registerFlammableSlab("dark_oak_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_TILES = registerFlammable("dark_oak_tiles", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_TILES_STAIRS = registerFlammableStairs("dark_oak_tiles_stairs", () -> DARK_OAK_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));
    public static final RegistryObject<Block> DARK_OAK_TILES_SLAB = registerFlammableSlab("dark_oak_tiles_slab", BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS));

    // --- MANGROVE ---
    public static final RegistryObject<Block> MANGROVE_LUMBER = registerFlammablePillar("mangrove_lumber", BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG));
    public static final RegistryObject<Block> MANGROVE_TRIM = registerFlammablePillar("mangrove_trim", BlockBehaviour.Properties.copy(Blocks.MANGROVE_LOG));
    public static final RegistryObject<Block> MANGROVE_MOSAIC = registerFlammable("mangrove_mosaic", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_MOSAIC_STAIRS = registerFlammableStairs("mangrove_mosaic_stairs", () -> MANGROVE_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_MOSAIC_SLAB = registerFlammableSlab("mangrove_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_TILES = registerFlammable("mangrove_tiles", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_TILES_STAIRS = registerFlammableStairs("mangrove_tiles_stairs", () -> MANGROVE_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));
    public static final RegistryObject<Block> MANGROVE_TILES_SLAB = registerFlammableSlab("mangrove_tiles_slab", BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS));

    // --- CHERRY ---
    public static final RegistryObject<Block> CHERRY_LUMBER = registerFlammablePillar("cherry_lumber", BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG));
    public static final RegistryObject<Block> CHERRY_TRIM = registerFlammablePillar("cherry_trim", BlockBehaviour.Properties.copy(Blocks.CHERRY_LOG));
    public static final RegistryObject<Block> CHERRY_MOSAIC = registerFlammable("cherry_mosaic", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_MOSAIC_STAIRS = registerFlammableStairs("cherry_mosaic_stairs", () -> CHERRY_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_MOSAIC_SLAB = registerFlammableSlab("cherry_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_TILES = registerFlammable("cherry_tiles", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_TILES_STAIRS = registerFlammableStairs("cherry_tiles_stairs", () -> CHERRY_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));
    public static final RegistryObject<Block> CHERRY_TILES_SLAB = registerFlammableSlab("cherry_tiles_slab", BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS));

    // --- CRIMSON ---
    public static final RegistryObject<Block> CRIMSON_LUMBER = registerNetherPillar("crimson_lumber", BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM));
    public static final RegistryObject<Block> CRIMSON_TRIM = registerNetherPillar("crimson_trim", BlockBehaviour.Properties.copy(Blocks.CRIMSON_STEM));
    public static final RegistryObject<Block> CRIMSON_MOSAIC = registerNether("crimson_mosaic", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_MOSAIC_STAIRS = registerNetherStairs("crimson_mosaic_stairs", () -> CRIMSON_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_MOSAIC_SLAB = registerNetherSlab("crimson_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_TILES = registerNether("crimson_tiles", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_TILES_STAIRS = registerNetherStairs("crimson_tiles_stairs", () -> CRIMSON_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));
    public static final RegistryObject<Block> CRIMSON_TILES_SLAB = registerNetherSlab("crimson_tiles_slab", BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS));

    // --- WARPED ---
    public static final RegistryObject<Block> WARPED_LUMBER = registerNetherPillar("warped_lumber", BlockBehaviour.Properties.copy(Blocks.WARPED_STEM));
    public static final RegistryObject<Block> WARPED_TRIM = registerNetherPillar("warped_trim", BlockBehaviour.Properties.copy(Blocks.WARPED_STEM));
    public static final RegistryObject<Block> WARPED_MOSAIC = registerNether("warped_mosaic", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_MOSAIC_STAIRS = registerNetherStairs("warped_mosaic_stairs", () -> WARPED_MOSAIC.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_MOSAIC_SLAB = registerNetherSlab("warped_mosaic_slab", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_TILES = registerNether("warped_tiles", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_TILES_STAIRS = registerNetherStairs("warped_tiles_stairs", () -> WARPED_TILES.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));
    public static final RegistryObject<Block> WARPED_TILES_SLAB = registerNetherSlab("warped_tiles_slab", BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS));

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