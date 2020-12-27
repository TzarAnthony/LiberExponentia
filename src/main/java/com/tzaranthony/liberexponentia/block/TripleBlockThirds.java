package com.tzaranthony.liberexponentia.block;

import net.minecraft.util.IStringSerializable;

public enum TripleBlockThirds implements IStringSerializable{
	UPPER,
	MIDDLE,
	LOWER;
	
	public String toString() {
		return this.func_176610_l();
	}
	
	public String func_176610_l() {
		return this == UPPER ? "upper" : this == MIDDLE ? "middle" : "lower";
	}

}
