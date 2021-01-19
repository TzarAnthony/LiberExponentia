package com.tzaranthony.liberexponentia.util;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum LEToolMaterial implements IItemTier {
    // basic
    SILVER(2, 195, 9.5F, 1.0F, 22, () -> {
        return Ingredient.fromItems(LEItems.SILVER_INGOT.getItem());
    }),
    COLD_IRON(4, 1811, 9.5F, 3.5F, 22, () -> {
        return Ingredient.fromItems(LEItems.COLD_IRON_INGOT.getItem());
    }),
    // intermediate
    HIHIROKANE(6, 5863, 15.0F, 9.5F, 29, () -> {
        return Ingredient.fromItems(LEItems.HIHIROKANE_INGOT.getItem());
    }),
    ANCEPS_LUX(6, 4971, 12.0F, 6.5F, 29, () -> {
        return Ingredient.fromItems(LEItems.ANCEPS_LUX_INGOT.getItem());
    }),
    ORICHALCUM(6, 5863, 10.0F, 7.5F, 37, () -> {
        return Ingredient.fromItems(LEItems.ORICHALCUM_INGOT.getItem());
    }),
    UNDEAD(6, 5863, 10.0F, 10.0F, 29, () -> {
        return Ingredient.fromItems(LEItems.CURSED_SILVER_INGOT.getItem());
    }),
    VOID(6, 5863, 10.0F, 8.0F, 37, () -> {
        return Ingredient.fromItems(LEItems.VOID_INGOT.getItem());
    }),
    AUTOMATA(7, 5863, 10.0F, 8.0F, 29, () -> {
        return Ingredient.fromItems(LEItems.FORGED_STEEL_INGOT.getItem());
    }),
    // adv items
    CELESTIAL_STEEL(7, 4031, 15.0F, 13.5F, 41, () -> {
        return Ingredient.fromItems(LEItems.CELESTIAL_STEEL_INGOT.getItem());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    LEToolMaterial(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
