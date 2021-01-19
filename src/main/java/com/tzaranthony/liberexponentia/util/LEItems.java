package com.tzaranthony.liberexponentia.util;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.item.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

import java.lang.reflect.Field;

@Mod.EventBusSubscriber(modid = LiberExponentia.MOD_ID, bus = Bus.MOD)
public class LEItems {

    // register magical food
    public static final Item NYMPHA_BERRIES = new NymphaBerries("nympha_berries");
    public static final Item ELiXIR_OF_LIFE = new LifeBottle("elixir_of_life");
    //	public static final Item BOTTLE_OF_IGNI = new MagicBottle("bottle_of_igni", Effects.FIRE_RESISTANCE, 0, Effects.POISON, 1, "fire");
//	public static final Item BOTTLE_OF_AQUA = new MagicBottle("bottle_of_aqua", Effects.WATER_BREATHING, 0, Effects.NAUSEA, 1, "water");
//	public static final Item BOTTLE_OF_TERRA = new MagicBottle("bottle_of_terra", Effects.RESISTANCE, 1, Effects.MINING_FATIGUE, 1, "earth");
//	public static final Item BOTTLE_OF_CAELUM = new MagicBottle("bottle_of_caelum", Effects.SLOW_FALLING, 0, Effects.LEVITATION, 0, "air");
//	public static final Item BOTTLE_OF_FULGUR = new MagicBottle("bottle_of_fulgur", Effects.SPEED, 3, Effects.SLOWNESS, 2, "electric");
//	public static final Item BOTTLE_OF_MENS = new MagicBottle("bottle_of_mens", Effects.HERO_OF_THE_VILLAGE, 4, Effects.BAD_OMEN, 5, "mind");
    public static final Item VAMPIRE_BLOOD = new VampireBlood("vampire_blood", Rarity.COMMON, 10, 1, 0.25f, 1, 0.9f);
    public static final Item HIGHER_VAMPIRE_BLOOD = new VampireBlood("higher_vampire_blood", Rarity.RARE, 20, 3, 0.35f, 4, 0.75f);

    // register raw mats
    public static final Item CINNABAR_FRAGMENT = new LEItemBase("cinnabar_fragment");
    public static final Item SILVER_INGOT = new LEItemBase("silver_ingot");
    public static final Item SILVER_NUGGET = new LEItemBase("silver_nugget");
    public static final Item BOTTLE_OF_MERCURY = new LEItemBase("bottle_of_mercury");
    public static final Item DRACONITE = new UnburnableItemRarity("draconite", Rarity.RARE);
    public static final Item PHOENIX_FEATHER = new LEItemBaseRarity("phoenix_feather", Rarity.UNCOMMON);
    public static final Item ALCHEMICAL_RESIDUE = new LEItemBase("alchemical_residue");

    // register alchemical mats
    public static final Item COLD_IRON_INGOT = new LEItemBase("cold_iron_ingot");
    public static final Item COLD_IRON_NUGGET = new LEItemBase("cold_iron_nugget");
    public static final Item NEBU_INGOT = new LEItemBaseRarity("nebu_ingot", Rarity.UNCOMMON);
    public static final Item NEBU_NUGGET = new LEItemBaseRarity("nebu_nugget", Rarity.UNCOMMON);
    public static final Item ORICHALCUM_INGOT = new LEItemBaseRarity("orichalcum_ingot", Rarity.UNCOMMON);
    public static final Item ORICHALCUM_NUGGET = new LEItemBaseRarity("orichalcum_nugget", Rarity.UNCOMMON);
    public static final Item CURSED_SILVER_INGOT = new LEItemBaseRarity("cursed_silver_ingot", Rarity.UNCOMMON);
    public static final Item CURSED_SILVER_NUGGET = new LEItemBaseRarity("cursed_silver_nugget", Rarity.UNCOMMON);
    public static final Item ANCEPS_LUX_INGOT = new UnburnableItemRarity("anceps_lux_ingot", Rarity.UNCOMMON);
    public static final Item ANCEPS_LUX_NUGGET = new UnburnableItemRarity("anceps_lux_nugget", Rarity.UNCOMMON);
    public static final Item HIHIROKANE_INGOT = new UnburnableItemRarity("hihirokane_ingot", Rarity.UNCOMMON);
    public static final Item HIHIROKANE_NUGGET = new UnburnableItemRarity("hihirokane_nugget", Rarity.UNCOMMON);
    public static final Item VOID_INGOT = new LEItemBaseRarity("void_ingot", Rarity.UNCOMMON);
    public static final Item VOID_NUGGET = new LEItemBaseRarity("void_nugget", Rarity.UNCOMMON);
    public static final Item FORGED_STEEL_INGOT = new LEItemBaseRarity("forged_steel_ingot", Rarity.UNCOMMON);
    public static final Item FORGED_STEEL_NUGGET = new LEItemBaseRarity("forged_steel_nugget", Rarity.UNCOMMON);
    public static final Item CELESTIAL_STEEL_INGOT = new LEItemBaseRarity("celestial_steel_ingot", Rarity.RARE);
    public static final Item CELESTIAL_STEEL_NUGGET = new LEItemBaseRarity("celestial_steel_nugget", Rarity.RARE);

