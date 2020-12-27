package com.tzaranthony.liberexponentia.block;


import java.util.Random;

import javax.annotation.Nullable;

import com.tzaranthony.liberexponentia.util.LEItems;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.SweetBerryBushBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

public class WaterBerries extends SweetBerryBushBlock{
	
	public WaterBerries(String name) {
		super(AbstractBlock.Properties.create(Material.OCEAN_PLANT)
				.tickRandomly()
				.doesNotBlockMovement()
				.sound(SoundType.SWEET_BERRY_BUSH));
		this.setRegistryName(name);
	}
	
	// berry bush that can be water logged
	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return state.isIn(Blocks.SAND) || state.isIn(Blocks.DIRT) || state.isIn(Blocks.COARSE_DIRT) || state.isIn(Blocks.field_235337_cO_) ;
	}
	
	@Nullable
	public BlockState getStateForPlacement(BlockItemUseContext context) {
	    FluidState fluidstate = context.getWorld().getFluidState(context.getPos());
	    return fluidstate.isTagged(FluidTags.WATER) && fluidstate.getLevel() == 8 ? super.getStateForPlacement(context) : null;
	}
	
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
	    BlockState blockstate = super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
	    if (!blockstate.isAir()) {
	    	worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
		}
	    return blockstate;
	}
	
	public FluidState getFluidState(BlockState state) {
		return Fluids.WATER.getStillFluidState(false);
	}
	
	public boolean canContainFluid(IBlockReader worldIn, BlockPos pos, BlockState state, Fluid fluidIn) {
		return false;
	}
	
	public boolean receiveFluid(IWorld worldIn, BlockPos pos, BlockState state, FluidState fluidStateIn) {
		return false;
	}
	
	
	// overrides for berry bush things
	@Override // berry picking
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		int i = state.get(AGE);
	    boolean flag = i == 3;
	    if (i > 1) {
	        int j = 1 + worldIn.rand.nextInt(2);
	        spawnAsEntity(worldIn, pos, new ItemStack(LEItems.NYMPHA_BERRIES, j + (flag ? 1 : 0)));
	        worldIn.playSound((PlayerEntity)null, pos, SoundEvents.ITEM_SWEET_BERRIES_PICK_FROM_BUSH, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.rand.nextFloat() * 0.4F);
	        worldIn.setBlockState(pos, state.with(AGE, Integer.valueOf(1)), 2);
	        return ActionResultType.func_233537_a_(worldIn.isRemote);
	    } else {
	        return super.onBlockActivated(state, worldIn, pos, player, handIn, hit);
	    }
	}
	
	@Override // not bonemealable
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
		return false;
	}
}
