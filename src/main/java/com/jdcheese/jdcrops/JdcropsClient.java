package com.jdcheese.jdcrops;

import com.jdcheese.jdcrops.menu.JdMenuTypes;
import com.jdcheese.jdcrops.menu.custom.FermentingScreen;
import com.jdcheese.jdcrops.menu.custom.PressingScreen;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;

public class JdcropsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ClientTickEvents.END_CLIENT_TICK.register(JdcropsClient::onEndTick);

        MenuScreens.register(JdMenuTypes.FERMENTING_MENU, FermentingScreen::new);
        MenuScreens.register(JdMenuTypes.PRESSING_MENU, PressingScreen::new);


    }

    public static void onEndTick(Minecraft client) {
    }
}
