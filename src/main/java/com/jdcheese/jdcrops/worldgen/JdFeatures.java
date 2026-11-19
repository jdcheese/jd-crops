package com.jdcheese.jdcrops.worldgen;

import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.block.JdBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.TreeFeature;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;

public class JdFeatures {
    public static final ResourceKey<Feature> APPLE_TREE_KEY = registerKey("apple_tree");
    public static final ResourceKey<Feature> CHERRY_TREE_KEY = registerKey("cherry_tree");
    public static final ResourceKey<Feature> BLACK_CHERRY_TREE_KEY = registerKey("black_cherry_tree");
    public static final ResourceKey<Feature> BANANA_TREE_KEY = registerKey("banana_tree");

    public static void bootstrap(BootstrapContext<Feature> context) {
        context.register(APPLE_TREE_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(3, 3, 4),

                BlockStateProvider.of(JdBlocks.ORCHID_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 3),

                new TwoLayersFeatureSize(1, 0, 2),
                BlockStateProvider.holderOf(Blocks.DIRT)).build());

        context.register(CHERRY_TREE_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(3, 3, 4),

                BlockStateProvider.of(JdBlocks.ORCHID_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 3),

                new TwoLayersFeatureSize(1, 0, 2),
                BlockStateProvider.holderOf(Blocks.DIRT)).build());

        context.register(BLACK_CHERRY_TREE_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(3, 3, 4),

                BlockStateProvider.of(JdBlocks.ORCHID_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 3),

                new TwoLayersFeatureSize(1, 0, 2),
                BlockStateProvider.holderOf(Blocks.DIRT)).build());

        context.register(BANANA_TREE_KEY, new TreeFeature.Builder(
                BlockStateProvider.of(Blocks.OAK_LOG),
                new StraightTrunkPlacer(3, 3, 4),

                BlockStateProvider.of(JdBlocks.ORCHID_LEAVES),
                new BlobFoliagePlacer(ConstantInt.of(1), ConstantInt.of(1), 3),

                new TwoLayersFeatureSize(1, 0, 2),
                BlockStateProvider.holderOf(Blocks.DIRT)).build());
    }

    public static ResourceKey<Feature> registerKey(String name) {
        return ResourceKey.create(Registries.FEATURE, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name));
    }
}
