package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HihirokaneBlock extends Block{
	
	public HihirokaneBlock(String name) {
		super(Block.Properties.create(Material.IRON)
				.func_235861_h_()
				.sound(SoundType.field_235594_P_)
				.hardnessAndResistance(40.0F, 3000.0F)
				.harvestLevel(4)
				.harvestTool(ToolType.PICKAXE));
		this.setRegistryName(name);
	}
}
