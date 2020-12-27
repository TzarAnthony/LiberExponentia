package com.tzaranthony.liberexponentia.util;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import com.tzaranthony.liberexponentia.Liber_Exponentia;
import com.tzaranthony.liberexponentia.block.*;

import com.tzaranthony.liberexponentia.fluid.LEFluids;
import com.tzaranthony.liberexponentia.fluid.util.PotionTypes;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.DyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Liber_Exponentia.MOD_ID, bus = Bus.MOD)
public class LEBlocks {
	// ores
	public static final Block SILVER_ORE = new LERockBlock("silver_ore", 3.0F, 5.0F);
	public static final Block CINNABAR_ORE_BLOCK = new CinnabarOre("cinnabar_ore");
	
	// storage blocks
	public static final Block SILVER_BLOCK = new MetalBlock("silver_block", 2, 3.0F,  6.0F);
	public static final Block COLD_IRON_BLOCK = new MetalBlock("cold_iron_block", 2, 25.0F, 15.0F);
	public static final Block CELESTIA_STEEL_BLOCK = new MetalBlock("celestial_steel_block", 4, 40.0F, 3000.0F);
	public static final Block HIHIROKANE_BLOCK = new HihirokaneBlock("hihirokane_block");
	
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
	public static final Block END_LANTERN = new LELantern("End_Lantern", 20);
	public static final Block END_TORCH = new LETorch("end_torch", 20);
	public static final Block END_WALL_TORCH = new LEWallTorch("end_wall_torch", 20, END_TORCH);
	
	// plants
	public static final Block CORDGRASS = new Cordgrass("cordgrass");
	public static final Block LYCIUM_NYMPHA_BLOCK = new WaterBerries("lycium_nympha");
	
	// misc
	public static final Block INFUSED_END_STONE = new LERockBlock("infused_end_stone", 5.0F, 200.0F);
	public static final Block MUD = new MetalBlock("mud", 1, 1.0F, 1.0F); // not final, needs to change
	
	// potion fluids
	//public static final Block MUNDANE_POTION = new potionFluidBlockNull("mundane_potion")
	//public static final Block THICK_POTION = new potionFluidBlockNull("thick_potion")
	//public static final Block AWKWARD_POTION = new potionFluidBlockNull("mundane_potion")
	//public static final Block NIGHT_VISION_POTION = new potionFluidBlock("night_vision_potion", Effects.NIGHT_VISION, 1.0f)
	//public static final Block LONG_NIGHT_VISION_POTION = new potionFluidBlock("lengthened_night_vision_potion", Effects.NIGHT_VISION, 2.6f)
	
