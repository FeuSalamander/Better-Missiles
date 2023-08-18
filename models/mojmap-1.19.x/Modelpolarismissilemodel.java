// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelpolarismissilemodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "polarismissilemodel"), "main");
	private final ModelPart first;
	private final ModelPart second;
	private final ModelPart four;
	private final ModelPart five;
	private final ModelPart six;
	private final ModelPart seven;
	private final ModelPart height;
	private final ModelPart nine;

	public Modelpolarismissilemodel(ModelPart root) {
		this.first = root.getChild("first");
		this.second = root.getChild("second");
		this.four = root.getChild("four");
		this.five = root.getChild("five");
		this.six = root.getChild("six");
		this.seven = root.getChild("seven");
		this.height = root.getChild("height");
		this.nine = root.getChild("nine");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition first = partdefinition.addOrReplaceChild("first",
				CubeListBuilder.create().texOffs(44, 47)
						.addBox(-3.3137F, -7.5F, -8.0F, 6.6274F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47)
						.addBox(-3.3137F, -7.5F, 6.0F, 6.6274F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 47)
						.addBox(6.0F, -7.5F, -3.3137F, 2.0F, 8.0F, 6.6274F, new CubeDeformation(0.0F)).texOffs(44, 47)
						.addBox(-8.0F, -7.5F, -3.3137F, 2.0F, 8.0F, 6.6274F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.0F, 23.5F, -2.0F));

		PartDefinition octagon_r1 = first.addOrReplaceChild("octagon_r1",
				CubeListBuilder.create().texOffs(44, 47)
						.addBox(-8.0F, 0.0F, -3.3137F, 2.0F, 8.0F, 6.6274F, new CubeDeformation(0.0F)).texOffs(44, 47)
						.addBox(6.0F, 0.0F, -3.3137F, 2.0F, 8.0F, 6.6274F, new CubeDeformation(0.0F)).texOffs(44, 47)
						.addBox(-3.3137F, 0.0F, 6.0F, 6.6274F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 52)
						.addBox(-3.3137F, 0.0F, -8.0F, 6.6274F, 8.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.5F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition second = partdefinition.addOrReplaceChild("second",
				CubeListBuilder.create().texOffs(38, 48)
						.addBox(-3.0261F, -7.0F, 3.018F, 6.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(35, 45)
						.addBox(-6.0261F, -7.0F, -2.982F, 3.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(35, 45)
						.addBox(2.9739F, -7.0F, -2.982F, 3.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(38, 48)
						.addBox(-3.0261F, -7.0F, -5.982F, 6.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.9739F, 15.0F, -2.018F));

		PartDefinition cube_r1 = second.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 50)
						.addBox(-2.0F, -7.0F, -0.5F, 4.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 48)
						.addBox(-2.0F, -7.0F, -0.5F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2949F, 0.0F, -4.2787F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r2 = second.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(38, 48)
						.addBox(-8.0F, -7.0F, -6.5F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(38, 48)
						.addBox(-8.0F, -7.0F, 3.5F, 4.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.2949F, 0.0F, -4.2787F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r3 = second.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(38, 48).addBox(-2.0F, -7.0F, -2.5F, 4.0F, 8.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.1904F, 0.0F, 4.2065F, 0.0F, -0.7854F, 0.0F));

		PartDefinition four = partdefinition.addOrReplaceChild("four", CubeListBuilder.create(),
				PartPose.offset(9.0F, 24.0F, 8.0F));

		PartDefinition bone = four.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -8.1F, 1.1056F, 2.0F, 6.0F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.2828F, -4.0F, -3.5456F, 0.7854F, -0.7854F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(31, 0).addBox(-3.0F, 0.0F, -2.6F, 2.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.0F, -8.0F, -1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone2 = four.addOrReplaceChild("bone2", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-4.8647F, -6.6218F, -15.2324F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(30, 0).addBox(-1.0F, -7.6F, 1.5863F, 2.0F, 6.0F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6961F, 2.6218F, 0.6961F, 0.7854F, -0.7854F, 0.0F));

		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(31, 0).addBox(-3.0F, 0.0F, -1.9092F, 2.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4133F, -1.3782F, 3.2417F, 0.0F, -0.7854F, 0.0F));

		PartDefinition five = partdefinition.addOrReplaceChild("five", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.0F, 24.0F, -1.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition bone3 = five.addOrReplaceChild("bone3", CubeListBuilder.create(),
				PartPose.offset(9.0F, 0.0F, 8.0F));

		PartDefinition cube_r8 = bone3.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(29, 1).addBox(-1.0F, -8.1F, 1.1056F, 2.0F, 6.0F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.2828F, -4.0F, -3.5456F, 0.7854F, -0.7854F, 0.0F));

		PartDefinition cube_r9 = bone3.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(30, 1).addBox(-3.0F, 0.0F, -2.6F, 2.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.0F, -8.0F, -1.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition bone4 = five.addOrReplaceChild("bone4", CubeListBuilder.create(),
				PartPose.offsetAndRotation(4.1353F, -6.6218F, -7.2324F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r10 = bone4.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(29, 1).addBox(-1.0F, -7.6F, 1.5863F, 2.0F, 6.0F, 2.42F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6961F, 2.6218F, 0.6961F, 0.7854F, -0.7854F, 0.0F));

		PartDefinition cube_r11 = bone4.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(30, 1).addBox(-3.0F, 0.0F, -1.9092F, 2.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.4133F, -1.3782F, 3.2417F, 0.0F, -0.7854F, 0.0F));

		PartDefinition six = partdefinition.addOrReplaceChild("six", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-2.088F, -23.0F, 2.7725F, 4.14F, 24.0F, 1.38F, new CubeDeformation(0.0F)).texOffs(-4, -4)
				.addBox(-4.158F, -23.0F, -2.0575F, 1.38F, 24.0F, 4.14F, new CubeDeformation(0.0F)).texOffs(-4, -4)
				.addBox(2.742F, -23.0F, -2.0575F, 1.38F, 24.0F, 4.14F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-2.088F, -23.0F, -4.1275F, 4.14F, 24.0F, 1.38F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.9739F, 7.0F, -2.018F));

		PartDefinition cube_r12 = six.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.38F, -23.0F, -0.345F, 2.76F, 24.0F, 1.69F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9635F, 0.0F, -2.9523F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r13 = six.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.52F, -23.0F, -4.485F, 2.76F, 24.0F, 1.69F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.52F, -23.0F, 2.795F, 2.76F, 24.0F, 1.69F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.9635F, 0.0F, -2.9523F, 0.0F, 0.7854F, 0.0F));

		PartDefinition cube_r14 = six.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.38F, -23.0F, -1.345F, 2.76F, 24.0F, 1.69F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.8914F, 0.0F, 2.9025F, 0.0F, -0.7854F, 0.0F));

		PartDefinition seven = partdefinition.addOrReplaceChild("seven",
				CubeListBuilder.create().texOffs(88, 115)
						.addBox(-15.0F, -43.0F, -15.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(108, 92)
						.addBox(-12.5F, -51.0F, -12.5F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(56, 2)
						.addBox(-13.0F, -52.0F, -13.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 1)
						.addBox(-11.0F, -56.0F, -11.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(9.0F, 24.0F, 8.0F));

		PartDefinition height = partdefinition.addOrReplaceChild("height", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition one = height.addOrReplaceChild("one",
				CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -45.0F, 1.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r15 = one
				.addOrReplaceChild("cube_r15",
						CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -3.7F, -2.1F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition two = height.addOrReplaceChild("two", CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F,
				-2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -45.0F, -5.5F));

		PartDefinition cube_r16 = two
				.addOrReplaceChild("cube_r16",
						CubeListBuilder.create().texOffs(31, 0).addBox(-1.0F, -3.7F, -2.1F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition nine = partdefinition.addOrReplaceChild("nine", CubeListBuilder.create(),
				PartPose.offsetAndRotation(-3.0F, 24.0F, 0.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition nineone = nine.addOrReplaceChild("nineone",
				CubeListBuilder.create().texOffs(25, 3).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -45.0F, 1.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r17 = nineone
				.addOrReplaceChild("cube_r17",
						CubeListBuilder.create().texOffs(25, 3).addBox(-1.0F, -3.7F, -2.1F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition ninetwo = nine.addOrReplaceChild("ninetwo", CubeListBuilder.create().texOffs(25, 3).addBox(-1.0F,
				-2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -45.0F, -5.5F));

		PartDefinition cube_r18 = ninetwo
				.addOrReplaceChild("cube_r18",
						CubeListBuilder.create().texOffs(25, 3).addBox(-1.0F, -3.7F, -2.1F, 2.0F, 3.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		first.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		second.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		four.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		five.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		six.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		seven.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		height.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		nine.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}