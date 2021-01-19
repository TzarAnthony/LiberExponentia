package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class HihirokaneBlock extends Block {

    public HihirokaneBlock(String name, int light) {
        super(Block.Properties.create(Material.IRON)
                .func_235861_h_()
                .sound(SoundType.field_235594_P_)
                .hardnessAndResistance(30.0F, 300.0F)
                .harvestLevel(4)
                .func_235838_a_((lightVar) -> {
                    return light;
                })
                .harvestTool(ToolType.PICKAXE));
        this.setRegistryName(name);
    }
}
