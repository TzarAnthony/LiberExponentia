package com.tzaranthony.liberexponentia.block;

import com.tzaranthony.liberexponentia.fluid.util.PotionTypes;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.potion.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class PotionFluidBlock extends FlowingFluidBlock {
    protected Potion potion;

    // TODO: This cana bea removeda and justa use a the PotionUtils.getPotionColor(potionFluidBlock.getPotion())
    protected int fluidColor;

    public PotionFluidBlock(String name, FlowingFluid fluid, PotionTypes potionType) {
        super(fluid, AbstractBlock.Properties.create(Material.WATER).doesNotBlockMovement().hardnessAndResistance(100.0F).noDrops());
        this.setRegistryName(name);
        this.fluidColor = PotionUtils.getPotionColor(potion);
    }

    public Potion getPotion() {
        return potion;
    }

    public int getFluidColor() {
        return fluidColor;
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (!worldIn.isRemote && worldIn.getDifficulty() != Difficulty.PEACEFUL) {
            if (entityIn instanceof LivingEntity) {
                LivingEntity livingentity = (LivingEntity)entityIn;
                livingentity.addPotionEffect();
            }
        }
    }

}
