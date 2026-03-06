package net.pixion.pixions_bnd.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.pixion.pixions_bnd.block.modBlocks;
import net.pixion.pixions_bnd.item.modItems;

import java.util.function.Consumer;

public class modRecipeGenerator extends RecipeProvider implements IConditionBuilder {
    public modRecipeGenerator(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, modBlocks.OAK_PANELS.get())
                .pattern("AA")
                .pattern("AA")
                .define("A", modItems.OAK_PANEL.get())
                .unlockedBy(getHasName(Items.OAK_SLAB), has(Items.OAK_SLAB))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, modBlocks.OAK_PANELS.get())
                .pattern("A")
                .pattern("A")
                .define("A", modItems.OAK_MOSAIC.get())
                .unlockedBy(getHasName(Items.OAK_SLAB), has(Items.OAK_SLAB))
                .save(pWriter);
    }
}
