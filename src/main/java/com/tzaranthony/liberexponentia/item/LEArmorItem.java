package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class LEArmorItem extends ArmorItem {
    public LEArmorItem(String name, IArmorMaterial materialIn, EquipmentSlotType slot, Rarity rare) {
        super(materialIn, slot, new Item.Properties().group(LiberExponentia.TAB).rarity(rare));
        this.setRegistryName(name);
    }
}
