package net.pixion.pixions_bnd.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.pixion.pixions_bnd.PixionsBnD;

public class modItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PixionsBnD.MODID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
