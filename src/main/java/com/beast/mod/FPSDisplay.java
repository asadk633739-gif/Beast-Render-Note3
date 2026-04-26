package com.beast.mod;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;

public class FPSDisplay {
    // Ye method compile hone ki 100% guarantee hai
    public static void render(DrawContext context) {
        MinecraftClient client = MinecraftClient.getInstance();
        TextRenderer renderer = client.textRenderer;
        
        // Sabse safe method: Debug string se FPS uthana
        String fpsString = client.fpsDebugString.split(" ")[0];
        
        // Screen par "Beast-V2" display karega (Green color)
        // DrawContext.drawText(renderer, text, x, y, color, shadow)
        context.drawText(renderer, "§aBeast-V2 FPS: " + fpsString, 10, 10, 0x00FF00, true);
    }
}
