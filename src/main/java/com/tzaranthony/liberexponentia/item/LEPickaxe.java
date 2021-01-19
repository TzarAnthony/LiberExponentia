package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.util.LEToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;

public class LEPickaxe extends PickaxeItem {
    public LEPickaxe(String name, LEToolMaterial tier, Rarity rare) {
        super(tier, 1, -2.8F, new Item.Properties().group(LiberExponentia.TAB).rarity(rare));
        this.setRegistryName(name);
    }
}
