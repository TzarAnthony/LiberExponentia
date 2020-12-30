package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.Item;

public class ItemBase extends Item {
	
	public ItemBase(String name) {
		super(new Item.Properties().group(LiberExponentia.TAB));
		this.setRegistryName(name);
	}
}
