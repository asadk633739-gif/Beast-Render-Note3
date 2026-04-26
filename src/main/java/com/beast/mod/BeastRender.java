package com.beast.mod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeastRender implements ModInitializer {
    public static final String MOD_ID = "beastrender";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // Infinix Note 30 5G - PC Level Optimization
        LOGGER.info("Beast-Render V2: Engine Started!");
        LOGGER.info("Mode: Ultra Smooth (Holy Renderer Compatible)");
    }
}
