package com.bypgomes.mycustomdb.item;

import com.bypgomes.mycustomdb.MyCustomDB;
import com.bypgomes.mycustomdb.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MyCustomDB.MOD_ID);

    public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MOD_TAB.register("bismuth_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BISMUTH.get()))
                    .title(Component.translatable("creativetab.mycustomdb.bismuth_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BISMUTH);
                        output.accept(ModItems.RAW_BISMUTH);

                    }).build());


    public static final Supplier<CreativeModeTab> BISMUTH_BLOCK_TAB = CREATIVE_MOD_TAB.register("bismuth_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BISMUTH_BLOCK))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MyCustomDB.MOD_ID, "bismuth_items_tab"))
                    .title(Component.translatable("creativetab.mycustomdb.bismuth_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BISMUTH_ORE);
                        output.accept(ModBlocks.DEEPSLATE_BISMUTH_ORE);
                        output.accept(ModBlocks.BISMUTH_BLOCK);


                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MOD_TAB.register(eventBus);

    }
}
