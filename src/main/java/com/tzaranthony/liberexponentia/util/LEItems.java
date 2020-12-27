package com.tzaranthony.liberexponentia.util;

import java.lang.reflect.Field;

import com.tzaranthony.liberexponentia.Liber_Exponentia;
import com.tzaranthony.liberexponentia.item.NymphaBerries;
import com.tzaranthony.liberexponentia.item.SilverArrow;
import com.tzaranthony.liberexponentia.item.UnburnableItem;
import com.tzaranthony.liberexponentia.item.UnburnableItemRarity;
import com.tzaranthony.liberexponentia.item.VampireBlood;
import com.tzaranthony.liberexponentia.item.ColdIronArrow;
import com.tzaranthony.liberexponentia.item.ItemBase;
import com.tzaranthony.liberexponentia.item.ItemBaseRarity;
import com.tzaranthony.liberexponentia.item.ItemBaseRarityStacksize;
import com.tzaranthony.liberexponentia.item.ItemBaseStacksize;
import com.tzaranthony.liberexponentia.item.LEHorseArmor;
import com.tzaranthony.liberexponentia.item.LifeBottle;
import com.tzaranthony.liberexponentia.item.MagicBottle;

import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.potion.Effects;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = Liber_Exponentia.MOD_ID, bus = Bus.MOD)
public class LEItems {
	
	// register magical food
	public static final Item NYMPHA_BERRIES = new NymphaBerries("nympha_berries");
	public static final Item ELXIR_OF_LIFE = new LifeBottle("elxir_of_life");
	public static final Item BOTTLE_OF_IGNI = new MagicBottle("bottle_of_igni", Effects.FIRE_RESISTANCE, 0, Effects.POISON, 1, "fire");
	public static final Item BOTTLE_OF_AQUA = new MagicBottle("bottle_of_aqua", Effects.WATER_BREATHING, 0, Effects.NAUSEA, 1, "water");
	public static final Item BOTTLE_OF_TERRA = new MagicBottle("bottle_of_terra", Effects.RESISTANCE, 1, Effects.MINING_FATIGUE, 1, "earth");
	public static final Item BOTTLE_OF_CAELUM = new MagicBottle("bottle_of_caelum", Effects.SLOW_FALLING, 0, Effects.LEVITATION, 0, "air");
	public static final Item BOTTLE_OF_FULGUR = new MagicBottle("bottle_of_fulgur", Effects.SPEED, 3, Effects.SLOWNESS, 2, "electric");
	public static final Item BOTTLE_OF_MENS = new MagicBottle("bottle_of_mens", Effects.HERO_OF_THE_VILLAGE, 4, Effects.BAD_OMEN, 5, "mind");
	public static final Item BOTTLE_OF_INANIS = new MagicBottle("bottle_of_inanis", Effects.HASTE, 3, Effects.HUNGER, 4, "void");
	public static final Item BOTTLE_OF_CLARITAS = new MagicBottle("bottle_of_claritas", Effects.INVISIBILITY, 0, Effects.BLINDNESS, 0, "light");
	public static final Item BOTTLE_OF_AUTOMATA = new MagicBottle("bottle_of_automata", Effects.HERO_OF_THE_VILLAGE, 5, Effects.MINING_FATIGUE, 2, "auto");
	public static final Item BOTTLE_OF_ALCHEMICA = new MagicBottle("bottle_of_alchemica", Effects.RESISTANCE, 3, Effects.WITHER, 2, "alchemy");
	public static final Item BOTTLE_OF_ANIMUS = new MagicBottle("bottle_of_animus", Effects.ABSORPTION, 4, Effects.WITHER, 2, "soul");
	public static final Item BOTTLE_OF_IMPETUS = new MagicBottle("bottle_of_impetus", Effects.STRENGTH, 4, Effects.WEAKNESS, 4, "attack");
	public static final Item VAMPIRE_BLOOD = new VampireBlood("vampire_blood", Rarity.COMMON, 10, 1, 0.25f, 1, 0.9f);
	public static final Item HIGHER_VAMPIRE_BLOOD = new VampireBlood("higher_vampire_blood", Rarity.RARE, 20, 3, 0.35f, 4, 0.75f);
	
