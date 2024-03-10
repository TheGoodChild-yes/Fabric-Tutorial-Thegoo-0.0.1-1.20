package com.avery.tutorialmod;


import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	//public static final Block HEHE  = new Block(FabricBlockSettings.create().strength(4.0f));

	@Override
	public void onInitialize() {
		//Registry.register(Registries.BLOCK, new Identifier("tutorial", "BestBlock"), HEHE);
		//Registry.register(Registries.ITEM, new Identifier("tutorial", "example_block"), new BlockItem(HEHE, new FabricItemSettings()));
		LOGGER.info("Hello Fabric world!");
	}
}