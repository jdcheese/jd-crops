package com.jdcheese.jdcrops.datagen;

import com.jdcheese.jdcrops.block.JdBlocks;
import com.jdcheese.jdcrops.block.custom.HeartBerryBushBlock;
import com.jdcheese.jdcrops.block.custom.RiceCropBlock;
import com.jdcheese.jdcrops.block.custom.StrawberryCropBlock;
import com.jdcheese.jdcrops.item.JdItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.*;

public class JdModelProvider extends FabricModelProvider {
    public JdModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createFurnace(JdBlocks.FERMENTING_BLOCK, TexturedModel.ORIENTABLE);
        blockModelGenerators.createTrivialBlock(JdBlocks.PRESSING_BLOCK, TexturedModel.ORIENTABLE);
        blockModelGenerators.createTrivialBlock(JdBlocks.ORCHID_LEAVES, TexturedModel.LEAVES);
        blockModelGenerators.createPlantWithDefaultItem(JdBlocks.APPLE_SAPLING, JdBlocks.POTTED_APPLE_SAPLING, BlockModelGenerators.PlantType.NOT_TINTED);
        blockModelGenerators.createCrossBlock(JdBlocks.HEART_BERRY_BUSH, BlockModelGenerators.PlantType.NOT_TINTED, HeartBerryBushBlock.AGE, 0, 1, 2, 3);
        blockModelGenerators.createCrossBlock(JdBlocks.MALO_BERRY_BUSH, BlockModelGenerators.PlantType.NOT_TINTED, HeartBerryBushBlock.AGE, 0, 1, 2, 3);
        blockModelGenerators.createCropBlock(JdBlocks.STRAWBERRY_CROP, StrawberryCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockModelGenerators.createCropBlock(JdBlocks.RICE_CROP, RiceCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(JdItems.STRAWBERRY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(JdItems.SWEET_BERRY_JUICE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(JdItems.SWEET_BERRY_WINE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(JdItems.GLOW_BERRY_JUICE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(JdItems.GLOW_BERRY_WINE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(JdItems.JUICER, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(JdItems.DOUGH, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(JdItems.MILK_BOTTLE, ModelTemplates.FLAT_ITEM);

    }
}
