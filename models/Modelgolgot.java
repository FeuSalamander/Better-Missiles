// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgolgot extends EntityModel<Entity> {
	private final ModelRenderer all;
	private final ModelRenderer body;
	private final ModelRenderer hexadecagon_r1;
	private final ModelRenderer hexadecagon_r2;
	private final ModelRenderer hexadecagon_r3;
	private final ModelRenderer hexadecagon_r4;
	private final ModelRenderer reacteur;
	private final ModelRenderer hexadecagon_r5;
	private final ModelRenderer hexadecagon_r6;
	private final ModelRenderer hexadecagon_r7;
	private final ModelRenderer hexadecagon_r8;
	private final ModelRenderer reactor;
	private final ModelRenderer hexadecagon_r9;
	private final ModelRenderer hexadecagon_r10;
	private final ModelRenderer hexadecagon_r11;
	private final ModelRenderer hexadecagon_r12;
	private final ModelRenderer aillette;
	private final ModelRenderer hexadecagon_r13;
	private final ModelRenderer hexadecagon_r14;
	private final ModelRenderer hexadecagon_r15;
	private final ModelRenderer hexadecagon_r16;
	private final ModelRenderer pointe;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public Modelgolgot() {
		textureWidth = 128;
		textureHeight = 128;

		all = new ModelRenderer(this);
		all.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(all, 0.0F, 0.0F, 1.5708F);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(body);
		body.setTextureOffset(0, 126).addBox(-40.0F, -0.5967F, -3.0F, 24.0F, 1.0F, 1.0F, 5.0F, false);
		body.setTextureOffset(0, 126).addBox(-40.0F, -0.5967F, 2.0F, 24.0F, 1.0F, 1.0F, 5.0F, false);
		body.setTextureOffset(0, 126).addBox(-40.0F, 2.0F, -0.5967F, 24.0F, 1.0F, 1.0F, 5.0F, false);
		body.setTextureOffset(0, 126).addBox(-40.0F, -3.0F, -0.5967F, 24.0F, 1.0F, 1.0F, 5.0F, false);

		hexadecagon_r1 = new ModelRenderer(this);
		hexadecagon_r1.setRotationPoint(-32.0F, 0.0F, 0.0F);
		body.addChild(hexadecagon_r1);
		setRotationAngle(hexadecagon_r1, -0.3927F, 0.0F, 0.0F);
		hexadecagon_r1.setTextureOffset(0, 126).addBox(-8.0F, -3.0F, -0.5967F, 24.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r1.setTextureOffset(0, 126).addBox(-8.0F, 2.0F, -0.5967F, 24.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r1.setTextureOffset(0, 126).addBox(-8.0F, -0.5967F, 2.0F, 24.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r1.setTextureOffset(0, 126).addBox(-8.0F, -0.5967F, -3.0F, 24.0F, 1.0F, 1.0F, 5.0F, false);

		hexadecagon_r2 = new ModelRenderer(this);
		hexadecagon_r2.setRotationPoint(-32.0F, 0.0F, 0.0F);
		body.addChild(hexadecagon_r2);
		setRotationAngle(hexadecagon_r2, 0.3927F, 0.0F, 0.0F);
		hexadecagon_r2.setTextureOffset(0, 126).addBox(-8.0F, -3.0F, -0.5967F, 24.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r2.setTextureOffset(0, 126).addBox(-8.0F, 2.0F, -0.5967F, 24.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r2.setTextureOffset(0, 126).addBox(-8.0F, -0.5967F, 2.0F, 24.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r2.setTextureOffset(0, 126).addBox(-8.0F, -0.5967F, -3.0F, 24.0F, 1.0F, 1.0F, 5.0F, false);

		hexadecagon_r3 = new ModelRenderer(this);
		hexadecagon_r3.setRotationPoint(-32.0F, 0.0F, 0.0F);
		body.addChild(hexadecagon_r3);
		setRotationAngle(hexadecagon_r3, -0.7854F, 0.0F, 0.0F);
		hexadecagon_r3.setTextureOffset(0, 126).addBox(-8.0F, -0.5967F, 2.0F, 24.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r3.setTextureOffset(0, 126).addBox(-8.0F, -0.5967F, -3.0F, 24.0F, 1.0F, 1.0F, 5.0F, false);

		hexadecagon_r4 = new ModelRenderer(this);
		hexadecagon_r4.setRotationPoint(-32.0F, 0.0F, 0.0F);
		body.addChild(hexadecagon_r4);
		setRotationAngle(hexadecagon_r4, 0.7854F, 0.0F, 0.0F);
		hexadecagon_r4.setTextureOffset(0, 126).addBox(-8.0F, -0.5967F, 2.0F, 24.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r4.setTextureOffset(0, 126).addBox(-8.0F, -0.5967F, -3.0F, 24.0F, 1.0F, 1.0F, 5.0F, false);

		reacteur = new ModelRenderer(this);
		reacteur.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(reacteur);
		reacteur.setTextureOffset(4, 36).addBox(-16.0F, -0.7956F, -4.0F, 8.0F, 1.0F, 1.0F, 5.0F, false);
		reacteur.setTextureOffset(4, 36).addBox(-16.0F, -0.7956F, 3.0F, 8.0F, 1.0F, 1.0F, 5.0F, false);
		reacteur.setTextureOffset(4, 36).addBox(-16.0F, 3.0F, -0.7956F, 8.0F, 1.0F, 1.0F, 5.0F, false);
		reacteur.setTextureOffset(4, 36).addBox(-16.0F, -4.0F, -0.7956F, 8.0F, 1.0F, 1.0F, 5.0F, false);

		hexadecagon_r5 = new ModelRenderer(this);
		hexadecagon_r5.setRotationPoint(-16.0F, 0.0F, 0.0F);
		reacteur.addChild(hexadecagon_r5);
		setRotationAngle(hexadecagon_r5, -0.3927F, 0.0F, 0.0F);
		hexadecagon_r5.setTextureOffset(4, 36).addBox(0.0F, -4.0F, -0.7956F, 8.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r5.setTextureOffset(4, 36).addBox(0.0F, 3.0F, -0.7956F, 8.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r5.setTextureOffset(4, 36).addBox(0.0F, -0.7956F, 3.0F, 8.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r5.setTextureOffset(4, 36).addBox(0.0F, -0.7956F, -4.0F, 8.0F, 1.0F, 1.0F, 5.0F, false);

		hexadecagon_r6 = new ModelRenderer(this);
		hexadecagon_r6.setRotationPoint(-16.0F, 0.0F, 0.0F);
		reacteur.addChild(hexadecagon_r6);
		setRotationAngle(hexadecagon_r6, 0.3927F, 0.0F, 0.0F);
		hexadecagon_r6.setTextureOffset(4, 36).addBox(0.0F, -4.0F, -0.7956F, 8.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r6.setTextureOffset(4, 36).addBox(0.0F, 3.0F, -0.7956F, 8.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r6.setTextureOffset(4, 36).addBox(0.0F, -0.7956F, 3.0F, 8.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r6.setTextureOffset(4, 36).addBox(0.0F, -0.7956F, -4.0F, 8.0F, 1.0F, 1.0F, 5.0F, false);

		hexadecagon_r7 = new ModelRenderer(this);
		hexadecagon_r7.setRotationPoint(-16.0F, 0.0F, 0.0F);
		reacteur.addChild(hexadecagon_r7);
		setRotationAngle(hexadecagon_r7, -0.7854F, 0.0F, 0.0F);
		hexadecagon_r7.setTextureOffset(4, 36).addBox(0.0F, -0.7956F, 3.0F, 8.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r7.setTextureOffset(4, 36).addBox(0.0F, -0.7956F, -4.0F, 8.0F, 1.0F, 1.0F, 5.0F, false);

		hexadecagon_r8 = new ModelRenderer(this);
		hexadecagon_r8.setRotationPoint(-16.0F, 0.0F, 0.0F);
		reacteur.addChild(hexadecagon_r8);
		setRotationAngle(hexadecagon_r8, 0.7854F, 0.0F, 0.0F);
		hexadecagon_r8.setTextureOffset(4, 36).addBox(0.0F, -0.7956F, 3.0F, 8.0F, 1.0F, 1.0F, 5.0F, false);
		hexadecagon_r8.setTextureOffset(4, 36).addBox(0.0F, -0.7956F, -4.0F, 8.0F, 1.0F, 1.0F, 5.0F, false);

		reactor = new ModelRenderer(this);
		reactor.setRotationPoint(-4.0F, 0.0F, 0.0F);
		all.addChild(reactor);
		reactor.setTextureOffset(2, 33).addBox(-4.0F, -0.9946F, -5.0F, 8.0F, 1.0F, 3.0F, 5.0F, false);
		reactor.setTextureOffset(2, 33).addBox(-4.0F, -0.9946F, 2.0F, 8.0F, 1.0F, 3.0F, 5.0F, false);
		reactor.setTextureOffset(2, 33).addBox(-4.0F, 2.0F, -0.9946F, 8.0F, 3.0F, 1.0F, 5.0F, false);
		reactor.setTextureOffset(2, 33).addBox(-4.0F, -5.0F, -0.9946F, 8.0F, 3.0F, 1.0F, 5.0F, false);

		hexadecagon_r9 = new ModelRenderer(this);
		hexadecagon_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		reactor.addChild(hexadecagon_r9);
		setRotationAngle(hexadecagon_r9, -0.3927F, 0.0F, 0.0F);
		hexadecagon_r9.setTextureOffset(2, 33).addBox(-4.0F, -5.0F, -0.9946F, 8.0F, 3.0F, 1.0F, 5.0F, false);
		hexadecagon_r9.setTextureOffset(2, 33).addBox(-4.0F, 2.0F, -0.9946F, 8.0F, 3.0F, 1.0F, 5.0F, false);
		hexadecagon_r9.setTextureOffset(2, 33).addBox(-4.0F, -0.9946F, 2.0F, 8.0F, 1.0F, 3.0F, 5.0F, false);
		hexadecagon_r9.setTextureOffset(2, 33).addBox(-4.0F, -0.9946F, -5.0F, 8.0F, 1.0F, 3.0F, 5.0F, false);

		hexadecagon_r10 = new ModelRenderer(this);
		hexadecagon_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		reactor.addChild(hexadecagon_r10);
		setRotationAngle(hexadecagon_r10, 0.3927F, 0.0F, 0.0F);
		hexadecagon_r10.setTextureOffset(2, 33).addBox(-4.0F, -5.0F, -0.9946F, 8.0F, 3.0F, 1.0F, 5.0F, false);
		hexadecagon_r10.setTextureOffset(2, 33).addBox(-4.0F, 2.0F, -0.9946F, 8.0F, 3.0F, 1.0F, 5.0F, false);
		hexadecagon_r10.setTextureOffset(2, 33).addBox(-4.0F, -0.9946F, 2.0F, 8.0F, 1.0F, 3.0F, 5.0F, false);
		hexadecagon_r10.setTextureOffset(2, 33).addBox(-4.0F, -0.9946F, -5.0F, 8.0F, 1.0F, 3.0F, 5.0F, false);

		hexadecagon_r11 = new ModelRenderer(this);
		hexadecagon_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		reactor.addChild(hexadecagon_r11);
		setRotationAngle(hexadecagon_r11, -0.7854F, 0.0F, 0.0F);
		hexadecagon_r11.setTextureOffset(2, 33).addBox(-4.0F, -0.9946F, 2.0F, 8.0F, 1.0F, 3.0F, 5.0F, false);
		hexadecagon_r11.setTextureOffset(2, 33).addBox(-4.0F, -0.9946F, -5.0F, 8.0F, 1.0F, 3.0F, 5.0F, false);

		hexadecagon_r12 = new ModelRenderer(this);
		hexadecagon_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		reactor.addChild(hexadecagon_r12);
		setRotationAngle(hexadecagon_r12, 0.7854F, 0.0F, 0.0F);
		hexadecagon_r12.setTextureOffset(2, 33).addBox(-4.0F, -0.9946F, 2.0F, 8.0F, 1.0F, 3.0F, 5.0F, false);
		hexadecagon_r12.setTextureOffset(2, 33).addBox(-4.0F, -0.9946F, -5.0F, 8.0F, 1.0F, 3.0F, 5.0F, false);

		aillette = new ModelRenderer(this);
		aillette.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(aillette);
		aillette.setTextureOffset(104, 0).addBox(-8.0F, -6.9946F, -1.0F, 8.0F, 1.0F, 2.0F, 5.0F, false);
		aillette.setTextureOffset(104, 0).addBox(-8.0F, -0.9946F, 5.0F, 8.0F, 1.0F, 2.0F, 5.0F, false);
		aillette.setTextureOffset(104, 0).addBox(-8.0F, -0.9946F, -7.0F, 8.0F, 1.0F, 2.0F, 5.0F, false);
		aillette.setTextureOffset(104, 0).addBox(-8.0F, 5.0054F, -1.0F, 8.0F, 1.0F, 2.0F, 5.0F, false);

		hexadecagon_r13 = new ModelRenderer(this);
		hexadecagon_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		aillette.addChild(hexadecagon_r13);
		setRotationAngle(hexadecagon_r13, 0.0F, -0.2182F, 0.0F);
		hexadecagon_r13.setTextureOffset(104, 0).addBox(-15.0F, -0.9946F, 5.0F, 9.0F, 1.0F, 3.0F, 5.0F, false);

		hexadecagon_r14 = new ModelRenderer(this);
		hexadecagon_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		aillette.addChild(hexadecagon_r14);
		setRotationAngle(hexadecagon_r14, 0.0F, 0.2182F, 0.0F);
		hexadecagon_r14.setTextureOffset(104, 0).addBox(-15.0F, -0.9946F, -8.0F, 9.0F, 1.0F, 3.0F, 5.0F, false);

		hexadecagon_r15 = new ModelRenderer(this);
		hexadecagon_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
		aillette.addChild(hexadecagon_r15);
		setRotationAngle(hexadecagon_r15, 0.0F, 0.0F, 0.2182F);
		hexadecagon_r15.setTextureOffset(104, 0).addBox(-15.0F, 4.9946F, -1.0F, 9.0F, 3.0F, 2.0F, 5.0F, false);

		hexadecagon_r16 = new ModelRenderer(this);
		hexadecagon_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		aillette.addChild(hexadecagon_r16);
		setRotationAngle(hexadecagon_r16, 0.0F, 0.0F, -0.2182F);
		hexadecagon_r16.setTextureOffset(104, 0).addBox(-15.0F, -7.9946F, -1.0F, 9.0F, 3.0F, 2.0F, 5.0F, false);

		pointe = new ModelRenderer(this);
		pointe.setRotationPoint(0.0F, 0.0F, 0.0F);
		all.addChild(pointe);
		pointe.setTextureOffset(0, 0).addBox(-42.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F, 5.0F, false);
		pointe.setTextureOffset(0, 0).addBox(-43.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 5.0F, false);
		pointe.setTextureOffset(13, 60).addBox(-44.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 5.0F, false);
		pointe.setTextureOffset(0, 0).addBox(-45.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 5.0F, false);
		pointe.setTextureOffset(8, 61).addBox(-46.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 5.0F, false);
		pointe.setTextureOffset(0, 0).addBox(-47.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 5.0F, false);
		pointe.setTextureOffset(10, 55).addBox(-48.0F, -2.0F, -2.0F, 1.0F, 4.0F, 4.0F, 5.0F, false);
		pointe.setTextureOffset(0, 0).addBox(-52.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 5.0F, false);
		pointe.setTextureOffset(114, 66).addBox(-54.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 5.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-42.0F, 0.0F, 0.0F);
		pointe.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.5708F, 0.0F, -0.2182F);
		cube_r1.setTextureOffset(0, 0).addBox(-7.0F, -1.0F, -4.0F, 8.0F, 2.0F, 2.0F, 5.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-42.0F, 0.0F, 0.0F);
		pointe.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.5708F, 0.0F, 0.2182F);
		cube_r2.setTextureOffset(0, 0).addBox(-7.0F, -1.0F, 2.0F, 8.0F, 2.0F, 2.0F, 5.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-42.0F, 0.0F, 0.0F);
		pointe.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.2182F, 0.0F);
		cube_r3.setTextureOffset(0, 0).addBox(-7.0F, -1.0F, 2.0F, 8.0F, 2.0F, 2.0F, 5.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-42.0F, 0.0F, 0.0F);
		pointe.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.2182F, 0.0F);
		cube_r4.setTextureOffset(0, 0).addBox(-7.0F, -1.0F, -4.0F, 8.0F, 2.0F, 2.0F, 5.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		all.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}