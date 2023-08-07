
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.feusalamander.bettermissiles.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.feusalamander.bettermissiles.client.model.Modelvillager;
import net.feusalamander.bettermissiles.client.model.Modelproxy;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BettermissilesModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelvillager.LAYER_LOCATION, Modelvillager::createBodyLayer);
		event.registerLayerDefinition(Modelproxy.LAYER_LOCATION, Modelproxy::createBodyLayer);
	}
}