	// gold
	public static final Block EMBOSSED_GOLD_BLOCK = new MetalBlock("embossed_gold_block", 2, 3.0F,  6.0F);
	public static final Block ETCHED_GOLD_BLOCK = new MetalBlock("etched_gold_block", 2, 3.0F,  6.0F);
	public static final Block GOLD_BRICKS = new MetalBlock("gold_bricks", 2, 3.0F,  6.0F);
	public static final Block GOLD_TILES = new MetalBlock("gold_tiles", 2, 3.0F,  6.0F);
	public static final Block LARGE_GOLD_BRICKS = new MetalBlock("large_gold_bricks", 2, 3.0F,  6.0F);
	// stairs
	public static final Block GOLD_BRICKS_STAIRS = new LEAbsStairs("gold_bricks_stairs", GOLD_BRICKS.getDefaultState(), GOLD_BRICKS);
	public static final Block GOLD_TILES_STAIRS = new LEAbsStairs("gold_tiles_stairs", GOLD_TILES.getDefaultState(), GOLD_TILES);
	public static final Block LARGE_GOLD_BRICKS_STAIRS = new LEAbsStairs("large_gold_bricks_stairs", LARGE_GOLD_BRICKS.getDefaultState(), LARGE_GOLD_BRICKS);
	// slabs
	public static final Block GOLD_BRICKS_SLAB = new LESlab("gold_bricks_slab", Material.IRON,3.0F, 6.0F);
	public static final Block GOLD_TILES_SLAB = new LESlab("gold_tiles_slab", Material.IRON,3.0F, 6.0F);
	public static final Block LARGE_GOLD_BRICKS_SLAB = new LESlab("large_gold_bricks_slab", Material.IRON,3.0F, 6.0F);
	
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
	public static final Block MUD_BRICKS_SLAB = new LEAbsSlab("mud_bricks_slab", Material.ROCK, MaterialColor.ADOBE, 1.25F, 4.2F);
	public static final Block WHITE_MUD_BRICKS_SLAB = new LEAbsSlab("white_mud_bricks_slab", Material.ROCK, MaterialColor.WHITE_TERRACOTTA, 1.25F, 4.2F);
	public static final Block ORANGE_MUD_BRICKS_SLAB = new LEAbsSlab("orange_mud_bricks_slab", Material.ROCK, MaterialColor.ORANGE_TERRACOTTA, 1.25F, 4.2F);
	public static final Block MAGENTA_MUD_BRICKS_SLAB = new LEAbsSlab("magenta_mud_bricks_slab", Material.ROCK, MaterialColor.MAGENTA_TERRACOTTA, 1.25F, 4.2F);
	public static final Block LIGHT_BLUE_MUD_BRICKS_SLAB = new LEAbsSlab("light_blue_mud_bricks_slab", Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA, 1.25F, 4.2F);
	public static final Block YELLOW_MUD_BRICKS_SLAB = new LEAbsSlab("yellow_mud_bricks_slab", Material.ROCK, MaterialColor.YELLOW_TERRACOTTA, 1.25F, 4.2F);
	public static final Block LIME_MUD_BRICKS_SLAB = new LEAbsSlab("lime_mud_bricks_slab", Material.ROCK, MaterialColor.LIME_TERRACOTTA, 1.25F, 4.2F);
	public static final Block PINK_MUD_BRICKS_SLAB = new LEAbsSlab("pink_mud_bricks_slab", Material.ROCK, MaterialColor.PINK_TERRACOTTA, 1.25F, 4.2F);
	public static final Block GRAY_MUD_BRICKS_SLAB = new LEAbsSlab("gray_mud_bricks_slab", Material.ROCK, MaterialColor.GRAY_TERRACOTTA, 1.25F, 4.2F);
	public static final Block LIGHT_GRAY_MUD_BRICKS_SLAB = new LEAbsSlab("light_gray_mud_bricks_slab", Material.ROCK, MaterialColor.LIGHT_GRAY_TERRACOTTA, 1.25F, 4.2F);
	public static final Block CYAN_MUD_BRICKS_SLAB = new LEAbsSlab("cyan_mud_bricks_slab", Material.ROCK, MaterialColor.CYAN_TERRACOTTA, 1.25F, 4.2F);
	public static final Block PURPLE_MUD_BRICKS_SLAB = new LEAbsSlab("purple_mud_bricks_slab", Material.ROCK, MaterialColor.PURPLE_TERRACOTTA, 1.25F, 4.2F);
	public static final Block BLUE_MUD_BRICKS_SLAB = new LEAbsSlab("blue_mud_bricks_slab", Material.ROCK, MaterialColor.BLUE_TERRACOTTA, 1.25F, 4.2F);
	public static final Block BROWN_MUD_BRICKS_SLAB = new LEAbsSlab("brown_mud_bricks_slab", Material.ROCK, MaterialColor.BROWN_TERRACOTTA, 1.25F, 4.2F);
	public static final Block GREEN_MUD_BRICKS_SLAB = new LEAbsSlab("green_mud_bricks_slab", Material.ROCK, MaterialColor.GREEN_TERRACOTTA, 1.25F, 4.2F);
	public static final Block RED_MUD_BRICKS_SLAB = new LEAbsSlab("red_mud_bricks_slab", Material.ROCK, MaterialColor.RED_TERRACOTTA, 1.25F, 4.2F);
	public static final Block BLACK_MUD_BRICKS_SLAB = new LEAbsSlab("black_mud_bricks_slab", Material.ROCK, MaterialColor.BLACK_TERRACOTTA, 1.25F, 4.2F);
	
