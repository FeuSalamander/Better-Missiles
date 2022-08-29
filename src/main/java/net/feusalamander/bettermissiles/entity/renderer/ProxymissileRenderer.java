
package net.feusalamander.bettermissiles.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import net.feusalamander.bettermissiles.entity.ProxymissileEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ProxymissileRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ProxymissileEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelproxy(), 0f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("bettermissiles:textures/proxy.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.3.1
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelproxy extends EntityModel<Entity> {
		private final ModelRenderer missile;
		private final ModelRenderer base;
		private final ModelRenderer ailettes;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer corp;
		private final ModelRenderer cube_r5;
		private final ModelRenderer ailettes2;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer tete;
		private final ModelRenderer cube_r10;

		public Modelproxy() {
			textureWidth = 128;
			textureHeight = 128;
			missile = new ModelRenderer(this);
			missile.setRotationPoint(0.0F, 24.0F, 0.0F);
			base = new ModelRenderer(this);
			base.setRotationPoint(0.0F, 0.0F, 0.0F);
			missile.addChild(base);
			base.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, false);
			ailettes = new ModelRenderer(this);
			ailettes.setRotationPoint(0.0F, 0.0F, 0.0F);
			base.addChild(ailettes);
			ailettes.setTextureOffset(116, 118).addBox(4.0F, -8.0F, -1.0F, 4.0F, 8.0F, 2.0F, 0.0F, false);
			ailettes.setTextureOffset(116, 118).addBox(-8.0F, -8.0F, -1.0F, 4.0F, 8.0F, 2.0F, 0.0F, false);
			ailettes.setTextureOffset(116, 116).addBox(-1.0F, -8.0F, 4.0F, 2.0F, 8.0F, 4.0F, 0.0F, false);
			ailettes.setTextureOffset(116, 116).addBox(-1.0F, -8.0F, -8.0F, 2.0F, 8.0F, 4.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(4.0F, -8.0F, 0.0F);
			ailettes.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
			cube_r1.setTextureOffset(116, 120).addBox(-8.3F, 2.5F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(4.0F, -8.0F, 0.0F);
			ailettes.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
			cube_r2.setTextureOffset(116, 120).addBox(-1.3F, -3.0F, -1.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, -8.0F, -4.0F);
			ailettes.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(116, 118).addBox(-1.0F, 2.5F, 4.3F, 2.0F, 6.0F, 4.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, -8.0F, -4.0F);
			ailettes.addChild(cube_r4);
			setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(116, 118).addBox(-1.0F, -3.0F, -2.7F, 2.0F, 6.0F, 4.0F, 0.0F, false);
			corp = new ModelRenderer(this);
			corp.setRotationPoint(0.0F, 0.0F, 0.0F);
			missile.addChild(corp);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, -7.0F, 0.0F);
			corp.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
			cube_r5.setTextureOffset(108, 0).addBox(-2.5F, -33.0F, -2.5F, 5.0F, 28.0F, 5.0F, 0.0F, false);
			ailettes2 = new ModelRenderer(this);
			ailettes2.setRotationPoint(0.0F, -26.0F, 0.0F);
			corp.addChild(ailettes2);
			ailettes2.setTextureOffset(118, 118).addBox(3.0F, -8.0F, -1.0F, 3.0F, 8.0F, 2.0F, 0.0F, false);
			ailettes2.setTextureOffset(118, 118).addBox(-5.0F, -8.0F, -1.0F, 3.0F, 8.0F, 2.0F, 0.0F, false);
			ailettes2.setTextureOffset(118, 117).addBox(-1.0F, -8.0F, 2.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
			ailettes2.setTextureOffset(118, 117).addBox(-1.0F, -8.0F, -6.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(4.0F, -8.0F, 0.0F);
			ailettes2.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
			cube_r6.setTextureOffset(118, 120).addBox(-6.0F, 0.5F, -1.0F, 3.0F, 6.0F, 2.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(4.0F, -8.0F, 0.0F);
			ailettes2.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
			cube_r7.setTextureOffset(118, 120).addBox(-2.0F, -4.5F, -1.0F, 3.0F, 6.0F, 2.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(0.0F, -8.0F, -4.0F);
			ailettes2.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(118, 119).addBox(-1.0F, 0.5F, 3.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(0.0F, -8.0F, -4.0F);
			ailettes2.addChild(cube_r9);
			setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(118, 119).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 6.0F, 3.0F, 0.0F, false);
			tete = new ModelRenderer(this);
			tete.setRotationPoint(0.0F, 0.0F, 0.0F);
			missile.addChild(tete);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
			tete.addChild(cube_r10);
			setRotationAngle(cube_r10, 0.0F, -0.7854F, 0.0F);
			cube_r10.setTextureOffset(0, 122).addBox(-1.0F, -48.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r10.setTextureOffset(56, 99).addBox(-1.5F, -44.0F, -1.5F, 3.0F, 4.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			missile.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
