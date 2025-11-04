package com.hadevv.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties RADISH = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.6f).effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600), 1.0f)
            .build();
}

