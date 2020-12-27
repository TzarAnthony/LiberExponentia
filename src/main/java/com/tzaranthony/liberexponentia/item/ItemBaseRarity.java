package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.Liber_Exponentia;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class ItemBaseRarity extends Item{
		
	public ItemBaseRarity(String name, Rarity rare) {
		super(new Item.Properties().group(Liber_Exponentia.TAB).rarity(rare));
		this.setRegistryName(name);
	}
}
