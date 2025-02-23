package net.nynnr.nynnrmod;

import net.fabricmc.api.ModInitializer;

import net.nynnr.nynnrmod.block.ModBlocks;
import net.nynnr.nynnrmod.item.ModItemGroups;
import net.nynnr.nynnrmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NynnrMod implements ModInitializer {
	public static final String MOD_ID = "nynnr-mod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemsGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}