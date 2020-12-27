package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.material.Material;

public class LESlab extends SlabBlock{
	public LESlab(String name, Material material, Float hardness, Float resistance) {
		super(Block.Properties.create(material)
				.func_235861_h_().hardnessAndResistance(hardness, resistance));
		this.setRegistryName(name);
	}
}
