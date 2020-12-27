package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class LEStairs extends StairsBlock{
	public LEStairs(String name, BlockState state, Block block) {
		super(state, Block.Properties.from(block));
		this.setRegistryName(name);
	}
}
