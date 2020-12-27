package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.Liber_Exponentia;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class ItemBaseRarityStacksize extends Item{

	public ItemBaseRarityStacksize(String name, Rarity rare, int stack) {
		super(new Item.Properties().group(Liber_Exponentia.TAB).rarity(rare).maxStackSize(stack));
		this.setRegistryName(name);
	}
}
