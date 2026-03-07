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
        blockWithItem(modBlocks.TRIMMED_OAK_PLANKS);
        blockWithItem(modBlocks.OAK_BOARDS);
        blockWithItem(modBlocks.TRIMMED_OAK_BOARDS);
        blockWithItem(modBlocks.OAK_MOSAIC);

        stairsBlock(((StairBlock) modBlocks.OAK_BOARDS_STAIRS.get()), blockTexture(modBlocks.OAK_BOARDS.get()));
        slabBlock(((SlabBlock) modBlocks.OAK_BOARDS_SLAB.get()), blockTexture(modBlocks.OAK_BOARDS.get()), blockTexture(modBlocks.OAK_BOARDS.get()));
        stairsBlock(((StairBlock) modBlocks.OAK_MOSAIC_STAIRS.get()), blockTexture(modBlocks.OAK_MOSAIC.get()));
        slabBlock(((SlabBlock) modBlocks.OAK_MOSAIC_SLAB.get()), blockTexture(modBlocks.OAK_MOSAIC.get()), blockTexture(modBlocks.OAK_MOSAIC.get()));

        blockWithItem(modBlocks.AZURE_PLANKS);

        stairsBlock(((StairBlock) modBlocks.AZURE_STAIRS.get()), blockTexture(modBlocks.AZURE_PLANKS.get()));
        slabBlock(((SlabBlock) modBlocks.AZURE_SLAB.get()), blockTexture(modBlocks.AZURE_PLANKS.get()), blockTexture(modBlocks.AZURE_PLANKS.get()));

        buttonBlock(((ButtonBlock) modBlocks.AZURE_BUTTON.get()), blockTexture(modBlocks.AZURE_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) modBlocks.AZURE_PRESSURE_PLATE.get()), blockTexture(modBlocks.AZURE_PLANKS.get()));

        fenceBlock(((FenceBlock) modBlocks.AZURE_FENCE.get()), blockTexture(modBlocks.AZURE_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) modBlocks.AZURE_FENCE_GATE.get()), blockTexture(modBlocks.AZURE_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) modBlocks.AZURE_DOOR.get()), modLoc("block/azure_door_bottom"), modLoc("block/azure_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) modBlocks.AZURE_TRAPDOOR.get()), modLoc("block/azure_trapdoor"), true, "cutout");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
