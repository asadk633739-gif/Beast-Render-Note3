package com.beast.mod;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.gui.DrawContext;

public class FPSDisplay {
    // MatrixStack ki jagah DrawContext use karna zyada stable hai modern versions mein
    public static void render(DrawContext context) {
        MinecraftClient client = MinecraftClient.getInstance();
        TextRenderer renderer = client.textRenderer;
        
        // Error fix: Accessor ke bina seedha FPS nikalne ka tarika
        // Agar ye error de, toh hum iska simple version use karenge
        String fpsString = client.fpsDebugString.split(" ")[0];
        
        // Screen par top-left mein display (Green color: 0x00FF00)
        // draw method ka sahi syntax:
        context.drawText(renderer, "Beast FPS: " + fpsString, 10, 10, 0x00FF00, true);
        
        // Dimensity 6080 GPU Optimization trigger point
        int fpsInt = Integer.parseInt(fpsString);
        if (fpsInt < 60) {
            // Future logic for Mali-G57 boost
        }
    }
}
