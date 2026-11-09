package com.jdcheese.jdcrops;

import com.jdcheese.jdcrops.datagen.*;
import com.jdcheese.jdcrops.worldgen.JdFeatures;
import com.jdcheese.jdcrops.worldgen.JdPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class JdCropsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(JdBlockLootTableProvider::new);
        pack.addProvider(JdBlockTagsProvider::new);
        pack.addProvider(JdModelProvider::new);
        //pack.addProvider(JdRegistryDataProvider::new);
        pack.addProvider(JdRecipeProvider::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {
            registryBuilder.add(Registries.FEATURE, JdFeatures::bootstrap);
            registryBuilder.add(Registries.PLACED_FEATURE, JdPlacedFeatures::bootstrap);
    }

}
