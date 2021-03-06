// Copyright (c) Daniel-Tayden Larsen 2022 //
// License: Open Source MCLegoMan Software License //

package com.mclegoman.legolib;

import com.mclegoman.legolib.registry.ModEffects;
import com.mclegoman.legolib.registry.ModPehkuiPowers;
import com.mclegoman.legolib.registry.ModPowers;
import com.mclegoman.legolib.registry.ModScaleTypes;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class main implements ModInitializer {
    public static final String MOD_ID = "legolib";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static boolean modPehkuiInstalled = false;
    public static boolean modOriginsInstalled = false;

    @Override
    public void onInitialize() {
        FabricLoader.getInstance().getModContainer("pehkui").ifPresent(
                modContainer -> {
                    modPehkuiInstalled = true;
                }
        );
        FabricLoader.getInstance().getModContainer("origins").ifPresent(
                modContainer -> {
                    modOriginsInstalled = true;
                }
        );
        if(modOriginsInstalled == true) {
            ModEffects.registerEffects();
            ModPowers.registerPowers();
            if(modPehkuiInstalled == true) {
                ModScaleTypes.registerScaleTypes();
                ModPehkuiPowers.registerPehkuiPowers();
            }
        }
    }

    public static Identifier identifier(String path) {
        return new Identifier(MOD_ID, path);
    }
}