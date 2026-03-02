package com.actionbar.mixin;

import com.actionbar.config.ModConfig;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class GuiMixin {
    
    /**
     * Désactive le rendu de la barre d'action (action bar)
     * Cela désactive le texte qui apparaît au-dessus de la barre de santé
     */
    @Inject(method = "renderOverlayMessage", at = @At("HEAD"), cancellable = true)
    private void disableActionBar(DrawContext context, RenderTickCounter tickCounter, CallbackInfo ci) {
        // Check if the mod is enabled
        if (ModConfig.getInstance().enabled) {
            // Annule le rendu de la barre d'action
            ci.cancel();
        }
    }
}