	// vanilla additions (only registered if vanilla block extension is true?)
	// terracotta
	// stairs
	public static final Block TERRACOTTA_STAIRS = new LEAbsStairs("terracotta_stairs", net.minecraft.block.Blocks.TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.TERRACOTTA);
	public static final Block WHITE_TERRACOTTA_STAIRS = new LEAbsStairs("white_terracotta_stairs", net.minecraft.block.Blocks.WHITE_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.WHITE_TERRACOTTA);
	public static final Block ORANGE_TERRACOTTA_STAIRS = new LEAbsStairs("orange_terracotta_stairs", net.minecraft.block.Blocks.ORANGE_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.ORANGE_TERRACOTTA);
	public static final Block MAGENTA_TERRACOTTA_STAIRS = new LEAbsStairs("magenta_terracotta_stairs", net.minecraft.block.Blocks.MAGENTA_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.MAGENTA_TERRACOTTA);
	public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = new LEAbsStairs("light_blue_terracotta_stairs", net.minecraft.block.Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.LIGHT_BLUE_TERRACOTTA);
	public static final Block YELLOW_TERRACOTTA_STAIRS = new LEAbsStairs("yellow_terracotta_stairs", net.minecraft.block.Blocks.YELLOW_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.YELLOW_TERRACOTTA);
	public static final Block LIME_TERRACOTTA_STAIRS = new LEAbsStairs("lime_terracotta_stairs", net.minecraft.block.Blocks.LIME_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.LIME_TERRACOTTA);
	public static final Block PINK_TERRACOTTA_STAIRS = new LEAbsStairs("pink_terracotta_stairs", net.minecraft.block.Blocks.PINK_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.PINK_TERRACOTTA);
	public static final Block GRAY_TERRACOTTA_STAIRS = new LEAbsStairs("gray_terracotta_stairs", net.minecraft.block.Blocks.GRAY_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.GRAY_TERRACOTTA);
	public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = new LEAbsStairs("light_gray_terracotta_stairs", net.minecraft.block.Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.LIGHT_GRAY_TERRACOTTA);
	public static final Block CYAN_TERRACOTTA_STAIRS = new LEAbsStairs("cyan_terracotta_stairs", net.minecraft.block.Blocks.CYAN_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.CYAN_TERRACOTTA);
	public static final Block PURPLE_TERRACOTTA_STAIRS = new LEAbsStairs("purple_terracotta_stairs", net.minecraft.block.Blocks.PURPLE_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.PURPLE_TERRACOTTA);
	public static final Block BLUE_TERRACOTTA_STAIRS = new LEAbsStairs("blue_terracotta_stairs", net.minecraft.block.Blocks.BLUE_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.BLUE_TERRACOTTA);
	public static final Block BROWN_TERRACOTTA_STAIRS = new LEAbsStairs("brown_terracotta_stairs", net.minecraft.block.Blocks.BROWN_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.BROWN_TERRACOTTA);
	public static final Block GREEN_TERRACOTTA_STAIRS = new LEAbsStairs("green_terracotta_stairs", net.minecraft.block.Blocks.GREEN_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.GREEN_TERRACOTTA);
	public static final Block RED_TERRACOTTA_STAIRS = new LEAbsStairs("red_terracotta_stairs", net.minecraft.block.Blocks.RED_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.RED_TERRACOTTA);
	public static final Block BLACK_TERRACOTTA_STAIRS = new LEAbsStairs("black_terracotta_stairs", net.minecraft.block.Blocks.BLACK_TERRACOTTA.getDefaultState(), net.minecraft.block.Blocks.BLACK_TERRACOTTA);
	// slabs
	public static final Block TERRACOTTA_SLAB = new LEAbsSlab("terracotta_slab", Material.ROCK, MaterialColor.ADOBE, 1.25F, 4.2F);
	public static final Block WHITE_TERRACOTTA_SLAB = new LEAbsSlab("white_terracotta_slab", Material.ROCK, MaterialColor.WHITE_TERRACOTTA, 1.25F, 4.2F);
	public static final Block ORANGE_TERRACOTTA_SLAB = new LEAbsSlab("orange_terracotta_slab", Material.ROCK, MaterialColor.ORANGE_TERRACOTTA, 1.25F, 4.2F);
	public static final Block MAGENTA_TERRACOTTA_SLAB = new LEAbsSlab("magenta_terracotta_slab", Material.ROCK, MaterialColor.MAGENTA_TERRACOTTA, 1.25F, 4.2F);
	public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = new LEAbsSlab("light_blue_terracotta_slab", Material.ROCK, MaterialColor.LIGHT_BLUE_TERRACOTTA, 1.25F, 4.2F);
	public static final Block YELLOW_TERRACOTTA_SLAB = new LEAbsSlab("yellow_terracotta_slab", Material.ROCK, MaterialColor.YELLOW_TERRACOTTA, 1.25F, 4.2F);
	public static final Block LIME_TERRACOTTA_SLAB = new LEAbsSlab("lime_terracotta_slab", Material.ROCK, MaterialColor.LIME_TERRACOTTA, 1.25F, 4.2F);
	public static final Block PINK_TERRACOTTA_SLAB = new LEAbsSlab("pink_terracotta_slab", Material.ROCK, MaterialColor.PINK_TERRACOTTA, 1.25F, 4.2F);
	public static final Block GRAY_TERRACOTTA_SLAB = new LEAbsSlab("gray_terracotta_slab", Material.ROCK, MaterialColor.GRAY_TERRACOTTA, 1.25F, 4.2F);
	public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = new LEAbsSlab("light_gray_terracotta_slab", Material.ROCK, MaterialColor.LIGHT_GRAY_TERRACOTTA, 1.25F, 4.2F);
	public static final Block CYAN_TERRACOTTA_SLAB = new LEAbsSlab("cyan_terracotta_slab", Material.ROCK, MaterialColor.CYAN_TERRACOTTA, 1.25F, 4.2F);
	public static final Block PURPLE_TERRACOTTA_SLAB = new LEAbsSlab("purple_terracotta_slab", Material.ROCK, MaterialColor.PURPLE_TERRACOTTA, 1.25F, 4.2F);
	public static final Block BLUE_TERRACOTTA_SLAB = new LEAbsSlab("blue_terracotta_slab", Material.ROCK, MaterialColor.BLUE_TERRACOTTA, 1.25F, 4.2F);
	public static final Block BROWN_TERRACOTTA_SLAB = new LEAbsSlab("brown_terracotta_slab", Material.ROCK, MaterialColor.BROWN_TERRACOTTA, 1.25F, 4.2F);
	public static final Block GREEN_TERRACOTTA_SLAB = new LEAbsSlab("green_terracotta_slab", Material.ROCK, MaterialColor.GREEN_TERRACOTTA, 1.25F, 4.2F);
	public static final Block RED_TERRACOTTA_SLAB = new LEAbsSlab("red_terracotta_slab", Material.ROCK, MaterialColor.RED_TERRACOTTA, 1.25F, 4.2F);
	public static final Block BLACK_TERRACOTTA_SLAB = new LEAbsSlab("black_terracotta_slab", Material.ROCK, MaterialColor.BLACK_TERRACOTTA, 1.25F, 4.2F);
	
