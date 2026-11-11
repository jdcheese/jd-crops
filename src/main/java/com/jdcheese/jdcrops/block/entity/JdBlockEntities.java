package com.jdcheese.jdcrops.block.entity;

import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.block.JdBlocks;
import com.jdcheese.jdcrops.block.entity.custom.FermentingBlockEntity;
import com.jdcheese.jdcrops.block.entity.custom.PressingBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class JdBlockEntities {
    public static void registerJdBlockEntities() {
        JdCrops.LOGGER.info("Registering Block Entities for " + JdCrops.MOD_ID);
    }    public static final BlockEntityType<FermentingBlockEntity> FERMENTING_BE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "fermenting_be"),
                    FabricBlockEntityTypeBuilder.create(FermentingBlockEntity::new, JdBlocks.FERMENTING_BLOCK).build());

    public static final BlockEntityType<PressingBlockEntity> PRESSING_BE =
            Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "pressing_be"),
                    FabricBlockEntityTypeBuilder.create(PressingBlockEntity::new, JdBlocks.PRESSING_BLOCK).build());


}
