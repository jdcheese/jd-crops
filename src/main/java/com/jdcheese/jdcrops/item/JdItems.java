package com.jdcheese.jdcrops.item;


import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.block.JdBlocks;
import com.jdcheese.jdcrops.food.JdFoods;
import com.jdcheese.jdcrops.item.custom.DrinkItem;
import com.jdcheese.jdcrops.item.custom.FoodItem;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;

import java.util.function.Consumer;
import java.util.function.Function;

import static net.minecraft.world.item.Items.BOWL;
import static net.minecraft.world.item.Items.GLASS_BOTTLE;


public class JdItems {
    public static final Item JUICER = registerItem("juicer", Item::new);
    public static final Item DOUGH = registerItem("dough", Item::new);
    public static final Item ICE_CUBES = registerItem("ice_cubes", Item::new);

    public static final Item STRAWBERRY = registerItem("strawberry", properties -> new Item(properties.food(JdFoods.STRAWBERRY).compostable(ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH)) {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.jdcrops.strawberry"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
            builder.accept(Component.translatable("tooltip.jdcrops.200gld").withStyle(ChatFormatting.GOLD));
        }
    });

    public static final Item RICE = registerItem("rice",
            Item::new);

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            properties -> new BlockItem(JdBlocks.STRAWBERRY_CROP, properties
                    .useItemDescriptionPrefix()
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW)));

    public static final Item RICE_SEEDS = registerItem("rice_seeds",
            properties -> new BlockItem(JdBlocks.RICE_CROP, properties
                    .useItemDescriptionPrefix()
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW)));

    public static final Item HEART_BERRIES = registerItem("heart_berries",
            properties -> new BlockItem(JdBlocks.HEART_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item MALO_BERRIES = registerItem("malo_berries",
            properties -> new BlockItem(JdBlocks.MALO_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item BEAR_BERRIES = registerItem("bear_berries",
            properties -> new BlockItem(JdBlocks.BEAR_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item BLACK_BERRIES = registerItem("black_berries",
            properties -> new BlockItem(JdBlocks.BLACK_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item BLACK_CURRANTS = registerItem("black_currants",
            properties -> new BlockItem(JdBlocks.BLACK_CURRANT_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item BLACK_MUL_BERRIES = registerItem("black_mul_berries",
            properties -> new BlockItem(JdBlocks.BLACK_MUL_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item BLUE_BERRIES = registerItem("blue_berries",
            properties -> new BlockItem(JdBlocks.BLUE_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item BOYSEN_BERRIES = registerItem("boysen_berries",
            properties -> new BlockItem(JdBlocks.BOYSEN_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item BUFFALO_BERRIES = registerItem("buffalo_berries",
            properties -> new BlockItem(JdBlocks.BUFFALO_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item CAPE_GOOSE_BERRIES = registerItem("cape_goose_berries",
            properties -> new BlockItem(JdBlocks.CAPE_GOOSE_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item CAPER_BERRIES = registerItem("caper_berries",
            properties -> new BlockItem(JdBlocks.CAPER_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item CEDAR_BERRIES = registerItem("cedar_berries",
            properties -> new BlockItem(JdBlocks.CEDAR_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item CHOKE_BERRIES = registerItem("choke_berries",
            properties -> new BlockItem(JdBlocks.CHOKE_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item CHOKE_CHERRY_BERRIES = registerItem("choke_cherry_berries",
            properties -> new BlockItem(JdBlocks.CHOKE_CHERRY_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item CLOUD_BERRIES = registerItem("cloud_berries",
            properties -> new BlockItem(JdBlocks.CLOUD_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item CRAN_BERRIES = registerItem("cran_berries",
            properties -> new BlockItem(JdBlocks.CRAN_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item DEW_BERRIES = registerItem("dew_berries",
            properties -> new BlockItem(JdBlocks.DEW_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item ELDER_BERRIES = registerItem("elder_berries",
            properties -> new BlockItem(JdBlocks.ELDER_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item GOJI_BERRIES = registerItem("goji_berries",
            properties -> new BlockItem(JdBlocks.GOJI_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item GOOSE_BERRIES = registerItem("goose_berries",
            properties -> new BlockItem(JdBlocks.GOOSE_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item HONEY_BERRIES = registerItem("honey_berries",
            properties -> new BlockItem(JdBlocks.HONEY_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item HUCKLE_BERRIES = registerItem("huckle_berries",
            properties -> new BlockItem(JdBlocks.HUCKLE_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));


    public static final Item JOSTA_BERRIES = registerItem("josta_berries",
            properties -> new BlockItem(JdBlocks.JOSTA_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item JUNE_BERRIES = registerItem("june_berries",
            properties -> new BlockItem(JdBlocks.JUNE_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item JUNIPER_BERRIES = registerItem("juniper_berries",
            properties -> new BlockItem(JdBlocks.JUNIPER_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item KIWI_BERRIES = registerItem("kiwi_berries",
            properties -> new BlockItem(JdBlocks.KIWI_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item LINGON_BERRIES = registerItem("lingon_berries",
            properties -> new BlockItem(JdBlocks.LINGON_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item LOGAN_BERRIES = registerItem("logan_berries",
            properties -> new BlockItem(JdBlocks.LOGAN_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item RASP_BERRIES = registerItem("rasp_berries",
            properties -> new BlockItem(JdBlocks.RASP_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item RED_CURRANTS = registerItem("red_currants",
            properties -> new BlockItem(JdBlocks.RED_CURRANT_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item RED_MUL_BERRIES = registerItem("red_mul_berries",
            properties -> new BlockItem(JdBlocks.RED_MUL_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item SALMON_BERRIES = registerItem("salmon_berries",
            properties -> new BlockItem(JdBlocks.SALMON_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item SEA_BUCKTHORN_BERRIES = registerItem("sea_buckthorn_berries",
            properties -> new BlockItem(JdBlocks.SEA_BUCKTHORN_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item TAY_BERRIES = registerItem("tay_berries",
            properties -> new BlockItem(JdBlocks.TAY_BERRY_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item WHITE_CURRANTS = registerItem("white_currants",
            properties -> new BlockItem(JdBlocks.WHITE_CURRANT_BUSH, properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    //tree crops
    public static final Item CHERRIES = registerItem("cherries",
            properties -> new Item(properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_MEDIUM)));

    public static final Item BLACK_CHERRIES = registerItem("black_cherries",
            properties -> new Item(properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_MEDIUM)));

    public static final Item BANANA = registerItem("banana",
            properties -> new Item(properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_MEDIUM)));

    public static final Item ACAI_BERRIES = registerItem("acai_berries",
            properties -> new Item(properties
                    .useItemDescriptionPrefix()
                    .food(JdFoods.BERRIES)
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));


    //milk
    public static final Item MILK_BOTTLE = registerItem("milk_bottle", properties -> {
        return new DrinkItem(properties
                .food(JdFoods.MILK_BOTTLE).craftRemainder(GLASS_BOTTLE)) {
        };
    });

    //juices
    public static final Item SWEET_BERRY_JUICE = registerItem("sweet_berry_juice", properties -> {
        return new DrinkItem(properties
                .food(JdFoods.SWEET_BERRY_JUICE, JdFoods.JUICE_CONSUMABLE).craftRemainder(GLASS_BOTTLE)) {
        };
    });

    public static final Item GLOW_BERRY_JUICE = registerItem("glow_berry_juice", properties -> {
        return new DrinkItem(properties
                .food(JdFoods.GLOW_BERRY_JUICE, JdFoods.JUICE_CONSUMABLE).craftRemainder(GLASS_BOTTLE)) {
        };
    });

    public static final Item HEART_BERRY_JUICE = registerItem("heart_berry_juice", properties -> {
        return new DrinkItem(properties
                .food(JdFoods.HEART_BERRY_JUICE, JdFoods.JUICE_CONSUMABLE).craftRemainder(GLASS_BOTTLE)) {
        };
    });

    //wines
    public static final Item SWEET_BERRY_WINE = registerItem("sweet_berry_wine", properties -> {
        return new DrinkItem(properties
                .food(JdFoods.SWEET_BERRY_WINE, JdFoods.WINE_CONSUMABLE).craftRemainder(GLASS_BOTTLE)) {
        };
    });

    public static final Item GLOW_BERRY_WINE = registerItem("glow_berry_wine", properties -> {
        return new DrinkItem(properties
                .food(JdFoods.GLOW_BERRY_WINE, JdFoods.WINE_CONSUMABLE).craftRemainder(GLASS_BOTTLE)) {
        };
    });

    public static final Item HEART_BERRY_WINE = registerItem("heart_berry_wine", properties -> {
        return new DrinkItem(properties
                .food(JdFoods.HEART_BERRY_WINE, JdFoods.WINE_CONSUMABLE).craftRemainder(GLASS_BOTTLE)) {
        };
    });

    //yogurt
    public static final Item PLAIN_YOGURT = registerItem("plain_yogurt", properties -> {
        return new DrinkItem(properties
                .food(JdFoods.PLAIN_YOGURT).craftRemainder(GLASS_BOTTLE)) {
        };
    });

    //ice creams
    public static final Item SWEET_BERRY_ICE_CREAM = registerItem("sweet_berry_ice_cream", properties -> {
        return new FoodItem(properties.food(JdFoods.SWEET_BERRY_ICE_CREAM).craftRemainder(BOWL)) {
            @Override
            public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay
                    display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
                builder.accept(Component.translatable("tooltip.jdcrops.sweet_berry_ice_cream"));
                super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
            }
        };
    });

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name)))));
    }

    public static void registerJdItems() {
        JdCrops.LOGGER.info("Registering Mod Items for " + JdCrops.MOD_ID);
    }
}
