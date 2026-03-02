package com.actionbar.gui;

import com.actionbar.config.ModConfig;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class ConfigScreen extends Screen {
    private final Screen parent;
    private ButtonWidget toggleButton;
    
    public ConfigScreen(Screen parent) {
        super(Text.literal("No Action Bar Skyblock Config"));
        this.parent = parent;
    }
    
    @Override
    protected void init() {
        super.init();
        
        ModConfig config = ModConfig.getInstance();
        
        // Toggle button
        toggleButton = ButtonWidget.builder(
            Text.literal("NoActionBar: " + (config.enabled ? "On" : "Off")),
            button -> {
                config.toggle();
                button.setMessage(Text.literal("NoActionBar: " + (config.enabled ? "On" : "Off")));
            }
        )
        .dimensions(this.width / 2 - 100, this.height / 2 - 10, 200, 20)
        .build();
        
        this.addDrawableChild(toggleButton);
        
        // Done button
        this.addDrawableChild(ButtonWidget.builder(
            Text.literal("Done"),
            button -> this.close()
        )
        .dimensions(this.width / 2 - 100, this.height / 2 + 30, 200, 20)
        .build());
    }
    
    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        context.drawCenteredTextWithShadow(this.textRenderer, this.title, this.width / 2, 20, 0xFFFFFF);
    }
    
    @Override
    public void close() {
        if (this.client != null) {
            this.client.setScreen(parent);
        }
    }
}
