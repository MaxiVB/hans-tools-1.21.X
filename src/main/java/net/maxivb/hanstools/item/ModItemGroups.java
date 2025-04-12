package net.maxivb.hanstools.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maxivb.hanstools.HansTools;
import net.maxivb.hanstools.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ORES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HansTools.MOD_ID, "ores"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.URANIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.hanstools.ores"))
                    .entries((displayContext, entries) -> {
                          entries.add(ModItems.RUBY);
                          entries.add(ModBlocks.RUBY_BLOCK);
                          entries.add(ModBlocks.RUBY_ORE_BLOCK);
                          entries.add(ModBlocks.RUBY_DEEPSLATE_ORE_BLOCK);
                          entries.add(ModItems.URANIUM_INGOT);
                          entries.add(ModItems.URANIUM);
                          entries.add(ModBlocks.URANUIM_BLOCK);
                          entries.add(ModBlocks.URANIUM_ORE_BLOCK);
                          entries.add(ModBlocks.URANUIM_DEEPSLATE_ORE_BLOCK);


                    }).build());

    public static final ItemGroup FOOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HansTools.MOD_ID, "food_and_drinks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.URANIUM_ROD))
                    .displayName(Text.translatable("itemgroup.hanstools.food_and_drinks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.URANIUM_ROD);

                    }).build());

 public static final ItemGroup TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HansTools.MOD_ID, "tools"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PLACEHOLDER))
                    .displayName(Text.translatable("itemgroup.hanstools.tools"))
                    .entries((displayContext, entries) -> {
                          entries.add(ModItems.PLACEHOLDER);

                    }).build());

    public static final ItemGroup COMBAT_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HansTools.MOD_ID, "combat"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PLACEHOLDER))
                    .displayName(Text.translatable("itemgroup.hanstools.combat"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PLACEHOLDER);

                    }).build());

 public static final ItemGroup TEMPLATES_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HansTools.MOD_ID, "templates"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE))
                    .displayName(Text.translatable("itemgroup.hanstools.templates"))
                    .entries((displayContext, entries) -> {
                          entries.add(ModItems.EMERALD_UPGRADE_SMITHING_TEMPLATE);
                          entries.add(ModItems.RUBY_UPGRADE_SMITHING_TEMPLATE);

                    }).build());

    public static final ItemGroup FUEL_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HansTools.MOD_ID, "fuel"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.URANIUM))
                    .displayName(Text.translatable("itemgroup.hanstools.fuel"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.URANIUM);

                    }).build());




    public static void registerItemGroups() {
        HansTools.LOGGER.info("Registering Item Groups for " + HansTools.MOD_ID);
    }
}
