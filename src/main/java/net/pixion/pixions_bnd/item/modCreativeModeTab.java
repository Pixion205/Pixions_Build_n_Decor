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
                        pOutput.accept(modBlocks.TRIMMED_OAK_PLANKS.get());
                        pOutput.accept(modBlocks.OAK_BOARDS.get());
                        pOutput.accept(modBlocks.TRIMMED_OAK_BOARDS.get());
                        pOutput.accept(modBlocks.OAK_MOSAIC.get());
                        pOutput.accept(modBlocks.OAK_PANEL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
