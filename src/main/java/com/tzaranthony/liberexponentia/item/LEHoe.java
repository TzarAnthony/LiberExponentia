package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.util.LEToolMaterial;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class LEHoe extends HoeItem {
    public LEHoe(String name, LEToolMaterial tier, Rarity rare) {
        super(tier, (int) (0 - tier.getAttackDamage()), 0.0F, new Item.Properties().group(LiberExponentia.TAB).rarity(rare));
        this.setRegistryName(name);
    }
}
