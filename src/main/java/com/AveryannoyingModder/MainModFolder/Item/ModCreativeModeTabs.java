package com.AveryannoyingModder.MainModFolder.Item;

import com.AveryannoyingModder.MainModFolder.RiverCraft;
import com.AveryannoyingModder.MainModFolder.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RiverCraft.MODID);

    public static final Supplier<CreativeModeTab> RIVER_ITEMS_TAB = CREATIVE_MODE_TAB.register("river_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RIVERITE.get()))
                    .title(Component.translatable("creativetab.rivercraft.river_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RIVERITE);
                        output.accept(ModItems.RIVERPICKAXE);
                        output.accept(ModBlocks.RIVERITEORE);

                    }).build());

    public static final Supplier<CreativeModeTab> RIVER_TOOLS_TAB = CREATIVE_MODE_TAB.register("river_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RIVERHAMMER.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(RiverCraft.MODID, "bismuth_items_tab"))
                    .title(Component.translatable("creativetab.rivercraft.river_tools"))
                    .displayItems((itemDisplayParameters, output) -> {


                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}