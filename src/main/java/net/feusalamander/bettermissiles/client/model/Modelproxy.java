package net.feusalamander.bettermissiles.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelproxy<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("bettermissiles", "modelproxy"), "main");
	public final ModelPart missile;

	public Modelproxy(ModelPart root) {
		this.missile = root.getChild("missile");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition missile = partdefinition.addOrReplaceChild("missile", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition base = missile.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -12.0F, -4.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition ailettes = base.addOrReplaceChild("ailettes",
				CubeListBuilder.create().texOffs(116, 118).addBox(4.0F, -8.0F, -1.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 118).addBox(-8.0F, -8.0F, -1.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(116, 116)
						.addBox(-1.0F, -8.0F, 4.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(116, 116).addBox(-1.0F, -8.0F, -8.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = ailettes.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(116, 120).addBox(-8.3F, 2.5F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r2 = ailettes.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(116, 120).addBox(-1.3F, -3.0F, -1.0F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -8.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r3 = ailettes.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(116, 118).addBox(-1.0F, 2.5F, 4.3F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -4.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r4 = ailettes.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(116, 118).addBox(-1.0F, -3.0F, -2.7F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -4.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition corp = missile.addOrReplaceChild("corp", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = corp.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(108, 0).addBox(-2.5F, -33.0F, -2.5F, 5.0F, 28.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition ailettes2 = corp
				.addOrReplaceChild(
						"ailettes2", CubeListBuilder.create().texOffs(118, 118).addBox(3.0F, -8.0F, -1.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(118, 118).addBox(-5.0F, -8.0F, -1.0F, 3.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
								.texOffs(118, 117).addBox(-1.0F, -8.0F, 2.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(118, 117).addBox(-1.0F, -8.0F, -6.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, -26.0F, 0.0F));
		PartDefinition cube_r6 = ailettes2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(118, 120).addBox(-6.0F, 0.5F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition cube_r7 = ailettes2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(118, 120).addBox(-2.0F, -4.5F, -1.0F, 3.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -8.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r8 = ailettes2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(118, 119).addBox(-1.0F, 0.5F, 3.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -4.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r9 = ailettes2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(118, 119).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -4.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tete = missile.addOrReplaceChild("tete", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r10 = tete.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 122).addBox(-1.0F, -48.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 99).addBox(-1.5F, -44.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		missile.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
