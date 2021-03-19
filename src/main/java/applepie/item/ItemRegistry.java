package applepie.item;

import applepie.ApplePie;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ApplePie.MOD_ID);

    public static final RegistryObject<Item> applepie = ITEMS.register("applepie", () -> new Item((new Item.Properties()).tab(ItemGroup.TAB_FOOD).food(FoodRegistry.APPLEPIE)));
}
