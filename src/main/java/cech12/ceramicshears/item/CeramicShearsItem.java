package cech12.ceramicshears.item;

import cech12.ceramicshears.config.ServerConfig;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;

public class CeramicShearsItem extends ShearsItem {

    public CeramicShearsItem() {
        super((new Properties()).stacksTo(1).tab(CreativeModeTab.TAB_TOOLS));
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return ServerConfig.DURABILITY.get() > 0;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return ServerConfig.DURABILITY.get();
    }

}
