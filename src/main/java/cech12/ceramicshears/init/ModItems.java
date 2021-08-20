package cech12.ceramicshears.init;

import cech12.ceramicshears.api.item.CeramicShearsItems;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.core.dispenser.ShearsDispenseItemBehavior;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ShearsItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static cech12.ceramicshears.CeramicShearsMod.MOD_ID;

@Mod.EventBusSubscriber(modid= MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        CeramicShearsItems.CLAY_SHEARS_PART = registerItem("clay_shears_part", new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));
        CeramicShearsItems.CERAMIC_SHEARS_PART = registerItem("ceramic_shears_part", new Item((new Item.Properties()).tab(CreativeModeTab.TAB_MISC)));
        CeramicShearsItems.CERAMIC_SHEARS = registerItem("ceramic_shears", new ShearsItem((new Item.Properties()).durability(179).tab(CreativeModeTab.TAB_TOOLS)));

        DispenserBlock.registerBehavior(CeramicShearsItems.CERAMIC_SHEARS.asItem(), new ShearsDispenseItemBehavior());
    }

    private static Item registerItem(String name, Item item) {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

}
