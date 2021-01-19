package com.tzaranthony.liberexponentia.util;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(modid = LiberExponentia.MOD_ID, bus = Bus.MOD)
public class LEBlocks {
    // ores
    public static final Block SILVER_ORE = new LERockBlock("silver_ore", 3.0F, 5.0F);
    public static final Block CINNABAR_ORE_BLOCK = new CinnabarOre("cinnabar_ore");

    // storage blocks
    public static final Block SILVER_BLOCK = new MetalBlock("silver_block", 2, 3.0F, 6.0F);
    public static final Block COLD_IRON_BLOCK = new MetalBlock("cold_iron_block", 2, 5.0F, 8.0F);
    public static final Block HIHIROKANE_BLOCK = new HihirokaneBlock("hihirokane_block", 12);
    public static final Block ANCEPS_LUX_BLOCK = new MetalBlock("anceps_lux_block", 4, 30.0F, 1200.0F);
    public static final Block ORICHALCUM_BLOCK = new MetalBlock("orichalcum_block", 4, 30.0F, 30.0F);
    public static final Block CURSED_SILVER_BLOCK = new MetalBlock("cursed_silver_block", 4, 30.0F, 30.0F);
    public static final Block VOID_BLOCK = new MetalBlock("void_block", 4, 30.0F, 30.0F);
    public static final Block FORGED_STEEL_BLOCK = new MetalBlock("forged_steel_block", 4, 30.0F, 30.0F);
    public static final Block CELESTIAL_STEEL_BLOCK = new MetalBlock("celestial_steel_block", 6, 60.0F, 3000.0F);

    // petrified wood
    public static final Block ROUGH_PETRIFIED_LOG = new PetrifiedWood("rough_petrified_log");
    public static final Block PETRIFIED_LOG = new PetrifiedWood("petrified_log");
    public static final Block ASHEN_ROUGH_PETRIFIED_LOG = new PetrifiedWood("ashen_rough_petrified_log");
    public static final Block ASHEN_PETRIFIED_LOG = new PetrifiedWood("ashen_petrified_log");

    // ash
    public static final Block VOLCANIC_ASH = new VolcanicAsh("volcanic_ash", 16006560);
    public static final Block BLACK_VOLCANIC_ASH = new VolcanicAsh("black_volcanic_ash", 10006560);

    // end fire stuff
    public static final Block END_CAMPFIRE = new LECampfire("end_campfire", 20);
    public static final Block END_LANTERN = new LELantern("end_lantern", 20);
    public static final Block END_TORCH = new LETorch("end_torch", 20);
    //public static final Block END_WALL_TORCH = new LEWallTorch("end_wall_torch", 20, END_TORCH);
    public static final Block END_FIRE = new LEFire("end_fire", MaterialColor.EMERALD, 20);

    // plants
//    public static final Block CORDGRASS = new Cordgrass("cordgrass");
    public static final Block LYCIUM_NYMPHA = new WaterBerries("lycium_nympha");

    // misc
    public static final Block INFUSED_END_STONE = new LERockBlock("infused_end_stone", 5.0F, 8.0F);
    public static final Block MUD = new MetalBlock("mud", 1, 1.0F, 1.0F); // not final, needs to change

    // gold
    public static final Block EMBOSSED_GOLD_BLOCK = new MetalBlock("embossed_gold_block", 2, 3.0F, 6.0F);
    public static final Block ETCHED_GOLD_BLOCK = new MetalBlock("etched_gold_block", 2, 3.0F, 6.0F);
    public static final Block GOLD_BRICKS = new MetalBlock("gold_bricks", 2, 3.0F, 6.0F);
    public static final Block GOLD_TILES = new MetalBlock("gold_tiles", 2, 3.0F, 6.0F);
    public static final Block LARGE_GOLD_BRICKS = new MetalBlock("large_gold_bricks", 2, 3.0F, 6.0F);
    // stairs
    public static final Block GOLD_BRICKS_STAIRS = new LEAbsStairs("gold_bricks_stairs", GOLD_BRICKS.getDefaultState(), GOLD_BRICKS);
    public static final Block GOLD_TILES_STAIRS = new LEAbsStairs("gold_tiles_stairs", GOLD_TILES.getDefaultState(), GOLD_TILES);
    public static final Block LARGE_GOLD_BRICKS_STAIRS = new LEAbsStairs("large_gold_bricks_stairs", LARGE_GOLD_BRICKS.getDefaultState(), LARGE_GOLD_BRICKS);
    // slabs
    public static final Block GOLD_BRICKS_SLAB = new LESlab("gold_bricks_slab", Material.IRON, 3.0F, 6.0F);
    public static final Block GOLD_TILES_SLAB = new LESlab("gold_tiles_slab", Material.IRON, 3.0F, 6.0F);
    public static final Block LARGE_GOLD_BRICKS_SLAB = new LESlab("large_gold_bricks_slab", Material.IRON, 3.0F, 6.0F);

