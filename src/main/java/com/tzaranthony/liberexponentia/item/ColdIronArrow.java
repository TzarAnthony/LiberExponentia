package com.tzaranthony.liberexponentia.item;

import com.tzaranthony.liberexponentia.LiberExponentia;
import com.tzaranthony.liberexponentia.entity.ColdIronArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ColdIronArrow extends ArrowItem{

	public ColdIronArrow(String name) {
		super(new Item.Properties().group(LiberExponentia.TAB));
		this.setRegistryName(name);
	}
	
	public AbstractArrowEntity createArrow(World worldIn, ItemStack stack, LivingEntity shooter) {
		return new ColdIronArrowEntity(worldIn, shooter);
	}
	
	public boolean isInfinite(ItemStack stack, ItemStack bow, PlayerEntity player) {
		int enchant = net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.enchantment.Enchantments.INFINITY, bow);
		return enchant <= 0 ? false : this.getClass() == ColdIronArrow.class;
	}
}
