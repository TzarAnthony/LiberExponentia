package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.Item;

public class LEItemBaseStacksize extends Item {

    public LEItemBaseStacksize(String name, int stack) {
        super(new Item.Properties().group(LiberExponentia.TAB).maxStackSize(stack));
        this.setRegistryName(name);
    }
}
