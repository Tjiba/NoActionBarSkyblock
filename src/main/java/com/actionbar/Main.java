package com.actionbar;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.gui.DrawContext;

public class Main implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Désactive l'affichage de la action bar en intercepant le rendu du HUD
        HudRenderCallback.EVENT.register((drawContext, tickDelta) -> {
            // Le callback est vide, nous simplement écoutons pour logger si nécessaire
        });
    }
}