    // mud bricks
    public static final Block MUD_BRICKS = new MudBricks("mud_bricks", MaterialColor.ADOBE);
    public static final Block WHITE_MUD_BRICKS = new MudBricks("white_mud_bricks", MaterialColor.WHITE_TERRACOTTA);
    public static final Block ORANGE_MUD_BRICKS = new MudBricks("orange_mud_bricks", MaterialColor.ORANGE_TERRACOTTA);
    public static final Block MAGENTA_MUD_BRICKS = new MudBricks("magenta_mud_bricks", MaterialColor.MAGENTA_TERRACOTTA);
    public static final Block LIGHT_BLUE_MUD_BRICKS = new MudBricks("light_blue_mud_bricks", MaterialColor.LIGHT_BLUE_TERRACOTTA);
    public static final Block YELLOW_MUD_BRICKS = new MudBricks("yellow_mud_bricks", MaterialColor.YELLOW_TERRACOTTA);
    public static final Block LIME_MUD_BRICKS = new MudBricks("lime_mud_bricks", MaterialColor.LIME_TERRACOTTA);
    public static final Block PINK_MUD_BRICKS = new MudBricks("pink_mud_bricks", MaterialColor.PINK_TERRACOTTA);
    public static final Block GRAY_MUD_BRICKS = new MudBricks("gray_mud_bricks", MaterialColor.GRAY_TERRACOTTA);
    public static final Block LIGHT_GRAY_MUD_BRICKS = new MudBricks("light_gray_mud_bricks", MaterialColor.LIGHT_GRAY_TERRACOTTA);
    public static final Block CYAN_MUD_BRICKS = new MudBricks("cyan_mud_bricks", MaterialColor.CYAN_TERRACOTTA);
    public static final Block PURPLE_MUD_BRICKS = new MudBricks("purple_mud_bricks", MaterialColor.PURPLE_TERRACOTTA);
    public static final Block BLUE_MUD_BRICKS = new MudBricks("blue_mud_bricks", MaterialColor.BLUE_TERRACOTTA);
    public static final Block BROWN_MUD_BRICKS = new MudBricks("brown_mud_bricks", MaterialColor.BROWN_TERRACOTTA);
    public static final Block GREEN_MUD_BRICKS = new MudBricks("green_mud_bricks", MaterialColor.GREEN_TERRACOTTA);
    public static final Block RED_MUD_BRICKS = new MudBricks("red_mud_bricks", MaterialColor.RED_TERRACOTTA);
    public static final Block BLACK_MUD_BRICKS = new MudBricks("black_mud_bricks", MaterialColor.BLACK_TERRACOTTA);
    // stairs
    public static final Block MUD_BRICKS_STAIRS = new LEAbsStairs("mud_bricks_stairs", MUD_BRICKS.getDefaultState(), MUD_BRICKS);
    public static final Block WHITE_MUD_BRICKS_STAIRS = new LEAbsStairs("white_mud_bricks_stairs", WHITE_MUD_BRICKS.getDefaultState(), WHITE_MUD_BRICKS);
    public static final Block ORANGE_MUD_BRICKS_STAIRS = new LEAbsStairs("orange_mud_bricks_stairs", ORANGE_MUD_BRICKS.getDefaultState(), ORANGE_MUD_BRICKS);
    public static final Block MAGENTA_MUD_BRICKS_STAIRS = new LEAbsStairs("magenta_mud_bricks_stairs", MAGENTA_MUD_BRICKS.getDefaultState(), MAGENTA_MUD_BRICKS);
    public static final Block LIGHT_BLUE_MUD_BRICKS_STAIRS = new LEAbsStairs("light_blue_mud_bricks_stairs", LIGHT_BLUE_MUD_BRICKS.getDefaultState(), LIGHT_BLUE_MUD_BRICKS);
    public static final Block YELLOW_MUD_BRICKS_STAIRS = new LEAbsStairs("yellow_mud_bricks_stairs", YELLOW_MUD_BRICKS.getDefaultState(), YELLOW_MUD_BRICKS);
    public static final Block LIME_MUD_BRICKS_STAIRS = new LEAbsStairs("lime_mud_bricks_stairs", LIME_MUD_BRICKS.getDefaultState(), LIME_MUD_BRICKS);
    public static final Block PINK_MUD_BRICKS_STAIRS = new LEAbsStairs("pink_mud_bricks_stairs", PINK_MUD_BRICKS.getDefaultState(), PINK_MUD_BRICKS);
    public static final Block GRAY_MUD_BRICKS_STAIRS = new LEAbsStairs("gray_mud_bricks_stairs", GRAY_MUD_BRICKS.getDefaultState(), GRAY_MUD_BRICKS);
    public static final Block LIGHT_GRAY_MUD_BRICKS_STAIRS = new LEAbsStairs("light_gray_mud_bricks_stairs", LIGHT_GRAY_MUD_BRICKS.getDefaultState(), LIGHT_GRAY_MUD_BRICKS);
    public static final Block CYAN_MUD_BRICKS_STAIRS = new LEAbsStairs("cyan_mud_bricks_stairs", CYAN_MUD_BRICKS.getDefaultState(), CYAN_MUD_BRICKS);
    public static final Block PURPLE_MUD_BRICKS_STAIRS = new LEAbsStairs("purple_mud_bricks_stairs", PURPLE_MUD_BRICKS.getDefaultState(), PURPLE_MUD_BRICKS);
    public static final Block BLUE_MUD_BRICKS_STAIRS = new LEAbsStairs("blue_mud_bricks_stairs", BLUE_MUD_BRICKS.getDefaultState(), BLUE_MUD_BRICKS);
    public static final Block BROWN_MUD_BRICKS_STAIRS = new LEAbsStairs("brown_mud_bricks_stairs", BROWN_MUD_BRICKS.getDefaultState(), BROWN_MUD_BRICKS);
    public static final Block GREEN_MUD_BRICKS_STAIRS = new LEAbsStairs("green_mud_bricks_stairs", GREEN_MUD_BRICKS.getDefaultState(), GREEN_MUD_BRICKS);
    public static final Block RED_MUD_BRICKS_STAIRS = new LEAbsStairs("red_mud_bricks_stairs", RED_MUD_BRICKS.getDefaultState(), RED_MUD_BRICKS);
    public static final Block BLACK_MUD_BRICKS_STAIRS = new LEAbsStairs("black_mud_bricks_stairs", BLACK_MUD_BRICKS.getDefaultState(), BLACK_MUD_BRICKS);
    // slabs
    public static final Block MUD_BRICKS_SLAB = new LEAbsSlabSound("mud_bricks_slab", Material.ROCK, MaterialColor.ADOBE, 1.25F, 4.2F);
    public static final Block WHITE_MUD_BRICKS_SLAB = new LEAbsSlabSound("white_mud_bricks_slab", Material.ROCK, MaterialColor.WHITE_TERRACOTTA, 1.25F, 4.2F);
    public static final Block ORANGE_MUD_BRICKS_SLAB = new LEAbsSlabSound("orange_mud_bricks_slab", Material.ROCK, MaterialColor.ORANGE_TERRACOTTA, 1.25F, 4.2F);
    public static final Block MAGENTA_MUD_BRICKS_SLAB = new LEAbsSlabSound("magenta_mud_bricks_slab", Material.ROCK, MaterialColor.MAGENTA_TERRACOTTA, 1.25F, 4.2F);
    public static final Block LIGHT_BLUE_MUD_BRICKS_SLAB = new LEAbsSlabSound("light_blue_mud_bricks_slab", Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA, 1.25F, 4.2F);
    public static final Block YELLOW_MUD_BRICKS_SLAB = new LEAbsSlabSound("yellow_mud_bricks_slab", Material.ROCK, MaterialColor.YELLOW_TERRACOTTA, 1.25F, 4.2F);
    public static final Block LIME_MUD_BRICKS_SLAB = new LEAbsSlabSound("lime_mud_bricks_slab", Material.ROCK, MaterialColor.LIME_TERRACOTTA, 1.25F, 4.2F);
    public static final Block PINK_MUD_BRICKS_SLAB = new LEAbsSlabSound("pink_mud_bricks_slab", Material.ROCK, MaterialColor.PINK_TERRACOTTA, 1.25F, 4.2F);
    public static final Block GRAY_MUD_BRICKS_SLAB = new LEAbsSlabSound("gray_mud_bricks_slab", Material.ROCK, MaterialColor.GRAY_TERRACOTTA, 1.25F, 4.2F);
    public static final Block LIGHT_GRAY_MUD_BRICKS_SLAB = new LEAbsSlabSound("light_gray_mud_bricks_slab", Material.ROCK, MaterialColor.LIGHT_GRAY_TERRACOTTA, 1.25F, 4.2F);
    public static final Block CYAN_MUD_BRICKS_SLAB = new LEAbsSlabSound("cyan_mud_bricks_slab", Material.ROCK, MaterialColor.CYAN_TERRACOTTA, 1.25F, 4.2F);
    public static final Block PURPLE_MUD_BRICKS_SLAB = new LEAbsSlabSound("purple_mud_bricks_slab", Material.ROCK, MaterialColor.PURPLE_TERRACOTTA, 1.25F, 4.2F);
    public static final Block BLUE_MUD_BRICKS_SLAB = new LEAbsSlabSound("blue_mud_bricks_slab", Material.ROCK, MaterialColor.BLUE_TERRACOTTA, 1.25F, 4.2F);
    public static final Block BROWN_MUD_BRICKS_SLAB = new LEAbsSlabSound("brown_mud_bricks_slab", Material.ROCK, MaterialColor.BROWN_TERRACOTTA, 1.25F, 4.2F);
    public static final Block GREEN_MUD_BRICKS_SLAB = new LEAbsSlabSound("green_mud_bricks_slab", Material.ROCK, MaterialColor.GREEN_TERRACOTTA, 1.25F, 4.2F);
    public static final Block RED_MUD_BRICKS_SLAB = new LEAbsSlabSound("red_mud_bricks_slab", Material.ROCK, MaterialColor.RED_TERRACOTTA, 1.25F, 4.2F);
    public static final Block BLACK_MUD_BRICKS_SLAB = new LEAbsSlabSound("black_mud_bricks_slab", Material.ROCK, MaterialColor.BLACK_TERRACOTTA, 1.25F, 4.2F);

