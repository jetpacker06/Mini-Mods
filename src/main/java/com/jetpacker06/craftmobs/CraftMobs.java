package com.jetpacker06.craftmobs;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Mod(CraftMobs.MOD_ID)
public class CraftMobs {
    public static final String MOD_ID = "craftmobs";

    public CraftMobs() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
//TODO warden recipe, configurable. by version 2.2