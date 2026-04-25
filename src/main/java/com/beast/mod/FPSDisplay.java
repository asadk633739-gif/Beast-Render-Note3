package com.beast.mod;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.util.math.MatrixStack;

public class FPSDisplay {
    public static void render(MatrixStack matrices) {
        MinecraftClient client = MinecraftClient.getInstance();
        TextRenderer renderer = client.textRenderer;
        
        // Asli FPS nikalne ka logic
        int fps = ((MinecraftClientAccessor)client).getCurrentFps();
        
        // Screen par top-left mein dikhega (Color: Green)
        renderer.draw(matrices, "Beast FPS: " + fps, 5, 5, 0x00FF00);
        
        // GPU Boost Signal for Mali-G57
        if (fps < 60) {
            // Memory saaf karne ka logic yahan trigger hoga
        }
    }
}