	// concrete
	// stairs
	public static final Block WHITE_CONCRETE_STAIRS = new LEAbsStairs("white_concrete_stairs", net.minecraft.block.Blocks.WHITE_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.WHITE_CONCRETE);
	public static final Block ORANGE_CONCRETE_STAIRS = new LEAbsStairs("orange_concrete_stairs", net.minecraft.block.Blocks.ORANGE_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.ORANGE_CONCRETE);
	public static final Block MAGENTA_CONCRETE_STAIRS = new LEAbsStairs("magenta_concrete_stairs", net.minecraft.block.Blocks.MAGENTA_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.MAGENTA_CONCRETE);
	public static final Block LIGHT_BLUE_CONCRETE_STAIRS = new LEAbsStairs("light_blue_concrete_stairs", net.minecraft.block.Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.LIGHT_BLUE_CONCRETE);
	public static final Block YELLOW_CONCRETE_STAIRS = new LEAbsStairs("yellow_concrete_stairs", net.minecraft.block.Blocks.YELLOW_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.YELLOW_CONCRETE);
	public static final Block LIME_CONCRETE_STAIRS = new LEAbsStairs("lime_concrete_stairs", net.minecraft.block.Blocks.LIME_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.LIME_CONCRETE);
	public static final Block PINK_CONCRETE_STAIRS = new LEAbsStairs("pink_concrete_stairs", net.minecraft.block.Blocks.PINK_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.PINK_CONCRETE);
	public static final Block GRAY_CONCRETE_STAIRS = new LEAbsStairs("gray_concrete_stairs", net.minecraft.block.Blocks.GRAY_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.GRAY_CONCRETE);
	public static final Block LIGHT_GRAY_CONCRETE_STAIRS = new LEAbsStairs("light_gray_concrete_stairs", net.minecraft.block.Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.LIGHT_GRAY_CONCRETE);
	public static final Block CYAN_CONCRETE_STAIRS = new LEAbsStairs("cyan_concrete_stairs", net.minecraft.block.Blocks.CYAN_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.CYAN_CONCRETE);
	public static final Block PURPLE_CONCRETE_STAIRS = new LEAbsStairs("purple_concrete_stairs", net.minecraft.block.Blocks.PURPLE_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.PURPLE_CONCRETE);
	public static final Block BLUE_CONCRETE_STAIRS = new LEAbsStairs("blue_concrete_stairs", net.minecraft.block.Blocks.BLUE_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.BLUE_CONCRETE);
	public static final Block BROWN_CONCRETE_STAIRS = new LEAbsStairs("brown_concrete_stairs", net.minecraft.block.Blocks.BROWN_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.BROWN_CONCRETE);
	public static final Block GREEN_CONCRETE_STAIRS = new LEAbsStairs("green_concrete_stairs", net.minecraft.block.Blocks.GREEN_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.GREEN_CONCRETE);
	public static final Block RED_CONCRETE_STAIRS = new LEAbsStairs("red_concrete_stairs", net.minecraft.block.Blocks.RED_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.RED_CONCRETE);
	public static final Block BLACK_CONCRETE_STAIRS = new LEAbsStairs("black_concrete_stairs", net.minecraft.block.Blocks.BLACK_CONCRETE.getDefaultState(), net.minecraft.block.Blocks.BLACK_CONCRETE);
	
