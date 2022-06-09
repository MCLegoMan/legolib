// Copyright (c) Daniel-Tayden Larsen 2022 //
// License: Open Source MCLegoMan Software License //

package com.mclegoman.legolib;

import com.mclegoman.legolib.registry.ModEffects;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class main implements ModInitializer {
    public static final String MOD_ID = "legolib";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModEffects.registerEffects();
    }

    public static Identifier identifier(String path) {
        return new Identifier(MOD_ID, path);
    }
}