    // register upgrade mats -- may need to be rewrote
    public static final Item SUBSTANTIA_ALTUM = new LEItemBaseStacksize("substantia_altum", 4);
    public static final Item SUBSTANTIA_LACTENTEM = new LEItemBaseStacksize("substantia_lactentem", 4);

    // Transport upgrades
    public static final Item VALVE = new LEItemBaseStacksize("valve", 16);
    public static final Item ELEMENTA_FILTER = new LEItemBaseStacksize("elementa_filter", 16);
    public static final Item ITEM_FILTER = new LEItemBaseStacksize("item_filter", 16);
    public static final Item LIQUID_FILTER = new LEItemBaseStacksize("liquid_filter", 16);
    public static final Item CURSED_SILK = new LEItemBase("cursed_silk");

    // register misc items
    public static final Item DYE_BASE = new LEItemBase("dye_base");
    public static final Item FLAMING_PEARL = new UnburnableItem("flaming_pearl");
    public static final Item OLD_KEY = new LEItemBaseRarityStacksize("old_key", Rarity.RARE, 1);
    public static final Item BANDIT_BOOKMARK = new LEItemBaseRarityStacksize("bandit_bookmark", Rarity.RARE, 1);
    public static final Item SPELL_PAPER = new LEItemBaseStacksize("spell_paper", 16);
    public static final Item NETHERITE_HORSE_ARMOR = new LEHorseArmor("netherite_horse_armor", 15, "netherite");

