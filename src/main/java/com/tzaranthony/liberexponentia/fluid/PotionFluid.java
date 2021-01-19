package com.tzaranthony.liberexponentia.fluid;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Item;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtils;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.FluidTags;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fluids.FluidAttributes;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class PotionFluid extends FlowingFluid {
    protected Potion potion;
    private Flowing flowingPotionFluid;
    private Item PotionBucket;
    private Source sourcePotionFluid;
    private Block fluidBlock;
    private final String name;

    public PotionFluid(String name, Potion potion, Block fluidBlock, Item Bucket) {
        super();
        this.potion = potion;
        this.fluidBlock = fluidBlock;
        this.PotionBucket = Bucket;
        this.name = name;
    }

//    public final PotionFluid registerSourceFlowingFluids() {
//        this.flowingPotionFluid = new Flowing(this.name + "_flowing", this.potion, this.fluidBlock, this);
//        this.sourcePotionFluid = new Source(this.name + "_source", this.potion, this.fluidBlock);
//        return this;
//    }

    public Fluid getFlowingFluid() {
        return flowingPotionFluid;
    }

    public Fluid getStillFluid() {
        return sourcePotionFluid;
    }

    public Item getFilledBucket() {
        return PotionBucket;
    }

    @Override
    public FluidAttributes createAttributes() {
        return FluidAttributes.builder(
                new ResourceLocation("block/potion_still"),
                new ResourceLocation("block/potion_flow"))
                .overlay(new ResourceLocation("block/potion_overlay"))
                .translationKey("block.liberexponentia.potion")
                .color(PotionUtils.getPotionColor(this.potion))
                .sound(SoundEvents.ITEM_BUCKET_FILL, SoundEvents.ITEM_BUCKET_EMPTY)
                .build(this);
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(World worldIn, BlockPos pos, FluidState state, Random random) {
        if (!state.isSource() && !state.get(FALLING)) {
            if (random.nextInt(64) == 0) {
                worldIn.playSound((double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D,
                        SoundEvents.BLOCK_WATER_AMBIENT, SoundCategory.BLOCKS, random.nextFloat() * 0.25F + 0.75F,
                        random.nextFloat() + 0.5F, false);
            }
        } else if (random.nextInt(10) == 0) {
            worldIn.addParticle(ParticleTypes.UNDERWATER, (double) pos.getX() + random.nextDouble(),
                    (double) pos.getY() + random.nextDouble(), (double) pos.getZ() + random.nextDouble(), 0.0D, 0.0D, 0.0D);
        }
    }

    @Nullable
    @OnlyIn(Dist.CLIENT)
    public IParticleData getDripParticleData() {
        return ParticleTypes.DRIPPING_HONEY;
    }

    protected boolean canSourcesMultiply() {
        return false;
    }

    protected void beforeReplacingBlock(IWorld worldIn, BlockPos pos, BlockState state) {
        TileEntity tileentity = state.hasTileEntity() ? worldIn.getTileEntity(pos) : null;
        Block.spawnDrops(state, worldIn, pos, tileentity);
    }

    protected int getSlopeFindDistance(IWorldReader worldIn) {
        return 4;
    }

    protected int getLevelDecreasePerBlock(IWorldReader worldIn) {
        return 1;
    }

    public Item getFilledBucket(FluidState state) {
        return PotionBucket;
    }

    protected boolean canDisplace(FluidState state, IBlockReader reader, BlockPos p_215665_3_, Fluid fluid, Direction dir) {
        return dir == Direction.DOWN && !fluid.isIn(FluidTags.WATER);
    }

    public int getTickRate(IWorldReader world) {
        return 5;
    }

    protected float getExplosionResistance() {
        return 100;
    }

    protected BlockState getBlockState(FluidState state) {
        return this.fluidBlock.getDefaultState().with(FlowingFluidBlock.LEVEL, Integer.valueOf(getLevelFromState(state)));
    }

    @Override
    public boolean isSource(FluidState state) {
        return false;
    }

    @Override
    public int getLevel(FluidState p_207192_1_) {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public Potion getPotion() {
        return this.potion;
    }

    public List<EffectInstance> getPotionEffects() {
        return this.potion.getEffects();
    }

    public static class Flowing extends PotionFluid {
        public Flowing(String name, Potion potion, Block fluidBlock, Item bucket) {
            super(name, potion, fluidBlock, bucket);
            this.setRegistryName(name);
        }

        protected void fillStateContainer(StateContainer.Builder<Fluid, FluidState> builder) {
            super.fillStateContainer(builder);
            builder.add(LEVEL_1_8);
        }

        @Override
        public int getLevel(FluidState state) {
            return state.get(LEVEL_1_8);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }
    }

    public static class Source extends PotionFluid {
        public Source(String name, Potion potion, Block fluidBlock, Item Bucket) {
            super(name, potion, fluidBlock, Bucket);
            this.setRegistryName(name);
        }

        @Override
        public int getLevel(FluidState state) {
            return 8;
        }

        @Override
        public boolean isSource(FluidState state) {
            return true;
        }
    }
}
