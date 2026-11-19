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

public record MillRecipe(Ingredient inputItem, ItemStackTemplate output) implements Recipe<MillRecipeInput> {
    public static final MapCodec<MillRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Ingredient.CODEC.fieldOf("ingredient").forGetter(MillRecipe::inputItem),
                    ItemStackTemplate.CODEC.fieldOf("result").forGetter(MillRecipe::output)
            ).apply(instance, MillRecipe::new));
    public static final StreamCodec<RegistryFriendlyByteBuf, MillRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC,
                    MillRecipe::inputItem,

                    ItemStackTemplate.STREAM_CODEC,
                    MillRecipe::output,

                    MillRecipe::new);

    @Override
    public boolean matches(MillRecipeInput input, Level level) {
        if(level.isClientSide()) {
            return false;
        }

        return inputItem.test(input.getItem(0));
    }

    @Override
    public ItemStack assemble(MillRecipeInput input) {
        return output.create().copy();
    }

    @Override
    public boolean showNotification() {
        return true;
    }

    @Override
    public String group() {
        return "Mill";
    }

    @Override
    public RecipeSerializer<? extends Recipe<MillRecipeInput>> getSerializer() {
        return JdRecipes.MILL_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<MillRecipeInput>> getType() {
        return JdRecipes.MILL_TYPE;
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

