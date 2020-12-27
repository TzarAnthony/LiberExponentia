package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class LEAbsSlab extends SlabBlock{
	public LEAbsSlab(String name, Material material, MaterialColor color, Float hardness, Float resistance) {
		super(AbstractBlock.Properties.create(material, color)
				.func_235861_h_().hardnessAndResistance(hardness, resistance));
		this.setRegistryName(name);
	}
}
