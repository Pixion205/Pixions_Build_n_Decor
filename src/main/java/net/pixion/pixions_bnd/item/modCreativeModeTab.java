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
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(modBlocks.OAK_LUMBER.get()))
                    .title(Component.translatable("creativetab.pixions_bnd_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Oak
                        pOutput.accept(modBlocks.OAK_LUMBER.get());
                        pOutput.accept(modBlocks.OAK_TRIM.get());
                        pOutput.accept(modBlocks.OAK_MOSAIC.get());
                        pOutput.accept(modBlocks.OAK_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.OAK_MOSAIC_SLAB.get());

                        // Spruce
                        pOutput.accept(modBlocks.SPRUCE_LUMBER.get());
                        pOutput.accept(modBlocks.SPRUCE_TRIM.get());
                        pOutput.accept(modBlocks.SPRUCE_MOSAIC.get());
                        pOutput.accept(modBlocks.SPRUCE_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.SPRUCE_MOSAIC_SLAB.get());

                        // Birch
                        pOutput.accept(modBlocks.BIRCH_LUMBER.get());
                        pOutput.accept(modBlocks.BIRCH_TRIM.get());
                        pOutput.accept(modBlocks.BIRCH_MOSAIC.get());
                        pOutput.accept(modBlocks.BIRCH_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.BIRCH_MOSAIC_SLAB.get());

                        // Jungle
                        pOutput.accept(modBlocks.JUNGLE_LUMBER.get());
                        pOutput.accept(modBlocks.JUNGLE_TRIM.get());
                        pOutput.accept(modBlocks.JUNGLE_MOSAIC.get());
                        pOutput.accept(modBlocks.JUNGLE_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.JUNGLE_MOSAIC_SLAB.get());

                        // Acacia
                        pOutput.accept(modBlocks.ACACIA_LUMBER.get());
                        pOutput.accept(modBlocks.ACACIA_TRIM.get());
                        pOutput.accept(modBlocks.ACACIA_MOSAIC.get());
                        pOutput.accept(modBlocks.ACACIA_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.ACACIA_MOSAIC_SLAB.get());

                        // Dark Oak
                        pOutput.accept(modBlocks.DARK_OAK_LUMBER.get());
                        pOutput.accept(modBlocks.DARK_OAK_TRIM.get());
                        pOutput.accept(modBlocks.DARK_OAK_MOSAIC.get());
                        pOutput.accept(modBlocks.DARK_OAK_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.DARK_OAK_MOSAIC_SLAB.get());

                        // Mangrove
                        pOutput.accept(modBlocks.MANGROVE_LUMBER.get());
                        pOutput.accept(modBlocks.MANGROVE_TRIM.get());
                        pOutput.accept(modBlocks.MANGROVE_MOSAIC.get());
                        pOutput.accept(modBlocks.MANGROVE_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.MANGROVE_MOSAIC_SLAB.get());

                        // Cherry
                        pOutput.accept(modBlocks.CHERRY_LUMBER.get());
                        pOutput.accept(modBlocks.CHERRY_TRIM.get());
                        pOutput.accept(modBlocks.CHERRY_MOSAIC.get());
                        pOutput.accept(modBlocks.CHERRY_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.CHERRY_MOSAIC_SLAB.get());

                        // Crimson
                        pOutput.accept(modBlocks.CRIMSON_LUMBER.get());
                        pOutput.accept(modBlocks.CRIMSON_TRIM.get());
                        pOutput.accept(modBlocks.CRIMSON_MOSAIC.get());
                        pOutput.accept(modBlocks.CRIMSON_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.CRIMSON_MOSAIC_SLAB.get());

                        // Warped
                        pOutput.accept(modBlocks.WARPED_LUMBER.get());
                        pOutput.accept(modBlocks.WARPED_TRIM.get());
                        pOutput.accept(modBlocks.WARPED_MOSAIC.get());
                        pOutput.accept(modBlocks.WARPED_MOSAIC_STAIRS.get());
                        pOutput.accept(modBlocks.WARPED_MOSAIC_SLAB.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
