package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class FoodBase extends Item{
	
	public FoodBase(String name, int hunger, float saturation) {
		super(new Item.Properties()
				.group(LiberExponentia.TAB)
				.food(new Food.Builder()
						.hunger(hunger)
						.saturation(saturation)
						.build())
				);
		this.setRegistryName(name);
	}
}
