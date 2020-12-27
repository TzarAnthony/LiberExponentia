package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.Liber_Exponentia;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class FoodBase extends Item{
	
	public FoodBase(String name, int hunger, float saturation) {
		super(new Item.Properties()
				.group(Liber_Exponentia.TAB)
				.food(new Food.Builder()
						.hunger(hunger)
						.saturation(saturation)
						.build())
				);
		this.setRegistryName(name);
	}
}
