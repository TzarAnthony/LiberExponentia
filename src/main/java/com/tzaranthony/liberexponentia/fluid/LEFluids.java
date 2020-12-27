package com.tzaranthony.liberexponentia.fluid;

import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.registry.Registry;

public class LEFluids {
    public static final FlowingFluid FLOWING_POTION = register("flowing_potion", new PotionFluid.Flowing());
    public static final FlowingFluid POTION = register("potion", new PotionFluid.Source());

    private static <T extends Fluid> T register(String key, T p_215710_1_) {
        return Registry.register(Registry.FLUID, key, p_215710_1_);
    }

    static {
        for(Fluid fluid : Registry.FLUID) {
            for(FluidState fluidstate : fluid.getStateContainer().getValidStates()) {
                Fluid.STATE_REGISTRY.add(fluidstate);
            }
        }
    }
}
