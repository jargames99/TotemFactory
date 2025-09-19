package com.marcos.totemfactory;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TotemFactory.MODID);

    public static final DeferredItem<Item> INACTIVE_TOTEM = ITEMS.registerSimpleItem("inactive_totem", new Item.Properties());
    public static final DeferredItem<Item> INCOMPLETE_TOTEM_BODY = ITEMS.registerSimpleItem("incomplete_totem_body", new Item.Properties());
    public static final DeferredItem<Item> INCOMPLETE_TOTEM_BODY_CASING = ITEMS.registerSimpleItem("incomplete_totem_body_casing", new Item.Properties());
    public static final DeferredItem<Item> INCOMPLETE_TOTEM_HEAD = ITEMS.registerSimpleItem("incomplete_totem_head", new Item.Properties());
    public static final DeferredItem<Item> INCOMPLETE_TOTEM_HEAD_CASING = ITEMS.registerSimpleItem("incomplete_totem_head_casing", new Item.Properties());
    public static final DeferredItem<Item> TOTEM_BODY = ITEMS.registerSimpleItem("totem_body", new Item.Properties());
    public static final DeferredItem<Item> TOTEM_BODY_CASING = ITEMS.registerSimpleItem("totem_body_casing", new Item.Properties());
    public static final DeferredItem<Item> TOTEM_HEAD = ITEMS.registerSimpleItem("totem_head", new Item.Properties());
    public static final DeferredItem<Item> TOTEM_HEAD_CASING = ITEMS.registerSimpleItem("totem_head_casing", new Item.Properties());
}
