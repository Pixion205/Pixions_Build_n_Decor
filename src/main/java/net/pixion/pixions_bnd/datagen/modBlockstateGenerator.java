package net.pixion.pixions_bnd.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
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
        blockWithItem(modBlocks.TRIMMED_OAK_PLANKS);
        blockWithItem(modBlocks.OAK_BOARDS);
        blockWithItem(modBlocks.TRIMMED_OAK_BOARDS);
        blockWithItem(modBlocks.OAK_MOSAIC);
        blockWithItem(modBlocks.OAK_PANEL);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
