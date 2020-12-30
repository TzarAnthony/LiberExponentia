package com.tzaranthony.liberexponentia.entity;

import com.tzaranthony.liberexponentia.util.LEItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SilverArrowEntity extends AbstractArrowEntity{
	public float extraDamage;
	
	public SilverArrowEntity(EntityType<? extends SilverArrowEntity> type, World worldIn) {
		super(type, worldIn);
		this.extraDamage = 1.05f;
		this.setDamage(3.0f);
	}
	
	public SilverArrowEntity(World worldIn, LivingEntity shooter) {
		super(EntityType.ARROW, shooter, worldIn);
	}
	
	public SilverArrowEntity(EntityType<? extends SilverArrowEntity> type, World worldIn, double x, double y, double z) {
		super(EntityType.ARROW, x, y, z, worldIn);
		this.extraDamage = 1.05f;
		this.setDamage(3.0f);
	}
	
	@Override
	protected ItemStack getArrowStack() {
		return new ItemStack(LEItems.SILVER_ARROW);
	}
}