    // Buckets
    public static final Item MUNDANE_BUCKET = new LEBucket("mundane_bucket", LEFluids.MUNDANE);
    public static final Item THICK_BUCKET = new LEBucket("thick_bucket", LEFluids.THICK);
    public static final Item AWKWARD_BUCKET = new LEBucket("awkward_bucket", LEFluids.AWKWARD);
    public static final Item NIGHT_VISION_BUCKET = new LEBucket("night_vision_bucket", LEFluids.NIGHT_VISION);
    public static final Item LONG_NIGHT_VISION_BUCKET = new LEBucket("long_night_vision_bucket", LEFluids.LONG_NIGHT_VISION);
    public static final Item INVISIBILITY_BUCKET = new LEBucket("invisibility_bucket", LEFluids.INVISIBILITY);
    public static final Item LONG_INVISIBILITY_BUCKET = new LEBucket("long_invisibility_bucket", LEFluids.LONG_INVISIBILITY);
    public static final Item LEAPING_BUCKET = new LEBucket("leaping_bucket", LEFluids.LEAPING);
    public static final Item LONG_LEAPING_BUCKET = new LEBucket("long_leaping_bucket", LEFluids.LONG_LEAPING);
    public static final Item STRONG_LEAPING_BUCKET = new LEBucket("strong_leaping_bucket", LEFluids.STRONG_LEAPING);
    public static final Item FIRE_RESISTANCE_BUCKET = new LEBucket("fire_resistance_bucket", LEFluids.FIRE_RESISTANCE);
    public static final Item LONG_FIRE_RESISTANCE_BUCKET = new LEBucket("long_fire_resistance_bucket", LEFluids.LONG_FIRE_RESISTANCE);
    public static final Item SWIFTNESS_BUCKET = new LEBucket("swiftness_bucket", LEFluids.SWIFTNESS);
    public static final Item LONG_SWIFTNESS_BUCKET = new LEBucket("long_swiftness_bucket", LEFluids.LONG_SWIFTNESS);
    public static final Item STRONG_SWIFTNESS_BUCKET = new LEBucket("strong_swiftness_bucket", LEFluids.STRONG_SWIFTNESS);
    public static final Item SLOWNESS_BUCKET = new LEBucket("slowness_bucket", LEFluids.SLOWNESS);
    public static final Item LONG_SLOWNESS_BUCKET = new LEBucket("long_slowness_bucket", LEFluids.LONG_SLOWNESS);
    public static final Item STRONG_SLOWNESS_BUCKET = new LEBucket("strong_slowness_bucket", LEFluids.STRONG_SLOWNESS);
    public static final Item TURTLE_MASTER_BUCKET = new LEBucket("turtle_master_bucket", LEFluids.TURTLE_MASTER);
    public static final Item LONG_TURTLE_MASTER_BUCKET = new LEBucket("long_turtle_master_bucket", LEFluids.LONG_TURTLE_MASTER);
    public static final Item STRONG_TURTLE_MASTER_BUCKET = new LEBucket("strong_turtle_master_bucket", LEFluids.STRONG_TURTLE_MASTER);
    public static final Item WATER_BREATHING_BUCKET = new LEBucket("water_breathing_bucket", LEFluids.WATER_BREATHING);
    public static final Item LONG_WATER_BREATHING_BUCKET = new LEBucket("long_water_breathing_bucket", LEFluids.LONG_WATER_BREATHING);
    public static final Item HEALING_BUCKET = new LEBucket("healing_bucket", LEFluids.HEALING);
    public static final Item STRONG_HEALING_BUCKET = new LEBucket("strong_healing_bucket", LEFluids.STRONG_HEALING);
    public static final Item HARMING_BUCKET = new LEBucket("harming_bucket", LEFluids.HARMING);
    public static final Item STRONG_HARMING_BUCKET = new LEBucket("strong_harming_bucket", LEFluids.STRONG_HARMING);
    public static final Item POISON_BUCKET = new LEBucket("poison_bucket", LEFluids.POISON);
    public static final Item LONG_POISON_BUCKET = new LEBucket("long_poison_bucket", LEFluids.LONG_POISON);
    public static final Item STRONG_POISON_BUCKET = new LEBucket("strong_poison_bucket", LEFluids.STRONG_POISON);
    public static final Item REGENERATION_BUCKET = new LEBucket("regeneration_bucket", LEFluids.REGENERATION);
    public static final Item LONG_REGENERATION_BUCKET = new LEBucket("long_regeneration_bucket", LEFluids.LONG_REGENERATION);
    public static final Item STRONG_REGENERATION_BUCKET = new LEBucket("strong_regeneration_bucket", LEFluids.STRONG_REGENERATION);
    public static final Item STRENGTH_BUCKET = new LEBucket("strength_bucket", LEFluids.STRENGTH);
    public static final Item LONG_STRENGTH_BUCKET = new LEBucket("long_strength_bucket", LEFluids.LONG_STRENGTH);
    public static final Item STRONG_STRENGTH_BUCKET = new LEBucket("strong_strength_bucket", LEFluids.STRONG_STRENGTH);
    public static final Item WEAKNESS_BUCKET = new LEBucket("weakness_bucket", LEFluids.WEAKNESS);
    public static final Item LONG_WEAKNESS_BUCKET = new LEBucket("long_weakness_bucket", LEFluids.LONG_WEAKNESS);
    public static final Item LUCK_BUCKET = new LEBucket("luck_bucket", LEFluids.LUCK);
    public static final Item SLOW_FALLING_BUCKET = new LEBucket("slow_falling_bucket", LEFluids.SLOW_FALLING);
    public static final Item LONG_SLOW_FALLING_BUCKET = new LEBucket("long_slow_falling_bucket", LEFluids.LONG_SLOW_FALLING);


