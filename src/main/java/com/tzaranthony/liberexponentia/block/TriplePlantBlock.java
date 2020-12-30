package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;

public class TriplePlantBlock extends BushBlock{
	public static final EnumProperty<TripleBlockThirds> THIRD = LEBlockStateProperties.TRIPLE_BLOCK_THIRDS;
	
	public TriplePlantBlock(AbstractBlock.Properties properties) {
		super(properties);
		this.setDefaultState(this.stateContainer.getBaseState().with(THIRD, TripleBlockThirds.LOWER));
	}
	
	/**
	 * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
	 * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
	 * returns its solidified counterpart.
	 * Note that this method should ideally consider only the specific face passed in.
	 */
	public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
		TripleBlockThirds tripleblockthirds = stateIn.get(THIRD);
		
		if (facing.getAxis() != Direction.Axis.Y
				|| tripleblockthirds == TripleBlockThirds.LOWER != (facing == Direction.UP)
				|| facingState.isIn(this) && facingState.get(THIRD) != tripleblockthirds) {
			
			return (tripleblockthirds == TripleBlockThirds.LOWER
					&& facing == Direction.DOWN
					&& !stateIn.isValidPosition(worldIn, currentPos)
					? Blocks.AIR.getDefaultState() : super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos));
		} else {
			return Blocks.AIR.getDefaultState();
		}
	}
	
	@Nullable
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		BlockPos blockpos = context.getPos();
	    	return blockpos.getY() < 255 && context.getWorld().getBlockState(blockpos.up()).isReplaceable(context) ? super.getStateForPlacement(context) : null;
	}
	
	/**
	 * Called by ItemBlocks after a block is set in the world, to allow post-place logic
	 */
	public void onBlockPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
		worldIn.setBlockState(pos.up(), this.getDefaultState().with(THIRD, TripleBlockThirds.MIDDLE), 3);
		worldIn.setBlockState(pos.up(2), this.getDefaultState().with(THIRD, TripleBlockThirds.UPPER), 3);
	}
	
	public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
		if (state.get(THIRD) == TripleBlockThirds.LOWER) {
			return super.isValidPosition(state, worldIn, pos);
		} else {
			BlockState blockstate = worldIn.getBlockState(pos.down());
			if (state.getBlock() != this) return super.isValidPosition(state, worldIn, pos); //Forge: This function is called during world gen and placement, before this block is set, so if we are not 'here' then assume it's the pre-check.
			return blockstate.isIn(this) && blockstate.get(THIRD) == TripleBlockThirds.LOWER;
		}
	}
	
	public void placeAt(IWorld worldIn, BlockPos pos, int flags) {
		worldIn.setBlockState(pos, this.getDefaultState().with(THIRD, TripleBlockThirds.LOWER), flags);
		worldIn.setBlockState(pos.up(), this.getDefaultState().with(THIRD, TripleBlockThirds.MIDDLE), flags);
		worldIn.setBlockState(pos.up(2), this.getDefaultState().with(THIRD, TripleBlockThirds.UPPER), flags);
	}
	
	/**
	 * Called before the Block is set to air in the world. Called regardless of if the player's tool can actually collect
	 * this block
	 */
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
		if (!worldIn.isRemote) {
			if (player.isCreative()) {
				func_241471_b_(worldIn, pos, state, player);
			} else {
				spawnDrops(state, worldIn, pos, (TileEntity)null, player, player.getHeldItemMainhand());
			}
		}
		super.onBlockHarvested(worldIn, pos, state, player);
	}
	
	/**
	 * Spawns the block's drops in the world. By the time this is called the Block has possibly been set to air via
	 * Block.removedByPlayer
	 */
	public void harvestBlock(World worldIn, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity te, ItemStack stack) {
		super.harvestBlock(worldIn, player, pos, Blocks.AIR.getDefaultState(), te, stack);
	}
	
	// drop position????
	protected static void func_241471_b_(World world, BlockPos blockPos, BlockState blockState, PlayerEntity playerEntity) {
		TripleBlockThirds tripleblockthirds = blockState.get(THIRD);
		if (tripleblockthirds == TripleBlockThirds.UPPER || tripleblockthirds == TripleBlockThirds.MIDDLE) {
			BlockPos blockpos = blockPos.down();
			BlockState blockstate = world.getBlockState(blockpos);
			if (blockstate.getBlock() == blockState.getBlock() && blockstate.get(THIRD) == TripleBlockThirds.LOWER) {
				world.setBlockState(blockpos, Blocks.AIR.getDefaultState(), 35);
				world.playEvent(playerEntity, 2001, blockpos, Block.getStateId(blockstate));
			}
		}
	}
	
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		builder.add(THIRD);
	}
	
	/**
	 * Get the OffsetType for this Block. Determines if the model is rendered slightly offset.
	 */
	public AbstractBlock.OffsetType getOffsetType() {
		return AbstractBlock.OffsetType.XZ;
	}
	
	/**
	 * Return a random long to be passed to {@link IBakedModel#getQuads}, used for random model rotations
	 */
	@OnlyIn(Dist.CLIENT)
	public long getPositionRandom(BlockState state, BlockPos pos) {
		return MathHelper.getCoordinateRandom(pos.getX(), pos.down(state.get(THIRD) == TripleBlockThirds.LOWER ? 0 : 1).getY(), pos.getZ());
	}
}