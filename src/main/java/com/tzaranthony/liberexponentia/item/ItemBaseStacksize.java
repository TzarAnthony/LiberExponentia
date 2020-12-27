package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.Liber_Exponentia;

import net.minecraft.item.Item;

public class ItemBaseStacksize extends Item{

	public ItemBaseStacksize(String name, int stack) {
		super(new Item.Properties().group(Liber_Exponentia.TAB).maxStackSize(stack));
		this.setRegistryName(name);
	}
}