    // fluids
    public static final Block MUNDANE = new PotionFluidBlock(LEFluids.MUNDANE);
    public static final Block THICK = new PotionFluidBlock(LEFluids.THICK);
    public static final Block AWKWARD = new PotionFluidBlock(LEFluids.AWKWARD);
    public static final Block NIGHT_VISION = new PotionFluidBlock(LEFluids.NIGHT_VISION);
    public static final Block LONG_NIGHT_VISION = new PotionFluidBlock(LEFluids.LONG_NIGHT_VISION);
    public static final Block INVISIBILITY = new PotionFluidBlock(LEFluids.INVISIBILITY);
    public static final Block LONG_INVISIBILITY = new PotionFluidBlock(LEFluids.LONG_INVISIBILITY);
    public static final Block LEAPING = new PotionFluidBlock(LEFluids.LEAPING);
    public static final Block LONG_LEAPING = new PotionFluidBlock(LEFluids.LONG_LEAPING);
    public static final Block STRONG_LEAPING = new PotionFluidBlock(LEFluids.STRONG_LEAPING);
    public static final Block FIRE_RESISTANCE = new PotionFluidBlock(LEFluids.FIRE_RESISTANCE);
    public static final Block LONG_FIRE_RESISTANCE = new PotionFluidBlock(LEFluids.LONG_FIRE_RESISTANCE);
    public static final Block SWIFTNESS = new PotionFluidBlock(LEFluids.SWIFTNESS);
    public static final Block LONG_SWIFTNESS = new PotionFluidBlock(LEFluids.LONG_SWIFTNESS);
    public static final Block STRONG_SWIFTNESS = new PotionFluidBlock(LEFluids.STRONG_SWIFTNESS);
    public static final Block SLOWNESS = new PotionFluidBlock(LEFluids.SLOWNESS);
    public static final Block LONG_SLOWNESS = new PotionFluidBlock(LEFluids.LONG_SLOWNESS);
    public static final Block STRONG_SLOWNESS = new PotionFluidBlock(LEFluids.STRONG_SLOWNESS);
    public static final Block TURTLE_MASTER = new PotionFluidBlock(LEFluids.TURTLE_MASTER);
    public static final Block LONG_TURTLE_MASTER = new PotionFluidBlock(LEFluids.LONG_TURTLE_MASTER);
    public static final Block STRONG_TURTLE_MASTER = new PotionFluidBlock(LEFluids.STRONG_TURTLE_MASTER);
    public static final Block WATER_BREATHING = new PotionFluidBlock(LEFluids.WATER_BREATHING);
    public static final Block LONG_WATER_BREATHING = new PotionFluidBlock(LEFluids.LONG_WATER_BREATHING);
    public static final Block HEALING = new PotionFluidBlock(LEFluids.HEALING);
    public static final Block STRONG_HEALING = new PotionFluidBlock(LEFluids.STRONG_HEALING);
    public static final Block HARMING = new PotionFluidBlock(LEFluids.HARMING);
    public static final Block STRONG_HARMING = new PotionFluidBlock(LEFluids.STRONG_HARMING);
    public static final Block POISON = new PotionFluidBlock(LEFluids.POISON);
    public static final Block LONG_POISON = new PotionFluidBlock(LEFluids.LONG_POISON);
    public static final Block STRONG_POISON = new PotionFluidBlock(LEFluids.STRONG_POISON);
    public static final Block REGENERATION = new PotionFluidBlock(LEFluids.REGENERATION);
    public static final Block LONG_REGENERATION = new PotionFluidBlock(LEFluids.LONG_REGENERATION);
    public static final Block STRONG_REGENERATION = new PotionFluidBlock(LEFluids.STRONG_REGENERATION);
    public static final Block STRENGTH = new PotionFluidBlock(LEFluids.STRENGTH);
    public static final Block LONG_STRENGTH = new PotionFluidBlock(LEFluids.LONG_STRENGTH);
    public static final Block STRONG_STRENGTH = new PotionFluidBlock(LEFluids.STRONG_STRENGTH);
    public static final Block WEAKNESS = new PotionFluidBlock(LEFluids.WEAKNESS);
    public static final Block LONG_WEAKNESS = new PotionFluidBlock(LEFluids.LONG_WEAKNESS);
    public static final Block LUCK = new PotionFluidBlock(LEFluids.LUCK);
    public static final Block SLOW_FALLING = new PotionFluidBlock(LEFluids.SLOW_FALLING);
    public static final Block LONG_SLOW_FALLING = new PotionFluidBlock(LEFluids.LONG_SLOW_FALLING);


