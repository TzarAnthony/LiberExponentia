package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.util.LEToolMaterial;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Rarity;

public class LEPickaxeUnburnable extends PickaxeItem {
    public LEPickaxeUnburnable(String name, LEToolMaterial tier, Rarity rare) {
        super(tier, 1, -2.8F, new Properties().group(LiberExponentia.TAB).rarity(rare).func_234689_a_());
        this.setRegistryName(name);
    }
}
