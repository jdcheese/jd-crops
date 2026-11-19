package com.jdcheese.jdcrops;


import com.jdcheese.jdcrops.block.JdBlocks;
import com.jdcheese.jdcrops.block.entity.JdBlockEntities;
import com.jdcheese.jdcrops.creativemodetab.JdCreativeModeTab;
import com.jdcheese.jdcrops.item.JdItems;
import com.jdcheese.jdcrops.menu.JdMenuTypes;
import com.jdcheese.jdcrops.particles.JdParticles;
import com.jdcheese.jdcrops.recipe.JdRecipes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.PackType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Text;

public class JdCrops implements ModInitializer {
    public static final String MOD_ID = "jd-crops";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    @Override
    public void onInitialize() {
        JdCreativeModeTab.registerJdCreativeModeTabs();

        JdItems.registerJdItems();
        JdBlocks.registerJdBlocks();

        JdBlockEntities.registerJdBlockEntities();

        JdMenuTypes.registerModMenuTypes();
        JdRecipes.registerModRecipes();

        JdParticles.registerParticles();

        FabricLoader.getInstance().getModContainer(MOD_ID).ifPresent(container -> {
            ResourceManagerHelper.registerBuiltinResourcePack(id("default"), container, "resourcePack.jdcrops.default.name", ResourcePackActivationType.ALWAYS_ENABLED);
        });

        LOGGER.info("Hello Fabric world!");
    }
}
