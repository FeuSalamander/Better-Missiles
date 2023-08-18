
package net.feusalamander.bettermissiles.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.feusalamander.bettermissiles.entity.PolarismissileEntity;
import net.feusalamander.bettermissiles.client.model.Modelpolarismissilemodel;

public class PolarismissileRenderer extends MobRenderer<PolarismissileEntity, Modelpolarismissilemodel<PolarismissileEntity>> {
	public PolarismissileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpolarismissilemodel(context.bakeLayer(Modelpolarismissilemodel.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(PolarismissileEntity entity) {
		return new ResourceLocation("bettermissiles:textures/entities/polaris.png");
	}
}
