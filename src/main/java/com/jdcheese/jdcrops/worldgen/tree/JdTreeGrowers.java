package com.jdcheese.jdcrops.worldgen.tree;

import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.worldgen.JdFeatures;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class JdTreeGrowers {
    public static final TreeGrower APPLE_TREE = new TreeGrower(JdCrops.MOD_ID + ":apple_tree",
            WeightedList.of(JdFeatures.APPLE_TREE_KEY), WeightedList.of(), WeightedList.of(), null);

    public static final TreeGrower CHERRY_TREE = new TreeGrower(JdCrops.MOD_ID + ":cherry_tree",
            WeightedList.of(JdFeatures.CHERRY_TREE_KEY), WeightedList.of(), WeightedList.of(), null);

    public static final TreeGrower BLACK_CHERRY_TREE = new TreeGrower(JdCrops.MOD_ID + ":black_cherry_tree",
            WeightedList.of(JdFeatures.BLACK_CHERRY_TREE_KEY), WeightedList.of(), WeightedList.of(), null);

    public static final TreeGrower BANANA_TREE = new TreeGrower(JdCrops.MOD_ID + ":banana_tree",
            WeightedList.of(JdFeatures.BANANA_TREE_KEY), WeightedList.of(), WeightedList.of(), null);
}
