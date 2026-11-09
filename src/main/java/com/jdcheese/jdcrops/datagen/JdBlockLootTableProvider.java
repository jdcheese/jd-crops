package com.jdcheese.jdcrops.datagen;

import com.jdcheese.jdcrops.block.JdBlocks;
import com.jdcheese.jdcrops.block.custom.StrawberryCropBlock;
import com.jdcheese.jdcrops.block.custom.HeartBerryBushBlock;
import com.jdcheese.jdcrops.item.JdItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.advancements.predicates.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchBlock;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

import java.util.concurrent.CompletableFuture;

public class JdBlockLootTableProvider extends FabricBlockLootSubProvider {
    public JdBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {
        dropSelf(JdBlocks.FERMENTING_BLOCK);
        dropSelf(JdBlocks.PRESSING_BLOCK);

        this.add(JdBlocks.STRAWBERRY_CROP, this.createCropDrops(JdBlocks.STRAWBERRY_CROP, JdItems.STRAWBERRY, JdItems.STRAWBERRY_SEEDS,
                MatchBlock.blockMatches(blocks, JdBlocks.STRAWBERRY_CROP,
                StatePropertiesPredicate.Builder.properties().hasProperty(StrawberryCropBlock.AGE, StrawberryCropBlock.MAX_AGE))
        ));

        this.add(JdBlocks.HEART_BERRY_BUSH, block -> this.applyExplosionDecay(
                block, LootTable.lootTable().withPool(
                        LootPool.lootPool()
                                .when(MatchBlock.blockMatches(blocks, JdBlocks.HEART_BERRY_BUSH,
                                        StatePropertiesPredicate.Builder.properties().hasProperty(HeartBerryBushBlock.AGE, 3))
                                )
                                .add(LootItem.lootTableItem(JdItems.HEART_BERRIES))
                                .apply(SetItemCountFunction.setCount(ContextIntProviders.between(2, 3)))
                                .apply(ApplyBonusCount.addUniformBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))
                ).withPool(LootPool.lootPool()

                        .when(MatchBlock.blockMatches(blocks, JdBlocks.HEART_BERRY_BUSH,
                                StatePropertiesPredicate.Builder.properties().hasProperty(HeartBerryBushBlock.AGE, 2))
                        )
                        .add(LootItem.lootTableItem(JdItems.HEART_BERRIES))
                        .apply(SetItemCountFunction.setCount(ContextIntProviders.between(1, 2)))
                        .apply(ApplyBonusCount.addUniformBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE))))));
    }
}