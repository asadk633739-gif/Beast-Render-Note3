package com.beast.mod;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeastCore implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("beast-v2");

    @Override
    public void onInitializeClient() {
        LOGGER.info("BEAST V2: PC Overdrive Mode Initialized!");
        // Rendering aur Exploration hooks yahan se start honge
    }
}
