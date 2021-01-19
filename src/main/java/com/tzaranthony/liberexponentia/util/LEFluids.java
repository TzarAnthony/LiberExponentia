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
    public static final PotionFluid AWKWARD = new PotionFluid.Source("awkward", Potions.AWKWARD, LEBlocks.AWKWARD, LEItems.AWKWARD_BUCKET);
    public static final PotionFluid FLOWING_AWKWARD = new PotionFluid.Flowing("flowing_awkward", Potions.AWKWARD, LEBlocks.AWKWARD, LEItems.AWKWARD_BUCKET);
    public static final PotionFluid FIRE_RESISTANCE = new PotionFluid.Source("fire_resistance", Potions.FIRE_RESISTANCE, LEBlocks.FIRE_RESISTANCE, LEItems.FIRE_RESISTANCE_BUCKET);
    public static final PotionFluid FLOWING_FIRE_RESISTANCE = new PotionFluid.Flowing("flowing_fire_resistance", Potions.FIRE_RESISTANCE, LEBlocks.FIRE_RESISTANCE, LEItems.FIRE_RESISTANCE_BUCKET);
    public static final PotionFluid HARMING = new PotionFluid.Source("harming", Potions.HARMING, LEBlocks.HARMING, LEItems.HARMING_BUCKET);
    public static final PotionFluid FLOWING_HARMING = new PotionFluid.Flowing("flowing_harming", Potions.HARMING, LEBlocks.HARMING, LEItems.HARMING_BUCKET);
    public static final PotionFluid HEALING = new PotionFluid.Source("healing", Potions.HEALING, LEBlocks.HEALING, LEItems.HEALING_BUCKET);
    public static final PotionFluid FLOWING_HEALING = new PotionFluid.Flowing("flowing_healing", Potions.HEALING, LEBlocks.HEALING, LEItems.HEALING_BUCKET);
    public static final PotionFluid INVISIBILITY = new PotionFluid.Source("invisibility", Potions.INVISIBILITY, LEBlocks.INVISIBILITY, LEItems.INVISIBILITY_BUCKET);
    public static final PotionFluid FLOWING_INVISIBILITY = new PotionFluid.Flowing("flowing_invisibility", Potions.INVISIBILITY, LEBlocks.INVISIBILITY, LEItems.INVISIBILITY_BUCKET);
    public static final PotionFluid LEAPING = new PotionFluid.Source("leaping", Potions.LEAPING, LEBlocks.LEAPING, LEItems.LEAPING_BUCKET);
    public static final PotionFluid FLOWING_LEAPING = new PotionFluid.Flowing("flowing_leaping", Potions.LEAPING, LEBlocks.LEAPING, LEItems.LEAPING_BUCKET);
    public static final PotionFluid LONG_FIRE_RESISTANCE = new PotionFluid.Source("long_fire_resistance", Potions.LONG_FIRE_RESISTANCE, LEBlocks.LONG_FIRE_RESISTANCE, LEItems.LONG_FIRE_RESISTANCE_BUCKET);
    public static final PotionFluid FLOWING_LONG_FIRE_RESISTANCE = new PotionFluid.Flowing("flowing_long_fire_resistance", Potions.LONG_FIRE_RESISTANCE, LEBlocks.LONG_FIRE_RESISTANCE, LEItems.LONG_FIRE_RESISTANCE_BUCKET);
    public static final PotionFluid LONG_INVISIBILITY = new PotionFluid.Source("long_invisibility", Potions.LONG_INVISIBILITY, LEBlocks.LONG_INVISIBILITY, LEItems.LONG_INVISIBILITY_BUCKET);
    public static final PotionFluid FLOWING_LONG_INVISIBILITY = new PotionFluid.Flowing("flowing_long_invisibility", Potions.LONG_INVISIBILITY, LEBlocks.LONG_INVISIBILITY, LEItems.LONG_INVISIBILITY_BUCKET);
    public static final PotionFluid LONG_LEAPING = new PotionFluid.Source("long_leaping", Potions.LONG_LEAPING, LEBlocks.LONG_LEAPING, LEItems.LONG_LEAPING_BUCKET);
    public static final PotionFluid FLOWING_LONG_LEAPING = new PotionFluid.Flowing("flowing_long_leaping", Potions.LONG_LEAPING, LEBlocks.LONG_LEAPING, LEItems.LONG_LEAPING_BUCKET);
    public static final PotionFluid LONG_NIGHT_VISION = new PotionFluid.Source("long_night_vision", Potions.LONG_NIGHT_VISION, LEBlocks.LONG_NIGHT_VISION, LEItems.LONG_NIGHT_VISION_BUCKET);
    public static final PotionFluid FLOWING_LONG_NIGHT_VISION = new PotionFluid.Flowing("flowing_long_night_vision", Potions.LONG_NIGHT_VISION, LEBlocks.LONG_NIGHT_VISION, LEItems.LONG_NIGHT_VISION_BUCKET);
    public static final PotionFluid LONG_POISON = new PotionFluid.Source("long_poison", Potions.LONG_POISON, LEBlocks.LONG_POISON, LEItems.LONG_POISON_BUCKET);
    public static final PotionFluid FLOWING_LONG_POISON = new PotionFluid.Flowing("flowing_long_poison", Potions.LONG_POISON, LEBlocks.LONG_POISON, LEItems.LONG_POISON_BUCKET);
    public static final PotionFluid LONG_REGENERATION = new PotionFluid.Source("long_regeneration", Potions.LONG_REGENERATION, LEBlocks.LONG_REGENERATION, LEItems.LONG_REGENERATION_BUCKET);
    public static final PotionFluid FLOWING_LONG_REGENERATION = new PotionFluid.Flowing("flowing_long_regeneration", Potions.LONG_REGENERATION, LEBlocks.LONG_REGENERATION, LEItems.LONG_REGENERATION_BUCKET);
    public static final PotionFluid LONG_SLOW_FALLING = new PotionFluid.Source("long_slow_falling", Potions.LONG_SLOW_FALLING, LEBlocks.LONG_SLOW_FALLING, LEItems.LONG_SLOW_FALLING_BUCKET);
    public static final PotionFluid FLOWING_LONG_SLOW_FALLING = new PotionFluid.Flowing("flowing_long_slow_falling", Potions.LONG_SLOW_FALLING, LEBlocks.LONG_SLOW_FALLING, LEItems.LONG_SLOW_FALLING_BUCKET);
    public static final PotionFluid LONG_SLOWNESS = new PotionFluid.Source("long_slowness", Potions.LONG_SLOWNESS, LEBlocks.LONG_SLOWNESS, LEItems.LONG_SLOWNESS_BUCKET);
    public static final PotionFluid FLOWING_LONG_SLOWNESS = new PotionFluid.Flowing("flowing_long_slowness", Potions.LONG_SLOWNESS, LEBlocks.LONG_SLOWNESS, LEItems.LONG_SLOWNESS_BUCKET);
    public static final PotionFluid LONG_STRENGTH = new PotionFluid.Source("long_strength", Potions.LONG_STRENGTH, LEBlocks.LONG_STRENGTH, LEItems.LONG_STRENGTH_BUCKET);
    public static final PotionFluid FLOWING_LONG_STRENGTH = new PotionFluid.Flowing("flowing_long_strength", Potions.LONG_STRENGTH, LEBlocks.LONG_STRENGTH, LEItems.LONG_STRENGTH_BUCKET);
    public static final PotionFluid LONG_SWIFTNESS = new PotionFluid.Source("long_swiftness", Potions.LONG_SWIFTNESS, LEBlocks.LONG_SWIFTNESS, LEItems.LONG_SWIFTNESS_BUCKET);
    public static final PotionFluid FLOWING_LONG_SWIFTNESS = new PotionFluid.Flowing("flowing_long_swiftness", Potions.LONG_SWIFTNESS, LEBlocks.LONG_SWIFTNESS, LEItems.LONG_SWIFTNESS_BUCKET);
    public static final PotionFluid LONG_TURTLE_MASTER = new PotionFluid.Source("long_turtle_master", Potions.LONG_TURTLE_MASTER, LEBlocks.LONG_TURTLE_MASTER, LEItems.LONG_TURTLE_MASTER_BUCKET);
    public static final PotionFluid FLOWING_LONG_TURTLE_MASTER = new PotionFluid.Flowing("flowing_long_turtle_master", Potions.LONG_TURTLE_MASTER, LEBlocks.LONG_TURTLE_MASTER, LEItems.LONG_TURTLE_MASTER_BUCKET);
    public static final PotionFluid LONG_WATER_BREATHING = new PotionFluid.Source("long_water_breathing", Potions.LONG_WATER_BREATHING, LEBlocks.LONG_WATER_BREATHING, LEItems.LONG_WATER_BREATHING_BUCKET);
    public static final PotionFluid FLOWING_LONG_WATER_BREATHING = new PotionFluid.Flowing("flowing_long_water_breathing", Potions.LONG_WATER_BREATHING, LEBlocks.LONG_WATER_BREATHING, LEItems.LONG_WATER_BREATHING_BUCKET);
    public static final PotionFluid LONG_WEAKNESS = new PotionFluid.Source("long_weakness", Potions.LONG_WEAKNESS, LEBlocks.LONG_WEAKNESS, LEItems.LONG_WEAKNESS_BUCKET);
    public static final PotionFluid FLOWING_LONG_WEAKNESS = new PotionFluid.Flowing("flowing_long_weakness", Potions.LONG_WEAKNESS, LEBlocks.LONG_WEAKNESS, LEItems.LONG_WEAKNESS_BUCKET);
    public static final PotionFluid LUCK = new PotionFluid.Source("luck", Potions.LUCK, LEBlocks.LUCK, LEItems.LUCK_BUCKET);
    public static final PotionFluid FLOWING_LUCK = new PotionFluid.Flowing("flowing_luck", Potions.LUCK, LEBlocks.LUCK, LEItems.LUCK_BUCKET);
    public static final PotionFluid MUNDANE = new PotionFluid.Source("mundane", Potions.MUNDANE, LEBlocks.MUNDANE, LEItems.MUNDANE_BUCKET);
    public static final PotionFluid FLOWING_MUNDANE = new PotionFluid.Flowing("flowing_mundane", Potions.MUNDANE, LEBlocks.MUNDANE, LEItems.MUNDANE_BUCKET);
    public static final PotionFluid NIGHT_VISION = new PotionFluid.Source("night_vision", Potions.NIGHT_VISION, LEBlocks.NIGHT_VISION, LEItems.NIGHT_VISION_BUCKET);
    public static final PotionFluid FLOWING_NIGHT_VISION = new PotionFluid.Flowing("flowing_night_vision", Potions.NIGHT_VISION, LEBlocks.NIGHT_VISION, LEItems.NIGHT_VISION_BUCKET);
    public static final PotionFluid POISON = new PotionFluid.Source("poison", Potions.POISON, LEBlocks.POISON, LEItems.POISON_BUCKET);
    public static final PotionFluid FLOWING_POISON = new PotionFluid.Flowing("flowing_poison", Potions.POISON, LEBlocks.POISON, LEItems.POISON_BUCKET);
    public static final PotionFluid REGENERATION = new PotionFluid.Source("regeneration", Potions.REGENERATION, LEBlocks.REGENERATION, LEItems.REGENERATION_BUCKET);
    public static final PotionFluid FLOWING_REGENERATION = new PotionFluid.Flowing("flowing_regeneration", Potions.REGENERATION, LEBlocks.REGENERATION, LEItems.REGENERATION_BUCKET);
    public static final PotionFluid SLOW_FALLING = new PotionFluid.Source("slow_falling", Potions.SLOW_FALLING, LEBlocks.SLOW_FALLING, LEItems.SLOW_FALLING_BUCKET);
    public static final PotionFluid FLOWING_SLOW_FALLING = new PotionFluid.Flowing("flowing_slow_falling", Potions.SLOW_FALLING, LEBlocks.SLOW_FALLING, LEItems.SLOW_FALLING_BUCKET);
    public static final PotionFluid SLOWNESS = new PotionFluid.Source("slowness", Potions.SLOWNESS, LEBlocks.SLOWNESS, LEItems.SLOWNESS_BUCKET);
    public static final PotionFluid FLOWING_SLOWNESS = new PotionFluid.Flowing("flowing_slowness", Potions.SLOWNESS, LEBlocks.SLOWNESS, LEItems.SLOWNESS_BUCKET);
    public static final PotionFluid STRENGTH = new PotionFluid.Source("strength", Potions.STRENGTH, LEBlocks.STRENGTH, LEItems.STRENGTH_BUCKET);
    public static final PotionFluid FLOWING_STRENGTH = new PotionFluid.Flowing("flowing_strength", Potions.STRENGTH, LEBlocks.STRENGTH, LEItems.STRENGTH_BUCKET);
    public static final PotionFluid STRONG_HARMING = new PotionFluid.Source("strong_harming", Potions.STRONG_HARMING, LEBlocks.STRONG_HARMING, LEItems.STRONG_HARMING_BUCKET);
    public static final PotionFluid FLOWING_STRONG_HARMING = new PotionFluid.Flowing("flowing_strong_harming", Potions.STRONG_HARMING, LEBlocks.STRONG_HARMING, LEItems.STRONG_HARMING_BUCKET);
    public static final PotionFluid STRONG_HEALING = new PotionFluid.Source("strong_healing", Potions.STRONG_HEALING, LEBlocks.STRONG_HEALING, LEItems.STRONG_HEALING_BUCKET);
    public static final PotionFluid FLOWING_STRONG_HEALING = new PotionFluid.Flowing("flowing_strong_healing", Potions.STRONG_HEALING, LEBlocks.STRONG_HEALING, LEItems.STRONG_HEALING_BUCKET);
    public static final PotionFluid STRONG_LEAPING = new PotionFluid.Source("strong_leaping", Potions.STRONG_LEAPING, LEBlocks.STRONG_LEAPING, LEItems.STRONG_LEAPING_BUCKET);
    public static final PotionFluid FLOWING_STRONG_LEAPING = new PotionFluid.Flowing("flowing_strong_leaping", Potions.STRONG_LEAPING, LEBlocks.STRONG_LEAPING, LEItems.STRONG_LEAPING_BUCKET);
    public static final PotionFluid STRONG_POISON = new PotionFluid.Source("strong_poison", Potions.STRONG_POISON, LEBlocks.STRONG_POISON, LEItems.STRONG_POISON_BUCKET);
    public static final PotionFluid FLOWING_STRONG_POISON = new PotionFluid.Flowing("flowing_strong_poison", Potions.STRONG_POISON, LEBlocks.STRONG_POISON, LEItems.STRONG_POISON_BUCKET);
    public static final PotionFluid STRONG_REGENERATION = new PotionFluid.Source("strong_regeneration", Potions.STRONG_REGENERATION, LEBlocks.STRONG_REGENERATION, LEItems.STRONG_REGENERATION_BUCKET);
    public static final PotionFluid FLOWING_STRONG_REGENERATION = new PotionFluid.Flowing("flowing_strong_regeneration", Potions.STRONG_REGENERATION, LEBlocks.STRONG_REGENERATION, LEItems.STRONG_REGENERATION_BUCKET);
    public static final PotionFluid STRONG_SLOWNESS = new PotionFluid.Source("strong_slowness", Potions.STRONG_SLOWNESS, LEBlocks.STRONG_SLOWNESS, LEItems.STRONG_SLOWNESS_BUCKET);
    public static final PotionFluid FLOWING_STRONG_SLOWNESS = new PotionFluid.Flowing("flowing_strong_slowness", Potions.STRONG_SLOWNESS, LEBlocks.STRONG_SLOWNESS, LEItems.STRONG_SLOWNESS_BUCKET);
    public static final PotionFluid STRONG_STRENGTH = new PotionFluid.Source("strong_strength", Potions.STRONG_STRENGTH, LEBlocks.STRONG_STRENGTH, LEItems.STRONG_STRENGTH_BUCKET);
    public static final PotionFluid FLOWING_STRONG_STRENGTH = new PotionFluid.Flowing("flowing_strong_strength", Potions.STRONG_STRENGTH, LEBlocks.STRONG_STRENGTH, LEItems.STRONG_STRENGTH_BUCKET);
    public static final PotionFluid STRONG_SWIFTNESS = new PotionFluid.Source("strong_swiftness", Potions.STRONG_SWIFTNESS, LEBlocks.STRONG_SWIFTNESS, LEItems.STRONG_SWIFTNESS_BUCKET);
    public static final PotionFluid FLOWING_STRONG_SWIFTNESS = new PotionFluid.Flowing("flowing_strong_swiftness", Potions.STRONG_SWIFTNESS, LEBlocks.STRONG_SWIFTNESS, LEItems.STRONG_SWIFTNESS_BUCKET);
    public static final PotionFluid STRONG_TURTLE_MASTER = new PotionFluid.Source("strong_turtle_master", Potions.STRONG_TURTLE_MASTER, LEBlocks.STRONG_TURTLE_MASTER, LEItems.STRONG_TURTLE_MASTER_BUCKET);
    public static final PotionFluid FLOWING_STRONG_TURTLE_MASTER = new PotionFluid.Flowing("flowing_strong_turtle_master", Potions.STRONG_TURTLE_MASTER, LEBlocks.STRONG_TURTLE_MASTER, LEItems.STRONG_TURTLE_MASTER_BUCKET);
    public static final PotionFluid SWIFTNESS = new PotionFluid.Source("swiftness", Potions.SWIFTNESS, LEBlocks.SWIFTNESS, LEItems.SWIFTNESS_BUCKET);
    public static final PotionFluid FLOWING_SWIFTNESS = new PotionFluid.Flowing("flowing_swiftness", Potions.SWIFTNESS, LEBlocks.SWIFTNESS, LEItems.SWIFTNESS_BUCKET);
    public static final PotionFluid THICK = new PotionFluid.Source("thick", Potions.THICK, LEBlocks.THICK, LEItems.THICK_BUCKET);
    public static final PotionFluid FLOWING_THICK = new PotionFluid.Flowing("flowing_thick", Potions.THICK, LEBlocks.THICK, LEItems.THICK_BUCKET);
    public static final PotionFluid TURTLE_MASTER = new PotionFluid.Source("turtle_master", Potions.TURTLE_MASTER, LEBlocks.TURTLE_MASTER, LEItems.TURTLE_MASTER_BUCKET);
    public static final PotionFluid FLOWING_TURTLE_MASTER = new PotionFluid.Flowing("flowing_turtle_master", Potions.TURTLE_MASTER, LEBlocks.TURTLE_MASTER, LEItems.TURTLE_MASTER_BUCKET);
    public static final PotionFluid WATER_BREATHING = new PotionFluid.Source("water_breathing", Potions.WATER_BREATHING, LEBlocks.WATER_BREATHING, LEItems.WATER_BREATHING_BUCKET);
    public static final PotionFluid FLOWING_WATER_BREATHING = new PotionFluid.Flowing("flowing_water_breathing", Potions.WATER_BREATHING, LEBlocks.WATER_BREATHING, LEItems.WATER_BREATHING_BUCKET);
    public static final PotionFluid WEAKNESS = new PotionFluid.Source("weakness", Potions.WEAKNESS, LEBlocks.WEAKNESS, LEItems.WEAKNESS_BUCKET);
    public static final PotionFluid FLOWING_WEAKNESS = new PotionFluid.Flowing("flowing_weakness", Potions.WEAKNESS, LEBlocks.WEAKNESS, LEItems.WEAKNESS_BUCKET);


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
