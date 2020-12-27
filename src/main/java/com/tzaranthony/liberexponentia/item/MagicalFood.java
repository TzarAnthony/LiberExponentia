package com.tzaranthony.liberexponentia.item;

import net.minecraft.item.Item;

public class MagicalFood extends Item{
	public String magicType;
	public int restoration;
	public int heartIncrease;

	public MagicalFood(Properties properties, String magicType, int restoration, int heartIncrease) {
		super(properties);
		this.setMagicType(magicType);
		this.setRestoration(restoration);
		this.setHeartIncrease(heartIncrease);
	}

	public String getMagicType() {
		return magicType;
	}

	public void setMagicType(String magicType) {
		this.magicType = magicType;
	}
	
	public int getRestoration() {
		return restoration;
	}

	public void setRestoration(int restoration) {
		this.restoration = restoration;
	}
	
	public int getHeartIncrease() {
		return heartIncrease;
	}

	public void setHeartIncrease(int heartIncrease) {
		this.heartIncrease = heartIncrease;
	}
}
