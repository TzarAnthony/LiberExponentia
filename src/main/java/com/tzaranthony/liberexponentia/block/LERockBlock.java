package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class LERockBlock extends Block{
	
	public LERockBlock(String name, float hardness, float resistance) {
		super(Block.Properties.create(Material.ROCK)
				.func_235861_h_()
				.sound(SoundType.STONE)
				.hardnessAndResistance(hardness, resistance)
				.harvestLevel(2)
				.harvestTool(ToolType.PICKAXE));
		this.setRegistryName(name);
	}
}
