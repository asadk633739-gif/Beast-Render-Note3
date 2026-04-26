package com.beast.mod;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;

public class FPSDisplay {
    // Is method ko RenderEvents ya HudRenderCallback se call kiya jata hai
    public static void render(DrawContext context) {
        MinecraftClient client = MinecraftClient.getInstance();
        TextRenderer renderer = client.textRenderer;
        
        // Sabse safe FPS nikalne ka tarika (Zero Error Method)
        String fpsText = "FPS: " + client.getCurrentFps();
        
        // DrawContext ka use karke text render karna
        // context.drawText(renderer, text, x, y, color, shadow)
        context.drawText(renderer, "§aBeast-V2 " + fpsText, 10, 10, 0xFFFFFF, true);
        
        // Dimensity 6080 optimization check
        if (client.getCurrentFps() < 60) {
             // System.gc(); // Ye memory clean karne ke liye use ho sakta hai
        }
    }
}
