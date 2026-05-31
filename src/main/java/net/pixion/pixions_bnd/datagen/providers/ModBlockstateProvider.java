package net.pixion.pixions_bnd.datagen.providers;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.pixion.pixions_bnd.PixionsBnD;
import net.pixion.pixions_bnd.block.ModBlocks;

public class ModBlockstateProvider extends BlockStateProvider {
    public ModBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, PixionsBnD.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.OAK_MOSAIC);

        stairsBlock(((StairBlock) ModBlocks.OAK_MOSAIC_STAIRS.get()), blockTexture(ModBlocks.OAK_MOSAIC.get()));
        slabBlock(((SlabBlock) ModBlocks.OAK_MOSAIC_SLAB.get()), blockTexture(ModBlocks.OAK_MOSAIC.get()), blockTexture(ModBlocks.OAK_MOSAIC.get()));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
