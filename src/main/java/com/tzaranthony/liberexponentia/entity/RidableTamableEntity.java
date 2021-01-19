//package com.tzaranthony.liberexponentia.entity;
//
//public class RidableTamableEntity extends TameableEntity implements IInventoryChangedListener, IJumpingMount, IEquipable {
//    private static final Predicate<LivingEntity> IS_HORSE_BREEDING = (p_213617_0_) -> {
//        return p_213617_0_ instanceof AbstractHorseEntity && ((AbstractHorseEntity) p_213617_0_).isBreeding();
//    };
//    private static final EntityPredicate MOMMY_TARGETING = (new EntityPredicate()).setDistance(16.0D).allowInvulnerable().allowFriendlyFire().setLineOfSiteRequired().setCustomPredicate(IS_HORSE_BREEDING);
//    private static final Ingredient field_234235_bE_ = Ingredient.fromItems(Items.WHEAT, Items.SUGAR, Blocks.HAY_BLOCK.asItem(), Items.APPLE, Items.GOLDEN_CARROT, Items.GOLDEN_APPLE, Items.ENCHANTED_GOLDEN_APPLE);
//    private static final DataParameter<Optional<UUID>> OWNER_UNIQUE_ID = EntityDataManager.createKey(AbstractHorseEntity.class, DataSerializers.OPTIONAL_UNIQUE_ID);
//    public int sprintCounter;
//    protected boolean isJumping;
//    protected Inventory entityInventory;
//    */
///**
// * The higher this value, the more likely the horse is to be tamed next time a player rides it.  Used to determine the sound that the horse should make when it steps
// * Returns true if this entity should push and be pushed by other entities when colliding.
// * <p>
// * Called by InventoryBasic.onInventoryChanged() on a array that is never filled.
// * <p>
// * Will return how many at most can spawn in a chunk at once.
// * <p>
// * Returns the volume for the sounds this mob makes.
// * <p>
// * Get number of ticks, at least during which the living entity will be silent.
// * <p>
// * Dead and sleeping entities cannot move
// * <p>
// * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
// * the animal type)
// * <p>
// * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
// * use this to react to sunlight and start to burn.
// * <p>
// * Called to update the entity's position/logic.
// * <p>
// * (abstract) Protected helper method to read subclass entity data from NBT.
// * <p>
// * Returns true if the mob is currently able to mate with the specified mob.
// * <p>
// * Return true if the horse entity ready to mate. (no rider, not riding, tame, adult, not steril...)
// * <p>
// * returns true if all the conditions for steering the entity are met. For pigs, this is true if it is being ridden
// * by a player and the player is holding a carrot-on-a-stick
// * <p>
// * "Spawns particles for the horse entity. par1 tells whether to spawn hearts. If it is false, it spawns smoke."
// * <p>
// * Handler for {@link World#setEntityState}
// * <p>
// * Returns randomized max health
// * <p>
// * Returns randomized jump strength
// * <p>
// * Returns randomized movement speed
// * <p>
// * Returns true if this entity should move as if it were on a ladder (either because it's actually on a ladder, or
// * for AI reasons)
// * <p>
// * For vehicles, the first passenger is generally considered the controller and "drives" the vehicle. For example,
// * Pigs, Horses, and Boats are generally "steered" by the controlling passenger.
// *//*
//
//    protected int temper;
//    protected float jumpPower;
//    private boolean allowStandSliding;
//    protected boolean canGallop = true;
//    */
///** Used to determine the sound that the horse should make when it steps *//*
//
//    protected int gallopTime;
//
//    protected RidableTamableEntity(EntityType<? extends RidableTamableEntity> type, World worldIn) {
//        super(type, worldIn);
//        this.stepHeight = 1.0F;
//        this.initInventory();
//    }
//
//    protected boolean getHorseWatchableBoolean(int p_110233_1_) {
//        return (this.dataManager.get(TAMED) & p_110233_1_) != 0;
//    }
//
//    protected void setHorseWatchableBoolean(int p_110208_1_, boolean p_110208_2_) {
//        byte b0 = this.dataManager.get(TAMED);
//        if (p_110208_2_) {
//            this.dataManager.set(TAMED, (byte)(b0 | p_110208_1_));
//        } else {
//            this.dataManager.set(TAMED, (byte)(b0 & ~p_110208_1_));
//        }
//
//    }
//
//    public boolean isEntityJumping() {
//        return this.isJumping;
//    }
//
//    public void setEntityJumping(boolean jumping) {
//        this.isJumping = jumping;
//    }
//
//    protected void onLeashDistance(float p_142017_1_) {
//        if (p_142017_1_ > 6.0F && this.isEatingHaystack()) {
//            this.setEatingHaystack(false);
//        }
//    }
//
//    public boolean isEatingHaystack() {
//        return this.getHorseWatchableBoolean(16);
//    }
//
//    public boolean isBreeding() {
//        return this.getHorseWatchableBoolean(8);
//    }
//
//    public void setBreeding(boolean breeding) {
//        this.setHorseWatchableBoolean(8, breeding);
//    }
//
//    public boolean func_230264_L__() {
//        return this.isAlive() && !this.isChild() && this.isTamed();
//    }
//
//    public void func_230266_a_(@Nullable SoundCategory p_230266_1_) {
//        this.entityInventory.setInventorySlotContents(0, new ItemStack(Items.SADDLE));
//        if (p_230266_1_ != null) {
//            this.world.playMovingSound((PlayerEntity)null, this, SoundEvents.ENTITY_HORSE_SADDLE, p_230266_1_, 0.5F, 1.0F);
//        }
//    }
//
//    public boolean isHorseSaddled() {
//        return this.getHorseWatchableBoolean(2);
//    }
//
//    public int getTemper() {
//        return this.temper;
//    }
//
//    public void setTemper(int temperIn) {
//        this.temper = temperIn;
//    }
//
//    public int increaseTemper(int p_110198_1_) {
//        int i = MathHelper.clamp(this.getTemper() + p_110198_1_, 0, this.getMaxTemper());
//        this.setTemper(i);
//        return i;
//    }
//
//    */
///**
// * Returns true if this entity should push and be pushed by other entities when colliding.
// *//*
//
//    public boolean canBePushed() {
//        return !this.isBeingRidden();
//    }
//
//    private void eatingHorse() {
//        if (!this.isSilent()) {
//            SoundEvent soundevent = this.func_230274_fe_();
//            if (soundevent != null) {
//                this.world.playSound((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), soundevent,
//                        this.getSoundCategory(), 1.0F, 1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F);
//            }
//        }
//    }
//
//    public boolean onLivingFall(float distance, float damageMultiplier) {
//        if (distance > 1.0F) {
//            this.playSound(SoundEvents.ENTITY_RAVAGER_STEP, 0.4F, 1.0F);
//        }
//
//        int i = this.calculateFallDamage(distance, damageMultiplier);
//        if (i <= 0) {
//            return false;
//        } else {
//            this.attackEntityFrom(DamageSource.FALL, (float)i);
//            if (this.isBeingRidden()) {
//                for(Entity entity : this.getRecursivePassengers()) {
//                    entity.attackEntityFrom(DamageSource.FALL, (float)i);
//                }
//            }
//
//            this.playFallSound();
//            return true;
//        }
//    }
//
//    protected int calculateFallDamage(float p_225508_1_, float p_225508_2_) {
//        return MathHelper.ceil((p_225508_1_ * 0.5F - 3.0F) * p_225508_2_);
//    }
//
//    protected int getInventorySize() {
//        return 2;
//    }
//
//    protected void initInventory() {
//        Inventory inventory = this.entityInventory;
//        this.entityInventory = new Inventory(this.getInventorySize());
//        if (inventory != null) {
//            inventory.removeListener(this);
//            int i = Math.min(inventory.getSizeInventory(), this.entityInventory.getSizeInventory());
//
//            for(int j = 0; j < i; ++j) {
//                ItemStack itemstack = inventory.getStackInSlot(j);
//                if (!itemstack.isEmpty()) {
//                    this.entityInventory.setInventorySlotContents(j, itemstack.copy());
//                }
//            }
//        }
//
//        this.entityInventory.addListener(this);
//        this.func_230275_fc_();
//        this.itemHandler = net.minecraftforge.common.util.LazyOptional.of(() -> new net.minecraftforge.items.wrapper.InvWrapper(this.entityInventory));
//    }
//
//    protected void func_230275_fc_() {
//        if (!this.world.isRemote) {
//            this.setHorseWatchableBoolean(2, !this.entityInventory.getStackInSlot(0).isEmpty());
//        }
//    }
//
//    */
///**
// * Called by InventoryBasic.onInventoryChanged() on a array that is never filled.
// *//*
//
//    public void onInventoryChanged(IInventory invBasic) {
//        boolean flag = this.isHorseSaddled();
//        this.func_230275_fc_();
//        if (this.ticksExisted > 20 && !flag && this.isHorseSaddled()) {
//            this.playSound(SoundEvents.ENTITY_HORSE_SADDLE, 0.5F, 1.0F);
//        }
//
//    }
//
//    public double getHorseJumpStrength() {
//        return this.func_233637_b_(Attributes.field_233830_m_);
//    }
//
//    @Nullable
//    protected SoundEvent func_230274_fe_() {
//        return null;
//    }
//
//    @Nullable
//    protected SoundEvent getDeathSound() {
//        return null;
//    }
//
//    @Nullable
//    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
//        if (this.rand.nextInt(3) == 0) {
//            this.makeHorseRear();
//        }
//
//        return null;
//    }
//
//    @Nullable
//    protected SoundEvent getAmbientSound() {
//        if (this.rand.nextInt(10) == 0 && !this.isMovementBlocked()) {
//            this.makeHorseRear();
//        }
//
//        return null;
//    }
//
//    @Nullable
//    protected SoundEvent getAngrySound() {
//        this.makeHorseRear();
//        return null;
//    }
//
//    protected void playStepSound(BlockPos pos, BlockState blockIn) {
//        if (!blockIn.getMaterial().isLiquid()) {
//            BlockState blockstate = this.world.getBlockState(pos.up());
//            SoundType soundtype = blockIn.getSoundType(world, pos, this);
//            if (blockstate.isIn(Blocks.SNOW)) {
//                soundtype = blockstate.getSoundType(world, pos, this);
//            }
//
//            if (this.isBeingRidden() && this.canGallop) {
//                ++this.gallopTime;
//                if (this.gallopTime > 5 && this.gallopTime % 3 == 0) {
//                    this.playGallopSound(soundtype);
//                } else if (this.gallopTime <= 5) {
//                    this.playSound(SoundEvents.ENTITY_HORSE_STEP_WOOD, soundtype.getVolume() * 0.15F, soundtype.getPitch());
//                }
//            } else if (soundtype == SoundType.WOOD) {
//                this.playSound(SoundEvents.ENTITY_HORSE_STEP_WOOD, soundtype.getVolume() * 0.15F, soundtype.getPitch());
//            } else {
//                this.playSound(SoundEvents.ENTITY_HORSE_STEP, soundtype.getVolume() * 0.15F, soundtype.getPitch());
//            }
//
//        }
//    }
//
//    protected void playGallopSound(SoundType p_190680_1_) {
//        this.playSound(SoundEvents.ENTITY_HORSE_GALLOP, p_190680_1_.getVolume() * 0.15F, p_190680_1_.getPitch());
//    }
//
//    public static AttributeModifierMap.MutableAttribute func_234237_fg_() {
//        return MobEntity.func_233666_p_().func_233814_a_(Attributes.field_233830_m_).func_233815_a_(Attributes.field_233818_a_, 53.0D).func_233815_a_(Attributes.field_233821_d_, (double)0.225F);
//    }
//
//    */
///**
// * Will return how many at most can spawn in a chunk at once.
// *//*
//
//    public int getMaxSpawnedInChunk() {
//        return 6;
//    }
//
//    public int getMaxTemper() {
//        return 100;
//    }
//
//    */
///**
// * Returns the volume for the sounds this mob makes.
// *//*
//
//    protected float getSoundVolume() {
//        return 0.8F;
//    }
//
//    */
///**
// * Get number of ticks, at least during which the living entity will be silent.
// *//*
//
//    public int getTalkInterval() {
//        return 400;
//    }
//
//    public void openGUI(PlayerEntity playerEntity) {
//        if (!this.world.isRemote && (!this.isBeingRidden() || this.isPassenger(playerEntity)) && this.isTamed()) {
//            playerEntity.openHorseInventory(this, this.horseChest);
//        }
//
//    }
//
//    public ActionResultType func_241395_b_(PlayerEntity p_241395_1_, ItemStack p_241395_2_) {
//        boolean flag = this.handleEating(p_241395_1_, p_241395_2_);
//        if (!p_241395_1_.abilities.isCreativeMode) {
//            p_241395_2_.shrink(1);
//        }
//
//        if (this.world.isRemote) {
//            return ActionResultType.CONSUME;
//        } else {
//            return flag ? ActionResultType.SUCCESS : ActionResultType.PASS;
//        }
//    }
//
//    protected boolean handleEating(PlayerEntity player, ItemStack stack) {
//        boolean flag = false;
//        float f = 0.0F;
//        int i = 0;
//        int j = 0;
//        Item item = stack.getItem();
//        if (item == Items.WHEAT) {
//            f = 2.0F;
//            i = 20;
//            j = 3;
//        } else if (item == Items.SUGAR) {
//            f = 1.0F;
//            i = 30;
//            j = 3;
//        } else if (item == Blocks.HAY_BLOCK.asItem()) {
//            f = 20.0F;
//            i = 180;
//        } else if (item == Items.APPLE) {
//            f = 3.0F;
//            i = 60;
//            j = 3;
//        } else if (item == Items.GOLDEN_CARROT) {
//            f = 4.0F;
//            i = 60;
//            j = 5;
//            if (!this.world.isRemote && this.isTamed() && this.getGrowingAge() == 0 && !this.isInLove()) {
//                flag = true;
//                this.setInLove(player);
//            }
//        } else if (item == Items.GOLDEN_APPLE || item == Items.ENCHANTED_GOLDEN_APPLE) {
//            f = 10.0F;
//            i = 240;
//            j = 10;
//            if (!this.world.isRemote && this.isTamed() && this.getGrowingAge() == 0 && !this.isInLove()) {
//                flag = true;
//                this.setInLove(player);
//            }
//        }
//
//        if (this.getHealth() < this.getMaxHealth() && f > 0.0F) {
//            this.heal(f);
//            flag = true;
//        }
//
//        if (this.isChild() && i > 0) {
//            this.world.addParticle(ParticleTypes.HAPPY_VILLAGER, this.getPosXRandom(1.0D), this.getPosYRandom() + 0.5D, this.getPosZRandom(1.0D), 0.0D, 0.0D, 0.0D);
//            if (!this.world.isRemote) {
//                this.addGrowth(i);
//            }
//
//            flag = true;
//        }
//
//        if (j > 0 && (flag || !this.isTamed()) && this.getTemper() < this.getMaxTemper()) {
//            flag = true;
//            if (!this.world.isRemote) {
//                this.increaseTemper(j);
//            }
//        }
//
//        if (flag) {
//            this.eatingHorse();
//        }
//
//        return flag;
//    }
//
//    protected void mountTo(PlayerEntity player) {
//        this.setEatingHaystack(false);
//        this.setRearing(false);
//        if (!this.world.isRemote) {
//            player.rotationYaw = this.rotationYaw;
//            player.rotationPitch = this.rotationPitch;
//            player.startRiding(this);
//        }
//
//    }
//
//    */
///**
// * Dead and sleeping entities cannot move
// *//*
//
//    protected boolean isMovementBlocked() {
//        return super.isMovementBlocked() && this.isBeingRidden() && this.isHorseSaddled() || this.isEatingHaystack() || this.isRearing();
//    }
//
//    */
///**
// * Checks if the parameter is an item which this animal can be fed to breed it (wheat, carrots or seeds depending on
// * the animal type)
// *//*
//
//    public boolean isBreedingItem(ItemStack stack) {
//        return field_234235_bE_.test(stack);
//    }
//
//    private void moveTail() {
//        this.tailCounter = 1;
//    }
//
//    protected void dropInventory() {
//        super.dropInventory();
//        if (this.horseChest != null) {
//            for(int i = 0; i < this.horseChest.getSizeInventory(); ++i) {
//                ItemStack itemstack = this.horseChest.getStackInSlot(i);
//                if (!itemstack.isEmpty() && !EnchantmentHelper.hasVanishingCurse(itemstack)) {
//                    this.entityDropItem(itemstack);
//                }
//            }
//
//        }
//    }
//
//    */
///**
// * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
// * use this to react to sunlight and start to burn.
// *//*
//
//    public void livingTick() {
//        if (this.rand.nextInt(200) == 0) {
//            this.moveTail();
//        }
//
//        super.livingTick();
//        if (!this.world.isRemote && this.isAlive()) {
//            if (this.rand.nextInt(900) == 0 && this.deathTime == 0) {
//                this.heal(1.0F);
//            }
//
//            if (this.canEatGrass()) {
//                if (!this.isEatingHaystack() && !this.isBeingRidden() && this.rand.nextInt(300) == 0 && this.world.getBlockState(this.func_233580_cy_().down()).isIn(Blocks.GRASS_BLOCK)) {
//                    this.setEatingHaystack(true);
//                }
//
//                if (this.isEatingHaystack() && ++this.eatingCounter > 50) {
//                    this.eatingCounter = 0;
//                    this.setEatingHaystack(false);
//                }
//            }
//
//            this.followMother();
//        }
//    }
//
//    protected void followMother() {
//        if (this.isBreeding() && this.isChild() && !this.isEatingHaystack()) {
//            LivingEntity livingentity = this.world.getClosestEntityWithinAABB(AbstractHorseEntity.class, MOMMY_TARGETING, this, this.getPosX(), this.getPosY(), this.getPosZ(), this.getBoundingBox().grow(16.0D));
//            if (livingentity != null && this.getDistanceSq(livingentity) > 4.0D) {
//                this.navigator.getPathToEntity(livingentity, 0);
//            }
//        }
//
//    }
//
//    public boolean canEatGrass() {
//        return true;
//    }
//
//    */
///**
// * Called to update the entity's position/logic.
// *//*
//
//    public void tick() {
//        super.tick();
//        if (this.openMouthCounter > 0 && ++this.openMouthCounter > 30) {
//            this.openMouthCounter = 0;
//            this.setHorseWatchableBoolean(64, false);
//        }
//
//        if ((this.canPassengerSteer() || this.isServerWorld()) && this.jumpRearingCounter > 0 && ++this.jumpRearingCounter > 20) {
//            this.jumpRearingCounter = 0;
//            this.setRearing(false);
//        }
//
//        if (this.tailCounter > 0 && ++this.tailCounter > 8) {
//            this.tailCounter = 0;
//        }
//
//        if (this.sprintCounter > 0) {
//            ++this.sprintCounter;
//            if (this.sprintCounter > 300) {
//                this.sprintCounter = 0;
//            }
//        }
//
//        this.prevHeadLean = this.headLean;
//        if (this.isEatingHaystack()) {
//            this.headLean += (1.0F - this.headLean) * 0.4F + 0.05F;
//            if (this.headLean > 1.0F) {
//                this.headLean = 1.0F;
//            }
//        } else {
//            this.headLean += (0.0F - this.headLean) * 0.4F - 0.05F;
//            if (this.headLean < 0.0F) {
//                this.headLean = 0.0F;
//            }
//        }
//
//        this.prevRearingAmount = this.rearingAmount;
//        if (this.isRearing()) {
//            this.headLean = 0.0F;
//            this.prevHeadLean = this.headLean;
//            this.rearingAmount += (1.0F - this.rearingAmount) * 0.4F + 0.05F;
//            if (this.rearingAmount > 1.0F) {
//                this.rearingAmount = 1.0F;
//            }
//        } else {
//            this.allowStandSliding = false;
//            this.rearingAmount += (0.8F * this.rearingAmount * this.rearingAmount * this.rearingAmount - this.rearingAmount) * 0.6F - 0.05F;
//            if (this.rearingAmount < 0.0F) {
//                this.rearingAmount = 0.0F;
//            }
//        }
//
//        this.prevMouthOpenness = this.mouthOpenness;
//        if (this.getHorseWatchableBoolean(64)) {
//            this.mouthOpenness += (1.0F - this.mouthOpenness) * 0.7F + 0.05F;
//            if (this.mouthOpenness > 1.0F) {
//                this.mouthOpenness = 1.0F;
//            }
//        } else {
//            this.mouthOpenness += (0.0F - this.mouthOpenness) * 0.7F - 0.05F;
//            if (this.mouthOpenness < 0.0F) {
//                this.mouthOpenness = 0.0F;
//            }
//        }
//
//    }
//
//    private void openHorseMouth() {
//        if (!this.world.isRemote) {
//            this.openMouthCounter = 1;
//            this.setHorseWatchableBoolean(64, true);
//        }
//
//    }
//
//    public void setEatingHaystack(boolean p_110227_1_) {
//        this.setHorseWatchableBoolean(16, p_110227_1_);
//    }
//
//    public void setRearing(boolean rearing) {
//        if (rearing) {
//            this.setEatingHaystack(false);
//        }
//
//        this.setHorseWatchableBoolean(32, rearing);
//    }
//
//    private void makeHorseRear() {
//        if (this.canPassengerSteer() || this.isServerWorld()) {
//            this.jumpRearingCounter = 1;
//            this.setRearing(true);
//        }
//
//    }
//
//    public void makeMad() {
//        if (!this.isRearing()) {
//            this.makeHorseRear();
//            SoundEvent soundevent = this.getAngrySound();
//            if (soundevent != null) {
//                this.playSound(soundevent, this.getSoundVolume(), this.getSoundPitch());
//            }
//        }
//
//    }
//
//    public boolean setTamedBy(PlayerEntity player) {
//        this.setOwnerId(player.getUniqueID());
//        this.setHorseTamed(true);
//        if (player instanceof ServerPlayerEntity) {
//            CriteriaTriggers.TAME_ANIMAL.trigger((ServerPlayerEntity)player, this);
//        }
//
//        this.world.setEntityState(this, (byte)7);
//        return true;
//    }
//
//    public void travel(Vector3d p_213352_1_) {
//        if (this.isAlive()) {
//            if (this.isBeingRidden() && this.canBeSteered() && this.isHorseSaddled()) {
//                LivingEntity livingentity = (LivingEntity)this.getControllingPassenger();
//                this.rotationYaw = livingentity.rotationYaw;
//                this.prevRotationYaw = this.rotationYaw;
//                this.rotationPitch = livingentity.rotationPitch * 0.5F;
//                this.setRotation(this.rotationYaw, this.rotationPitch);
//                this.renderYawOffset = this.rotationYaw;
//                this.rotationYawHead = this.renderYawOffset;
//                float f = livingentity.moveStrafing * 0.5F;
//                float f1 = livingentity.moveForward;
//                if (f1 <= 0.0F) {
//                    f1 *= 0.25F;
//                    this.gallopTime = 0;
//                }
//
//                if (this.onGround && this.jumpPower == 0.0F && this.isRearing() && !this.allowStandSliding) {
//                    f = 0.0F;
//                    f1 = 0.0F;
//                }
//
//                if (this.jumpPower > 0.0F && !this.isHorseJumping() && this.onGround) {
//                    double d0 = this.getHorseJumpStrength() * (double)this.jumpPower * (double)this.getJumpFactor();
//                    double d1;
//                    if (this.isPotionActive(Effects.JUMP_BOOST)) {
//                        d1 = d0 + (double)((float)(this.getActivePotionEffect(Effects.JUMP_BOOST).getAmplifier() + 1) * 0.1F);
//                    } else {
//                        d1 = d0;
//                    }
//
//                    Vector3d vector3d = this.getMotion();
//                    this.setMotion(vector3d.x, d1, vector3d.z);
//                    this.setHorseJumping(true);
//                    this.isAirBorne = true;
//                    net.minecraftforge.common.ForgeHooks.onLivingJump(this);
//                    if (f1 > 0.0F) {
//                        float f2 = MathHelper.sin(this.rotationYaw * ((float)Math.PI / 180F));
//                        float f3 = MathHelper.cos(this.rotationYaw * ((float)Math.PI / 180F));
//                        this.setMotion(this.getMotion().add((double)(-0.4F * f2 * this.jumpPower), 0.0D, (double)(0.4F * f3 * this.jumpPower)));
//                    }
//
//                    this.jumpPower = 0.0F;
//                }
//
//                this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1F;
//                if (this.canPassengerSteer()) {
//                    this.setAIMoveSpeed((float)this.func_233637_b_(Attributes.field_233821_d_));
//                    super.travel(new Vector3d((double)f, p_213352_1_.y, (double)f1));
//                } else if (livingentity instanceof PlayerEntity) {
//                    this.setMotion(Vector3d.ZERO);
//                }
//
//                if (this.onGround) {
//                    this.jumpPower = 0.0F;
//                    this.setHorseJumping(false);
//                }
//
//                this.func_233629_a_(this, false);
//            } else {
//                this.jumpMovementFactor = 0.02F;
//                super.travel(p_213352_1_);
//            }
//        }
//    }
//
//    protected void playJumpSound() {
//        this.playSound(SoundEvents.ENTITY_HORSE_JUMP, 0.4F, 1.0F);
//    }
//
//    public void writeAdditional(CompoundNBT compound) {
//        super.writeAdditional(compound);
//        compound.putBoolean("EatingHaystack", this.isEatingHaystack());
//        compound.putBoolean("Bred", this.isBreeding());
//        compound.putInt("Temper", this.getTemper());
//        compound.putBoolean("Tame", this.isTamed());
//        if (this.getOwnerId() != null) {
//            compound.putUniqueId("Owner", this.getOwnerId());
//        }
//
//        if (!this.horseChest.getStackInSlot(0).isEmpty()) {
//            compound.put("SaddleItem", this.horseChest.getStackInSlot(0).write(new CompoundNBT()));
//        }
//
//    }
//
//    */
///**
// * (abstract) Protected helper method to read subclass entity data from NBT.
// *//*
//
//    public void readAdditional(CompoundNBT compound) {
//        super.readAdditional(compound);
//        this.setEatingHaystack(compound.getBoolean("EatingHaystack"));
//        this.setBreeding(compound.getBoolean("Bred"));
//        this.setTemper(compound.getInt("Temper"));
//        this.setHorseTamed(compound.getBoolean("Tame"));
//        UUID uuid;
//        if (compound.hasUniqueId("Owner")) {
//            uuid = compound.getUniqueId("Owner");
//        } else {
//            String s = compound.getString("Owner");
//            uuid = PreYggdrasilConverter.convertMobOwnerIfNeeded(this.getServer(), s);
//        }
//
//        if (uuid != null) {
//            this.setOwnerId(uuid);
//        }
//
//        if (compound.contains("SaddleItem", 10)) {
//            ItemStack itemstack = ItemStack.read(compound.getCompound("SaddleItem"));
//            if (itemstack.getItem() == Items.SADDLE) {
//                this.horseChest.setInventorySlotContents(0, itemstack);
//            }
//        }
//
//        this.func_230275_fc_();
//    }
//
//    */
///**
// * Returns true if the mob is currently able to mate with the specified mob.
// *//*
//
//    public boolean canMateWith(AnimalEntity otherAnimal) {
//        return false;
//    }
//
//    */
///**
// * Return true if the horse entity ready to mate. (no rider, not riding, tame, adult, not steril...)
// *//*
//
//    protected boolean canMate() {
//        return !this.isBeingRidden() && !this.isPassenger() && this.isTamed() && !this.isChild() && this.getHealth() >= this.getMaxHealth() && this.isInLove();
//    }
//
//    @Nullable
//    public AgeableEntity func_241840_a(ServerWorld p_241840_1_, AgeableEntity p_241840_2_) {
//        return null;
//    }
//
//    protected void setOffspringAttributes(AgeableEntity p_190681_1_, AbstractHorseEntity p_190681_2_) {
//        double d0 = this.func_233638_c_(Attributes.field_233818_a_) + p_190681_1_.func_233638_c_(Attributes.field_233818_a_) + (double)this.getModifiedMaxHealth();
//        p_190681_2_.getAttribute(Attributes.field_233818_a_).setBaseValue(d0 / 3.0D);
//        double d1 = this.func_233638_c_(Attributes.field_233830_m_) + p_190681_1_.func_233638_c_(Attributes.field_233830_m_) + this.getModifiedJumpStrength();
//        p_190681_2_.getAttribute(Attributes.field_233830_m_).setBaseValue(d1 / 3.0D);
//        double d2 = this.func_233638_c_(Attributes.field_233821_d_) + p_190681_1_.func_233638_c_(Attributes.field_233821_d_) + this.getModifiedMovementSpeed();
//        p_190681_2_.getAttribute(Attributes.field_233821_d_).setBaseValue(d2 / 3.0D);
//    }
//
//    */
///**
// * returns true if all the conditions for steering the entity are met. For pigs, this is true if it is being ridden
// * by a player and the player is holding a carrot-on-a-stick
// *//*
//
//    public boolean canBeSteered() {
//        return this.getControllingPassenger() instanceof LivingEntity;
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public float getGrassEatingAmount(float p_110258_1_) {
//        return MathHelper.lerp(p_110258_1_, this.prevHeadLean, this.headLean);
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public float getRearingAmount(float p_110223_1_) {
//        return MathHelper.lerp(p_110223_1_, this.prevRearingAmount, this.rearingAmount);
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public float getMouthOpennessAngle(float p_110201_1_) {
//        return MathHelper.lerp(p_110201_1_, this.prevMouthOpenness, this.mouthOpenness);
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public void setJumpPower(int jumpPowerIn) {
//        if (this.isHorseSaddled()) {
//            if (jumpPowerIn < 0) {
//                jumpPowerIn = 0;
//            } else {
//                this.allowStandSliding = true;
//                this.makeHorseRear();
//            }
//
//            if (jumpPowerIn >= 90) {
//                this.jumpPower = 1.0F;
//            } else {
//                this.jumpPower = 0.4F + 0.4F * (float)jumpPowerIn / 90.0F;
//            }
//
//        }
//    }
//
//    public boolean canJump() {
//        return this.isHorseSaddled();
//    }
//
//    public void handleStartJump(int p_184775_1_) {
//        this.allowStandSliding = true;
//        this.makeHorseRear();
//        this.playJumpSound();
//    }
//
//    public void handleStopJump() {
//    }
//
//    */
///**
// * "Spawns particles for the horse entity. par1 tells whether to spawn hearts. If it is false, it spawns smoke."
// *//*
//
//    @OnlyIn(Dist.CLIENT)
//    protected void spawnHorseParticles(boolean p_110216_1_) {
//        IParticleData iparticledata = p_110216_1_ ? ParticleTypes.HEART : ParticleTypes.SMOKE;
//
//        for(int i = 0; i < 7; ++i) {
//            double d0 = this.rand.nextGaussian() * 0.02D;
//            double d1 = this.rand.nextGaussian() * 0.02D;
//            double d2 = this.rand.nextGaussian() * 0.02D;
//            this.world.addParticle(iparticledata, this.getPosXRandom(1.0D), this.getPosYRandom() + 0.5D, this.getPosZRandom(1.0D), d0, d1, d2);
//        }
//
//    }
//
//    */
///**
// * Handler for {@link World#setEntityState}
// *//*
//
//    @OnlyIn(Dist.CLIENT)
//    public void handleStatusUpdate(byte id) {
//        if (id == 7) {
//            this.spawnHorseParticles(true);
//        } else if (id == 6) {
//            this.spawnHorseParticles(false);
//        } else {
//            super.handleStatusUpdate(id);
//        }
//
//    }
//
//    public void updatePassenger(Entity passenger) {
//        super.updatePassenger(passenger);
//        if (passenger instanceof MobEntity) {
//            MobEntity mobentity = (MobEntity)passenger;
//            this.renderYawOffset = mobentity.renderYawOffset;
//        }
//
//        if (this.prevRearingAmount > 0.0F) {
//            float f3 = MathHelper.sin(this.renderYawOffset * ((float)Math.PI / 180F));
//            float f = MathHelper.cos(this.renderYawOffset * ((float)Math.PI / 180F));
//            float f1 = 0.7F * this.prevRearingAmount;
//            float f2 = 0.15F * this.prevRearingAmount;
//            passenger.setPosition(this.getPosX() + (double)(f1 * f3), this.getPosY() + this.getMountedYOffset() + passenger.getYOffset() + (double)f2, this.getPosZ() - (double)(f1 * f));
//            if (passenger instanceof LivingEntity) {
//                ((LivingEntity)passenger).renderYawOffset = this.renderYawOffset;
//            }
//        }
//
//    }
//
//    */
///**
// * Returns randomized max health
// *//*
//
//    protected float getModifiedMaxHealth() {
//        return 15.0F + (float)this.rand.nextInt(8) + (float)this.rand.nextInt(9);
//    }
//
//    */
///**
// * Returns randomized jump strength
// *//*
//
//    protected double getModifiedJumpStrength() {
//        return (double)0.4F + this.rand.nextDouble() * 0.2D + this.rand.nextDouble() * 0.2D + this.rand.nextDouble() * 0.2D;
//    }
//
//    */
///**
// * Returns randomized movement speed
// *//*
//
//    protected double getModifiedMovementSpeed() {
//        return ((double)0.45F + this.rand.nextDouble() * 0.3D + this.rand.nextDouble() * 0.3D + this.rand.nextDouble() * 0.3D) * 0.25D;
//    }
//
//    */
///**
// * Returns true if this entity should move as if it were on a ladder (either because it's actually on a ladder, or
// * for AI reasons)
// *//*
//
//    public boolean isOnLadder() {
//        return false;
//    }
//
//    protected float getStandingEyeHeight(Pose poseIn, EntitySize sizeIn) {
//        return sizeIn.height * 0.95F;
//    }
//
//    public boolean func_230276_fq_() {
//        return false;
//    }
//
//    public boolean func_230277_fr_() {
//        return !this.getItemStackFromSlot(EquipmentSlotType.CHEST).isEmpty();
//    }
//
//    public boolean isArmor(ItemStack stack) {
//        return false;
//    }
//
//    public boolean replaceItemInInventory(int inventorySlot, ItemStack itemStackIn) {
//        int i = inventorySlot - 400;
//        if (i >= 0 && i < 2 && i < this.horseChest.getSizeInventory()) {
//            if (i == 0 && itemStackIn.getItem() != Items.SADDLE) {
//                return false;
//            } else if (i != 1 || this.func_230276_fq_() && this.isArmor(itemStackIn)) {
//                this.horseChest.setInventorySlotContents(i, itemStackIn);
//                this.func_230275_fc_();
//                return true;
//            } else {
//                return false;
//            }
//        } else {
//            int j = inventorySlot - 500 + 2;
//            if (j >= 2 && j < this.horseChest.getSizeInventory()) {
//                this.horseChest.setInventorySlotContents(j, itemStackIn);
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }
//
//    */
///**
// * For vehicles, the first passenger is generally considered the controller and "drives" the vehicle. For example,
// * Pigs, Horses, and Boats are generally "steered" by the controlling passenger.
// *//*
//
//    @Nullable
//    public Entity getControllingPassenger() {
//        return this.getPassengers().isEmpty() ? null : this.getPassengers().get(0);
//    }
//
//    @Nullable
//    private Vector3d func_234236_a_(Vector3d p_234236_1_, LivingEntity p_234236_2_) {
//        double d0 = this.getPosX() + p_234236_1_.x;
//        double d1 = this.getBoundingBox().minY;
//        double d2 = this.getPosZ() + p_234236_1_.z;
//        BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();
//
//        for(Pose pose : p_234236_2_.func_230297_ef_()) {
//            blockpos$mutable.setPos(d0, d1, d2);
//            double d3 = this.getBoundingBox().maxY + 0.75D;
//
//            while(true) {
//                double d4 = this.world.func_242403_h(blockpos$mutable);
//                if ((double)blockpos$mutable.getY() + d4 > d3) {
//                    break;
//                }
//
//                if (TransportationHelper.func_234630_a_(d4)) {
//                    AxisAlignedBB axisalignedbb = p_234236_2_.func_233648_f_(pose);
//                    Vector3d vector3d = new Vector3d(d0, (double)blockpos$mutable.getY() + d4, d2);
//                    if (TransportationHelper.func_234631_a_(this.world, p_234236_2_, axisalignedbb.offset(vector3d))) {
//                        p_234236_2_.setPose(pose);
//                        return vector3d;
//                    }
//                }
//
//                blockpos$mutable.move(Direction.UP);
//                if (!((double)blockpos$mutable.getY() < d3)) {
//                    break;
//                }
//            }
//        }
//
//        return null;
//    }
//
//    public Vector3d func_230268_c_(LivingEntity p_230268_1_) {
//        Vector3d vector3d = func_233559_a_((double)this.getWidth(), (double)p_230268_1_.getWidth(), this.rotationYaw + (p_230268_1_.getPrimaryHand() == HandSide.RIGHT ? 90.0F : -90.0F));
//        Vector3d vector3d1 = this.func_234236_a_(vector3d, p_230268_1_);
//        if (vector3d1 != null) {
//            return vector3d1;
//        } else {
//            Vector3d vector3d2 = func_233559_a_((double)this.getWidth(), (double)p_230268_1_.getWidth(), this.rotationYaw + (p_230268_1_.getPrimaryHand() == HandSide.LEFT ? 90.0F : -90.0F));
//            Vector3d vector3d3 = this.func_234236_a_(vector3d2, p_230268_1_);
//            return vector3d3 != null ? vector3d3 : this.getPositionVec();
//        }
//    }
//
//    protected void func_230273_eI_() {
//    }
//
//    @Nullable
//    public ILivingEntityData onInitialSpawn(IServerWorld worldIn, DifficultyInstance difficultyIn, SpawnReason reason, @Nullable ILivingEntityData spawnDataIn, @Nullable CompoundNBT dataTag) {
//        if (spawnDataIn == null) {
//            spawnDataIn = new AgeableEntity.AgeableData(0.2F);
//        }
//
//        this.func_230273_eI_();
//        return super.onInitialSpawn(worldIn, difficultyIn, reason, spawnDataIn, dataTag);
//    }
//
//    private net.minecraftforge.common.util.LazyOptional<?> itemHandler = null;
//
//    @Override
//    public <T> net.minecraftforge.common.util.LazyOptional<T> getCapability(net.minecraftforge.common.capabilities.Capability<T> capability, @Nullable net.minecraft.util.Direction facing) {
//        if (this.isAlive() && capability == net.minecraftforge.items.CapabilityItemHandler.ITEM_HANDLER_CAPABILITY && itemHandler != null)
//            return itemHandler.cast();
//        return super.getCapability(capability, facing);
//    }
//
//    @Override
//    public void remove(boolean keepData) {
//        super.remove(keepData);
//        if (!keepData && itemHandler != null) {
//            itemHandler.invalidate();
//            itemHandler = null;
//        }
//    }
//}
