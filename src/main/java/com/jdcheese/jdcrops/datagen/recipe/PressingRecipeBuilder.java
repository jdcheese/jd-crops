package com.jdcheese.jdcrops.datagen.recipe;

import com.jdcheese.jdcrops.recipe.custom.PressingRecipe;
import net.minecraft.advancements.triggers.Criterion;
import net.minecraft.data.recipes.RecipeBuilder;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeUnlockAdvancementBuilder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import org.jspecify.annotations.Nullable;

import java.util.List;

public class PressingRecipeBuilder implements RecipeBuilder {
    private final RecipeCategory category;
    private final ItemStackTemplate result;
    private final List<Ingredient> ingredients;
    private final RecipeUnlockAdvancementBuilder advancementBuilder = new RecipeUnlockAdvancementBuilder();
    private @Nullable String group;

    public PressingRecipeBuilder(RecipeCategory category, List<Ingredient> ingredients, ItemStackTemplate result) {
        this.category = category;
        this.result = result;
        this.ingredients = ingredients;

    }

    public static PressingRecipeBuilder pressingRecipe(RecipeCategory category, List<Ingredient> ingredients,  ItemLike item, int count) {
        return new PressingRecipeBuilder(category, ingredients, new ItemStackTemplate(item.asItem(), count));
    }

    public static PressingRecipeBuilder pressingRecipe(RecipeCategory category, List<Ingredient> ingredients, ItemLike item) {
        return new PressingRecipeBuilder(category, ingredients, new ItemStackTemplate(item.asItem()));
    }

    @Override
    public RecipeBuilder unlockedBy(String name, Criterion<?> criterion) {
        advancementBuilder.unlockedBy(name, criterion);
        return this;
    }

    @Override
    public RecipeBuilder group(@Nullable String group) {
        this.group = group;
        return this;
    }

    @Override
    public ResourceKey<Recipe<?>> defaultId() {
        return RecipeBuilder.getDefaultRecipeId(this.result);
    }

    @Override
    public void save(RecipeOutput output, ResourceKey<Recipe<?>> id) {
        PressingRecipe recipe = new PressingRecipe(this.ingredients, this.result);
        output.accept(id, recipe, this.advancementBuilder.build(output, id, this.category));
    }
}
