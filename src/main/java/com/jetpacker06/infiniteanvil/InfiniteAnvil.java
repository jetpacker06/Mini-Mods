package com.jetpacker06.infiniteanvil;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.AnvilRepairEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Mod(InfiniteAnvil.MOD_ID)
@Mod.EventBusSubscriber
@SuppressWarnings("unused")
public class InfiniteAnvil {
    public static final String MOD_ID = "infiniteanvil";
    public static final Logger LOGGER = LogManager.getLogger();

    public InfiniteAnvil() {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public static void onAnvilUse(AnvilRepairEvent event) {
        event.setBreakChance(0f);
    }
}