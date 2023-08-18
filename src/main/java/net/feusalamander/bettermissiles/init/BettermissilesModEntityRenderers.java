
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.feusalamander.bettermissiles.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.feusalamander.bettermissiles.client.renderer.ProxymissileRenderer;
import net.feusalamander.bettermissiles.client.renderer.PolarismissileRenderer;
import net.feusalamander.bettermissiles.client.renderer.OblivionmissileRenderer;
import net.feusalamander.bettermissiles.client.renderer.GolgotmissileRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BettermissilesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BettermissilesModEntities.OBLIVIONMISSILE.get(), OblivionmissileRenderer::new);
		event.registerEntityRenderer(BettermissilesModEntities.GOLGOTMISSILE.get(), GolgotmissileRenderer::new);
		event.registerEntityRenderer(BettermissilesModEntities.PROXYMISSILE.get(), ProxymissileRenderer::new);
		event.registerEntityRenderer(BettermissilesModEntities.POLARISMISSILE.get(), PolarismissileRenderer::new);
	}
}
