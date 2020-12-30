package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class VampireBlood extends Item{
	
	@SuppressWarnings("deprecation")
	public VampireBlood(String name, Rarity rare, int hunger, int potency, float probability, int negPotency, float negProbability) {
		super(new Item.Properties()
				.group(LiberExponentia.TAB)
				.rarity(rare)
				.food(new Food.Builder()
						.hunger(hunger)
						.saturation(0.1f)
						.effect(new EffectInstance(Effects.SPEED, 1200, potency), probability)
						.effect(new EffectInstance(Effects.STRENGTH, 1200, potency), probability)
						.effect(new EffectInstance(Effects.RESISTANCE, 1200, potency), probability)
						.effect(new EffectInstance(Effects.HASTE, 1200, potency), probability)
						.effect(new EffectInstance(Effects.POISON, 600, negPotency), negProbability)
						.setAlwaysEdible()
						.build()));
		this.setRegistryName(name);
	}

}
