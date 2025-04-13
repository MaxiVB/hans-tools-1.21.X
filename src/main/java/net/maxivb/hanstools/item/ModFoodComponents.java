package net.maxivb.hanstools.item;

import net.maxivb.hanstools.HansTools;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFoodComponents {
    public static final FoodComponent URANIUM_ROD = new FoodComponent.Builder().nutrition(16).saturationModifier(2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 800), 0.50f).build();

}
