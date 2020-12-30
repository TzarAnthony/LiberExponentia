package com.tzaranthony.liberexponentia.util;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.fluid.PotionFluid;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.potion.Potions;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.Field;

@Mod.EventBusSubscriber(modid = LiberExponentia.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class LEFluids {
    public static final PotionFluid MUNDANE = new PotionFluid("mundane", Potions.MUNDANE, LEBlocks.MUNDANE);
    public static final PotionFluid THICK = new PotionFluid("thick", Potions.THICK, LEBlocks.THICK);
    public static final PotionFluid AWKWARD = new PotionFluid("awkward", Potions.AWKWARD, LEBlocks.AWKWARD);
    public static final PotionFluid NIGHT_VISION = new PotionFluid("night_vision", Potions.NIGHT_VISION, LEBlocks.NIGHT_VISION);
    public static final PotionFluid LONG_NIGHT_VISION = new PotionFluid("long_night_vision", Potions.LONG_NIGHT_VISION, LEBlocks.LONG_NIGHT_VISION);
    public static final PotionFluid INVISIBILITY = new PotionFluid("invisibility", Potions.INVISIBILITY, LEBlocks.INVISIBILITY);
    public static final PotionFluid LONG_INVISIBILITY = new PotionFluid("long_invisibility", Potions.LONG_INVISIBILITY, LEBlocks.LONG_INVISIBILITY);
    public static final PotionFluid LEAPING = new PotionFluid("leaping", Potions.LEAPING, LEBlocks.LEAPING);
    public static final PotionFluid LONG_LEAPING = new PotionFluid("long_leaping", Potions.LONG_LEAPING, LEBlocks.LONG_LEAPING);
    public static final PotionFluid STRONG_LEAPING = new PotionFluid("strong_leaping", Potions.STRONG_LEAPING, LEBlocks.STRONG_LEAPING);
    public static final PotionFluid FIRE_RESISTANCE = new PotionFluid("fire_resistance", Potions.FIRE_RESISTANCE, LEBlocks.FIRE_RESISTANCE);
    public static final PotionFluid LONG_FIRE_RESISTANCE = new PotionFluid("long_fire_resistance", Potions.LONG_FIRE_RESISTANCE, LEBlocks.LONG_FIRE_RESISTANCE);
    public static final PotionFluid SWIFTNESS = new PotionFluid("swiftness_potion", Potions.SWIFTNESS, LEBlocks.SWIFTNESS).registerSourceFlowingFluids();
    public static final PotionFluid LONG_SWIFTNESS = new PotionFluid("long_swiftness_potion", Potions.LONG_SWIFTNESS, LEBlocks.LONG_SWIFTNESS).registerSourceFlowingFluids();
    public static final PotionFluid STRONG_SWIFTNESS = new PotionFluid("strong_swiftness", Potions.STRONG_SWIFTNESS, LEBlocks.STRONG_SWIFTNESS);
    public static final PotionFluid SLOWNESS = new PotionFluid("slowness", Potions.SLOWNESS, LEBlocks.SLOWNESS);
    public static final PotionFluid LONG_SLOWNESS = new PotionFluid("long_slowness", Potions.LONG_SLOWNESS, LEBlocks.LONG_SLOWNESS);
    public static final PotionFluid STRONG_SLOWNESS = new PotionFluid("strong_slowness", Potions.STRONG_SLOWNESS, LEBlocks.STRONG_SLOWNESS);
    public static final PotionFluid TURTLE_MASTER = new PotionFluid("turtle_master", Potions.TURTLE_MASTER, LEBlocks.TURTLE_MASTER);
    public static final PotionFluid LONG_TURTLE_MASTER = new PotionFluid("long_turtle_master", Potions.LONG_TURTLE_MASTER, LEBlocks.LONG_TURTLE_MASTER);
    public static final PotionFluid STRONG_TURTLE_MASTER = new PotionFluid("strong_turtle_master", Potions.STRONG_TURTLE_MASTER, LEBlocks.STRONG_TURTLE_MASTER);
    public static final PotionFluid WATER_BREATHING = new PotionFluid("water_breathing", Potions.WATER_BREATHING, LEBlocks.WATER_BREATHING);
    public static final PotionFluid LONG_WATER_BREATHING = new PotionFluid("long_water_breathing", Potions.LONG_WATER_BREATHING, LEBlocks.LONG_WATER_BREATHING);
    public static final PotionFluid HEALING = new PotionFluid("healing", Potions.HEALING, LEBlocks.HEALING);
    public static final PotionFluid STRONG_HEALING = new PotionFluid("strong_healing", Potions.STRONG_HEALING, LEBlocks.STRONG_HEALING);
    public static final PotionFluid HARMING = new PotionFluid("harming", Potions.HARMING, LEBlocks.HARMING);
    public static final PotionFluid STRONG_HARMING = new PotionFluid("strong_harming", Potions.STRONG_HARMING, LEBlocks.STRONG_HARMING);
    public static final PotionFluid POISON = new PotionFluid("poison", Potions.POISON, LEBlocks.POISON);
    public static final PotionFluid LONG_POISON = new PotionFluid("long_poison", Potions.LONG_POISON, LEBlocks.LONG_POISON);
    public static final PotionFluid STRONG_POISON = new PotionFluid("strong_poison", Potions.STRONG_POISON, LEBlocks.STRONG_POISON);
    public static final PotionFluid REGENERATION = new PotionFluid("regeneration", Potions.REGENERATION, LEBlocks.REGENERATION);
    public static final PotionFluid LONG_REGENERATION = new PotionFluid("long_regeneration", Potions.LONG_REGENERATION, LEBlocks.LONG_REGENERATION);
    public static final PotionFluid STRONG_REGENERATION = new PotionFluid("strong_regeneration", Potions.STRONG_REGENERATION, LEBlocks.STRONG_REGENERATION);
    public static final PotionFluid STRENGTH = new PotionFluid("strength", Potions.STRENGTH, LEBlocks.STRENGTH);
    public static final PotionFluid LONG_STRENGTH = new PotionFluid("long_strength", Potions.LONG_STRENGTH, LEBlocks.LONG_STRENGTH);
    public static final PotionFluid STRONG_STRENGTH = new PotionFluid("strong_strength", Potions.STRONG_STRENGTH, LEBlocks.STRONG_STRENGTH);
    public static final PotionFluid WEAKNESS = new PotionFluid("weakness", Potions.WEAKNESS, LEBlocks.WEAKNESS);
    public static final PotionFluid LONG_WEAKNESS = new PotionFluid("long_weakness", Potions.LONG_WEAKNESS, LEBlocks.LONG_WEAKNESS);
    public static final PotionFluid LUCK = new PotionFluid("luck", Potions.LUCK, LEBlocks.LUCK);
    public static final PotionFluid SLOW_FALLING = new PotionFluid("slow_falling", Potions.SLOW_FALLING, LEBlocks.SLOW_FALLING);
    public static final PotionFluid LONG_SLOW_FALLING = new PotionFluid("long_slow_falling", Potions.LONG_SLOW_FALLING, LEBlocks.LONG_SLOW_FALLING);


    @SubscribeEvent
    public static void registerFluids(RegistryEvent.Register<Fluid> regFluids) {
        for (Field f : LEFluids.class.getDeclaredFields()) {
            try {
                Object obj = f.get(null);
                if (obj instanceof FlowingFluid) {
                    regFluids.getRegistry().register(((FlowingFluid) obj).getStillFluid());
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
