// Copyright (c) Daniel-Tayden Larsen 2022 //
// License: Open Source MCLegoMan Software License //

package com.mclegoman.legolib.registry;

import com.mclegoman.legolib.main;
import com.mclegoman.legolib.status_effects.BlankEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.mclegoman.legolib.main.MOD_ID;

public class ModEffects {
    public static StatusEffect INABILITY;
    public static StatusEffect UPGRADING;
    public static StatusEffect POWERED;

    public static StatusEffect registerBlankEffect(String name) {
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(MOD_ID, name),
                new BlankEffect(StatusEffectCategory.HARMFUL, 0xFA113D));
    }

    public static void registerEffects() {
        main.LOGGER.info("Registering Effects for Mod:", MOD_ID);
        INABILITY = registerBlankEffect("inability");
        UPGRADING = registerBlankEffect("upgrading");
        POWERED = registerBlankEffect("powered");
    }
}