    // ignore class list
    private static final List<Class<?>> IGNORE_CLASS_LIST = Arrays.asList(
            WallTorchBlock.class, FlowingFluidBlock.class, LEFire.class, WaterBerries.class
    );

    // registry functions things
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> regBlocks) {
        try {
            for (Field f : LEBlocks.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof Block) {
                    regBlocks.getRegistry().register((Block) obj);
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @SubscribeEvent
    public static void registerBlockItems(RegistryEvent.Register<Item> regBlockItems) {
        try {
            for (Field f : LEBlocks.class.getDeclaredFields()) {
                Object obj = f.get(null);
                if (obj instanceof HihirokaneBlock) {
                    // for blocks that don't burn in lava
                    BlockItem blockItem = new BlockItem((Block) obj, new Item.Properties().func_234689_a_().group(LiberExponentia.TAB));
                    blockItem.setRegistryName(((Block) obj).getRegistryName());
                    regBlockItems.getRegistry().register(blockItem);
                } else if (obj instanceof Block && !IGNORE_CLASS_LIST.contains(obj.getClass())) {
                    BlockItem blockItem = new BlockItem((Block) obj, new Item.Properties().group(LiberExponentia.TAB));
                    blockItem.setRegistryName(((Block) obj).getRegistryName());
                    regBlockItems.getRegistry().register(blockItem);
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
