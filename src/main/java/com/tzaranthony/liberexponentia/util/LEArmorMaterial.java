package com.tzaranthony.liberexponentia.util;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.SoundEvent;

public class LEArmorMaterial extends TAArmorMaterial{
	private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
	private final int maxDamageFactor;
	
	public LEArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability,
			SoundEvent soundEvent, float toughness, float knockbackResistance) {
		super(name, maxDamageFactor, damageReductionAmountArray, enchantability, soundEvent, toughness, knockbackResistance);
		this.maxDamageFactor = maxDamageFactor;
	}
	
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}
	
	
}
