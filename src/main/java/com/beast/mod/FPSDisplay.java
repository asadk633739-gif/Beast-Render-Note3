package com.beast.mod;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;

public class FPSDisplay {
    // MatrixStack purana ho gaya hai, DrawContext latest hai
    public static void render(DrawContext context) {
        MinecraftClient client = MinecraftClient.getInstance();
        TextRenderer renderer = client.textRenderer;
        
        // Minecraft ka inbuilt FPS string nikalne ka sabse safe tarika
        String fpsText = client.fpsDebugString.split(" ")[0] + " FPS";
        
        // Screen par top-left mein "Beast Mode" display
        // Syntax: renderer, text, x, y, color, shadow
        context.drawText(renderer, "Beast-V2: " + fpsText, 10, 10, 0x00FF00, true);
        
        // Mali-G57 GPU optimization logic trigger
        if (client.getCurrentFps() < 60) {
            // Memory management triggers here
        }
    }
}
