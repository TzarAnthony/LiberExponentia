package com.tzaranthony.liberexponentia.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.tzaranthony.liberexponentia.Liber_Exponentia;
import com.tzaranthony.liberexponentia.util.LEBlocks;
import com.tzaranthony.liberexponentia.util.LEItems;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.brain.task.GiveHeroGiftsTask;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades.ITrade;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.village.PointOfInterestType;
import net.minecraft.world.gen.feature.jigsaw.JigsawPattern;
import net.minecraft.world.gen.feature.jigsaw.JigsawPatternRegistry;
import net.minecraft.world.gen.feature.jigsaw.JigsawPiece;
import net.minecraft.world.gen.feature.jigsaw.LegacySingleJigsawPiece;
import net.minecraft.world.gen.feature.structure.DesertVillagePools;
import net.minecraft.world.gen.feature.structure.PlainsVillagePools;
import net.minecraft.world.gen.feature.structure.SavannaVillagePools;
import net.minecraft.world.gen.feature.structure.SnowyVillagePools;
import net.minecraft.world.gen.feature.structure.TaigaVillagePools;
import net.minecraft.world.gen.feature.template.ProcessorLists;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class VillagerMage {
	public static void init() {
		// init pools
		PlainsVillagePools.init();
		SnowyVillagePools.init();
		SavannaVillagePools.init();
		DesertVillagePools.init();
		TaigaVillagePools.init();
		
		// Register mage houses per biome
		for(String biome : new String[] {"plains", "snowy", "savanna", "desert", "taiga"})
			addHouseToPool(
					new ResourceLocation("village/"+biome+"/houses"),
					new ResourceLocation("village/mage_house_"+biome), 1);
		
		// register placement of houses
		JigsawPatternRegistry.func_244094_a(new JigsawPattern(
			new ResourceLocation(Liber_Exponentia.MOD_ID, "village/mage"),
			new ResourceLocation("empty"),
			ImmutableList.of(Pair.of(JigsawPiece.func_242849_a(Liber_Exponentia.MOD_ID + ":village/mage/mage_1"), 1)),
			JigsawPattern.PlacementBehaviour.RIGID));
		
		// register gifts
		GiveHeroGiftsTask.GIFTS.put(MerchantRegister.MAGE.get(), new ResourceLocation(Liber_Exponentia.MOD_ID, "gameplay/hero_of_the_village/mage_gifts"));
	}
	
	
	// I've no idea what any of this does LOL -- well it seems to register patterns for the houses, but aside from that....
	private static void addHouseToPool(ResourceLocation pool, ResourceLocation toAdd, int weight) {
		JigsawPattern old = WorldGenRegistries.field_243656_h.getOrDefault(pool); // not sure this is the right world gen field
		
		List<JigsawPiece> shuffled = old.getShuffledPieces(new Random());
		List<Pair<JigsawPiece, Integer>> newPieces = new ArrayList<>();
		
		for (JigsawPiece p : shuffled) {newPieces.add(new Pair<>(p, 1));}
		
		newPieces.add(Pair.of(new LegacySingleJigsawPiece(Either.left(toAdd),
				() -> ProcessorLists.field_244101_a, JigsawPattern.PlacementBehaviour.RIGID), weight));
		
		ResourceLocation name = old.getName();
		Registry.register(WorldGenRegistries.field_243656_h, pool, new JigsawPattern(pool, name, newPieces));
	}
	
	
	// Register poi and profession data
	@Mod.EventBusSubscriber(modid = Liber_Exponentia.MOD_ID, bus = Bus.FORGE)
	public static class MerchantRegister {
		public static final DeferredRegister<PointOfInterestType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, Liber_Exponentia.MOD_ID);
		public static final DeferredRegister<VillagerProfession> PROFESSIONS = DeferredRegister.create(ForgeRegistries.PROFESSIONS, Liber_Exponentia.MOD_ID);
		
		public static final RegistryObject<PointOfInterestType> idk = POI_TYPES.register(
				"idk", () -> new PointOfInterestType("mage", PointOfInterestType.getAllStates(LEBlocks.COLD_IRON_BLOCK), 1, 1));
		public static final RegistryObject<VillagerProfession> MAGE = PROFESSIONS.register(
				"mage", () -> new VillagerProfession("mage", idk.get(), ImmutableSet.of(Items.field_234759_km_), ImmutableSet.of(), SoundEvents.ENTITY_VILLAGER_WORK_CLERIC));
	}
	
	
	// register trade events
	@Mod.EventBusSubscriber(modid = Liber_Exponentia.MOD_ID, bus = Bus.FORGE)
	public static class TradeEvents {
		@SubscribeEvent
		public static void registerTrades(VillagerTradesEvent vTradeEvent) {
			Int2ObjectMap<List<ITrade>> trades = vTradeEvent.getTrades();
			
			// standard trade xp are buy/sell > 2/1, 10/5, 20/10, 30/15. 60/30
			if (vTradeEvent.getType() == MAGE.get()) {
				trades.get(1).add(new VillagerSells(LEItems.IGNI_BOTTLE, 3, 1, 12, 1));
				trades.get(1).add(new VillagerSells(LEItems.AQUA_BOTTLE, 3, 1, 12, 1));
				trades.get(1).add(new VillagerSells(LEItems.TERRA_BOTTLE, 3, 1, 12, 1));
				trades.get(1).add(new VillagerSells(LEItems.CAELUM_BOTTLE, 3, 1, 12, 1));
				trades.get(1).add(new VillagerSells(LEItems.FULGUR_BOTTLE, 3, 1, 12, 1));
				trades.get(1).add(new VillagerSells(LEItems.MENS_BOTTLE, 3, 1, 12, 1));
				
				trades.get(2).add(new VillagerBuys(LEItems.SILVER_INGOT, 3, 12, 10));
				trades.get(2).add(new VillagerBuys(LEItems.CINNBAR_FRAGMENT, 2, 12, 10));
				trades.get(2).add(new VillagerBuys(Items.PHANTOM_MEMBRANE, 6, 12, 10));
				
				// maybe add potion buckets here
				trades.get(3).add(new VillagerSells(LEItems.INANIS_BOTTLE, 6, 1, 12, 10));
				trades.get(3).add(new VillagerSells(LEItems.CLARITAS_BOTTLE, 6, 1, 12, 10));
				trades.get(3).add(new VillagerSells(LEItems.AUTOMATA_BOTTLE, 6, 1, 12, 10));
				trades.get(3).add(new VillagerSells(LEItems.ALCHIMIA_BOTTLE, 6, 1, 12, 10));
				trades.get(3).add(new VillagerSells(LEItems.ANIMUS_BOTTLE, 6, 1, 12, 10));
				trades.get(3).add(new VillagerSells(LEItems.IMPETUS_BOTTLE, 6, 1, 12, 10));
				
				trades.get(4).add(new VillagerSells(LEItems.IMPETUS_BOTTLE, 6, 1, 12, 15));
				
				trades.get(5).add(new VillagerSells(LEBlocks.LYCIUM_NYMPHA, 64, 1, 6, 30));
				trades.get(5).add(new VillagerSells(LEItems.DRACONITE, 64, 1, 10, 30));
			}
		}
	}
	
	// I have to create my own buying and selling classes for some mysterious reason............ So i'm literally just copying the base one...
	public static class VillagerSells implements ITrade {
		public final ItemStack villagerHas;
		public final int itemCost;
		public final int amountGiven;
		public final int maxTrades;
		public final int xpGiven;
		public final float priceMultiplier;
		
		// I'm guessing these 2 convert the thing to an item stack???
		public VillagerSells(Block block, int cost, int amount, int maxTrades, int xpGiven) {
			this(new ItemStack(block), cost, amount, maxTrades, xpGiven);
		}
		
		public VillagerSells(Item item, int cost, int amount, int maxTrades, int xpGiven) {
			this(new ItemStack(item), cost, amount, maxTrades, xpGiven);
		}
		
		// actual selling settings
		public VillagerSells(ItemStack stack, int cost, int amount, int maxTrades, int xpGiven) {
			this.villagerHas = stack;
			this.itemCost = cost;
			this.amountGiven = amount;
			this.maxTrades = maxTrades;
			this.xpGiven = xpGiven;
			this.priceMultiplier = 0.05F;
		}
		
		// register trade info
		public MerchantOffer getOffer(Entity trader, Random rand) {
			return new MerchantOffer(new ItemStack(Items.EMERALD, this.itemCost),
					new ItemStack(this.villagerHas.getItem(), this.amountGiven),
					this.maxTrades, this.xpGiven, this.priceMultiplier);
		}
	}
	
	
	public static class VillagerBuys implements ITrade {
		private final Item villagerWants;
		private final int amountWanted;
		private final int maxTrades;
		private final int xpGiven;
		private final float priceMultiplier;
		
		// purchase settings
		public VillagerBuys(IItemProvider wantsIn, int amountIn, int maxTradesIn, int xpGivenIn) {
			this.villagerWants = wantsIn.asItem();
			this.amountWanted = amountIn;
			this.maxTrades = maxTradesIn;
			this.xpGiven = xpGivenIn;
			this.priceMultiplier = 0.05F; // I assume this is the random price multiplier?
		}
		
		// register trade info
		public MerchantOffer getOffer(Entity trader, Random rand) {
			ItemStack item = new ItemStack(this.villagerWants, this.amountWanted);
			return new MerchantOffer(item, new ItemStack(Items.EMERALD), this.maxTrades, this.xpGiven, this.priceMultiplier);
		}
	}
}
