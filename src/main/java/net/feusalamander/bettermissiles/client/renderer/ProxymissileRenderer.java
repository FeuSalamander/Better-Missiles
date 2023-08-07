
package net.feusalamander.bettermissiles.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.feusalamander.bettermissiles.entity.ProxymissileEntity;
import net.feusalamander.bettermissiles.client.model.Modelproxy;

public class ProxymissileRenderer extends MobRenderer<ProxymissileEntity, Modelproxy<ProxymissileEntity>> {
	public ProxymissileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelproxy(context.bakeLayer(Modelproxy.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(ProxymissileEntity entity) {
		return new ResourceLocation("bettermissiles:textures/entities/proxy.png");
	}
}
