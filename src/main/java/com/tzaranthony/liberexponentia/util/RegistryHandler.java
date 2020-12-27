package com.tzaranthony.liberexponentia.util;

import com.tzaranthony.liberexponentia.Liber_Exponentia;

import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.util.SoundEvents;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Liber_Exponentia.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Liber_Exponentia.MOD_ID);
	
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
	}
	
	// Tools
		// Silver
	public static final RegistryObject<SwordItem> SILVER_SWORD = ITEMS.register("silver_sword", () ->
		new SwordItem(TAToolTier.SILVER, 5, -2.4F, new Item.Properties().group(Liber_Exponentia.TAB)));
	public static final RegistryObject<PickaxeItem> SILVER_PICKAXE = ITEMS.register("silver_pickaxe", () ->
		new PickaxeItem(TAToolTier.SILVER, 3, -2.8F, new Item.Properties().group(Liber_Exponentia.TAB)));
	public static final RegistryObject<AxeItem> SILVER_AXE = ITEMS.register("silver_axe", () ->
		new AxeItem(TAToolTier.SILVER, 8, -3.1F, new Item.Properties().group(Liber_Exponentia.TAB)));
	public static final RegistryObject<ShovelItem> SILVER_SHOVEL = ITEMS.register("silver_shovel", () ->
		new ShovelItem(TAToolTier.SILVER, 3, -3.0F, new Item.Properties().group(Liber_Exponentia.TAB)));
	public static final RegistryObject<HoeItem> SILVER_HOE = ITEMS.register("silver_hoe", () ->
		new HoeItem(TAToolTier.SILVER, 0, -1.0F, new Item.Properties().group(Liber_Exponentia.TAB)));
		// Cold Iron
		// Hihirokane
	
	
	
	// Armor Types
	public static TAArmorMaterial SILVER_ARMOR_MATERIAL = new LEArmorMaterial("silver", 14, new int[] {2, 4, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0);

	/* public static final 
	public static final RegistryObject<ArmorItem> SILVER_HELMET = ITEMS.register("silver_helmet", () ->
		new ArmorItem(TAArmorMaterial.SILVER, EquipmentSlotType.HEAD, new Item.Properties().group(Liber_Exponentia.TAB)));
	public static final RegistryObject<ArmorItem> SILVER_CHESTPLATE = ITEMS.register("silver_chestplate", () ->
		new ArmorItem(TAArmorMaterial.SILVER, EquipmentSlotType.CHEST, new Item.Properties().group(Liber_Exponentia.TAB)));
	public static final RegistryObject<ArmorItem> SILVER_LEGGINGS = ITEMS.register("silver_leggings", () ->
		new ArmorItem(TAArmorMaterial.SILVER, EquipmentSlotType.LEGS, new Item.Properties().group(Liber_Exponentia.TAB)));
	public static final RegistryObject<ArmorItem> SILVER_BOOTS = ITEMS.register("silver_boots", () ->
		new ArmorItem(TAArmorMaterial.SILVER, EquipmentSlotType.FEET, new Item.Properties().group(Liber_Exponentia.TAB)));
	
	
	SILVER(Liber_Exponentia.MOD_ID + ":silver", 14, new int[] {2, 4, 5, 2}, 25,
			 () -> {return Ingredient.fromItems(RegistryHandler.SILVER_INGOT.get()); });
	*/
	
	
	// Tool Set Function
	public static Item registerItem(ItemTier tier, int[] damageAry, ) {
		
	}
	
	
	// Block Function
	public static Block registerBlock(Block block, String name, BlockItem itemBlock) {
		block.set
	}
	
	
	
}