package com.jdcheese.jdcrops.worldgen.tree;

import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.worldgen.JdFeatures;
import net.minecraft.util.random.WeightedList;
import net.minecraft.world.level.block.grower.TreeGrower;

public class JdTreeGrowers {
    public static final TreeGrower APPLE_TREE = new TreeGrower(JdCrops.MOD_ID + ":apple_tree",
            WeightedList.of(JdFeatures.APPLE_TREE_KEY), WeightedList.of(), WeightedList.of(), null);
}
