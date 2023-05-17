package applepie.item;

import applepie.ApplePie;
import net.minecraft.world.item.*;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ApplePie.MOD_ID);

    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("applepie", () -> new Item((new Item.Properties()).food(FoodRegistry.APPLEPIE)));

    @SubscribeEvent
    public static void onCreativeModeTabBuildContents(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.FOOD_AND_DRINKS)
            event.getEntries().putBefore(new ItemStack(Items.PUMPKIN_PIE), new ItemStack(APPLE_PIE.get()), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
    }

}
