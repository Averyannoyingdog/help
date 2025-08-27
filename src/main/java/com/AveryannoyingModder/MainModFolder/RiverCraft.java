package com.AveryannoyingModder.MainModFolder;

import com.AveryannoyingModder.MainModFolder.Item.ModCreativeModeTabs;
import com.AveryannoyingModder.MainModFolder.Item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;




// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(RiverCraft.MODID)
public class RiverCraft {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "rivercraft";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();



    public RiverCraft(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);



        ModCreativeModeTabs.register(modEventBus);


        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        ModItems.register(modEventBus);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }


    private void commonSetup(FMLCommonSetupEvent event) {


    }

    // Add the example block item to the building blocks tab

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
//        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
//
//        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
    public static class ClientModEvents{
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }

    }
}
