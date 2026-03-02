package com.actionbar.command;

import com.actionbar.config.ModConfig;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.text.Text;

public class NABCommand {
    
    public static void register(CommandDispatcher<FabricClientCommandSource> dispatcher) {
        dispatcher.register(ClientCommandManager.literal("nab")
            .executes(NABCommand::execute)
        );
    }
    
    private static int execute(CommandContext<FabricClientCommandSource> context) {
        ModConfig config = ModConfig.getInstance();
        config.toggle();
        
        String status = config.enabled ? "On" : "Off";
        context.getSource().sendFeedback(Text.literal("NoActionBar " + status));
        
        return 1;
    }
}
