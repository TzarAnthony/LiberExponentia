package com.tzaranthony.liberexponentia.item;

import net.minecraft.item.Item;

import com.tzaranthony.liberexponentia.Liber_Exponentia;

public class ItemBase extends Item {
	
	public ItemBase(String name) {
		super(new Item.Properties().group(Liber_Exponentia.TAB));
		this.setRegistryName(name);
	}
}
