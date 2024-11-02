package net.maxivb.hanstools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.maxivb.hanstools.block.ModBlocks;
import net.maxivb.hanstools.item.ModItemGroups;
import net.maxivb.hanstools.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class HansTools implements ModInitializer {
	public static final String MOD_ID = "hanstools";
	public static final Logger LOGGER  = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.URANIUM, 1000);
	}
}