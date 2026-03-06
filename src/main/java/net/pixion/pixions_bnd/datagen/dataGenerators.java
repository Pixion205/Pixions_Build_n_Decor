package net.pixion.pixions_bnd.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.pixion.pixions_bnd.PixionsBnD;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = PixionsBnD.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class dataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new modRecipeGenerator(packOutput));
        generator.addProvider(event.includeServer(), modLootTableGenerator.create(packOutput));

        generator.addProvider(event.includeClient(), new modBlockstateGenerator(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new modItemModelProvider(packOutput, existingFileHelper));

        modBlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
                new modBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new modItemTagGenerator(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));
    }
}
