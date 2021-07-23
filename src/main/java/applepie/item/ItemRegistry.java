package applepie.item;

import applepie.ApplePie;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ApplePie.MOD_ID);

    public static final RegistryObject<Item> applepie = ITEMS.register("applepie", () -> new Item((new Item.Properties()).tab(CreativeModeTab.TAB_FOOD).food(FoodRegistry.APPLEPIE)));
}
