package com.AveryannoyingModder.MainModFolder.Item;

import com.AveryannoyingModder.MainModFolder.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {

    public static final Tier RIVERITE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_RIVERITE_TOOL,
            512, 1f, 1f, 18, () -> Ingredient.of(ModItems.RIVERITE));


}
