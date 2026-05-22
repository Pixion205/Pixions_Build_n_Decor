package net.pixion.pixions_bnd.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.pixion.pixions_bnd.PixionsBnD;
import net.pixion.pixions_bnd.block.modBlocks;

public class modBlockstateGenerator extends BlockStateProvider {
    public modBlockstateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PixionsBnD.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(modBlocks.OAK_MOSAIC);

        stairsBlock(((StairBlock) modBlocks.OAK_MOSAIC_STAIRS.get()), blockTexture(modBlocks.OAK_MOSAIC.get()));
        slabBlock(((SlabBlock) modBlocks.OAK_MOSAIC_SLAB.get()), blockTexture(modBlocks.OAK_MOSAIC.get()), blockTexture(modBlocks.OAK_MOSAIC.get()));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
