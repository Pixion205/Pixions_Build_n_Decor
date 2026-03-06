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
        this.dropSelf(modBlocks.OAK_PANEL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return modBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
