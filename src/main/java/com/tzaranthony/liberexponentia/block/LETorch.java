package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.TorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;

public class LETorch extends TorchBlock {
	public LETorch(String name, int light) {
		super(AbstractBlock.Properties.create(Material.MISCELLANEOUS)
				.doesNotBlockMovement()
				.zeroHardnessAndResistance()
				.func_235838_a_((lightVar) -> {return light;})
				.sound(SoundType.WOOD), ParticleTypes.field_239811_B_);
		this.setRegistryName(name);
	}
}