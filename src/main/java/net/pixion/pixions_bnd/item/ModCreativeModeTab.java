package net.pixion.pixions_bnd.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pixion.pixions_bnd.PixionsBnD;
import net.pixion.pixions_bnd.block.ModBlocks;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PixionsBnD.MODID);

    public static final RegistryObject<CreativeModeTab> PIXIONS_BND_TAB = CREATIVE_MODE_TABS.register("pixions_bnd_tab",
            () -> CreativeModeTab.builder().icon(()-> new ItemStack(ModBlocks.OAK_LUMBER.get()))
                    .title(Component.translatable("creativetab.pixions_bnd_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // Oak
                        pOutput.accept(ModBlocks.OAK_LUMBER.get());
                        pOutput.accept(ModBlocks.OAK_TRIM.get());
                        pOutput.accept(ModBlocks.OAK_MOSAIC.get());
                        pOutput.accept(ModBlocks.OAK_MOSAIC_STAIRS.get());
                        pOutput.accept(ModBlocks.OAK_MOSAIC_SLAB.get());

                        // Spruce
                        pOutput.accept(ModBlocks.SPRUCE_LUMBER.get());
                        pOutput.accept(ModBlocks.SPRUCE_TRIM.get());
                        pOutput.accept(ModBlocks.SPRUCE_MOSAIC.get());
                        pOutput.accept(ModBlocks.SPRUCE_MOSAIC_STAIRS.get());
                        pOutput.accept(ModBlocks.SPRUCE_MOSAIC_SLAB.get());

                        // Birch
                        pOutput.accept(ModBlocks.BIRCH_LUMBER.get());
                        pOutput.accept(ModBlocks.BIRCH_TRIM.get());
                        pOutput.accept(ModBlocks.BIRCH_MOSAIC.get());
                        pOutput.accept(ModBlocks.BIRCH_MOSAIC_STAIRS.get());
                        pOutput.accept(ModBlocks.BIRCH_MOSAIC_SLAB.get());

                        // Jungle
                        pOutput.accept(ModBlocks.JUNGLE_LUMBER.get());
                        pOutput.accept(ModBlocks.JUNGLE_TRIM.get());
                        pOutput.accept(ModBlocks.JUNGLE_MOSAIC.get());
                        pOutput.accept(ModBlocks.JUNGLE_MOSAIC_STAIRS.get());
                        pOutput.accept(ModBlocks.JUNGLE_MOSAIC_SLAB.get());

                        // Acacia
                        pOutput.accept(ModBlocks.ACACIA_LUMBER.get());
                        pOutput.accept(ModBlocks.ACACIA_TRIM.get());
                        pOutput.accept(ModBlocks.ACACIA_MOSAIC.get());
                        pOutput.accept(ModBlocks.ACACIA_MOSAIC_STAIRS.get());
                        pOutput.accept(ModBlocks.ACACIA_MOSAIC_SLAB.get());

                        // Dark Oak
                        pOutput.accept(ModBlocks.DARK_OAK_LUMBER.get());
                        pOutput.accept(ModBlocks.DARK_OAK_TRIM.get());
                        pOutput.accept(ModBlocks.DARK_OAK_MOSAIC.get());
                        pOutput.accept(ModBlocks.DARK_OAK_MOSAIC_STAIRS.get());
                        pOutput.accept(ModBlocks.DARK_OAK_MOSAIC_SLAB.get());

                        // Mangrove
                        pOutput.accept(ModBlocks.MANGROVE_LUMBER.get());
                        pOutput.accept(ModBlocks.MANGROVE_TRIM.get());
                        pOutput.accept(ModBlocks.MANGROVE_MOSAIC.get());
                        pOutput.accept(ModBlocks.MANGROVE_MOSAIC_STAIRS.get());
                        pOutput.accept(ModBlocks.MANGROVE_MOSAIC_SLAB.get());

                        // Cherry
                        pOutput.accept(ModBlocks.CHERRY_LUMBER.get());
                        pOutput.accept(ModBlocks.CHERRY_TRIM.get());
                        pOutput.accept(ModBlocks.CHERRY_MOSAIC.get());
                        pOutput.accept(ModBlocks.CHERRY_MOSAIC_STAIRS.get());
                        pOutput.accept(ModBlocks.CHERRY_MOSAIC_SLAB.get());

                        // Crimson
                        pOutput.accept(ModBlocks.CRIMSON_LUMBER.get());
                        pOutput.accept(ModBlocks.CRIMSON_TRIM.get());
                        pOutput.accept(ModBlocks.CRIMSON_MOSAIC.get());
                        pOutput.accept(ModBlocks.CRIMSON_MOSAIC_STAIRS.get());
                        pOutput.accept(ModBlocks.CRIMSON_MOSAIC_SLAB.get());

                        // Warped
                        pOutput.accept(ModBlocks.WARPED_LUMBER.get());
                        pOutput.accept(ModBlocks.WARPED_TRIM.get());
                        pOutput.accept(ModBlocks.WARPED_MOSAIC.get());
                        pOutput.accept(ModBlocks.WARPED_MOSAIC_STAIRS.get());
                        pOutput.accept(ModBlocks.WARPED_MOSAIC_SLAB.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
