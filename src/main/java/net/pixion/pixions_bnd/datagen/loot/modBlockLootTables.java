package net.pixion.pixions_bnd.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.pixion.pixions_bnd.block.modBlocks;

import java.util.Set;

public class modBlockLootTables extends BlockLootSubProvider {
    public modBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(modBlocks.TRIMMED_OAK_PLANKS.get());
        this.dropSelf(modBlocks.OAK_BOARDS.get());
        this.dropSelf(modBlocks.TRIMMED_OAK_BOARDS.get());
        this.dropSelf(modBlocks.OAK_MOSAIC.get());

        this.dropSelf(modBlocks.OAK_BOARDS_STAIRS.get());
        this.add(modBlocks.OAK_BOARDS_SLAB.get(),block -> createSlabItemTable(modBlocks.OAK_BOARDS_SLAB.get()));
        this.dropSelf(modBlocks.OAK_MOSAIC_STAIRS.get());
        this.add(modBlocks.OAK_MOSAIC_SLAB.get(),block -> createSlabItemTable(modBlocks.OAK_MOSAIC_SLAB.get()));

        this.dropSelf(modBlocks.AZURE_PLANKS.get());
        this.dropSelf(modBlocks.AZURE_STAIRS.get());
        this.dropSelf(modBlocks.AZURE_FENCE.get());
        this.dropSelf(modBlocks.AZURE_FENCE_GATE.get());
        this.dropSelf(modBlocks.AZURE_TRAPDOOR.get());
        this.dropSelf(modBlocks.AZURE_BUTTON.get());
        this.dropSelf(modBlocks.AZURE_PRESSURE_PLATE.get());

        this.add(modBlocks.AZURE_SLAB.get(),
                block -> createSlabItemTable(modBlocks.AZURE_SLAB.get()));
        this.add(modBlocks.AZURE_DOOR.get(),
                block -> createDoorTable(modBlocks.AZURE_DOOR.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return modBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
