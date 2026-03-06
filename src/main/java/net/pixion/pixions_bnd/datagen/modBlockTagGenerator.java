package net.pixion.pixions_bnd.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.pixion.pixions_bnd.PixionsBnD;
import net.pixion.pixions_bnd.block.modBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class modBlockTagGenerator extends BlockTagsProvider {

    public modBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, PixionsBnD.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(modBlocks.TRIMMED_OAK_PLANKS.get(),
                        modBlocks.OAK_BOARDS.get(),
                        modBlocks.TRIMMED_OAK_BOARDS.get(),
                        modBlocks.OAK_MOSAIC.get(),
                        modBlocks.OAK_PANEL.get());

    }
}
