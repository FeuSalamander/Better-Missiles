
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.feusalamander.bettermissiles.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BettermissilesModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == BettermissilesModVillagerProfessions.EXPLOSIVEENJOYER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.GUNPOWDER, 8),

					new ItemStack(Items.EMERALD, 2), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 2), new ItemStack(Blocks.SAND, 6), new ItemStack(Blocks.TNT), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Blocks.TNT, 16), new ItemStack(Items.EMERALD, 48), new ItemStack(BettermissilesModBlocks.EXPLOSIVEWORKBENCH.get()), 1, 30, 1f));
		}
	}
}
