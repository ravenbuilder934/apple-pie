package applepie.item;

import net.minecraft.item.Food;

public class FoodRegistry
{
    public static final Food APPLEPIE = (new Food.Builder()).nutrition(8).saturationMod(4.0F).build();
}