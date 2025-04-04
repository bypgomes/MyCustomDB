package com.bypgomes.mycustomdb.item;

import com.bypgomes.mycustomdb.MyCustomDB;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MyCustomDB.MOD_ID);

    public static final DeferredItem<Item>  BISMUTH = ITEMS.register("bismuth",
            ()-> new  Item(new Item.Properties()));
    public static final DeferredItem<Item>  RAW_BISMUTH = ITEMS.register("raw_bismuth",
            ()-> new  Item(new Item.Properties()));



    public static void  register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
