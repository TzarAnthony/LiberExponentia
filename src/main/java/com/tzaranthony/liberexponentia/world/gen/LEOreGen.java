package com.tzaranthony.liberexponentia.world.gen;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = LiberExponentia.MOD_ID, bus = Bus.MOD)
public class LEOreGen {
	
	@SubscribeEvent
	public static void generateOres(FMLLoadCompleteEvent event) {
		for (Biome biome : ForgeRegistries.BIOMES) {
			
			if (biome.getCategory() == Biome.Category.NETHER) {
				// Nether Ore Gen
			} else if (biome.getCategory() == Biome.Category.THEEND) {
				// End Ore Gen
			} else {
				// Overworld
			}
		}
	};
	
	private static void genOre(RegistryObject<Block> Ore, int base, int spread) {
		Registry.register(
				WorldGenRegistries.field_243653_e,
				Ore.getId(),
				net.minecraft.world.gen.feature.Feature.field_236289_V_.withConfiguration(
						new OreFeatureConfig(
								OreFeatureConfig.FillerBlockType.field_241882_a,
								Ore.get().getDefaultState(),
								64)
						).withPlacement(Placement.field_242910_o.configure(
								new DepthAverageConfig(base, spread)
								)).func_242728_a().func_242731_b(1)
				);
	}
}