	// register raw mats
	public static final Item CINNABAR_FRAGMET = new ItemBase("cinnabar_fragment");
	public static final Item SILVER_INGOT = new ItemBase("silver_ingot");
	public static final Item BOTTLE_OF_MERCURY = new ItemBase("bottle_of_mercury");
	public static final Item DRACONITE = new UnburnableItemRarity("draconite", Rarity.RARE);
	public static final Item PHOENIX_FEATHER = new ItemBaseRarity("phoenix_feather", Rarity.UNCOMMON);
	public static final Item ALCHEMICAL_RESIDUE = new ItemBase("alchemical_residue");
	public static final Item POTION_BUCKET = new ItemBase("potion_bucket");
	
	// register alchemical mats
	public static final Item COLD_IRON_INGOT = new ItemBase("cold_iron_ingot");
	public static final Item COLD_IRON_NUGGET = new ItemBase("cold_iron_nugget");
	public static final Item ORICHALCUM_INGOT = new ItemBaseRarity("orichalcum_ingot", Rarity.UNCOMMON);
	public static final Item ORICHALCUM_NUGGET = new ItemBaseRarity("orichalcum_nugget", Rarity.UNCOMMON);
	public static final Item CELESTIAL_IRON_INGOT = new ItemBaseRarity("celestial_iron_ingot", Rarity.UNCOMMON);
	public static final Item CELESTIAL_IRON_NUGGET = new ItemBaseRarity("celestial_iron_nugget", Rarity.UNCOMMON);
	// ingot can be used as an upgrade
	public static final Item ANCEPS_LUX_NUGGET = new ItemBaseRarity("anceps_lux_nugget", Rarity.UNCOMMON);
	public static final Item NEBU_NUGGET = new ItemBaseRarity("nebu_nugget", Rarity.UNCOMMON);
	public static final Item HIHIROKANE_NUGGET = new UnburnableItemRarity("hihirokane_nugget", Rarity.UNCOMMON);
	
	// register upgrade mats -- may need to be rewrote
	public static final Item HIHIROKANE_INGOT = new UnburnableItemRarity("hihirokane_ingot", Rarity.UNCOMMON);
	public static final Item ANCEPS_LUX_INGOT = new ItemBaseRarity("anceps_lux_ingot", Rarity.UNCOMMON);
	public static final Item NEBU_INGOT = new ItemBaseRarity("nebu_ingot", Rarity.UNCOMMON);
	public static final Item SUBSTANTIA_ALTUM = new ItemBaseStacksize("substantia_altum", 4);
	public static final Item SUBSTANTIA_LACTENTEM = new ItemBaseStacksize("substantia_lactentem", 4);
	
	// Transport upgrades
	public static final Item VALVE = new ItemBaseStacksize("valve", 16);
	public static final Item ELEMENTA_FILTER = new ItemBaseStacksize("elementa_filter", 16);
	public static final Item ITEM_FILTER = new ItemBaseStacksize("item_filter", 16);
	public static final Item LIQUID_FILTER = new ItemBaseStacksize("liquid_filter", 16);
	public static final Item CURSED_SILK = new ItemBase("cursed_silk");
	
	// register tools and accessories (curios) items
	public static final Item SILVER_ARROW = new SilverArrow("silver_arrow");
	public static final Item COLD_IRON_ARROW = new ColdIronArrow("cold_iron_arrow");
	
	// register misc items
	public static final Item DYE_BASE = new ItemBase("dye_base");
	public static final Item FLAMING_PEARL = new UnburnableItem("flaming_pearl");
	public static final Item OLD_KEY = new ItemBaseRarityStacksize("old_key", Rarity.RARE, 1);
	public static final Item BANDIT_BOOKMARK = new ItemBaseRarityStacksize("bandit_bookmark", Rarity.RARE, 1);
	public static final Item SPELL_PAPER = new ItemBaseStacksize("spell_paper", 16);
	public static final Item NETHERITE_HORSE_ARMOR = new LEHorseArmor("netherite_horse_armor", 15, "netherite");
	
	// register research book
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> regItems) {
		try {
			for (Field f : LEItems.class.getDeclaredFields()) {
				Object obj = f.get(null);
				if (obj instanceof Item) {
					regItems.getRegistry().register((Item) obj);
				}
			}
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
}
