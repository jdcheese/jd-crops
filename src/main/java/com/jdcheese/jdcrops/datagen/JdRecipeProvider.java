package com.jdcheese.jdcrops.datagen;

import com.jdcheese.jdcrops.block.JdBlocks;
import com.jdcheese.jdcrops.datagen.recipe.FermentingRecipeBuilder;
import com.jdcheese.jdcrops.datagen.recipe.PressingRecipeBuilder;
import com.jdcheese.jdcrops.item.JdItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class JdRecipeProvider extends FabricRecipeProvider {
    public JdRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, BootstrapContext<Recipe<?>> recipes, BootstrapContext<Advancement> advancements) {
        return new RecipeProvider(recipes, advancements) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.MISC, JdBlocks.FERMENTING_BLOCK, 1)
                        .pattern("PSP")
                        .pattern("PBP")
                        .pattern("PSP")
                        .define('P', ItemTags.PLANKS)
                        .define('S', ItemTags.WOODEN_SLABS)
                        .define('B', Items.BUCKET)
                        .unlockedBy(getHasName(Items.BUCKET), has(Items.BUCKET))
                        .save(output, "jd-crops:fermenter");

                shaped(RecipeCategory.MISC, JdBlocks.PRESSING_BLOCK, 1)
                        .pattern("PSP")
                        .pattern("PJP")
                        .pattern("PQP")
                        .define('P', ItemTags.PLANKS)
                        .define('S', ItemTags.WOODEN_SLABS)
                        .define('J', JdItems.JUICER)
                        .define('Q', ItemTags.STONE_CRAFTING_MATERIALS)
                        .unlockedBy(getHasName(Items.BUCKET), has(Items.BUCKET))
                        .save(output, "jd-crops:pressing_barrel");

                shaped(RecipeCategory.MISC, JdItems.JUICER, 1)
                        .pattern(" C ")
                        .pattern("CCC")
                        .define('C', Items.COPPER_INGOT)
                        .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                        .save(output);

                SimpleCookingRecipeBuilder.campfireCooking(
                                Ingredient.of(JdItems.DOUGH),
                                RecipeCategory.MISC,
                                Items.BREAD,
                                0.35f,
                                100)
                        .unlockedBy(getHasName(Items.WATER_BUCKET), has(Items.WATER_BUCKET))
                        .save(output, "jdcrops:dough_to_bread");

                FermentingRecipeBuilder.fermentingRecipe(RecipeCategory.MISC, Ingredient.of(JdItems.SWEET_BERRY_JUICE), JdItems.SWEET_BERRY_WINE, 1)
                        .unlockedBy(getHasName(JdItems.SWEET_BERRY_JUICE), has(JdItems.SWEET_BERRY_JUICE))
                        .save(output, "jd-crops:sweet_berry_juice_to_sweet_berry_wine");

                FermentingRecipeBuilder.fermentingRecipe(RecipeCategory.MISC, Ingredient.of(JdItems.GLOW_BERRY_JUICE), JdItems.GLOW_BERRY_WINE, 1)
                        .unlockedBy(getHasName(JdItems.GLOW_BERRY_JUICE), has(JdItems.GLOW_BERRY_JUICE))
                        .save(output, "jd-crops:glow_berry_juice_to_glow_berry_wine");

                PressingRecipeBuilder.pressingRecipe(RecipeCategory.MISC, List.of(
                                        Ingredient.of(Items.SWEET_BERRIES),
                                        Ingredient.of(Items.GLASS_BOTTLE)),
                                JdItems.SWEET_BERRY_JUICE, 1)
                        .unlockedBy(getHasName(Items.SWEET_BERRIES), has(Items.SWEET_BERRIES))
                        .save(output, "jd-crops:sweet_berries_to_sweet_berry_juice");

                PressingRecipeBuilder.pressingRecipe(RecipeCategory.MISC, List.of(
                                        Ingredient.of(Items.GLOW_BERRIES),
                                        Ingredient.of(Items.GLASS_BOTTLE)),
                                JdItems.GLOW_BERRY_JUICE, 1)
                        .unlockedBy(getHasName(Items.GLOW_BERRIES), has(Items.GLOW_BERRIES))
                        .save(output, "jd-crops:glow_berries_to_glow_berry_juice");
            }
        };

}

    @Override
    public String getName() {
        return "Jdcrops Recipes";
    }
}

