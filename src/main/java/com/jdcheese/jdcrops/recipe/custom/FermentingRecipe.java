package com.jdcheese.jdcrops.recipe.custom;

import com.jdcheese.jdcrops.recipe.JdRecipes;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public record FermentingRecipe(Ingredient inputItem, ItemStackTemplate output) implements Recipe<FermentingRecipeInput> {
    public static final MapCodec<FermentingRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Ingredient.CODEC.fieldOf("ingredient").forGetter(FermentingRecipe::inputItem),
                    ItemStackTemplate.CODEC.fieldOf("result").forGetter(FermentingRecipe::output)
            ).apply(instance, FermentingRecipe::new));
    public static final StreamCodec<RegistryFriendlyByteBuf, FermentingRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC,
                    FermentingRecipe::inputItem,

                    ItemStackTemplate.STREAM_CODEC,
                    FermentingRecipe::output,

                    FermentingRecipe::new);

    @Override
    public boolean matches(FermentingRecipeInput input, Level level) {
        if(level.isClientSide()) {
            return false;
        }

        return inputItem.test(input.getItem(0));
    }

    @Override
    public ItemStack assemble(FermentingRecipeInput input) {
        return output.create().copy();
    }

    @Override
    public boolean showNotification() {
        return true;
    }

    @Override
    public String group() {
        return "Fermenting";
    }

    @Override
    public RecipeSerializer<? extends Recipe<FermentingRecipeInput>> getSerializer() {
        return JdRecipes.FERMENTING_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<FermentingRecipeInput>> getType() {
        return JdRecipes.FERMENTING_TYPE;
    }

    @Override
    public PlacementInfo placementInfo() {
        return PlacementInfo.NOT_PLACEABLE;
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return RecipeBookCategories.CRAFTING_MISC;
    }
}
