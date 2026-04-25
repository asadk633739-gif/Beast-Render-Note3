package com.beast.mod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BeastMod implements ModInitializer {
    public static final String MOD_ID = "beastmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Beast Mod V2 Initialized on Infinix Note 30!");
    }
}
