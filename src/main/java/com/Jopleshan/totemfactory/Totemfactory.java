package com.Jopleshan.totemfactory;

import com.Jopleshan.totemfactory.Init.InitItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Totemfactory.MODID)

public class Totemfactory {

    public static final String MODID ="totemfactory";

    public Totemfactory(){
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEMS.register(bus);
    }

}
