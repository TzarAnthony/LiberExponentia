package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class NymphaBerries extends Item{

	@SuppressWarnings("deprecation")
	public NymphaBerries(String name) {
		super(new Item.Properties()
				.group(LiberExponentia.TAB)
				.rarity(Rarity.EPIC)
				.food(new Food.Builder()
						.hunger(2)
						.saturation(1.2f)
						.effect(new EffectInstance(Effects.REGENERATION, 1500, 1), 1.0F)
						.effect(new EffectInstance(Effects.RESISTANCE, 3000, 0), 1.0F)
						.effect(new EffectInstance(Effects.ABSORPTION, 3000, 6), 1.0F)
						.effect(new EffectInstance(Effects.WATER_BREATHING, 6000, 0), 1.0F)
						.effect(new EffectInstance(Effects.DOLPHINS_GRACE, 1500, 0), 1.0F)
						.effect(new EffectInstance(Effects.SPEED, 1500, 3), 1.0F)
						.setAlwaysEdible()
						.build())
				);
		this.setRegistryName(name);
	}
}