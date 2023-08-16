
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
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.COPPER_INGOT, 64), new ItemStack(Items.EMERALD, 32), new ItemStack(BettermissilesModItems.BODY_COPPER.get()), 2, 20, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.IRON_BLOCK, 16), new ItemStack(Items.EMERALD, 64), new ItemStack(BettermissilesModItems.BODY_IRON.get()), 2, 30, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Blocks.COAL_BLOCK, 64), new ItemStack(Blocks.EMERALD_BLOCK, 14), new ItemStack(BettermissilesModItems.BODY_CARBON.get()), 2, 40, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.PAPER, 64), new ItemStack(Items.GUNPOWDER, 64), new ItemStack(BettermissilesModItems.NOZZLETEMPLATE_1.get()), 2, 20, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(BettermissilesModItems.NOZZLETEMPLATE_1.get()), new ItemStack(Items.EMERALD, 64), new ItemStack(BettermissilesModItems.NOZZLETEMPLATE_2.get()), 2, 30, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(BettermissilesModItems.NOZZLETEMPLATE_2.get()), new ItemStack(Blocks.EMERALD_BLOCK, 20), new ItemStack(BettermissilesModItems.NOZZLETEMPLATE_3.get()), 2, 40, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.FIRE_CHARGE, 3), new ItemStack(Blocks.TNT, 2), new ItemStack(Items.FIREWORK_ROCKET, 16), 20, 10, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.TOTEM_OF_UNDYING), new ItemStack(Items.TOTEM_OF_UNDYING), new ItemStack(Items.TOTEM_OF_UNDYING), 10, 30, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.LAVA_BUCKET), new ItemStack(Items.EMERALD, 10), new ItemStack(Items.BLAZE_ROD), 10, 10, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.ENDER_PEARL, 2), new ItemStack(Items.BLAZE_POWDER, 4), new ItemStack(Blocks.END_STONE, 16), 10, 10, 0.05f));
		}
	}
}
