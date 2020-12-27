package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.Liber_Exponentia;
import com.tzaranthony.liberexponentia.entity.SilverArrowEntity;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SilverArrow extends ArrowItem{
	
	public SilverArrow(String name) {
		super(new Item.Properties().group(Liber_Exponentia.TAB));
		this.setRegistryName(name);
	}
	
	public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
		return new SilverArrowEntity(worldIn, shooter);
	}
	
	public boolean isInfinite(ItemStack stack, ItemStack bow, PlayerEntity player) {
		int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.enchantment.Enchantments.INFINITY, bow);
		return enchant <= 0 ? false : this.getClass() == SilverArrow.class;
	}
}
