package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class MudBricks extends Block{
	public MudBricks(String name, MaterialColor color) {
		super(AbstractBlock.Properties.create(Material.ROCK, color)
				.func_235861_h_()
				.sound(SoundType.field_235590_L_)
				.hardnessAndResistance(1.25F, 4.2F)
				.harvestTool(ToolType.PICKAXE));
		this.setRegistryName(name);
	}
}
