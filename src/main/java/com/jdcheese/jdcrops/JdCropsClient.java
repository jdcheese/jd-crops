package com.jdcheese.jdcrops;

import com.jdcheese.jdcrops.menu.JdMenuTypes;
import com.jdcheese.jdcrops.menu.custom.DryingScreen;
import com.jdcheese.jdcrops.menu.custom.FermentingScreen;
import com.jdcheese.jdcrops.menu.custom.MillScreen;
import com.jdcheese.jdcrops.menu.custom.PressingScreen;
import com.jdcheese.jdcrops.particles.JdParticles;
import com.jdcheese.jdcrops.particles.custom.OrchidLeavesParticle;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;

public class JdCropsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ClientTickEvents.END_CLIENT_TICK.register(JdCropsClient::onEndTick);

        MenuScreens.register(JdMenuTypes.FERMENTING_MENU, FermentingScreen::new);
        MenuScreens.register(JdMenuTypes.PRESSING_MENU, PressingScreen::new);
        MenuScreens.register(JdMenuTypes.MILL_MENU, MillScreen::new);
        MenuScreens.register(JdMenuTypes.DRYING_MENU, DryingScreen::new);

        ParticleProviderRegistry.getInstance().register(JdParticles.ORCHID_LEAVES_PARTICLE, OrchidLeavesParticle.OrchidProvider::new);
    }

    public static void onEndTick(Minecraft client) {
    }
}
