package com.tzaranthony.liberexponentia.block;

import com.tzaranthony.liberexponentia.fluid.PotionFluid;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class PotionFluidBlock extends FlowingFluidBlock {
    public List<EffectInstance> effects;

    public PotionFluidBlock(PotionFluid fluid) {
        super(fluid, AbstractBlock.Properties.create(Material.WATER).doesNotBlockMovement().hardnessAndResistance(100.0F).noDrops());
        this.effects = fluid.getPotionEffects();
        this.setRegistryName(fluid.getName());
    }

    @Override
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        if (!worldIn.isRemote) {
            if (entityIn instanceof LivingEntity) {
                LivingEntity livingentity = (LivingEntity)entityIn;

                // Make fluid block give all effects of potion
                for (EffectInstance effect : this.effects)
                    livingentity.addPotionEffect(effect);
            }
        }
    }

}
