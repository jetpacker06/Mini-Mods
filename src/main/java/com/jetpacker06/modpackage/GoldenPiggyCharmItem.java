package com.jetpacker06.modpackage;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

public class GoldenPiggyCharmItem extends Item implements ICurioItem {
    public GoldenPiggyCharmItem(Properties pProperties) {
        super(pProperties.stacksTo(1));
    }

    @Override
    public boolean makesPiglinsNeutral(SlotContext slotContext, ItemStack stack) {
        return true;
    }
}
