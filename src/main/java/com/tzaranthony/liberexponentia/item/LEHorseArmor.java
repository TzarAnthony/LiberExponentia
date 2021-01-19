package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.HorseArmorItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class LEHorseArmor extends HorseArmorItem {

    public LEHorseArmor(String name, int protection, String texture) {
        super(protection, new ResourceLocation(LiberExponentia.MOD_ID + ":textures/entity/horse/armor/horse_armor_" + texture + ".png"),
                new Item.Properties()
                        .group(LiberExponentia.TAB)
                        .maxStackSize(1));
        this.setRegistryName(name);
    }
}
