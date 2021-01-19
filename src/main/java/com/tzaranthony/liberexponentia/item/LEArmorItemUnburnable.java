package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Rarity;

public class LEArmorItemUnburnable extends ArmorItem {
    public LEArmorItemUnburnable(String name, IArmorMaterial materialIn, EquipmentSlotType slot, Rarity rare) {
        super(materialIn, slot, new Properties().group(LiberExponentia.TAB).rarity(rare).func_234689_a_());
        this.setRegistryName(name);
    }
}
