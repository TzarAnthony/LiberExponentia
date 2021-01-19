package com.tzaranthony.liberexponentia.item;

import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;

public class LEBucket extends BucketItem {
    public LEBucket(String name, Fluid fluid) {
        super(fluid.delegate, new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(ItemGroup.MISC));
        this.setRegistryName(name);
    }
}
