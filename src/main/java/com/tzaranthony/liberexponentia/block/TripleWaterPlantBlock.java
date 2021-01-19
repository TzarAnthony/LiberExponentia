//package com.tzaranthony.liberexponentia.block;
//
//import com.tzaranthony.liberexponentia.util.LEBlocks;
//import net.minecraft.block.Block;
//import net.minecraft.block.BlockState;
//import net.minecraft.block.Blocks;
//import net.minecraft.block.IWaterLoggable;
//import net.minecraft.block.material.Material;
//import net.minecraft.entity.LivingEntity;
//import net.minecraft.fluid.FluidState;
//import net.minecraft.fluid.Fluids;
//import net.minecraft.item.BlockItemUseContext;
//import net.minecraft.item.ItemStack;
//import net.minecraft.state.BooleanProperty;
//import net.minecraft.state.StateContainer;
//import net.minecraft.state.properties.BlockStateProperties;
//import net.minecraft.util.Direction;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.IBlockReader;
//import net.minecraft.world.IWorld;
//import net.minecraft.world.IWorldReader;
//import net.minecraft.world.World;
//
//import javax.annotation.Nullable;
//
//public class TripleWaterPlantBlock extends TriplePlantBlock implements IWaterLoggable{
//	public static final BooleanProperty WATER_LOGGED = BlockStateProperties.WATERLOGGED;
//
//	public TripleWaterPlantBlock(Properties properties) {
//		super(properties);
//	};
//
//	protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
//		return state.isIn(Blocks.GRASS_BLOCK) || state.isIn(Blocks.DIRT) || state.isIn(Blocks.COARSE_DIRT) || state.isIn(Blocks.PODZOL) || state.isIn(Blocks.FARMLAND)
//				|| state.isIn(Blocks.GRAVEL) || state.isIn(Blocks.SAND) || state.isIn(Blocks.CLAY) || state.isIn(LEBlocks.MUD);
//	}
//
//	@Override
//    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
//        if (stateIn.get(WATER_LOGGED)) {
//            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
//        }
//        return facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos) ? Blocks.AIR.getDefaultState()
//        		: super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
//    }
//
//	@Nullable
//	public BlockState getStateForPlacement(BlockItemUseContext context) {
//		FluidState fluidState = context.getWorld().getFluidState(context.getPos());
//		BlockPos blockpos = context.getPos();
//		return blockpos.getY() < 255 && context.getWorld().getBlockState(blockpos.up()).isReplaceable(context)
//				? this.getDefaultState().with(WATER_LOGGED,  Boolean.valueOf(fluidState.getFluid() == Fluids.WATER) && fluidState.getLevel() == 8) : null;
//	}
//
//    @Override
//    public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
//    	worldIn.setBlockState(pos.up(), this.getDefaultState().with(THIRD, TripleBlockThirds.MIDDLE).with(WATER_LOGGED, false), 3);
//    	worldIn.setBlockState(pos.up(2), this.getDefaultState().with(THIRD, TripleBlockThirds.UPPER).with(WATER_LOGGED, false), 3);
//    }
//
//    @Override
//    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
//        if (state.get(THIRD) == TripleBlockThirds.LOWER) {
//            BlockPos blockpos = pos.down();
//            return (state.getBlock() != this || worldIn.getBlockState(pos).getMaterial() == Material.WATER)
//            		// I don't think this is needed but I saw something similar in BOP watergrass    && worldIn.getBlockState(blockpos).isTopSolid(worldIn, blockpos, null, Direction.UP)
//            		&& this.isValidGround(worldIn.getBlockState(blockpos), worldIn, blockpos);
//        } else {
//            BlockState blockstate = worldIn.getBlockState(pos.down());
//            if (state.getBlock() != this) return worldIn.isAirBlock(pos); // This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
//            return !worldIn.getBlockState(pos).get(WATER_LOGGED) && state.getBlock() == this && blockstate.get(THIRD) == TripleBlockThirds.LOWER && blockstate.get(WATER_LOGGED);
//        }
//    }
//
//    @Override
//    public void placeAt(IWorld worldIn, BlockPos pos, int flags) {
//    	if (worldIn.getBlockState(pos).getMaterial() == Material.WATER) {
//    		worldIn.setBlockState(pos, this.getDefaultState().with(THIRD, TripleBlockThirds.LOWER).with(WATER_LOGGED, true), flags);
//    	} else {
//    		worldIn.setBlockState(pos, this.getDefaultState().with(THIRD, TripleBlockThirds.LOWER).with(WATER_LOGGED, false), flags);
//    	}
//        worldIn.setBlockState(pos.up(), this.getDefaultState().with(THIRD, TripleBlockThirds.MIDDLE).with(WATER_LOGGED, false), flags);
//        worldIn.setBlockState(pos.up(2), this.getDefaultState().with(THIRD, TripleBlockThirds.UPPER).with(WATER_LOGGED, false), flags);
//    }
//
//    // idk if I need this, I saw it in BOP watergrass
//    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
//        builder.add(WATER_LOGGED, THIRD);
//    }
//
///*    @Override
//    public FluidState getFluidState(BlockState state) {
//        return state.get(WATER_LOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
//    }*/
//}