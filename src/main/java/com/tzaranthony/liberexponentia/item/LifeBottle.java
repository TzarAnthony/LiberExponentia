package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.Rarity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.stats.Stats;
import net.minecraft.world.World;

public class LifeBottle extends MagicalFood {

    public LifeBottle(String name) {
        super(new MagicalFood.Properties()
                        .group(LiberExponentia.TAB)
                        .rarity(Rarity.EPIC)
                        .containerItem(Items.GLASS_BOTTLE)
                        .maxStackSize(16)
                        .food(new Food.Builder()
                                .hunger(6)
                                .saturation(1.5f)
                                .effect(new EffectInstance(Effects.REGENERATION, 400, 3), 1.0F)
                                .effect(new EffectInstance(Effects.RESISTANCE, 200, 4), 1.0F)
                                .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 200, 1), 1.0F)
                                .effect(new EffectInstance(Effects.WATER_BREATHING, 200, 1), 1.0F)
                                .effect(new EffectInstance(Effects.NAUSEA, 200, 1), 1.0F)
                                .effect(new EffectInstance(Effects.WEAKNESS, 400, 4), 1.0F)
                                .effect(new EffectInstance(Effects.SLOWNESS, 200, 4), 1.0F)
                                .setAlwaysEdible()
                                .build())
                , "rand"
                , 400);
        this.setHeartIncrease(4);
        this.setRegistryName(name);
    }

    public int getHeartIncrease() {
        return heartIncrease;
    }

    public void setHeartIncrease(int heartIncrease) {
        this.heartIncrease = heartIncrease;
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        if (entityLiving instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity) entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, stack);
            serverplayerentity.addStat(Stats.ITEM_USED.get(this));
        }

//        if (!worldIn.isRemote) {
//            entityLiving.setHealth(entityLiving.getMaxHealth() + getHeartIncrease());
//        }

        if (stack.isEmpty()) {
            return new ItemStack(Items.GLASS_BOTTLE);
        } else {
            if (entityLiving instanceof PlayerEntity && !((PlayerEntity) entityLiving).abilities.isCreativeMode) {
                ItemStack itemstack = new ItemStack(Items.GLASS_BOTTLE);
                PlayerEntity playerentity = (PlayerEntity) entityLiving;
                if (!playerentity.inventory.addItemStackToInventory(itemstack)) {
                    playerentity.dropItem(itemstack, false);
                }
            }
            return stack;
        }
    }

}
