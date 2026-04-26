package com.beast.mod;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;

public class FPSDisplay {
    public static void render(DrawContext context) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || client.textRenderer == null) return;

        TextRenderer renderer = client.textRenderer;
        
        // Mobile FPS extraction (Safe Method)
        String fpsText = "Beast-V2 FPS: " + client.getCurrentFps();
        
        // Screen rendering (Top Left)
        // §a = Green color for that PC feel
        context.drawText(renderer, "§a" + fpsText, 10, 10, 0xFFFFFF, true);
        
        // Performance Signal
        if (client.getCurrentFps() < 60) {
            // Future: Add Holy Renderer optimization calls here
        }
    }
}
