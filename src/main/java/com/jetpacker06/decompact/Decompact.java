package com.jetpacker06.decompact;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Decompact.MOD_ID)
public class Decompact {
    public static final String MOD_ID = "decompact";

    public Decompact() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
//TODO warden recipe, configurable. by version 2.2. diamond blocks?