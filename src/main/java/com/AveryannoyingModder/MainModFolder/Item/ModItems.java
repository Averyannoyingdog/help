package com.AveryannoyingModder.MainModFolder.Item;
import com.AveryannoyingModder.MainModFolder.RiverCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.*;

import javax.swing.*;


public class ModItems {

//"you need the sauce not the build" Phoenix Calvert 28/08/25 11:10am

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RiverCraft.MODID);

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RiverCraft.MODID);



    public static final DeferredItem<Item> RIVERITE = ITEMS.registerItem("riverite",
            Item::new, new Item.Properties());



    public static final DeferredItem<Item> RIVERHAMMER = ITEMS.registerItem("river_hammer",
            Item::new, new Item.Properties());


    //BLOCKS is a DeferredRegister.Blocks
//    public static final DeferredBlock<Block> RIVERITEORE = BLOCKS.register(
//            "riverore",
//            registryName -> new Block(BlockBehaviour.Properties.of()
//                    .destroyTime(2.0f)
//                    .explosionResistance(10.0f)
//                    .sound(SoundType.GRAVEL)
//                    .lightLevel(state -> 7)
//            ));


    public static final DeferredItem<Item> RIVERMASK = ITEMS.registerItem("river_mask",
            Item::new, new Item.Properties());

    public static final DeferredItem<Item> CASH = ITEMS.registerItem("cash",
            Item::new, new Item.Properties());
    //



    public static final DeferredItem<SwordItem> RIVERSWORD = ITEMS.register("riversword",
            () -> new SwordItem(ModToolTiers.RIVERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.RIVERITE,100,0))));

    public static final DeferredItem<PickaxeItem> RIVERPICKAXE = ITEMS.register("riverpickaxe",
            () -> new PickaxeItem(ModToolTiers.RIVERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.RIVERITE,2,-3))));

    public static final DeferredItem<AxeItem> RIVERAXE = ITEMS.register("riveraxe",
            () -> new AxeItem(ModToolTiers.RIVERITE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.RIVERITE, 10,-2))));

    public static final DeferredItem<ShovelItem> RIVERSHOVEL = ITEMS.register("rivershovel",
            () -> new ShovelItem(ModToolTiers.RIVERITE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.RIVERITE, 4, 4))));

    public static final DeferredItem<HoeItem> RIVERHOE = ITEMS.register("riverhoe",
            () -> new HoeItem(ModToolTiers.RIVERITE, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.RIVERITE, 4,2))));



    public static final  DeferredItem<ArmorItem> RIVER_HELMET = ITEMS.register("river_helmet",
            () -> new ArmorItem(ModArmorMaterials.RIVERITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(19))));

    public static final  DeferredItem<ArmorItem> RIVER_LEGGINGS = ITEMS.register("river_leggings",
            () -> new ArmorItem(ModArmorMaterials.RIVERITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(19))));


    public static final  DeferredItem<ArmorItem> RIVER_CHESTPLATE = ITEMS.register("river_chestplate",
            () -> new ArmorItem(ModArmorMaterials.RIVERITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(19))));


    public static final  DeferredItem<ArmorItem> RIVER_BOOTS = ITEMS.register("river_boots",
            () -> new ArmorItem(ModArmorMaterials.RIVERITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(19))));


    public static void register(IEventBus EventBus)
    {
        ITEMS.register(EventBus);
    }



}