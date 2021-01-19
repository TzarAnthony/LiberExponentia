package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.stats.Stats;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class VampireBlood extends Item {

    public VampireBlood(String name, Rarity rare, int hunger, int potency, float probability, int negPotency, float negProbability) {
        super(new Item.Properties()
                .group(LiberExponentia.TAB)
                .rarity(rare)
                .containerItem(Items.GLASS_BOTTLE)
                .maxStackSize(16)
                .food(new Food.Builder()
                        .hunger(hunger)
                        .saturation(0.1f)
                        .effect(new EffectInstance(Effects.SPEED, 1200, potency), probability)
                        .effect(new EffectInstance(Effects.STRENGTH, 1200, potency), probability)
                        .effect(new EffectInstance(Effects.RESISTANCE, 1200, potency), probability)
                        .effect(new EffectInstance(Effects.HASTE, 1200, potency), probability)
                        .effect(new EffectInstance(Effects.POISON, 600, negPotency), negProbability)
                        .setAlwaysEdible()
                        .build()));
        this.setRegistryName(name);
    }

    // drink stuff
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        if (entityLiving instanceof ServerPlayerEntity) {
            ServerPlayerEntity serverplayerentity = (ServerPlayerEntity) entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(serverplayerentity, stack);
            serverplayerentity.addStat(Stats.ITEM_USED.get(this));
        }

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
