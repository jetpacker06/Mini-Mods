package com.jetpacker06.modpackage;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.SlotTypePreset;

@Mod(GoldenPiggyCharm.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = GoldenPiggyCharm.MOD_ID)
public class GoldenPiggyCharm {
    public static final String MOD_ID = "goldenpiggycharm";

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GoldenPiggyCharm.MOD_ID);
    public static RegistryObject<Item> ITEM = ITEMS.register("golden_piggy_charm", () -> new GoldenPiggyCharmItem(new Item.Properties()));

    public GoldenPiggyCharm() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ITEMS.register(eventBus);
        eventBus.addListener(GoldenPiggyCharm::onInterModEnqueue);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private static void onInterModEnqueue(final InterModEnqueueEvent event) {
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE,
                () -> SlotTypePreset.CHARM.getMessageBuilder().build());
    }

    @SubscribeEvent
    public static void populateTab(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(new ItemStack(ITEM.get()));
        }
    }
}
