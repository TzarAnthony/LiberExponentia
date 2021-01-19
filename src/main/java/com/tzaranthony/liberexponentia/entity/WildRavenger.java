//package com.tzaranthony.liberexponentia.entity;
//
//public class WildRavenger extends AbstractHorseEntity implements IAngerable {
//	protected static final DataParameter<Byte> TAMED = EntityDataManager.createKey(TameableEntity.class, DataSerializers.BYTE);
//	private static final Ingredient FOOD = Ingredient.fromItems(Items.SUGAR_CANE, Items.WHEAT, Blocks.HAY_BLOCK.asItem(), Items.KELP, Items.DRIED_KELP, Blocks.DRIED_KELP_BLOCK.asItem());
//	private TemptGoal temptGoal;
//
//	*//**
//	 * Ravenger Properties
//	 *//*
//	private int attackTick;
//	private int stunTick;
//	private int roarTick;
//
//	*//**
//	 * Angerable Properties
//	 *//*
//	private static final RangedInteger unknownRange = TickRangeConverter.func_233037_a_(20, 39);
//	protected int unknownInt;
//	protected UUID playerId;
//
//	protected WildRavenger(EntityType<? extends AbstractHorseEntity> type, World worldIn) {
//		super(type, worldIn);
//	}
//
//	@SuppressWarnings({"unchecked", "rawtypes"})
//	@Override
//	protected void registerGoals() {
//		setTemptGoal(new WildRavenger.TemptGoal(this, 0.6D, FOOD, true));
//		this.goalSelector.addGoal(1, new SwimGoal(this));
//		this.goalSelector.addGoal(2, new WildRavenger.RavAvoidEntityGoal(this, VillagerEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(4, new WildRavenger.RavAvoidEntityGoal(this, PillagerEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(5, new WildRavenger.RavAvoidEntityGoal(this, VindicatorEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(6, new WildRavenger.RavAvoidEntityGoal(this, EvokerEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(7, new WildRavenger.RavAvoidEntityGoal(this, IllusionerEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(8, new WildRavenger.RavAvoidEntityGoal(this, WolfEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(9, new WildRavenger.RavAvoidEntityGoal(this, PolarBearEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(3, this.temptGoal);
//
//		this.goalSelector.addGoal(10, new WildRavenger.AttackGoal());
//		this.goalSelector.addGoal(11, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
//		this.goalSelector.addGoal(12, new BreedGoal(this, 1.0D));
//		this.goalSelector.addGoal(13, new FollowParentGoal(this, 1.0D));
//		this.goalSelector.addGoal(14, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
//		this.goalSelector.addGoal(15, new LookAtGoal(this, PlayerEntity.class, 8.0F));
//		this.goalSelector.addGoal(16, new LookRandomlyGoal(this));
//
//		// target goals
//		this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
//		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
//		this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setCallsForHelp());
//		this.targetSelector.addGoal(4, new AttackPlayerGoal());
//		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, 10, true, false, this::func_233680_b_));
//		this.targetSelector.addGoal(6, new ResetAngerGoal<>(this, false));
//	}
//
//	public void setTemptGoal(TemptGoal temptGoal) {
//		this.temptGoal = temptGoal;
//	}
//
//	*//**
//	 *
//	 *//*
//	public boolean isTamed() {
//		return (this.dataManager.get(TAMED) & 4) != 0;
//	}
//
//	*//**
//	 * Dead and sleeping entities cannot move
//	 *//*
//	protected boolean isMovementBlocked() {
//		return super.isMovementBlocked() || this.attackTick > 0 || this.stunTick > 0 || this.roarTick > 0;
//	}
//
//	*//**
//	 * returns true if the entity provided in the argument can be seen. (Raytrace)
//	 *//*
//	public boolean canEntityBeSeen(Entity entityIn) {
//		return this.stunTick <= 0 && this.roarTick <= 0 ? super.canEntityBeSeen(entityIn) : false;
//	}
//
//	protected void constructKnockBackVector(LivingEntity entityIn) {
//		if (this.roarTick == 0) {
//			if (this.rand.nextDouble() < 0.5D) {
//				this.stunTick = 40;
//				this.playSound(SoundEvents.ENTITY_RAVAGER_STUNNED, 1.0F, 1.0F);
//				this.world.setEntityState(this, (byte) 39);
//				entityIn.applyEntityCollision(this);
//			} else {
//				this.launch(entityIn);
//			}
//
//			entityIn.velocityChanged = true;
//		}
//	}
//
//	private void roar() {
//		if (this.isAlive()) {
//			for (Entity entity : this.world.getEntitiesWithinAABB(LivingEntity.class, this.getBoundingBox().grow(4.0D), field_213690_b)) {
//				if (!(entity instanceof AbstractIllagerEntity)) {
//					entity.attackEntityFrom(DamageSource.causeMobDamage(this), 6.0F);
//				}
//
//				this.launch(entity);
//			}
//
//			Vector3d vector3d = this.getBoundingBox().getCenter();
//
//			for (int i = 0; i < 40; ++i) {
//				double d0 = this.rand.nextGaussian() * 0.2D;
//				double d1 = this.rand.nextGaussian() * 0.2D;
//				double d2 = this.rand.nextGaussian() * 0.2D;
//				this.world.addParticle(ParticleTypes.POOF, vector3d.x, vector3d.y, vector3d.z, d0, d1, d2);
//			}
//		}
//	}
//
//	private void launch(Entity p_213688_1_) {
//		double d0 = p_213688_1_.getPosX() - this.getPosX();
//		double d1 = p_213688_1_.getPosZ() - this.getPosZ();
//		double d2 = Math.max(d0 * d0 + d1 * d1, 0.001D);
//		p_213688_1_.addVelocity(d0 / d2 * 4.0D, 0.2D, d1 / d2 * 4.0D);
//	}
//
//	*//**
//	 * Goals
//	 *//*
//
//	static class AvoidPlayerGoal<T extends LivingEntity> extends AvoidEntityGoal<T> {
//		private final WildRavenger rav;
//
//		public AvoidPlayerGoal(WildRavenger ravIn, Class<T> entityClassToAvoidIn, float avoidDistanceIn, double farSpeedIn, double nearSpeedIn) {
//			super(ravIn, entityClassToAvoidIn, avoidDistanceIn, farSpeedIn, nearSpeedIn, EntityPredicates.CAN_AI_TARGET::test);
//			this.rav = ravIn;
//		}
//
//		*//**
//		 * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
//		 * method as well.
//		 *//*
//		public boolean shouldExecute() {
//			return !this.rav.isTamed() && super.shouldExecute();
//		}
//
//		*//**
//		 * Returns whether an in-progress EntityAIBase should continue executing
//		 *//*
//		public boolean shouldContinueExecuting() {
//			return !this.rav.isTamed() && super.shouldContinueExecuting();
//		}
//	}
//
//	class RavAvoidEntityGoal<T extends LivingEntity> extends AvoidEntityGoal<T> {
//		private final WildRavenger rav;
//
//		public RavAvoidEntityGoal(WildRavenger ravIn, Class<T> entityClassToAvoidIn, float avoidDistanceIn, double farSpeedIn, double nearSpeedIn) {
//			super(ravIn, entityClassToAvoidIn, avoidDistanceIn, farSpeedIn, nearSpeedIn);
//			this.rav = ravIn;
//		}
//
//		*//**
//		 * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
//		 * method as well.
//		 *//*
//		public boolean shouldExecute() {
//			if (super.shouldExecute() && this.avoidTarget instanceof LlamaEntity) {
//				return !this.rav.isTamed() && this.avoidLlama((LlamaEntity) this.avoidTarget);
//			} else {
//				return false;
//			}
//		}
//
//		private boolean avoidLlama(LlamaEntity llamaIn) {
//			return llamaIn.getStrength() >= WildRavenger.this.rand.nextInt(5);
//		}
//
//		*//**
//		 * Execute a one shot task or start executing a continuous task
//		 *//*
//		public void startExecuting() {
//			WildRavenger.this.setAttackTarget((LivingEntity) null);
//			super.startExecuting();
//		}
//
//		*//**
//		 * Keep ticking a continuous task that has already been started
//		 *//*
//		public void tick() {
//			WildRavenger.this.setAttackTarget((LivingEntity) null);
//			super.tick();
//		}
//	}
//
//	class AttackGoal extends MeleeAttackGoal {
//		public AttackGoal() {
//			super(WildRavenger.this, 1.0D, true);
//		}
//
//		protected double getAttackReachSqr(LivingEntity attackTarget) {
//			float f = WildRavenger.this.getWidth() - 0.1F;
//			return (double) (f * 2.0F * f * 2.0F + attackTarget.getWidth());
//		}
//	}
//
//	static class Navigator extends GroundPathNavigator {
//		public Navigator(MobEntity p_i50754_1_, World p_i50754_2_) {
//			super(p_i50754_1_, p_i50754_2_);
//		}
//
//		protected PathFinder getPathFinder(int p_179679_1_) {
//			this.nodeProcessor = new WildRavenger.Processor();
//			return new PathFinder(this.nodeProcessor, p_179679_1_);
//		}
//	}
//
//	static class Processor extends WalkNodeProcessor {
//		private Processor() {
//		}
//
//		protected PathNodeType func_215744_a(IBlockReader p_215744_1_, boolean p_215744_2_, boolean p_215744_3_, BlockPos p_215744_4_, PathNodeType p_215744_5_) {
//			return p_215744_5_ == PathNodeType.LEAVES ? PathNodeType.OPEN : super.func_215744_a(p_215744_1_, p_215744_2_, p_215744_3_, p_215744_4_, p_215744_5_);
//		}
//	}
//
//	static class TemptGoal extends net.minecraft.entity.ai.goal.TemptGoal {
//		@Nullable
//		private PlayerEntity temptingPlayer;
//		private final WildRavenger rav;
//
//		public TemptGoal(WildRavenger ravIn, double speedIn, Ingredient temptItemsIn, boolean scaredByPlayerMovementIn) {
//			super(ravIn, speedIn, temptItemsIn, scaredByPlayerMovementIn);
//			this.rav = ravIn;
//		}
//
//		*//**
//		 * Keep ticking a continuous task that has already been started
//		 *//*
//		public void tick() {
//			super.tick();
//			if (this.temptingPlayer == null && this.creature.getRNG().nextInt(600) == 0) {
//				this.temptingPlayer = this.closestPlayer;
//			} else if (this.creature.getRNG().nextInt(500) == 0) {
//				this.temptingPlayer = null;
//			}
//		}
//
//		protected boolean isScaredByPlayerMovement() {
//			return this.temptingPlayer != null && this.temptingPlayer.equals(this.closestPlayer) ? false : super.isScaredByPlayerMovement();
//		}
//
//		*//**
//		 * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
//		 * method as well.
//		 *//*
//		public boolean shouldExecute() {
//			return super.shouldExecute() && !this.rav.isTamed();
//		}
//	}
//
//	// angerable / polar bear
//	class AttackPlayerGoal extends NearestAttackableTargetGoal<PlayerEntity> {
//		public AttackPlayerGoal() {
//			super(WildRavenger.this, PlayerEntity.class, 20, true, true, (Predicate<LivingEntity>)null);
//		}
//
//		*//**
//		 * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
//		 * method as well.
//		 *//*
//		public boolean shouldExecute() {
//			if (WildRavenger.this.isChild()) {
//				return false;
//			} else {
//				if (super.shouldExecute()) {
//					for(WildRavenger ridableRavenger : WildRavenger.this.world.getEntitiesWithinAABB(WildRavenger.class, WildRavenger.this.getBoundingBox().grow(8.0D, 4.0D, 8.0D))) {
//						if (ridableRavenger.isChild()) {
//							return true;
//						}
//					}
//				}
//				return false;
//			}
//		}
//		protected double getTargetDistance() {
//			return super.getTargetDistance() * 0.5D;
//		}
//	}
//
//	*//**
//	 *
//	 *//*
//	class OwnerHurtByTargetGoal extends TargetGoal {
//		private final TameableEntity tameable;
//		private LivingEntity attacker;
//		private int timestamp;
//
//		public OwnerHurtByTargetGoal(TameableEntity theDefendingTameableIn) {
//			super(theDefendingTameableIn, false);
//			this.tameable = theDefendingTameableIn;
//			this.setMutexFlags(EnumSet.of(Goal.Flag.TARGET));
//		}
//
//		*//**
//		 * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
//		 * method as well.
//		 *//*
//		public boolean shouldExecute() {
//			if (this.tameable.isTamed() && !this.tameable.func_233685_eM_()) {
//				LivingEntity livingentity = this.tameable.getOwner();
//				if (livingentity == null) {
//					return false;
//				} else {
//					this.attacker = livingentity.getRevengeTarget();
//					int i = livingentity.getRevengeTimer();
//					return i != this.timestamp && this.isSuitableTarget(this.attacker, EntityPredicate.DEFAULT) && this.tameable.shouldAttackEntity(this.attacker, livingentity);
//				}
//			} else {
//				return false;
//			}
//		}
//
//		*//**
//		 * Execute a one shot task or start executing a continuous task
//		 *//*
//		public void startExecuting() {
//			this.goalOwner.setAttackTarget(this.attacker);
//			LivingEntity livingentity = this.tameable.getOwner();
//			if (livingentity != null) {
//				this.timestamp = livingentity.getRevengeTimer();
//			}
//
//			super.startExecuting();
//		}
//	}
//
//	*//**
//	 * Angerable overides
//	 *//*
//
//	@Override
//	public int func_230256_F__() {
//		return this.unknownInt;
//	}
//
//	@Override
//	public void func_230260_a__(int p_230260_1_) {
//		this.unknownInt = p_230260_1_;
//	}
//
//	@Override
//	public UUID func_230257_G__() {
//		return this.playerId;
//	}
//
//	@Override
//	public void func_230259_a_(UUID playerId) {
//		this.playerId = playerId;
//	}
//
//	@Override
//	public void func_230258_H__() {
//		this.func_230260_a__(unknownRange.func_233018_a_(this.rand));
//	}
//}
//
//public class WildRavenger extends RavagerEntity implements IAngerable, ImRidable {
//	private static final Ingredient FOOD = Ingredient.fromItems(Items.SUGAR_CANE, Items.WHEAT, Blocks.HAY_BLOCK.asItem(), Items.KELP, Items.DRIED_KELP, Blocks.DRIED_KELP_BLOCK.asItem());
//	protected static final DataParameter<Byte> TAMED = EntityDataManager.createKey(TameableEntity.class, DataSerializers.BYTE);
//	private static final RangedInteger unknown_range = TickRangeConverter.func_233037_a_(20, 39);
//	private int attackTick;
//	private int stunTick;
//	private int roarTick;
//	private int unknown_int;
//	private UUID playerID;
//
//	public static final Predicate<LivingEntity> AVOID = (avoid) -> {
//		EntityType<?> entitytype = avoid.getType();
//		return entitytype == EntityType.POLAR_BEAR || entitytype == EntityType.WOLF || entitytype == EntityType.VILLAGER
//				|| entitytype == EntityType.PILLAGER || entitytype == EntityType.VINDICATOR || entitytype == EntityType.EVOKER || entitytype == EntityType.ILLUSIONER;
//	};
//
//	private WildRavenger.AvoidPlayerGoal<PlayerEntity> avoidPlayerGoal;
//	private net.minecraft.entity.ai.goal.TemptGoal temptGoal;
//	private float field_213433_bL;
//	private float field_213434_bM;
//	private float field_213435_bN;
//	private float field_213436_bO;
//	private float field_213437_bP;
//	private float field_213438_bQ;
//
//	protected WildRavenger(EntityType<? extends WildRavenger> type, World worldIn) {
//		super(type, worldIn);
//		this.stepHeight = 1.0F;
//		this.experienceValue = 20;
//	}
//
//
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	@Override
//	protected void registerGoals() {
//		// move goals
//		this.temptGoal = new WildRavenger.TemptGoal(this, 0.6D, FOOD, true);
//		this.goalSelector.addGoal(1, new SwimGoal(this));
//		this.goalSelector.addGoal(2, new WildRavenger.RavAvoidEntityGoal(this, VillagerEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(4, new WildRavenger.RavAvoidEntityGoal(this, PillagerEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(5, new WildRavenger.RavAvoidEntityGoal(this, VindicatorEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(6, new WildRavenger.RavAvoidEntityGoal(this, EvokerEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(7, new WildRavenger.RavAvoidEntityGoal(this, IllusionerEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(8, new WildRavenger.RavAvoidEntityGoal(this, WolfEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(9, new WildRavenger.RavAvoidEntityGoal(this, PolarBearEntity.class, 24.0F, 1.5D, 1.5D));
//		this.goalSelector.addGoal(3, this.temptGoal);
//		this.goalSelector.addGoal(10, new WildRavenger.AttackGoal());
//		this.goalSelector.addGoal(11, new FollowOwnerGoal(this, 1.0D, 10.0F, 2.0F, false));
//		this.goalSelector.addGoal(12, new BreedGoal(this, 1.0D));
//		this.goalSelector.addGoal(13, new FollowParentGoal(this, 1.0D));
//		this.goalSelector.addGoal(14, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
//		this.goalSelector.addGoal(15, new LookAtGoal(this, PlayerEntity.class, 8.0F));
//		this.goalSelector.addGoal(16, new LookRandomlyGoal(this));
//
//		// target goals
//		this.targetSelector.addGoal(1, new OwnerHurtByTargetGoal(this));
//		this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
//		this.targetSelector.addGoal(3, (new HurtByTargetGoal(this)).setCallsForHelp());
//		this.targetSelector.addGoal(4, new WildRavenger.AttackPlayerGoal());
//		this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, 10, true, false, this::func_233680_b_));
//		this.targetSelector.addGoal(6, new ResetAngerGoal<>(this, false));
//	}
//
//
//	// Ravager Stuff
//	public void writeAdditional(CompoundNBT compound) {
//		super.writeAdditional(compound);
//		compound.putInt("AttackTick", this.attackTick);
//		compound.putInt("StunTick", this.stunTick);
//		compound.putInt("RoarTick", this.roarTick);
//	}
//
//	*//**
//	 * (abstract) Protected helper method to read subclass entity data from NBT.
//	 *//*
//	public void readAdditional(CompoundNBT compound) {
//		super.readAdditional(compound);
//		this.attackTick = compound.getInt("AttackTick");
//		this.stunTick = compound.getInt("StunTick");
//		this.roarTick = compound.getInt("RoarTick");
//	}
//
//	class AttackGoal extends MeleeAttackGoal {
//		public AttackGoal() {
//			super(WildRavenger.this, 1.0D, true);
//		}
//		protected double getAttackReachSqr(LivingEntity attackTarget) {
//			float f = WildRavenger.this.getWidth() - 0.1F;
//			return (double)(f * 2.0F * f * 2.0F + attackTarget.getWidth());
//		}
//	}
//
//
//	public boolean attackEntityAsMob(Entity entityIn) {
//		this.attackTick = 10;
//		this.world.setEntityState(this, (byte)4);
//		this.playSound(SoundEvents.ENTITY_RAVAGER_ATTACK, 1.0F, 1.0F);
//		return super.attackEntityAsMob(entityIn);
//	}
//
//	@Nullable
//	protected SoundEvent getAmbientSound() {
//		return SoundEvents.ENTITY_RAVAGER_AMBIENT;
//	}
//
//	protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
//		return SoundEvents.ENTITY_RAVAGER_HURT;
//	}
//
//	protected SoundEvent getDeathSound() {
//		return SoundEvents.ENTITY_RAVAGER_DEATH;
//	}
//
//	protected void playStepSound(BlockPos pos, BlockState blockIn) {
//		this.playSound(SoundEvents.ENTITY_RAVAGER_STEP, 0.15F, 1.0F);
//	}
//
//	public boolean isNotColliding(IWorldReader worldIn) {
//		return !worldIn.containsAnyLiquid(this.getBoundingBox());
//	}
//
//	*//**
//	 * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
//	 * use this to react to sunlight and start to burn.
//	 *//*
//	public void livingTick() {
//		super.livingTick();
//		if (this.isAlive()) {
//			if (this.isMovementBlocked()) {
//				this.getAttribute(Attributes.field_233821_d_).setBaseValue(0.0D);
//			} else {
//				double d0 = this.getAttackTarget() != null ? 0.35D : 0.3D;
//				double d1 = this.getAttribute(Attributes.field_233821_d_).getBaseValue();
//				this.getAttribute(Attributes.field_233821_d_).setBaseValue(MathHelper.lerp(0.1D, d1, d0));
//			}
//
//			if (this.collidedHorizontally && net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.world, this)) {
//				boolean flag = false;
//				AxisAlignedBB axisalignedbb = this.getBoundingBox().grow(0.2D);
//
//				for(BlockPos blockpos : BlockPos.getAllInBoxMutable(MathHelper.floor(axisalignedbb.minX), MathHelper.floor(axisalignedbb.minY), MathHelper.floor(axisalignedbb.minZ), MathHelper.floor(axisalignedbb.maxX), MathHelper.floor(axisalignedbb.maxY), MathHelper.floor(axisalignedbb.maxZ))) {
//					BlockState blockstate = this.world.getBlockState(blockpos);
//					Block block = blockstate.getBlock();
//					if (block instanceof LeavesBlock) {
//						flag = this.world.destroyBlock(blockpos, true, this) || flag;
//					}
//				}
//
//				if (!flag && this.onGround) {
//					this.jump();
//				}
//			}
//
//			if (this.roarTick > 0) {
//				--this.roarTick;
//				if (this.roarTick == 10) {
//					this.roar();
//				}
//			}
//
//			if (this.attackTick > 0) {
//				--this.attackTick;
//			}
//
//			if (this.stunTick > 0) {
//				--this.stunTick;
//				this.func_213682_eh();
//				if (this.stunTick == 0) {
//					this.playSound(SoundEvents.ENTITY_RAVAGER_ROAR, 1.0F, 1.0F);
//					this.roarTick = 20;
//				}
//			}
//		}
//	}
//
//	private void func_213682_eh() {
//		if (this.rand.nextInt(6) == 0) {
//			double d0 = this.getPosX() - (double)this.getWidth() * Math.sin((double)(this.renderYawOffset * ((float)Math.PI / 180F))) + (this.rand.nextDouble() * 0.6D - 0.3D);
//			double d1 = this.getPosY() + (double)this.getHeight() - 0.3D;
//			double d2 = this.getPosZ() + (double)this.getWidth() * Math.cos((double)(this.renderYawOffset * ((float)Math.PI / 180F))) + (this.rand.nextDouble() * 0.6D - 0.3D);
//			this.world.addParticle(ParticleTypes.ENTITY_EFFECT, d0, d1, d2, 0.4980392156862745D, 0.5137254901960784D, 0.5725490196078431D);
//		}
//	}
//
//	*//**
//	 * Dead and sleeping entities cannot move
//	 *//*
//	protected boolean isMovementBlocked() {
//		return super.isMovementBlocked() || this.attackTick > 0 || this.stunTick > 0 || this.roarTick > 0;
//	}
//
//	*//**
//	 * returns true if the entity provided in the argument can be seen. (Raytrace)
//	 *//*
//	public boolean canEntityBeSeen(Entity entityIn) {
//		return this.stunTick <= 0 && this.roarTick <= 0 ? super.canEntityBeSeen(entityIn) : false;
//	}
//
//	protected void constructKnockBackVector(LivingEntity entityIn) {
//		if (this.roarTick == 0) {
//			if (this.rand.nextDouble() < 0.5D) {
//				this.stunTick = 40;
//				this.playSound(SoundEvents.ENTITY_RAVAGER_STUNNED, 1.0F, 1.0F);
//				this.world.setEntityState(this, (byte)39);
//				entityIn.applyEntityCollision(this);
//			} else {
//				this.launch(entityIn);
//			}
//			entityIn.velocityChanged = true;
//		}
//	}
//
//	private void roar() {
//		if (this.isAlive()) {
//			for(Entity entity : this.world.getEntitiesWithinAABB(LivingEntity.class, this.getBoundingBox().grow(4.0D), field_213690_b)) {
//				if (!(entity instanceof AbstractIllagerEntity)) {
//					entity.attackEntityFrom(DamageSource.causeMobDamage(this), 6.0F);
//				}
//				this.launch(entity);
//			}
//			Vector3d vector3d = this.getBoundingBox().getCenter();
//			for(int i = 0; i < 40; ++i) {
//				double d0 = this.rand.nextGaussian() * 0.2D;
//				double d1 = this.rand.nextGaussian() * 0.2D;
//				double d2 = this.rand.nextGaussian() * 0.2D;
//				this.world.addParticle(ParticleTypes.POOF, vector3d.x, vector3d.y, vector3d.z, d0, d1, d2);
//			}
//		}
//	}
//
//	private void launch(Entity p_213688_1_) {
//		double d0 = p_213688_1_.getPosX() - this.getPosX();
//		double d1 = p_213688_1_.getPosZ() - this.getPosZ();
//		double d2 = Math.max(d0 * d0 + d1 * d1, 0.001D);
//		p_213688_1_.addVelocity(d0 / d2 * 4.0D, 0.2D, d1 / d2 * 4.0D);
//	}
//
//
//	// Tameable stuff
//
//
//
//
//
//	// Wolf stuff
//	public boolean isTamed() {
//		return (this.dataManager.get(TAMED) & 4) != 0;
//	}
//
//
//	class RavAvoidEntityGoal<T extends LivingEntity> extends AvoidEntityGoal<T> {
//		private final WildRavenger rav;
//
//		public RavAvoidEntityGoal(WildRavenger ravIn, Class<T> entityClassToAvoidIn, float avoidDistanceIn, double farSpeedIn, double nearSpeedIn) {
//			super(ravIn, entityClassToAvoidIn, avoidDistanceIn, farSpeedIn, nearSpeedIn);
//			this.rav = ravIn;
//		}
//
//		*//**
//		 * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
//		 * method as well.
//		 *//*
//		public boolean shouldExecute() {
//			if (super.shouldExecute() && this.avoidTarget instanceof LlamaEntity) {
//				return !this.rav.isTamed() && this.avoidLlama((LlamaEntity)this.avoidTarget);
//			} else {
//				return false;
//			}
//		}
//
//		private boolean avoidLlama(LlamaEntity llamaIn) {
//			return llamaIn.getStrength() >= WildRavenger.this.rand.nextInt(5);
//		}
//
//		*//**
//		 * Execute a one shot task or start executing a continuous task
//		 *//*
//		public void startExecuting() {
//			WildRavenger.this.setAttackTarget((LivingEntity)null);
//			super.startExecuting();
//		}
//
//		*//**
//		 * Keep ticking a continuous task that has already been started
//		 *//*
//		public void tick() {
//			WildRavenger.this.setAttackTarget((LivingEntity)null);
//			super.tick();
//		}
//	}
//
//
//
//
//
//
//
//
//	// cat stuff
//
//
//	// i've no idea what any of this does but it looks like it's for the tempt goal
//	public boolean func_213416_eg() {
//		return this.dataManager.get(field_213428_bG);
//	}
//
//	public void func_213415_v(boolean p_213415_1_) {
//		this.dataManager.set(field_213429_bH, p_213415_1_);
//	}
//
//	public boolean func_213409_eh() {
//		return this.dataManager.get(field_213429_bH);
//	}
//
//	public void tick() {
//		super.tick();
//		if (this.temptGoal != null && this.temptGoal.isRunning() && !this.isTamed() && this.ticksExisted % 100 == 0) {
//			this.playSound(SoundEvents.ENTITY_CAT_BEG_FOR_FOOD, 1.0F, 1.0F);
//		}
//		this.func_213412_ek();
//	}
//
//	private void func_213412_ek() {
//		if ((this.func_213416_eg() || this.func_213409_eh()) && this.ticksExisted % 5 == 0) {
//			this.playSound(SoundEvents.ENTITY_CAT_PURR, 0.6F + 0.4F * (this.rand.nextFloat() - this.rand.nextFloat()), 1.0F);
//		}
//		this.func_213418_el();
//		this.func_213411_em();
//	}
//
//	private void func_213418_el() {
//		this.field_213434_bM = this.field_213433_bL;
//		this.field_213436_bO = this.field_213435_bN;
//		if (this.func_213416_eg()) {
//			this.field_213433_bL = Math.min(1.0F, this.field_213433_bL + 0.15F);
//			this.field_213435_bN = Math.min(1.0F, this.field_213435_bN + 0.08F);
//		} else {
//			this.field_213433_bL = Math.max(0.0F, this.field_213433_bL - 0.22F);
//			this.field_213435_bN = Math.max(0.0F, this.field_213435_bN - 0.13F);
//		}
//	}
//
//	private void func_213411_em() {
//		this.field_213438_bQ = this.field_213437_bP;
//		if (this.func_213409_eh()) {
//			this.field_213437_bP = Math.min(1.0F, this.field_213437_bP + 0.1F);
//		} else {
//			this.field_213437_bP = Math.max(0.0F, this.field_213437_bP - 0.13F);
//		}
//	}
//
//	@OnlyIn(Dist.CLIENT)
//	public float func_213408_v(float partialTicks) {
//		return MathHelper.lerp(partialTicks, this.field_213434_bM, this.field_213433_bL);
//	}
//
//	@OnlyIn(Dist.CLIENT)
//	public float func_213421_w(float partialTicks) {
//		return MathHelper.lerp(partialTicks, this.field_213436_bO, this.field_213435_bN);
//	}
//
//	@OnlyIn(Dist.CLIENT)
//	public float func_213424_x(float partialTicks) {
//		return MathHelper.lerp(partialTicks, this.field_213438_bQ, this.field_213437_bP);
//	}
//
//
//
//	protected void setupTamedAI() {
//		if (this.avoidPlayerGoal == null) {
//			this.avoidPlayerGoal = new WildRavenger.AvoidPlayerGoal<>(this, PlayerEntity.class, 16.0F, 0.8D, 1.33D);
//		}
//
//		this.goalSelector.removeGoal(this.avoidPlayerGoal);
//
//		if (!this.isTamed()) {
//			this.goalSelector.addGoal(4, this.avoidPlayerGoal);
//		}
//	}
//
//	static class AvoidPlayerGoal<T extends LivingEntity> extends AvoidEntityGoal<T> {
//		private final WildRavenger rav;
//
//		public AvoidPlayerGoal(WildRavenger ravIn, Class<T> entityClassToAvoidIn, float avoidDistanceIn, double farSpeedIn, double nearSpeedIn) {
//			super(ravIn, entityClassToAvoidIn, avoidDistanceIn, farSpeedIn, nearSpeedIn, EntityPredicates.CAN_AI_TARGET::test);
//			this.rav = ravIn;
//		}
//
//		*//**
//		 * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
//		 * method as well.
//		 *//*
//		public boolean shouldExecute() {
//			return !this.rav.isTamed() && super.shouldExecute();
//		}
//
//		*//**
//		 * Returns whether an in-progress EntityAIBase should continue executing
//		 *//*
//		public boolean shouldContinueExecuting() {
//			return !this.rav.isTamed() && super.shouldContinueExecuting();
//		}
//	}
//
//	static class TemptGoal extends net.minecraft.entity.ai.goal.TemptGoal {
//		@Nullable
//		private PlayerEntity temptingPlayer;
//		private final WildRavenger rav;
//
//		public TemptGoal(WildRavenger ravIn, double speedIn, Ingredient temptItemsIn, boolean scaredByPlayerMovementIn) {
//			super(ravIn, speedIn, temptItemsIn, scaredByPlayerMovementIn);
//			this.rav = ravIn;
//		}
//
//		*//**
//		 * Keep ticking a continuous task that has already been started
//		 *//*
//		public void tick() {
//			super.tick();
//			if (this.temptingPlayer == null && this.creature.getRNG().nextInt(600) == 0) {
//				this.temptingPlayer = this.closestPlayer;
//			} else if (this.creature.getRNG().nextInt(500) == 0) {
//				this.temptingPlayer = null;
//			}
//		}
//
//		protected boolean isScaredByPlayerMovement() {
//			return this.temptingPlayer != null && this.temptingPlayer.equals(this.closestPlayer) ? false : super.isScaredByPlayerMovement();
//		}
//
//		*//**
//		 * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
//		 * method as well.
//		 *//*
//		public boolean shouldExecute() {
//			return super.shouldExecute() && !this.rav.isTamed();
//		}
//	}
//
//
//
//
//
//
//	// angerable / polar bear
//	class AttackPlayerGoal extends NearestAttackableTargetGoal<PlayerEntity> {
//		public AttackPlayerGoal() {
//			super(WildRavenger.this, PlayerEntity.class, 20, true, true, (Predicate<LivingEntity>)null);
//		}
//		*//**
//		 * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
//		 * method as well.
//		 *//*
//		public boolean shouldExecute() {
//			if (WildRavenger.this.isChild()) {
//				return false;
//			} else {
//				if (super.shouldExecute()) {
//					for(WildRavenger ridableRavenger : WildRavenger.this.world.getEntitiesWithinAABB(WildRavenger.class, WildRavenger.this.getBoundingBox().grow(8.0D, 4.0D, 8.0D))) {
//						if (ridableRavenger.isChild()) {
//							return true;
//						}
//					}
//				}
//				return false;
//			}
//		}
//		protected double getTargetDistance() {
//			return super.getTargetDistance() * 0.5D;
//		}
//	}
//
//
//	@Override
//	public int func_230256_F__() {
//		// TODO Auto-generated method stub
//		return this.unknown_int;
//	}
//
//
//	@Override
//	public void func_230260_a__(int p_230260_1_) {
//		// TODO Auto-generated method stub
//		this.unknown_int = p_230260_1_;
//	}
//
//
//	@Override
//	public UUID func_230257_G__() {
//		// TODO Auto-generated method stub
//		return this.playerID;
//	}
//
//
//	@Override
//	public void func_230259_a_(UUID playerID) {
//		// TODO Auto-generated method stub
//		this.playerID = playerID;
//	}
//
//
//	@Override
//	public void func_230258_H__() {
//		// TODO Auto-generated method stub
//		this.func_230260_a__(unknown_range.func_233018_a_(this.rand));
//	}
//}
