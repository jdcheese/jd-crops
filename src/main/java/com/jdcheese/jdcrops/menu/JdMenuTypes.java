package com.jdcheese.jdcrops.menu;

import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.menu.custom.DryingMenu;
import com.jdcheese.jdcrops.menu.custom.FermentingMenu;
import com.jdcheese.jdcrops.menu.custom.MillMenu;
import com.jdcheese.jdcrops.menu.custom.PressingMenu;
import net.fabricmc.fabric.api.menu.v1.ExtendedMenuType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.inventory.MenuType;

public class JdMenuTypes {
    public static final MenuType<FermentingMenu> FERMENTING_MENU =
            Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "fermenting_menu"),
                    new ExtendedMenuType<>(FermentingMenu::new, BlockPos.STREAM_CODEC));

    public static final MenuType<PressingMenu> PRESSING_MENU =
            Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "pressing_menu"),
                    new ExtendedMenuType<>(PressingMenu::new, BlockPos.STREAM_CODEC));

    public static final MenuType<MillMenu> MILL_MENU =
            Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "mill_menu"),
                    new ExtendedMenuType<>(MillMenu::new, BlockPos.STREAM_CODEC));

    public static final MenuType<DryingMenu> DRYING_MENU =
            Registry.register(BuiltInRegistries.MENU, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "drying_menu"),
                    new ExtendedMenuType<>(DryingMenu::new, BlockPos.STREAM_CODEC));

    public static void registerModMenuTypes() {
        JdCrops.LOGGER.info("Registering ModMenuTypes for " + JdCrops.MOD_ID);
    }
}

