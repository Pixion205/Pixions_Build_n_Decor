package net.pixion.pixions_bnd.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class modLootTableGenerator {
    public static LootTableProvider create(PackOutput output) {
        Supplier<LootTableSubProvider> modBlockLootTable;
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(modBlockLootTable::new, LootContextParamSets.BLOCK)
        ));
    }
}
