package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class LEAbsStairs extends StairsBlock{
	public LEAbsStairs(String name, BlockState state, AbstractBlock block) {
		super(state, AbstractBlock.Properties.from(block));
		this.setRegistryName(name);
	}
}
