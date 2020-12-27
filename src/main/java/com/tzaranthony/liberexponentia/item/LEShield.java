package com.tzaranthony.liberexponentia.item;

import net.minecraft.item.ShieldItem;

public class LEShield extends ShieldItem{
	private final int magicReduction;
	
	public LEShield(Properties properties, int durability, String name, int magicDef) {
		super(properties.maxDamage(durability));
		this.setRegistryName(name);
		this.magicReduction = magicDef;
	}
	
	// add magic dmg reduction
}
