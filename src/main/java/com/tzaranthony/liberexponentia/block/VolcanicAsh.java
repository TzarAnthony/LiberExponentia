package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class VolcanicAsh extends SandBlock{
	public VolcanicAsh(String name, int color) {
		super(color, AbstractBlock.Properties.create(Material.SAND, MaterialColor.GRAY)
				.func_235861_h_()
				.sound(SoundType.SNOW)
				.hardnessAndResistance(1.0F)
				.harvestLevel(0)
				.harvestTool(ToolType.SHOVEL));
		this.setRegistryName(name);
	}
}
