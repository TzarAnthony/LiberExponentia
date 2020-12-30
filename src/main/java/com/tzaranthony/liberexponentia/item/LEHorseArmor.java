package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;

public class LEHorseArmor extends HorseArmorItem{

	public LEHorseArmor(String name, int protection, String texture) {
		super(protection, texture, new Item.Properties()
				.group(LiberExponentia.TAB)
				.maxStackSize(1));
		this.setRegistryName(name);
	}

}
