package com.tzaranthony.liberexponentia;

import com.tzaranthony.liberexponentia.util.LEItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("liberexponentia")
public class LiberExponentia {
	
	public static boolean curiosLoaded = false;
	
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "liberexponentia";
    
    public LiberExponentia() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {}
    
    
    public static final ItemGroup TAB = new ItemGroup("LibExp") {
    	@Override
    	public ItemStack createIcon() {
    		return new ItemStack(LEItems.DRACONITE);
    	};
    };
}