	// slabs
	public static final Block WHITE_CONCRETE_SLAB = new LEAbsSlabD("white_concrete_slab", Material.ROCK, DyeColor.WHITE, 1.8F, 1.8F);
	public static final Block ORANGE_CONCRETE_SLAB = new LEAbsSlabD("orange_concrete_slab", Material.ROCK, DyeColor.ORANGE, 1.8F, 1.8F);
	public static final Block MAGENTA_CONCRETE_SLAB = new LEAbsSlabD("magenta_concrete_slab", Material.ROCK, DyeColor.MAGENTA, 1.8F, 1.8F);
	public static final Block LIGHT_BLUE_CONCRETE_SLAB = new LEAbsSlabD("light_blue_concrete_slab", Material.ROCK, DyeColor.LIGHT_BLUE, 1.8F, 1.8F);
	public static final Block YELLOW_CONCRETE_SLAB = new LEAbsSlabD("yellow_concrete_slab", Material.ROCK, DyeColor.YELLOW, 1.8F, 1.8F);
	public static final Block LIME_CONCRETE_SLAB = new LEAbsSlabD("lime_concrete_slab", Material.ROCK, DyeColor.LIME, 1.8F, 1.8F);
	public static final Block PINK_CONCRETE_SLAB = new LEAbsSlabD("pink_concrete_slab", Material.ROCK, DyeColor.PINK, 1.8F, 1.8F);
	public static final Block GRAY_CONCRETE_SLAB = new LEAbsSlabD("gray_concrete_slab", Material.ROCK, DyeColor.GRAY, 1.8F, 1.8F);
	public static final Block LIGHT_GRAY_CONCRETE_SLAB = new LEAbsSlabD("light_gray_concrete_slab", Material.ROCK, DyeColor.LIGHT_GRAY, 1.8F, 1.8F);
	public static final Block CYAN_CONCRETE_SLAB = new LEAbsSlabD("cyan_concrete_slab", Material.ROCK, DyeColor.CYAN, 1.8F, 1.8F);
	public static final Block PURPLE_CONCRETE_SLAB = new LEAbsSlabD("purple_concrete_slab", Material.ROCK, DyeColor.PURPLE, 1.8F, 1.8F);
	public static final Block BLUE_CONCRETE_SLAB = new LEAbsSlabD("blue_concrete_slab", Material.ROCK, DyeColor.BLUE, 1.8F, 1.8F);
	public static final Block BROWN_CONCRETE_SLAB = new LEAbsSlabD("brown_concrete_slab", Material.ROCK, DyeColor.BROWN, 1.8F, 1.8F);
	public static final Block GREEN_CONCRETE_SLAB = new LEAbsSlabD("green_concrete_slab", Material.ROCK, DyeColor.GREEN, 1.8F, 1.8F);
	public static final Block RED_CONCRETE_SLAB = new LEAbsSlabD("red_concrete_slab", Material.ROCK, DyeColor.RED, 1.8F, 1.8F);
	public static final Block BLACK_CONCRETE_SLAB = new LEAbsSlabD("black_concrete_slab", Material.ROCK, DyeColor.BLACK, 1.8F, 1.8F);

