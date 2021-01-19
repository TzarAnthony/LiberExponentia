package com.tzaranthony.liberexponentia.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class MagicalFood extends Item {
    public String magicType;
    public int restoration;
    public int heartIncrease;

    public MagicalFood(Properties properties, String magicType, int restoration) {
        super(properties);
        this.setMagicType(magicType);
        this.setRestoration(restoration);
    }

    public String getMagicType() {
        return magicType;
    }

    public void setMagicType(String magicType) {
        this.magicType = magicType;
    }

    public int getRestoration() {
        return restoration;
    }

    public void setRestoration(int restoration) {
        this.restoration = restoration;
    }

    // drink stuff
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    public SoundEvent getDrinkSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }

    public SoundEvent getEatSound() {
        return SoundEvents.ENTITY_GENERIC_DRINK;
    }
}
