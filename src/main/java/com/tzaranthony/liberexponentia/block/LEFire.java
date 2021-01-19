package com.tzaranthony.liberexponentia.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class LEFire extends AbstractFireBlock {
    public LEFire(String name, MaterialColor color, int light) {
        super(AbstractBlock.Properties.create(Material.FIRE, color)
                .doesNotBlockMovement()
                .zeroHardnessAndResistance()
                .func_235838_a_((p_235468_0_) -> {
                    return light;
                })
                .sound(SoundType.CLOTH), 2.0f);
        this.setRegistryName(name);
    }

    //    public BlockState getStateForPlacement(BlockItemUseContext context) {
//        return func_235326_a_(context.getWorld(), context.getPos());
//    }
//
//    public static BlockState func_235326_a_(IBlockReader reader, BlockPos pos) {
//        BlockPos blockpos = pos.down();
//        BlockState blockstate = reader.getBlockState(blockpos);
//        return LEBlocks.INFUSED_END_STONE = blockstate.getBlock() ? LEBlocks.END_FIRE.getDefaultState() : AbstractFireBlock.get;
//    }
//
//    /**
//     * Update the provided state given the provided neighbor facing and neighbor state, returning a new state.
//     * For example, fences make their connections to the passed in state if possible, and wet concrete powder immediately
//     * returns its solidified counterpart.
//     * Note that this method should ideally consider only the specific face passed in.
//     */
//    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
//        return this.isValidPosition(stateIn, worldIn, currentPos) ? this.getDefaultState() : Blocks.AIR.getDefaultState();
//    }
//
//    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos) {
//        return func_235577_c_(worldIn.getBlockState(pos.down()).getBlock());
//    }
//
//    public static boolean func_235577_c_(Block p_235577_0_) {
//        return p_235577_0_.isIn(BlockTags.field_232880_av_);
//    }
//
    protected boolean canBurn(BlockState state) {
        return true;
    }
}
