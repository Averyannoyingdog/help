package com.AveryannoyingModder.MainModFolder.Item;
import com.AveryannoyingModder.MainModFolder.RiverCraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.*;


public class ModItems {


    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RiverCraft.MODID);

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RiverCraft.MODID);



    public static final DeferredItem<Item> RIVERITE = ITEMS.registerItem("riverite",
            Item::new, new Item.Properties());

    public static final DeferredItem<Item> RIVERPICKAXE = ITEMS.registerItem("riverpickaxe",
            Item::new, new Item.Properties());

    //BLOCKS is a DeferredRegister.Blocks
    public static final DeferredBlock<Block> MY_BETTER_BLOCK = BLOCKS.register(
            "river_ore",
            registryName -> new Block(BlockBehaviour.Properties.of()
//                    .setId(ResourceKey.create(Registries.BLOCK, registryName))
                    .destroyTime(2.0f)
                    .explosionResistance(10.0f)
                    .sound(SoundType.GRAVEL)
                    .lightLevel(state -> 7)
            ));

    public static final DeferredItem<Item> RIVERHAMMER = ITEMS.registerItem("river_hammer",
            Item::new, new Item.Properties());

    public static final DeferredItem<Item> RIVERMASK = ITEMS.registerItem("river_mask",
            Item::new, new Item.Properties());

    public static final DeferredItem<Item> MONEY = ITEMS.registerItem("5_dollar_bill",
            Item::new, new Item.Properties());


    public static void register(IEventBus EventBus)
    {
        ITEMS.register(EventBus);
    }



}