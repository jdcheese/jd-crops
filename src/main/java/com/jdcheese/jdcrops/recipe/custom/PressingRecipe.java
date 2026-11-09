package com.jdcheese.jdcrops.recipe.custom;

import com.jdcheese.jdcrops.recipe.JdRecipes;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.NonNullList;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

import java.util.List;

public record PressingRecipe(List<Ingredient> inputItems, ItemStackTemplate output) implements Recipe<PressingRecipeInput> {
    public static final MapCodec<PressingRecipe> CODEC = RecordCodecBuilder.mapCodec(instance ->
            instance.group(
                    Ingredient.CODEC.listOf().fieldOf("ingredients").forGetter(PressingRecipe::inputItems),
                    ItemStackTemplate.CODEC.fieldOf("result").forGetter(PressingRecipe::output)
            ).apply(instance, PressingRecipe::new));
    public static final StreamCodec<RegistryFriendlyByteBuf, PressingRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC.apply(ByteBufCodecs.list()),
                    PressingRecipe::inputItems,

                    ItemStackTemplate.STREAM_CODEC,
                    PressingRecipe::output,

                    PressingRecipe::new);

    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.addAll(inputItems);
        return list;
    }

    @Override
    public boolean matches(PressingRecipeInput pInput, Level pLevel) {
        if(pLevel.isClientSide()) {
            return false;
        }

        for (int i = 0; i < inputItems.size(); i++) {
            if(!inputItems.get(i).test(pInput.getItem(i))) {
                return false;
            }
        }

        return true;
    }

    @Override
    public ItemStack assemble(PressingRecipeInput input) {
        return output.create().copy();
    }

    @Override
    public boolean showNotification() {
        return true;
    }

    @Override
    public String group() {
        return "Pressing";
    }

    @Override
    public RecipeSerializer<? extends Recipe<PressingRecipeInput>> getSerializer() {
        return JdRecipes.PRESSING_SERIALIZER;
    }

    @Override
    public RecipeType<? extends Recipe<PressingRecipeInput>> getType() {
        return JdRecipes.PRESSING_TYPE;
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
