package net.pixion.pixions_bnd.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.pixion.pixions_bnd.PixionsBnD;

public class modTags {
    public static class Blocks {



        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(PixionsBnD.MODID, name));
        }

    }

    public static class Items {

        public static final TagKey<Item> LUMBERS = tag("lumbers");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(PixionsBnD.MODID, name));
        }
    }
}
