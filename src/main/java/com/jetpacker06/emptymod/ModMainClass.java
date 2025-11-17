package com.jetpacker06.emptymod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import org.apache.logging.log4j.LogManager;

@Mod(ModMainClass.MOD_ID)
public class ModMainClass {
    public static final String MOD_ID = "emptymod";
    public static void log(Object msg) {
        LogManager.getLogger().info(msg);
    }

    public ModMainClass(IEventBus eventBus) {
        log("Initializing mod " + MOD_ID);
        ModBlocks.register(eventBus);
        ModItems.register(eventBus);
        eventBus.addListener(this::setup);
        eventBus.register(this);
    }

    @SubscribeEvent
    private void setup(final FMLCommonSetupEvent event) {

    }
}
