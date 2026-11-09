package com.jdcheese.jdcrops.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class JdFoods {

    public static final FoodProperties STRAWBERRY = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodProperties HEART_BERRIES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.15f).alwaysEdible().build();
    public static final FoodProperties MALO_BERRIES = new FoodProperties.Builder().nutrition(1).saturationModifier(0.15f).alwaysEdible().build();

    public static final FoodProperties SWEET_BERRY_JUICE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.15f).build();
    public static final FoodProperties SWEET_BERRY_WINE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.15f).build();
    public static final FoodProperties GLOW_BERRY_JUICE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.15f).build();
    public static final FoodProperties GLOW_BERRY_WINE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.15f).build();

    public static final FoodProperties HEART_BERRY_WINE = new FoodProperties.Builder().nutrition(2).saturationModifier(0.15f).build();

    public static  final Consumable WINE_CONSUMABLE = Consumables.defaultDrink()
            .consumeSeconds(1f)
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SLOWNESS, 600), 1f))
            .build();

    public static final Consumable JUICE_CONSUMABLE = Consumables.defaultDrink()
            .consumeSeconds(1f).build();
}
