package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.item.Food;
import net.minecraft.item.Rarity;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;

public class MagicBottle extends MagicalFood {

    public MagicBottle(String name, Effect goodEffect, int goodLevel, Effect badEffect, int badLevel, String magicType) {
        super(new MagicalFood.Properties()
                        .group(LiberExponentia.TAB)
                        .rarity(Rarity.UNCOMMON)
                        .food(new Food.Builder()
                                .hunger(0)
                                .saturation(0.0f)
                                .effect(new EffectInstance(goodEffect, 600, goodLevel), 0.025F)
                                .effect(new EffectInstance(badEffect, 400, badLevel), 0.025F)
                                .setAlwaysEdible()
                                .build())
                , magicType, 200);
        this.setRegistryName(name);
    }
}
