package com.jdcheese.jdcrops.worldgen;

import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.block.JdBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class JdPlacedFeatures {
    public static final ResourceKey<PlacedFeature> APPLE_TREE_PLACED_KEY = registerKey("apple_tree_placed");
    public static final ResourceKey<PlacedFeature> CHERRY_TREE_PLACED_KEY = registerKey("cherry_tree_placed");
    public static final ResourceKey<PlacedFeature> BLACK_CHERRY_TREE_PLACED_KEY = registerKey("black_cherry_tree_placed");
    public static final ResourceKey<PlacedFeature> BANANA_TREE_PLACED_KEY = registerKey("banana_tree_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.FEATURE);

        register(context, APPLE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(JdFeatures.APPLE_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        JdBlocks.APPLE_SAPLING));

        register(context, CHERRY_TREE_PLACED_KEY, configuredFeatures.getOrThrow(JdFeatures.CHERRY_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        JdBlocks.CHERRY_SAPLING));

        register(context, BLACK_CHERRY_TREE_PLACED_KEY, configuredFeatures.getOrThrow(JdFeatures.BLACK_CHERRY_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        JdBlocks.BLACK_CHERRY_SAPLING));

        register(context, BANANA_TREE_PLACED_KEY, configuredFeatures.getOrThrow(JdFeatures.BANANA_TREE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        JdBlocks.BANANA_SAPLING));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key,
                                 Holder<Feature> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
