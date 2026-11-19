package com.jdcheese.jdcrops.recipe;

import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.recipe.custom.DryingRecipe;
import com.jdcheese.jdcrops.recipe.custom.FermentingRecipe;
import com.jdcheese.jdcrops.recipe.custom.MillRecipe;
import com.jdcheese.jdcrops.recipe.custom.PressingRecipe;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;

public class JdRecipes {
    public static final RecipeSerializer<FermentingRecipe> FERMENTING_SERIALIZER = Registry.register(
            BuiltInRegistries.RECIPE_SERIALIZER, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "fermenting"),
            new RecipeSerializer<>(FermentingRecipe.CODEC, FermentingRecipe.STREAM_CODEC));
    public static final RecipeType<FermentingRecipe> FERMENTING_TYPE = Registry.register(
            BuiltInRegistries.RECIPE_TYPE, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "fermenting"),
            new RecipeType<FermentingRecipe>() {
                @Override
                public String toString() {
                    return "fermenting";
                }
            });

    public static final RecipeSerializer<PressingRecipe> PRESSING_SERIALIZER = Registry.register(
            BuiltInRegistries.RECIPE_SERIALIZER, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "pressing"),
            new RecipeSerializer<>(PressingRecipe.CODEC, PressingRecipe.STREAM_CODEC));
    public static final RecipeType<PressingRecipe> PRESSING_TYPE = Registry.register(
            BuiltInRegistries.RECIPE_TYPE, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "pressing"),
            new RecipeType<PressingRecipe>() {
                @Override
                public String toString() {
                    return "pressing";
                }
            });

    public static final RecipeSerializer<MillRecipe> MILL_SERIALIZER = Registry.register(
            BuiltInRegistries.RECIPE_SERIALIZER, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "mill"),
            new RecipeSerializer<>(MillRecipe.CODEC, MillRecipe.STREAM_CODEC));
    public static final RecipeType<MillRecipe> MILL_TYPE = Registry.register(
            BuiltInRegistries.RECIPE_TYPE, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "mill"),
            new RecipeType<MillRecipe>() {
                @Override
                public String toString() {
                    return "mill";
                }
            });

    public static final RecipeSerializer<DryingRecipe> DRYING_SERIALIZER = Registry.register(
            BuiltInRegistries.RECIPE_SERIALIZER, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "drying"),
            new RecipeSerializer<>(DryingRecipe.CODEC, DryingRecipe.STREAM_CODEC));
    public static final RecipeType<DryingRecipe> DRYING_TYPE = Registry.register(
            BuiltInRegistries.RECIPE_TYPE, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "drying"),
            new RecipeType<DryingRecipe>() {
                @Override
                public String toString() {
                    return "drying";
                }
            });

    public static void registerModRecipes() {
        JdCrops.LOGGER.info("Registering JdRecipes for " + JdCrops.MOD_ID);
    }
}

