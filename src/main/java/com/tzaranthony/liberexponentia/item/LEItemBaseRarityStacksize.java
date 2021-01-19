package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class LEItemBaseRarityStacksize extends Item {

    public LEItemBaseRarityStacksize(String name, Rarity rare, int stack) {
        super(new Item.Properties().group(LiberExponentia.TAB).rarity(rare).maxStackSize(stack));
        this.setRegistryName(name);
    }
}