    // Armor and Tools
    // Silver
    public static final Item SILVER_HELMET = new LEArmorItem("silver_helmet", LEArmorMaterial.SILVER, EquipmentSlotType.HEAD, Rarity.COMMON);
    public static final Item SILVER_CHESTPLATE = new LEArmorItem("silver_chestplate", LEArmorMaterial.SILVER, EquipmentSlotType.CHEST, Rarity.COMMON);
    public static final Item SILVER_LEGGINGS = new LEArmorItem("silver_leggings", LEArmorMaterial.SILVER, EquipmentSlotType.LEGS, Rarity.COMMON);
    public static final Item SILVER_BOOTS = new LEArmorItem("silver_boots", LEArmorMaterial.SILVER, EquipmentSlotType.FEET, Rarity.COMMON);
    public static final Item SILVER_AXE = new LEAxe("silver_axe", LEToolMaterial.SILVER, Rarity.COMMON);
    public static final Item SILVER_HOE = new LEHoe("silver_hoe", LEToolMaterial.SILVER, Rarity.COMMON);
    public static final Item SILVER_PICKAXE = new LEPickaxe("silver_pickaxe", LEToolMaterial.SILVER, Rarity.COMMON);
    public static final Item SILVER_SHOVEL = new LEShovel("silver_shovel", LEToolMaterial.SILVER, Rarity.COMMON);
    public static final Item SILVER_SWORD = new LESword("silver_sword", LEToolMaterial.SILVER, Rarity.COMMON);

    // Cold Iron
    public static final Item COLD_IRON_HELMET = new LEArmorItem("cold_iron_helmet", LEArmorMaterial.COLD_IRON, EquipmentSlotType.HEAD, Rarity.COMMON);
    public static final Item COLD_IRON_CHESTPLATE = new LEArmorItem("cold_iron_chestplate", LEArmorMaterial.COLD_IRON, EquipmentSlotType.CHEST, Rarity.COMMON);
    public static final Item COLD_IRON_LEGGINGS = new LEArmorItem("cold_iron_leggings", LEArmorMaterial.COLD_IRON, EquipmentSlotType.LEGS, Rarity.COMMON);
    public static final Item COLD_IRON_BOOTS = new LEArmorItem("cold_iron_boots", LEArmorMaterial.COLD_IRON, EquipmentSlotType.FEET, Rarity.COMMON);
    public static final Item COLD_IRON_AXE = new LEAxe("cold_iron_axe", LEToolMaterial.COLD_IRON, Rarity.COMMON);
    public static final Item COLD_IRON_HOE = new LEHoe("cold_iron_hoe", LEToolMaterial.COLD_IRON, Rarity.COMMON);
    public static final Item COLD_IRON_PICKAXE = new LEPickaxe("cold_iron_pickaxe", LEToolMaterial.COLD_IRON, Rarity.COMMON);
    public static final Item COLD_IRON_SHOVEL = new LEShovel("cold_iron_shovel", LEToolMaterial.COLD_IRON, Rarity.COMMON);
    public static final Item COLD_IRON_SWORD = new LESword("cold_iron_sword", LEToolMaterial.COLD_IRON, Rarity.COMMON);

