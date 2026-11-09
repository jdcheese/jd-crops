package com.jdcheese.jdcrops.creativemodetab;

import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.block.JdBlocks;
import com.jdcheese.jdcrops.item.JdItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class JdCreativeModeTab {
    public static final CreativeModeTab JD_CROP_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, "jd-crops"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(JdItems.STRAWBERRY))
                    .title(Component.translatable("creativemodetab.jd-crops.jd-crops"))
                    .displayItems((parameters, output) -> {
                        output.accept(JdItems.STRAWBERRY);
                        output.accept(JdItems.RICE);
                        output.accept(JdItems.STRAWBERRY_SEEDS);
                        output.accept(JdItems.RICE_SEEDS);
                        output.accept(JdItems.HEART_BERRIES);
                        output.accept(JdItems.MALO_BERRIES);
                        output.accept(JdItems.SWEET_BERRY_JUICE);
                        output.accept(JdItems.SWEET_BERRY_WINE);
                        output.accept(JdItems.GLOW_BERRY_JUICE);
                        output.accept(JdItems.GLOW_BERRY_WINE);
                        output.accept(JdBlocks.APPLE_SAPLING);
                        output.accept(JdItems.JUICER);
                        output.accept(JdBlocks.FERMENTING_BLOCK);
                        output.accept(JdBlocks.PRESSING_BLOCK);
                    }).build());

    public static void registerJdCreativeModeTabs() {
        JdCrops.LOGGER.info("Registering Creative Mode Tabs for " + JdCrops.MOD_ID);
    }
}
