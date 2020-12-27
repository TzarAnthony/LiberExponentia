package com.tzaranthony.liberexponentia.block;

import net.minecraft.state.EnumProperty;
import net.minecraft.state.properties.BlockStateProperties;

public class LEBlockStateProperties extends BlockStateProperties{
	public static final EnumProperty<TripleBlockThirds> TRIPLE_BLOCK_THIRDS = EnumProperty.create("thrid", TripleBlockThirds.class);
}