    // Hihirokane
    public static final Item HIHIROKANE_HELMET = new LEArmorItemUnburnable("hihirokane_helmet", LEArmorMaterial.HIHIROKANE, EquipmentSlotType.HEAD, Rarity.UNCOMMON);
    public static final Item HIHIROKANE_CHESTPLATE = new LEArmorItemUnburnable("hihirokane_chestplate", LEArmorMaterial.HIHIROKANE, EquipmentSlotType.CHEST, Rarity.UNCOMMON);
    public static final Item HIHIROKANE_LEGGINGS = new LEArmorItemUnburnable("hihirokane_leggings", LEArmorMaterial.HIHIROKANE, EquipmentSlotType.LEGS, Rarity.UNCOMMON);
    public static final Item HIHIROKANE_BOOTS = new LEArmorItemUnburnable("hihirokane_boots", LEArmorMaterial.HIHIROKANE, EquipmentSlotType.FEET, Rarity.UNCOMMON);
    public static final Item HIHIROKANE_AXE = new LEAxeUnburnable("hihirokane_axe", LEToolMaterial.HIHIROKANE, Rarity.UNCOMMON);
    public static final Item HIHIROKANE_HOE = new LEHoeUnburnable("hihirokane_hoe", LEToolMaterial.HIHIROKANE, Rarity.UNCOMMON);
    public static final Item HIHIROKANE_PICKAXE = new LEPickaxeUnburnable("hihirokane_pickaxe", LEToolMaterial.HIHIROKANE, Rarity.UNCOMMON);
    public static final Item HIHIROKANE_SHOVEL = new LEShovelUnburnable("hihirokane_shovel", LEToolMaterial.HIHIROKANE, Rarity.UNCOMMON);
    public static final Item HIHIROKANE_SWORD = new LESwordUnburnable("hihirokane_sword", LEToolMaterial.HIHIROKANE, Rarity.UNCOMMON);

    // Lux
    public static final Item ANCEPS_LUX_HELMET = new LEArmorItemUnburnable("anceps_lux_helmet", LEArmorMaterial.ANCEPS_LUX, EquipmentSlotType.HEAD, Rarity.UNCOMMON);
    public static final Item ANCEPS_LUX_CHESTPLATE = new LEArmorItemUnburnable("anceps_lux_chestplate", LEArmorMaterial.ANCEPS_LUX, EquipmentSlotType.CHEST, Rarity.UNCOMMON);
    public static final Item ANCEPS_LUX_LEGGINGS = new LEArmorItemUnburnable("anceps_lux_leggings", LEArmorMaterial.ANCEPS_LUX, EquipmentSlotType.LEGS, Rarity.UNCOMMON);
    public static final Item ANCEPS_LUX_BOOTS = new LEArmorItemUnburnable("anceps_lux_boots", LEArmorMaterial.ANCEPS_LUX, EquipmentSlotType.FEET, Rarity.UNCOMMON);
    public static final Item ANCEPS_LUX_AXE = new LEAxeUnburnable("anceps_lux_axe", LEToolMaterial.ANCEPS_LUX, Rarity.UNCOMMON);
    public static final Item ANCEPS_LUX_HOE = new LEHoeUnburnable("anceps_lux_hoe", LEToolMaterial.ANCEPS_LUX, Rarity.UNCOMMON);
    public static final Item ANCEPS_LUX_PICKAXE = new LEPickaxeUnburnable("anceps_lux_pickaxe", LEToolMaterial.ANCEPS_LUX, Rarity.UNCOMMON);
    public static final Item ANCEPS_LUX_SHOVEL = new LEShovelUnburnable("anceps_lux_shovel", LEToolMaterial.ANCEPS_LUX, Rarity.UNCOMMON);
    public static final Item ANCEPS_LUX_SWORD = new LESwordUnburnable("anceps_lux_sword", LEToolMaterial.ANCEPS_LUX, Rarity.UNCOMMON);

