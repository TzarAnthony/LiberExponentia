package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.Liber_Exponentia;

import net.minecraft.item.Food;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class LifeBottle extends MagicalFood{
	
	@SuppressWarnings("deprecation")
	public LifeBottle(String name) {
		super(new MagicalFood.Properties()
				.group(Liber_Exponentia.TAB)
				.rarity(Rarity.UNCOMMON)
				.food(new Food.Builder()
						.hunger(6)
						.saturation(1.5f)
						.effect(new EffectInstance(Effects.REGENERATION, 400, 3), 1.0F)
						.effect(new EffectInstance(Effects.RESISTANCE, 200, 4), 1.0F)
						.effect(new EffectInstance(Effects.FIRE_RESISTANCE, 200, 1), 1.0F)
						.effect(new EffectInstance(Effects.WATER_BREATHING, 200, 1), 1.0F)
						.effect(new EffectInstance(Effects.NAUSEA, 200, 1), 1.0F)
						.effect(new EffectInstance(Effects.WEAKNESS, 400, 4), 1.0F)
						.effect(new EffectInstance(Effects.SLOWNESS, 200, 4), 1.0F)
						.setAlwaysEdible()
						.build())
				, "rand", 400, 4);
		this.setRegistryName(name);
	}
}
