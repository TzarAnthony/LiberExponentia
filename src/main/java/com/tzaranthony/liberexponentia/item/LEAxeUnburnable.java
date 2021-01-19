package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.util.LEToolMaterial;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Rarity;

public class LEAxeUnburnable extends AxeItem {
    public LEAxeUnburnable(String name, LEToolMaterial tier, Rarity rare) {
        super(tier, 6, -3.0F, new Properties().group(LiberExponentia.TAB).rarity(rare).func_234689_a_());
        this.setRegistryName(name);
    }
}
