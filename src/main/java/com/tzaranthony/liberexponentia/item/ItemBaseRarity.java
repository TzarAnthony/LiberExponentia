package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class ItemBaseRarity extends Item{
		
	public ItemBaseRarity(String name, Rarity rare) {
		super(new Item.Properties().group(LiberExponentia.TAB).rarity(rare));
		this.setRegistryName(name);
	}
}
