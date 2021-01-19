package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.util.LEToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;

public class LEShovel extends ShovelItem {
    public LEShovel(String name, LEToolMaterial tier, Rarity rare) {
        super(tier, 1.5F, -3.0F, new Item.Properties().group(LiberExponentia.TAB).rarity(rare));
        this.setRegistryName(name);
    }
}
