package com.jdcheese.jdcrops.particles.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.FallingLeavesParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;
import org.jspecify.annotations.Nullable;

public class OrchidLeavesParticle extends FallingLeavesParticle {
    protected OrchidLeavesParticle(final ClientLevel level, final double x, final double y, final double z, final TextureAtlasSprite sprite, final float fallAcceleration, final float sideAcceleration, final boolean swirl, final boolean flowAway, final float scale, final float startVelocity) {
        super(level, x, y, z, sprite, fallAcceleration, sideAcceleration, swirl, flowAway, scale, startVelocity);
    }


    public static class OrchidProvider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprites;

        public OrchidProvider(final SpriteSet sprites) {
            this.sprites = sprites;
        }

        @Override
        public @Nullable Particle createParticle(final SimpleParticleType options, final ClientLevel level, final double x, final double y, final double z, final double xAux, final double yAux, final double zAux, final RandomSource random) {
            return new OrchidLeavesParticle(level, x, y, z, this.sprites.get(random), 0.25F, 2.0F, false, true, 1.0F, 0.0F);
        }
    }
}
