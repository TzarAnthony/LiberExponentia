package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class PetrifiedWood extends RotatedPillarBlock{
	public PetrifiedWood(String name) {
		super(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY)
				.func_235861_h_()
				.sound(SoundType.field_235587_I_)
				.hardnessAndResistance(1.25F, 4.2F)
				.harvestLevel(1)
				.harvestTool(ToolType.PICKAXE));
		this.setRegistryName(name);
	}
}
