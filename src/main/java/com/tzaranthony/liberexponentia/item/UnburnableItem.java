package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.Item;

public class UnburnableItem extends Item {
	
	public UnburnableItem(String name) {
		super(new Item.Properties().group(LiberExponentia.TAB).func_234689_a_());
		this.setRegistryName(name);
	}
}

