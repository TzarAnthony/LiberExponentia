package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.util.LEToolMaterial;
import net.minecraft.item.Rarity;
import net.minecraft.item.ShovelItem;

public class LEShovelUnburnable extends ShovelItem {
    public LEShovelUnburnable(String name, LEToolMaterial tier, Rarity rare) {
        super(tier, 1.5F, -3.0F, new Properties().group(LiberExponentia.TAB).rarity(rare).func_234689_a_());
        this.setRegistryName(name);
    }
}