    // Orichalcum
    public static final Item ORICHALCUM_HELMET = new LEArmorItem("orichalcum_helmet", LEArmorMaterial.ORICHALCUM, EquipmentSlotType.HEAD, Rarity.UNCOMMON);
    public static final Item ORICHALCUM_CHESTPLATE = new LEArmorItem("orichalcum_chestplate", LEArmorMaterial.ORICHALCUM, EquipmentSlotType.CHEST, Rarity.UNCOMMON);
    public static final Item ORICHALCUM_LEGGINGS = new LEArmorItem("orichalcum_leggings", LEArmorMaterial.ORICHALCUM, EquipmentSlotType.LEGS, Rarity.UNCOMMON);
    public static final Item ORICHALCUM_BOOTS = new LEArmorItem("orichalcum_boots", LEArmorMaterial.ORICHALCUM, EquipmentSlotType.FEET, Rarity.UNCOMMON);
    public static final Item ORICHALCUM_AXE = new LEAxe("orichalcum_axe", LEToolMaterial.ORICHALCUM, Rarity.UNCOMMON);
    public static final Item ORICHALCUM_HOE = new LEHoe("orichalcum_hoe", LEToolMaterial.ORICHALCUM, Rarity.UNCOMMON);
    public static final Item ORICHALCUM_PICKAXE = new LEPickaxe("orichalcum_pickaxe", LEToolMaterial.ORICHALCUM, Rarity.UNCOMMON);
    public static final Item ORICHALCUM_SHOVEL = new LEShovel("orichalcum_shovel", LEToolMaterial.ORICHALCUM, Rarity.UNCOMMON);
    public static final Item ORICHALCUM_SWORD = new LESword("orichalcum_sword", LEToolMaterial.ORICHALCUM, Rarity.UNCOMMON);

    // Undead
    public static final Item UNDEAD_HELMET = new LEArmorItem("undead_helmet", LEArmorMaterial.UNDEAD, EquipmentSlotType.HEAD, Rarity.UNCOMMON);
    public static final Item UNDEAD_CHESTPLATE = new LEArmorItem("undead_chestplate", LEArmorMaterial.UNDEAD, EquipmentSlotType.CHEST, Rarity.UNCOMMON);
    public static final Item UNDEAD_LEGGINGS = new LEArmorItem("undead_leggings", LEArmorMaterial.UNDEAD, EquipmentSlotType.LEGS, Rarity.UNCOMMON);
    public static final Item UNDEAD_BOOTS = new LEArmorItem("undead_boots", LEArmorMaterial.UNDEAD, EquipmentSlotType.FEET, Rarity.UNCOMMON);
    public static final Item UNDEAD_AXE = new LEAxe("undead_axe", LEToolMaterial.UNDEAD, Rarity.UNCOMMON);
    public static final Item UNDEAD_HOE = new LEHoe("undead_hoe", LEToolMaterial.UNDEAD, Rarity.UNCOMMON);
    public static final Item UNDEAD_PICKAXE = new LEPickaxe("undead_pickaxe", LEToolMaterial.UNDEAD, Rarity.UNCOMMON);
    public static final Item UNDEAD_SHOVEL = new LEShovel("undead_shovel", LEToolMaterial.UNDEAD, Rarity.UNCOMMON);
    public static final Item UNDEAD_SWORD = new LESword("undead_sword", LEToolMaterial.UNDEAD, Rarity.UNCOMMON);

    // Void
    public static final Item VOID_HELMET = new LEArmorItem("void_helmet", LEArmorMaterial.VOID, EquipmentSlotType.HEAD, Rarity.UNCOMMON);
    public static final Item VOID_CHESTPLATE = new LEArmorItem("void_chestplate", LEArmorMaterial.VOID, EquipmentSlotType.CHEST, Rarity.UNCOMMON);
    public static final Item VOID_LEGGINGS = new LEArmorItem("void_leggings", LEArmorMaterial.VOID, EquipmentSlotType.LEGS, Rarity.UNCOMMON);
    public static final Item VOID_BOOTS = new LEArmorItem("void_boots", LEArmorMaterial.VOID, EquipmentSlotType.FEET, Rarity.UNCOMMON);
    public static final Item VOID_AXE = new LEAxe("void_axe", LEToolMaterial.VOID, Rarity.UNCOMMON);
    public static final Item VOID_HOE = new LEHoe("void_hoe", LEToolMaterial.VOID, Rarity.UNCOMMON);
    public static final Item VOID_PICKAXE = new LEPickaxe("void_pickaxe", LEToolMaterial.VOID, Rarity.UNCOMMON);
    public static final Item VOID_SHOVEL = new LEShovel("void_shovel", LEToolMaterial.VOID, Rarity.UNCOMMON);
    public static final Item VOID_SWORD = new LESword("void_sword", LEToolMaterial.VOID, Rarity.UNCOMMON);