	public static final Block SPEED_POTION_FLUID = new PotionFluidBlock("SPEED_POTION_FLUID", LEFluids.POTION, PotionTypes.SPEED);


	// ignroe class list
	private static final List<Class<?>> IGNORE_CLASS_LIST = Arrays.asList(WallTorchBlock.class, FlowingFluidBlock.class);

	// registry functions things
	public static void registerBlocks(RegistryEvent.Register<Block> regBlocks) {
		for (Field f : LEBlocks.class.getDeclaredFields()) {
			try {
				Object obj = f.get(null);
				if (obj instanceof Block) {
					regBlocks.getRegistry().register((Block) obj);
					}
			// I have no idea why I need this yet
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}
	}
	
	public static void registerBlockItems(RegistryEvent.Register<Item> regBlockItems) {
		for (Field f : LEBlocks.class.getDeclaredFields()) {
			try {
				Object obj = f.get(null);
				if (obj instanceof HihirokaneBlock) {
					// for blocks that don't burn in lava
					BlockItem blockItem = new BlockItem((Block) obj, new Properties().func_234689_a_().group(Liber_Exponentia.TAB));
					blockItem.setRegistryName(((Block) obj).getRegistryName());
					regBlockItems.getRegistry().register(blockItem);
				}
				else if (obj instanceof Block && !IGNORE_CLASS_LIST.contains(obj.getClass())) {
					BlockItem blockItem = new BlockItem((Block) obj, new Properties().group(Liber_Exponentia.TAB));
					blockItem.setRegistryName(((Block) obj).getRegistryName());
					regBlockItems.getRegistry().register(blockItem);
				}
			} catch (IllegalAccessException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
