package net.pixion.pixions_bnd.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.registries.RegistryObject;
import net.pixion.pixions_bnd.block.ModBlocks;

import javax.annotation.Nonnull;
import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        for (RegistryObject<Block> blockEntry : ModBlocks.BLOCKS.getEntries()) {
            Block block = blockEntry.get();

            if (block instanceof SlabBlock) {
                this.add(block, createSlabItemTable(block));
            } else if (block instanceof DoorBlock) {
                this.add(block, createDoorTable(block));
            } else {
                this.dropSelf(block);
            }
        }
    }

    @Override
    protected @Nonnull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}