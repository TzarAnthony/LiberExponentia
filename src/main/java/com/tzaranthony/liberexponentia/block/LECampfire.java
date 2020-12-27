package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.CampfireBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.state.properties.BlockStateProperties;

public class LECampfire extends CampfireBlock{

	public LECampfire(String name, int light) {
		super(true, 1, AbstractBlock.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN)
				.hardnessAndResistance(2.0F)
				.sound(SoundType.WOOD)
				.func_235838_a_((lightVar) -> {return p_235421_1_.get(BlockStateProperties.LIT) ? light : 0;})
				.notSolid());
		this.setRegistryName(name);
	}
}
