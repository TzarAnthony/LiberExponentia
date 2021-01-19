package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.util.LEToolMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class LEAxe extends AxeItem {
    public LEAxe(String name, LEToolMaterial tier, Rarity rare) {
        super(tier, 6, -3.0F, new Item.Properties().group(LiberExponentia.TAB).rarity(rare));
        this.setRegistryName(name);
    }
}
