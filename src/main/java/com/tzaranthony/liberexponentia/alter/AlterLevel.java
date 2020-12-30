package com.tzaranthony.liberexponentia.alter;

/*
public enum AlterLevel {
    void LevelOne() {
    	@Override
    	public void structureComponents(Comsumer<AlterComponents> components) {
    		// center block
    		components.accept(new AlterComponent(new BlockPos(1, 0, 1), componentType.StoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(0, 0, 1), componentType.StoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(-1, 0, 1), componentType.StoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(-1, 0, 0), componentType.StoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(-1, 0, -1), componentType.StoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(0, 0, -1), componentType.StoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(1, 0, -1), componentType.StoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(1, 0, 0), componentType.StoneSlabs));
    		
    		// outer ring
    		components.accept(new AlterComponent(new BlockPos(2, 0, 2), componentType.LapisBlock));
    		components.accept(new AlterComponent(new BlockPos(3, 0, 0), componentType.Gold));
    		components.accept(new AlterComponent(new BlockPos(-2, 0, 2), componentType.LapisBlock));
    		components.accept(new AlterComponent(new BlockPos(-2, 0, -2), componentType.LapisBlock));
    		components.accept(new AlterComponent(new BlockPos(-3, 0, 0), componentType.Gold));
    		components.accept(new AlterComponent(new BlockPos(2, 0, -2), componentType.LapisBlock));
    	};
    },
	
	void LevelTwo() {
    	@Override
    	public void structureComponenets(Consumer<AlterComponenets> components) {
    		// center block
    		components.accept(new AlterComponent(new BlockPos(0, -1, 0), componentType.Lodestone));
    		components.accept(new AlterComponent(new BlockPos(1, -1, 1), componentType.blackstoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(0, -1, 1), componentType.blackstoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(-1, -1, 1), componentType.blackstoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(-1, -1, 0), componentType.blackstoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(-1, -1, -1), componentType.blackstoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(0, -1, -1), componentType.blackstoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(1, -1, -1), componentType.blackstoneSlabs));
    		components.accept(new AlterComponent(new BlockPos(1, -1, 0), componentType.blackstoneSlabs));
    		
    		// outer ring
    		components.accept(new AlterComponent(new BlockPos(3, -1, 3), componentType.DiamondBlock));
    		components.accept(new AlterComponent(new BlockPos(1, -1, 4), componentType.CryingObsidian));
    		components.accept(new AlterComponent(new BlockPos(-1, -1, 4), componentType.CryingObsidian));
    		components.accept(new AlterComponent(new BlockPos(-3, -1, 3), componentType.DiamondBlock));
    		components.accept(new AlterComponent(new BlockPos(-4, -1, 1), componentType.CryingObsidian));
    		components.accept(new AlterComponent(new BlockPos(-4, -1, -1), componentType.CryingObsidian));
    		components.accept(new AlterComponent(new BlockPos(-3, -1, -3), componentType.DiamondBlock));
    		components.accept(new AlterComponent(new BlockPos(-1, -1, -4), componentType.CryingObsidian));
    		components.accept(new AlterComponent(new BlockPos(1, -1, -4), componentType.CryingObsidian));
    		components.accept(new AlterComponent(new BlockPos(3, -1, -3), componentType.DiamondBlock));
    		components.accept(new AlterComponent(new BlockPos(4, -1, -1), componentType.CryingObsidian));
    		components.accept(new AlterComponent(new BlockPos(4, -1, 1), componentType.CryingObsidian));
    	};
    }, 
	
	void LevelThree() {
    	@Override
    	public void structureComponents(Comsumer<AlterComponents> components) {
    		// center block
    		components.accept(new AlterComponent(new BlockPos(0, -1, 0), componentType.Lodestone));
    		components.accept(new AlterComponent(new BlockPos(1, -1, 1), componentType.endSlab));
    		components.accept(new AlterComponent(new BlockPos(0, -1, 1), componentType.endSlab));
    		components.accept(new AlterComponent(new BlockPos(-1, -1, 1), componentType.endSlab));
    		components.accept(new AlterComponent(new BlockPos(-1, -1, 0), componentType.endSlab));
    		components.accept(new AlterComponent(new BlockPos(-1, -1, -1), componentType.endSlab));
    		components.accept(new AlterComponent(new BlockPos(0, -1, -1), componentType.endSlab));
    		components.accept(new AlterComponent(new BlockPos(1, -1, -1), componentType.endSlab));
    		components.accept(new AlterComponent(new BlockPos(1, -1, 0), componentType.endSlab));
    		
    		// outer ring
    		components.accept(new AlterComponent(new BlockPos(3, -1, 3), componentType.NetheriteBlock));
    		components.accept(new AlterComponent(new BlockPos(2, -1, 4), componentType.HihrokaneBlock));
    		components.accept(new AlterComponent(new BlockPos(0, -1, 5), componentType.CelestialIronBlock));
    		components.accept(new AlterComponent(new BlockPos(-2, -1, 4), componentType.HihrokaneBlock));
    		components.accept(new AlterComponent(new BlockPos(-3, -1, 3), componentType.NetheriteBlock));
    		components.accept(new AlterComponent(new BlockPos(-4, -1, 2), componentType.HihrokaneBlock));
    		components.accept(new AlterComponent(new BlockPos(-5, -1, 0), componentType.CelestialIronBlock));
    		components.accept(new AlterComponent(new BlockPos(-4, -1, -2), componentType.HihrokaneBlock));
    		components.accept(new AlterComponent(new BlockPos(-3, -1, -3), componentType.NetheriteBlock));
    		components.accept(new AlterComponent(new BlockPos(-2, -1, -4), componentType.HihrokaneBlock));
    		components.accept(new AlterComponent(new BlockPos(0, -1, -5), componentType.CelestialIronBlock));
    		components.accept(new AlterComponent(new BlockPos(2, -1, -4), componentType.HihrokaneBlock));
    		components.accept(new AlterComponent(new BlockPos(3, -1, -3), componentType.NetheriteBlock));
    		components.accept(new AlterComponent(new BlockPos(4, -1, -2), componentType.HihrokaneBlock));
    		components.accept(new AlterComponent(new BlockPos(5, -1, 0), componentType.CelestialIronBlock));
    		components.accept(new AlterComponent(new BlockPos(4, -1, 2), componentType.HihrokaneBlock));
    		
    		// outer columns
    		components.accept(new AlterComponent(new BlockPos(3, 0, 3), componentType.DiamondBlock));
    		components.accept(new AlterComponent(new BlockPos(-3, 0, 3), componentType.DiamondBlock));
    		components.accept(new AlterComponent(new BlockPos(-3, 0, -3), componentType.DiamondBlock));
    		components.accept(new AlterComponent(new BlockPos(3, 0, -3), componentType.DiamondBlock));
    		components.accept(new AlterComponent(new BlockPos(3, 1, 3), componentType.Beacon));
    		components.accept(new AlterComponent(new BlockPos(-3, 1, 3), componentType.Beacon));
    		components.accept(new AlterComponent(new BlockPos(-3, 1, -3), componentType.Beacon));
    		components.accept(new AlterComponent(new BlockPos(3, 1, -3), componentType.Beacon));
    	};
    },
    

    private List<AltarComponent> altarComponents;

    AlterLevel() {
        this.altarComponents = Lists.newArrayList();

        buildComponents(altarComponents::add);
    }

    public abstract void structureComponents(Consumer<AltarComponent> components);

    public int toInt() {
        return ordinal() + 1;
    }

    public List<AltarComponent> getAltarComponents() {
        return altarComponents;
    }
}
*/