    // Automaton
    public static final Item AUTOMATON_HELMET = new LEArmorItem("automaton_helmet", LEArmorMaterial.AUTOMATON, EquipmentSlotType.HEAD, Rarity.UNCOMMON);
    public static final Item AUTOMATON_CHESTPLATE = new LEArmorItem("automaton_chestplate", LEArmorMaterial.AUTOMATON, EquipmentSlotType.CHEST, Rarity.UNCOMMON);
    public static final Item AUTOMATON_LEGGINGS = new LEArmorItem("automaton_leggings", LEArmorMaterial.AUTOMATON, EquipmentSlotType.LEGS, Rarity.UNCOMMON);
    public static final Item AUTOMATON_BOOTS = new LEArmorItem("automaton_boots", LEArmorMaterial.AUTOMATON, EquipmentSlotType.FEET, Rarity.UNCOMMON);
    public static final Item AUTOMATA_AXE = new LEAxe("automata_axe", LEToolMaterial.AUTOMATA, Rarity.UNCOMMON);
    public static final Item AUTOMATA_HOE = new LEHoe("automata_hoe", LEToolMaterial.AUTOMATA, Rarity.UNCOMMON);
    public static final Item AUTOMATA_PICKAXE = new LEPickaxe("automata_pickaxe", LEToolMaterial.AUTOMATA, Rarity.UNCOMMON);
    public static final Item AUTOMATA_SHOVEL = new LEShovel("automata_shovel", LEToolMaterial.AUTOMATA, Rarity.UNCOMMON);
    public static final Item AUTOMATA_SWORD = new LESword("automata_sword", LEToolMaterial.AUTOMATA, Rarity.UNCOMMON);

    // Celestial Steel
    public static final Item CELESTIAL_STEEL_HELMET = new LEArmorItem("celestial_steel_helmet", LEArmorMaterial.CELESTIAL_STEEL, EquipmentSlotType.HEAD, Rarity.RARE);
    public static final Item CELESTIAL_STEEL_CHESTPLATE = new LEArmorItem("celestial_steel_chestplate", LEArmorMaterial.CELESTIAL_STEEL, EquipmentSlotType.CHEST, Rarity.RARE);
    public static final Item CELESTIAL_STEEL_LEGGINGS = new LEArmorItem("celestial_steel_leggings", LEArmorMaterial.CELESTIAL_STEEL, EquipmentSlotType.LEGS, Rarity.RARE);
    public static final Item CELESTIAL_STEEL_BOOTS = new LEArmorItem("celestial_steel_boots", LEArmorMaterial.CELESTIAL_STEEL, EquipmentSlotType.FEET, Rarity.RARE);
    public static final Item CELESTIAL_STEEL_AXE = new LEAxe("celestial_steel_axe", LEToolMaterial.CELESTIAL_STEEL, Rarity.RARE);
    public static final Item CELESTIAL_STEEL_HOE = new LEHoe("celestial_steel_hoe", LEToolMaterial.CELESTIAL_STEEL, Rarity.RARE);
    public static final Item CELESTIAL_STEEL_PICKAXE = new LEPickaxe("celestial_steel_pickaxe", LEToolMaterial.CELESTIAL_STEEL, Rarity.RARE);
    public static final Item CELESTIAL_STEEL_SHOVEL = new LEShovel("celestial_steel_shovel", LEToolMaterial.CELESTIAL_STEEL, Rarity.RARE);
    public static final Item CELESTIAL_STEEL_SWORD = new LESword("celestial_steel_sword", LEToolMaterial.CELESTIAL_STEEL, Rarity.RARE);

    // register accessories (curios) items


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
