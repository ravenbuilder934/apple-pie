package applepie.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import applepie.SweetBerryPie;

public class ItemRegistry
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SweetBerryPie.MOD_ID);

    public static final RegistryObject<Item> applepie = ITEMS.register("applepie", () -> new Item((new Item.Properties()).tab(ItemGroup.TAB_FOOD).food(FoodRegistry.APPLEPIE)));
}
