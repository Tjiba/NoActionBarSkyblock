package com.actionbar;

import com.actionbar.command.NABCommand;
import com.actionbar.config.ModConfig;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;

public class Main implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Load configuration
        ModConfig.getInstance();
        
        // Register /nab command
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
            NABCommand.register(dispatcher);
        });
    }
}
