package com.tzaranthony.liberexponentia.util;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

public class TAArmorMaterial implements IArmorMaterial{
	private String name;
	private int maxDamageFactor;
	private int[] damageReductionAmountArray;
	private int enchantability;
	private SoundEvent soundEvent;
	private float toughness;
	private Ingredient ingredient = null;
	private float knockbackResistance;
	
	TAArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance) {
		this.name = name;
		this.maxDamageFactor = maxDamageFactor;
		this.damageReductionAmountArray = damageReductionAmountArray;
		this.enchantability = enchantability;
		this.soundEvent = soundEvent;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
	}

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return this.maxDamageFactor;
	}
	
	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return this.damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return this.soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return ingredient == null ? Ingredient.EMPTY : ingredient;
	}
	
	public void setRepairMaterial(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public float getToughness() {
		return this.toughness;
	}

	@Override
	public float func_230304_f_() {
		return this.knockbackResistance;
	}
}
