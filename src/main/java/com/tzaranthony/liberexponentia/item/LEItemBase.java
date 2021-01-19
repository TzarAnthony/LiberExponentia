package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.Item;

public class LEItemBase extends Item {

    public LEItemBase(String name) {
        super(new Item.Properties().group(LiberExponentia.TAB));
        this.setRegistryName(name);
    }
}
