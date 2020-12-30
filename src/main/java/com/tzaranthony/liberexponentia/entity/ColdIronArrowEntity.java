package com.tzaranthony.liberexponentia.entity;

import com.tzaranthony.liberexponentia.util.LEItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ColdIronArrowEntity extends AbstractArrowEntity{
	public float extraDamage;
	
	public ColdIronArrowEntity(EntityType<? extends ColdIronArrowEntity> type, World worldIn) {
		super(type, worldIn);
		this.extraDamage = 1.15f;
		this.setDamage(5.0f);
	}
	
	public ColdIronArrowEntity(World worldIn, LivingEntity shooter) {
		super(EntityType.ARROW, shooter, worldIn);
	}
	
	public ColdIronArrowEntity(World worldIn, double x, double y, double z) {
		super(EntityType.ARROW, x, y, z, worldIn);
		this.extraDamage = 1.15f;
		this.setDamage(5.0f);
	}
	
	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(LEItems.COLD_IRON_ARROW);
	}
}
