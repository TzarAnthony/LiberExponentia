package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class CinnabarOre extends OreBlock{
	
	public CinnabarOre(String name) {
		super(Block.Properties.create(Material.ROCK)
				.func_235861_h_()
				.sound(SoundType.STONE)
				.hardnessAndResistance(4.0F, 6.0F)
				.harvestLevel(3)
				.harvestTool(ToolType.PICKAXE));
		this.setRegistryName(name);
	}
	
	@Override
	public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
		return 1;
	}
	
}
