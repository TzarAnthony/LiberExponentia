package com.tzaranthony.liberexponentia.util;

import com.tzaranthony.liberexponentia.entity.ColdIronArrowEntity;
import com.tzaranthony.liberexponentia.entity.SilverArrowEntity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.registry.Registry;

public class LEEntities<T extends Entity> extends net.minecraftforge.registries.ForgeRegistryEntry<EntityType<?>> {
	public static final EntityType<SilverArrowEntity> SILVER_ARROW = register("silver_arrow", EntityType.Builder.<SilverArrowEntity>create(
			SilverArrowEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).func_233606_a_(4).func_233608_b_(20));
	
	public static final EntityType<ColdIronArrowEntity> COLD_IRON_ARROW = register("cold_iron_arrow", EntityType.Builder.<ColdIronArrowEntity>create(
			ColdIronArrowEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).func_233606_a_(4).func_233608_b_(20));
	
	private static <T extends Entity> EntityType<T> register(String key, EntityType.Builder<T> builder) {
		return Registry.register(Registry.ENTITY_TYPE, key, builder.build(key));
	}
}
