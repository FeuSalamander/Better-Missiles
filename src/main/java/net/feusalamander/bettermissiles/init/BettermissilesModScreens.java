
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.feusalamander.bettermissiles.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.feusalamander.bettermissiles.client.gui.WorkBenchScreen;
import net.feusalamander.bettermissiles.client.gui.LauncherScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BettermissilesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BettermissilesModMenus.LAUNCHER.get(), LauncherScreen::new);
			MenuScreens.register(BettermissilesModMenus.WORK_BENCH.get(), WorkBenchScreen::new);
		});
	}
}
