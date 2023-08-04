
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.feusalamander.bettermissiles.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BettermissilesModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("bettermissiles", "bettermissiles"),
				builder -> builder.title(Component.translatable("item_group.bettermissiles.bettermissiles")).icon(() -> new ItemStack(BettermissilesModItems.OBLIVION.get())).displayItems((parameters, tabData) -> {
					tabData.accept(BettermissilesModBlocks.PAD.get().asItem());
					tabData.accept(BettermissilesModBlocks.LAUNCHPADCONTROLLER.get().asItem());
					tabData.accept(BettermissilesModItems.OBLIVION.get());
					tabData.accept(BettermissilesModItems.GOLGOT.get());
					tabData.accept(BettermissilesModItems.PROXY.get());
					tabData.accept(BettermissilesModBlocks.EXPLOSIVEWORKBENCH.get().asItem());
					tabData.accept(BettermissilesModItems.BODY_COPPER.get());
					tabData.accept(BettermissilesModItems.BODY_CARBON.get());
					tabData.accept(BettermissilesModItems.BODY_IRON.get());
				}).withSearchBar());
	}
}
