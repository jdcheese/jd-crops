package com.jdcheese.jdcrops.item;

import com.jdcheese.jdcrops.JdCrops;
import com.jdcheese.jdcrops.block.JdBlocks;
import com.jdcheese.jdcrops.food.JdFoods;
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

public class JdItems {
    public static final Item JUICER = registerItem("juicer",  Item::new);
    public static final Item DOUGH = registerItem("dough", Item::new);

    public static final Item STRAWBERRY = registerItem("strawberry", properties -> new Item(properties.food(JdFoods.STRAWBERRY).compostable(ContextIntProviders.COMPOSTABLE_MEDIUM_HIGH)) {
        @Override
        public void appendHoverText(ItemStack itemStack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag) {
            builder.accept(Component.translatable("tooltip.jdcrops.strawberry"));
            super.appendHoverText(itemStack, context, display, builder, tooltipFlag);
        }
    });

    public static final Item RICE = registerItem("rice",
            Item::new);

    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds",
            properties -> new BlockItem(JdBlocks.STRAWBERRY_CROP, properties.useItemDescriptionPrefix()
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW)));

    public static final Item RICE_SEEDS = registerItem("rice_seeds",
            properties -> new BlockItem(JdBlocks.RICE_CROP,
                    properties.useItemDescriptionPrefix()));

    public static final Item HEART_BERRIES = registerItem("heart_berries",
            properties -> new BlockItem(JdBlocks.HEART_BERRY_BUSH, properties
                    .food(JdFoods.HEART_BERRIES).useItemDescriptionPrefix()
                    .compostable(ContextIntProviders.COMPOSTABLE_LOW_MEDIUM)));

    public static final Item MALO_BERRIES = registerItem("malo_berries",
            properties -> new BlockItem(JdBlocks.MALO_BERRY_BUSH,
                    properties.useItemDescriptionPrefix().food(JdFoods.MALO_BERRIES)));

    //juices
    public static final Item SWEET_BERRY_JUICE = registerItem("sweet_berry_juice", properties -> new Item(properties
            .food(JdFoods.SWEET_BERRY_JUICE, JdFoods.JUICE_CONSUMABLE)) {
    });

    public static final Item GLOW_BERRY_JUICE = registerItem("glow_berry_juice", properties -> new Item(properties
            .food(JdFoods.GLOW_BERRY_JUICE, JdFoods.JUICE_CONSUMABLE)) {
    });

    //wines
    public static final Item SWEET_BERRY_WINE = registerItem("sweet_berry_wine", properties -> new Item(properties
            .food(JdFoods.SWEET_BERRY_WINE, JdFoods.WINE_CONSUMABLE)) {
    });

    public static final Item GLOW_BERRY_WINE = registerItem("glow_berry_wine", properties -> new Item(properties
            .food(JdFoods.GLOW_BERRY_WINE, JdFoods.WINE_CONSUMABLE)) {
    });

    public static final Item HEART_BERRY_WINE = registerItem("heart_berry_wine", properties -> new Item(properties
            .food(JdFoods.HEART_BERRY_WINE, JdFoods.WINE_CONSUMABLE)) {
    });

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(JdCrops.MOD_ID, name)))));
    }

    public static void registerJdItems() {
        JdCrops.LOGGER.info("Registering Mod Items for " + JdCrops.MOD_ID);
    }
}
