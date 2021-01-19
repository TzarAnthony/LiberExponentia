package com.tzaranthony.liberexponentia.util;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum LEArmorMaterial implements IArmorMaterial {
    // basic
    SILVER(LiberExponentia.MOD_ID + ":silver", 10, new int[]{2, 5, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            0.0F, 0.0F, () -> {
        return Ingredient.fromItems(LEItems.SILVER_INGOT);
    }),
    COLD_IRON(LiberExponentia.MOD_ID + ":cold_iron", 35, new int[]{3, 6, 8, 3}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            2.0F, 0.0F, () -> {
        return Ingredient.fromItems(LEItems.COLD_IRON_INGOT);
    }),
    // intermediate
    HIHIROKANE(LiberExponentia.MOD_ID + ":hihirokane", 57, new int[]{6, 9, 11, 6}, 32, SoundEvents.field_232681_Q_,
            5.0F, 0.2F, () -> {
        return Ingredient.fromItems(LEItems.HIHIROKANE_INGOT);
    }),
    ANCEPS_LUX(LiberExponentia.MOD_ID + ":anceps_lux", 52, new int[]{4, 7, 9, 4}, 32, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            2.0F, 0.0F, () -> {
        return Ingredient.fromItems(LEItems.ANCEPS_LUX_INGOT);
    }),
    ORICHALCUM(LiberExponentia.MOD_ID + ":orichalcum", 57, new int[]{6, 9, 11, 6}, 40, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
            4.0F, 0.2F, () -> {
        return Ingredient.fromItems(LEItems.ORICHALCUM_INGOT);
    }),
    UNDEAD(LiberExponentia.MOD_ID + ":undead", 57, new int[]{8, 11, 13, 7}, 32, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,
            4.0F, 0.2F, () -> {
        return Ingredient.fromItems(LEItems.CURSED_SILVER_INGOT);
    }),
    VOID(LiberExponentia.MOD_ID + ":void", 57, new int[]{5, 8, 10, 4}, 40, SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            4.0F, 0.0F, () -> {
        return Ingredient.fromItems(LEItems.VOID_INGOT);
    }),
    AUTOMATON(LiberExponentia.MOD_ID + ":automaton", 63, new int[]{6, 9, 11, 6}, 32, SoundEvents.field_232681_Q_,
            4.0F, 0.3F, () -> {
        return Ingredient.fromItems(LEItems.FORGED_STEEL_INGOT);
    }),
    // adv armor
    CELESTIAL_STEEL(LiberExponentia.MOD_ID + ":celestial_steel", 73, new int[]{7, 10, 13, 6}, 45, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            6.0F, 0.1F, () -> {
        return Ingredient.fromItems(LEItems.CELESTIAL_STEEL_INGOT);
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durability;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairMaterial;

    private LEArmorMaterial(String name, int durability, int[] damageReductionAmountArray, int enchantability,
                            SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> p_i231593_10_) {
        this.name = name;
        this.durability = durability;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = new LazyValue<>(p_i231593_10_);
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.durability;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.sound;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float func_230304_f_() {
        return this.knockbackResistance;
    }
}
