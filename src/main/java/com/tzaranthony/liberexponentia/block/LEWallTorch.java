package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.particles.ParticleTypes;

public class LEWallTorch extends WallTorchBlock {
	public LEWallTorch(String name, int light, Block base) {
		super(AbstractBlock.Properties.create(Material.MISCELLANEOUS)
				.doesNotBlockMovement()
				.zeroHardnessAndResistance()
				.func_235838_a_((lightVar) -> {return light;})
				.sound(SoundType.WOOD).lootFrom(base), ParticleTypes.field_239811_B_);
		this.setRegistryName(name);
	}
}