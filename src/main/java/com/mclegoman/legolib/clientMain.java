// Copyright (c) Daniel-Tayden Larsen 2022 //
// License: Open Source MCLegoMan Software License //

package com.mclegoman.legolib;

import io.github.apace100.apoli.ApoliClient;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

import java.util.List;

public class clientMain implements ClientModInitializer {

    private static boolean originsInstalled;
    public List<String> keys = List.of("ternary","quaternary","quinary","senary","septenary","octonary","nonary","denary");

    @Override
    public void onInitializeClient() {

        FabricLoader.getInstance().getModContainer("origins").ifPresent(
                modContainer -> {
                    originsInstalled = true;
                }
        );

        if(originsInstalled == true) {
            for(String key : keys) {
                KeyBinding binding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                        "legolib.keybind."+key+"_active", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_UNKNOWN, "legolib.keybinds"));
                ApoliClient.registerPowerKeybinding(binding.getTranslationKey(), binding);
                ApoliClient.registerPowerKeybinding(key, binding);
            }
        }

    }
}