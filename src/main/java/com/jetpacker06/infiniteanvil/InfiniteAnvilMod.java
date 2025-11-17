package com.jetpacker06.infiniteanvil;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.player.AnvilRepairEvent;

@Mod(InfiniteAnvilMod.MOD_ID)
@SuppressWarnings("unused")
public class InfiniteAnvilMod {
    public static final String MOD_ID = "infiniteanvil";

    public InfiniteAnvilMod(IEventBus eventBus) {}

    @EventBusSubscriber(modid = MOD_ID)
    public static class ModEvents {
        @SubscribeEvent
        public static void onAnvilUse(AnvilRepairEvent event) {
            event.setBreakChance(0);
        }
    }
}
