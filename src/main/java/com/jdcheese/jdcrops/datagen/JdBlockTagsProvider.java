package com.jdcheese.jdcrops.datagen;

import com.jdcheese.jdcrops.block.JdBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class JdBlockTagsProvider extends FabricTagsProvider.BlockTagsProvider {
    public JdBlockTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.CROPS)
                .add(JdBlocks.getRK(JdBlocks.STRAWBERRY_CROP))
                .add(JdBlocks.getRK(JdBlocks.RICE_CROP));
    }
}