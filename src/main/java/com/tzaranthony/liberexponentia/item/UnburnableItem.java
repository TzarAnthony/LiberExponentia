package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.Liber_Exponentia;

import net.minecraft.item.Item;

public class UnburnableItem extends Item {
	
	public UnburnableItem(String name) {
		super(new Item.Properties().group(Liber_Exponentia.TAB).func_234689_a_());
		this.setRegistryName(name);
	}
}

