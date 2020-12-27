package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LELantern extends LanternBlock{
	public LELantern(String name, int light) {
		super(AbstractBlock.Properties.create(Material.IRON)
				.func_235861_h_()
				.hardnessAndResistance(3.5F)
				.sound(SoundType.LANTERN)
				.func_235838_a_((lightVar) -> {return light;})
				.notSolid());
		this.setRegistryName(name);
	}
}
