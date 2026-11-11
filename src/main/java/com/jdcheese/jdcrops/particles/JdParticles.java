package com.jdcheese.jdcrops.particles;

import com.jdcheese.jdcrops.JdCrops;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;

public class JdParticles {
    public static final SimpleParticleType ORCHID_LEAVES_PARTICLE =
            registerParticle("orchid_leaves_particle", FabricParticleTypes.simple());


    private static SimpleParticleType registerParticle(String name, SimpleParticleType particleType) {
        return Registry.register(BuiltInRegistries.PARTICLE_TYPE, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        JdCrops.LOGGER.info("Registering Particles for " + JdCrops.MOD_ID);
    }
}
