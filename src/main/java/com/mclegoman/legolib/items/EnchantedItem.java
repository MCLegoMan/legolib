// Copyright (c) Daniel-Tayden Larsen 2022 //
// License: Open Source MCLegoMan Software License //

package com.mclegoman.legolib.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class EnchantedItem extends Item {
    public EnchantedItem(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}
