package net.nynnr.nynnrmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.nynnr.nynnrmod.NynnrMod;
import net.nynnr.nynnrmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup NYNNRS_RUBYS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(NynnrMod.MOD_ID, "nynnrs_rubys"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BLOCK_OF_RUBY))
                    .displayName(Text.translatable("itemgroup.nynnr-mod.nynnrs_rubys"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.BLOCK_OF_RUBY);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                    })
                    .build());


    public static void registerItemsGroups(){
        NynnrMod.LOGGER.info("Registering Item Groups for " + NynnrMod.MOD_ID);
    }
}
