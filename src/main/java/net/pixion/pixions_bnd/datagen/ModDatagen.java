package net.pixion.pixions_bnd.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pixion.pixions_bnd.PixionsBnD;
import net.pixion.pixions_bnd.datagen.providers.ModBlockstateProvider;
import net.pixion.pixions_bnd.datagen.providers.ModItemModelProvider;
import net.pixion.pixions_bnd.datagen.providers.ModLootTableProvider;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = PixionsBnD.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDatagen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new ModBlockstateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
    }
}
