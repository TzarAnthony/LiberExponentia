package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.util.LEToolMaterial;
import net.minecraft.item.Rarity;
import net.minecraft.item.SwordItem;

public class LESwordUnburnable extends SwordItem {
    public LESwordUnburnable(String name, LEToolMaterial tier, Rarity rare) {
        super(tier, 3, -2.4F, new Properties().group(LiberExponentia.TAB).rarity(rare).func_234689_a_());
        this.setRegistryName(name);
    }
}
