package net.pixion.pixions_bnd.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pixion.pixions_bnd.PixionsBnD;
import net.pixion.pixions_bnd.block.modBlocks;

public class modCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PixionsBnD.MODID);

    public static final RegistryObject<CreativeModeTab> PIXIONS_BND_TAB = CREATIVE_MODE_TABS.register("pixions_bnd_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(modBlocks.TRIMMED_OAK_BOARDS.get()))
                    .title(Component.translatable("creativetab.pixions_bnd_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Oak
                        pOutput.accept(modBlocks.OAK_LUMBER.get());
                        pOutput.accept(modBlocks.TRIMMED_OAK_PLANKS.get());
                        pOutput.accept(modBlocks.OAK_BOARDS.get());
                        pOutput.accept(modBlocks.OAK_BOARDS_STAIRS.get());
                        pOutput.accept(modBlocks.OAK_BOARDS_SLAB.get());
                        pOutput.accept(modBlocks.TRIMMED_OAK_BOARDS.get());
                        pOutput.accept(modBlocks.OAK_PANEL.get());
                        pOutput.accept(modBlocks.OAK_MOSAIC.get());
                        pOutput.accept(modBlocks.OAK_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.OAK_MOSAIC_SLAB.get());

                        // Spruce
                        pOutput.accept(modBlocks.SPRUCE_LUMBER.get());
                        pOutput.accept(modBlocks.TRIMMED_SPRUCE_PLANKS.get());
                        pOutput.accept(modBlocks.SPRUCE_BOARDS.get());
                        pOutput.accept(modBlocks.SPRUCE_BOARDS_STAIRS.get());
                        pOutput.accept(modBlocks.SPRUCE_BOARDS_SLAB.get());
                        pOutput.accept(modBlocks.TRIMMED_SPRUCE_BOARDS.get());
                        pOutput.accept(modBlocks.SPRUCE_PANEL.get());
                        pOutput.accept(modBlocks.SPRUCE_MOSAIC.get());
                        pOutput.accept(modBlocks.SPRUCE_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.SPRUCE_MOSAIC_SLAB.get());

                        // Birch
                        pOutput.accept(modBlocks.BIRCH_LUMBER.get());
                        pOutput.accept(modBlocks.TRIMMED_BIRCH_PLANKS.get());
                        pOutput.accept(modBlocks.BIRCH_BOARDS.get());
                        pOutput.accept(modBlocks.BIRCH_BOARDS_STAIRS.get());
                        pOutput.accept(modBlocks.BIRCH_BOARDS_SLAB.get());
                        pOutput.accept(modBlocks.TRIMMED_BIRCH_BOARDS.get());
                        pOutput.accept(modBlocks.BIRCH_PANEL.get());
                        pOutput.accept(modBlocks.BIRCH_MOSAIC.get());
                        pOutput.accept(modBlocks.BIRCH_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.BIRCH_MOSAIC_SLAB.get());

                        // Jungle
                        pOutput.accept(modBlocks.JUNGLE_LUMBER.get());
                        pOutput.accept(modBlocks.TRIMMED_JUNGLE_PLANKS.get());
                        pOutput.accept(modBlocks.JUNGLE_BOARDS.get());
                        pOutput.accept(modBlocks.JUNGLE_BOARDS_STAIRS.get());
                        pOutput.accept(modBlocks.JUNGLE_BOARDS_SLAB.get());
                        pOutput.accept(modBlocks.TRIMMED_JUNGLE_BOARDS.get());
                        pOutput.accept(modBlocks.JUNGLE_PANEL.get());
                        pOutput.accept(modBlocks.JUNGLE_MOSAIC.get());
                        pOutput.accept(modBlocks.JUNGLE_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.JUNGLE_MOSAIC_SLAB.get());

                        // Acacia
                        pOutput.accept(modBlocks.ACACIA_LUMBER.get());
                        pOutput.accept(modBlocks.TRIMMED_ACACIA_PLANKS.get());
                        pOutput.accept(modBlocks.ACACIA_BOARDS.get());
                        pOutput.accept(modBlocks.ACACIA_BOARDS_STAIRS.get());
                        pOutput.accept(modBlocks.ACACIA_BOARDS_SLAB.get());
                        pOutput.accept(modBlocks.TRIMMED_ACACIA_BOARDS.get());
                        pOutput.accept(modBlocks.ACACIA_PANEL.get());
                        pOutput.accept(modBlocks.ACACIA_MOSAIC.get());
                        pOutput.accept(modBlocks.ACACIA_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.ACACIA_MOSAIC_SLAB.get());

                        // Dark Oak
                        pOutput.accept(modBlocks.DARK_OAK_LUMBER.get());
                        pOutput.accept(modBlocks.TRIMMED_DARK_OAK_PLANKS.get());
                        pOutput.accept(modBlocks.DARK_OAK_BOARDS.get());
                        pOutput.accept(modBlocks.DARK_OAK_BOARDS_STAIRS.get());
                        pOutput.accept(modBlocks.DARK_OAK_BOARDS_SLAB.get());
                        pOutput.accept(modBlocks.TRIMMED_DARK_OAK_BOARDS.get());
                        pOutput.accept(modBlocks.DARK_OAK_PANEL.get());
                        pOutput.accept(modBlocks.DARK_OAK_MOSAIC.get());
                        pOutput.accept(modBlocks.DARK_OAK_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.DARK_OAK_MOSAIC_SLAB.get());

                        // Mangrove
                        pOutput.accept(modBlocks.MANGROVE_LUMBER.get());
                        pOutput.accept(modBlocks.TRIMMED_MANGROVE_PLANKS.get());
                        pOutput.accept(modBlocks.MANGROVE_BOARDS.get());
                        pOutput.accept(modBlocks.MANGROVE_BOARDS_STAIRS.get());
                        pOutput.accept(modBlocks.MANGROVE_BOARDS_SLAB.get());
                        pOutput.accept(modBlocks.TRIMMED_MANGROVE_BOARDS.get());
                        pOutput.accept(modBlocks.MANGROVE_PANEL.get());
                        pOutput.accept(modBlocks.MANGROVE_MOSAIC.get());
                        pOutput.accept(modBlocks.MANGROVE_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.MANGROVE_MOSAIC_SLAB.get());

                        // Cherry
                        pOutput.accept(modBlocks.CHERRY_LUMBER.get());
                        pOutput.accept(modBlocks.TRIMMED_CHERRY_PLANKS.get());
                        pOutput.accept(modBlocks.CHERRY_BOARDS.get());
                        pOutput.accept(modBlocks.CHERRY_BOARDS_STAIRS.get());
                        pOutput.accept(modBlocks.CHERRY_BOARDS_SLAB.get());
                        pOutput.accept(modBlocks.TRIMMED_CHERRY_BOARDS.get());
                        pOutput.accept(modBlocks.CHERRY_PANEL.get());
                        pOutput.accept(modBlocks.CHERRY_MOSAIC.get());
                        pOutput.accept(modBlocks.CHERRY_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.CHERRY_MOSAIC_SLAB.get());

                        // Crimson
                        pOutput.accept(modBlocks.CRIMSON_LUMBER.get());
                        pOutput.accept(modBlocks.TRIMMED_CRIMSON_PLANKS.get());
                        pOutput.accept(modBlocks.CRIMSON_BOARDS.get());
                        pOutput.accept(modBlocks.CRIMSON_BOARDS_STAIRS.get());
                        pOutput.accept(modBlocks.CRIMSON_BOARDS_SLAB.get());
                        pOutput.accept(modBlocks.TRIMMED_CRIMSON_BOARDS.get());
                        pOutput.accept(modBlocks.CRIMSON_PANEL.get());
                        pOutput.accept(modBlocks.CRIMSON_MOSAIC.get());
                        pOutput.accept(modBlocks.CRIMSON_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.CRIMSON_MOSAIC_SLAB.get());

                        // Warped
                        pOutput.accept(modBlocks.WARPED_LUMBER.get());
                        pOutput.accept(modBlocks.TRIMMED_WARPED_PLANKS.get());
                        pOutput.accept(modBlocks.WARPED_BOARDS.get());
                        pOutput.accept(modBlocks.WARPED_BOARDS_STAIRS.get());
                        pOutput.accept(modBlocks.WARPED_BOARDS_SLAB.get());
                        pOutput.accept(modBlocks.TRIMMED_WARPED_BOARDS.get());
                        pOutput.accept(modBlocks.WARPED_PANEL.get());
                        pOutput.accept(modBlocks.WARPED_PANELS_STAIRS.get());
                        pOutput.accept(modBlocks.WARPED_PANELS_SLAB.get());
                        pOutput.accept(modBlocks.TRIMMED_WARPED_PANELS.get());
                        pOutput.accept(modBlocks.WARPED_MOSAIC.get());
                        pOutput.accept(modBlocks.WARPED_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.WARPED_MOSAIC_SLAB.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
