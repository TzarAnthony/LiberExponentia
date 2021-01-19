package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.util.LEToolMaterial;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Rarity;

public class LEHoeUnburnable extends HoeItem {
    public LEHoeUnburnable(String name, LEToolMaterial tier, Rarity rare) {
        super(tier, (int) (0 - tier.getAttackDamage()), 0.0F, new Properties().group(LiberExponentia.TAB).rarity(rare).func_234689_a_());
        this.setRegistryName(name);
    }
}
