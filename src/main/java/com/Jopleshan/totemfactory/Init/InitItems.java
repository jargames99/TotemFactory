package com.Jopleshan.totemfactory.Init;

import com.Jopleshan.totemfactory.Totemfactory;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Totemfactory.MODID);
    public static final RegistryObject<Item>  EMPTY_TOTEM_BODY = ITEMS.register("empty_totem_body" , () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item> UNCOMPLETED_EMPTY_TOTEM_BODY = ITEMS.register("uncompleted_empty_totem_body" , () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOTEM_HEAD = ITEMS.register("totem_head" , () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> UNCOMPLETED_TOTEM_HEAD = ITEMS.register("uncompleted" , () -> new Item(new Item.Properties()));
}
