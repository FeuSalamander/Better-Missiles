
package net.feusalamander.bettermissiles.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.feusalamander.bettermissiles.entity.OblivionmissileEntity;

public class OblivionmissileRenderer extends HumanoidMobRenderer<OblivionmissileEntity, HumanoidModel<OblivionmissileEntity>> {
	public OblivionmissileRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(OblivionmissileEntity entity) {
		return new ResourceLocation("bettermissiles:textures/entities/oblivion.png");
	}
}
