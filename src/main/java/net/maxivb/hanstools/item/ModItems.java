package net.maxivb.hanstools.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maxivb.hanstools.HansTools;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RUBY_UPGRADE_SMITHING_TEMPLATE = registerItem("ruby_upgrade_smithing_template", new Item(new Item.Settings()));
    public static final Item EMERALD_UPGRADE_SMITHING_TEMPLATE = registerItem("emerald_upgrade_smithing_template", new Item(new Item.Settings()));
    public static final Item URANIUM = registerItem("uranium", new Item(new Item.Settings()));
    public static final Item URANIUM_INGOT = registerItem("uranium_ingot", new Item(new Item.Settings()));

    public static final Item URANIUM_ROD = registerItem("uranium_rod", new Item(new Item.Settings()
            .food(ModFoodComponents.URANIUM_ROD)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HansTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HansTools.LOGGER.info("Registering Mod Items for " + HansTools.MOD_ID);
    }
}

