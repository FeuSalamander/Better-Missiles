package net.feusalamander.bettermissiles.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.feusalamander.bettermissiles.world.inventory.WorkBenchMenu;
import net.feusalamander.bettermissiles.procedures.TntcountProcedure;
import net.feusalamander.bettermissiles.procedures.StarcountProcedure;
import net.feusalamander.bettermissiles.procedures.EntityreturnbooleanProcedure;
import net.feusalamander.bettermissiles.procedures.EntityreturnProcedure;
import net.feusalamander.bettermissiles.procedures.BlazecountProcedure;
import net.feusalamander.bettermissiles.network.WorkBenchButtonMessage;
import net.feusalamander.bettermissiles.BettermissilesMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class WorkBenchScreen extends AbstractContainerScreen<WorkBenchMenu> {
	private final static HashMap<String, Object> guistate = WorkBenchMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_left;
	ImageButton imagebutton_right;

	public WorkBenchScreen(WorkBenchMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 309;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("bettermissiles:textures/screens/work_bench.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		if (EntityreturnProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
			if (EntityreturnbooleanProcedure.execute(world, x, y, z))
				InventoryScreen.renderEntityInInventoryFollowsAngle(ms, this.leftPos + 271, this.topPos + 137, 30, 0f + (float) Math.atan((this.leftPos + 271 - mouseX) / 40.0), (float) Math.atan((this.topPos + 87 - mouseY) / 40.0), livingEntity);
		}
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("bettermissiles:textures/screens/tnt.png"));
		this.blit(ms, this.leftPos + 10, this.topPos + 47, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("bettermissiles:textures/screens/blaze_powder.png"));
		this.blit(ms, this.leftPos + 10, this.topPos + 65, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("bettermissiles:textures/screens/nether_star.png"));
		this.blit(ms, this.leftPos + 10, this.topPos + 83, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.bettermissiles.work_bench.label_explosive_workbench"), 4, 3, -12829636);
		this.font.draw(poseStack,

				TntcountProcedure.execute(world, x, y, z), 26, 56, -3407872);
		this.font.draw(poseStack,

				BlazecountProcedure.execute(world, x, y, z), 26, 74, -39424);
		this.font.draw(poseStack,

				StarcountProcedure.execute(world, x, y, z), 26, 92, -6036766);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_left = new ImageButton(this.leftPos + 19, this.topPos + 114, 7, 11, 0, 0, 11, new ResourceLocation("bettermissiles:textures/screens/atlas/imagebutton_left.png"), 7, 22, e -> {
			if (true) {
				BettermissilesMod.PACKET_HANDLER.sendToServer(new WorkBenchButtonMessage(0, x, y, z));
				WorkBenchButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_left", imagebutton_left);
		this.addRenderableWidget(imagebutton_left);
		imagebutton_right = new ImageButton(this.leftPos + 48, this.topPos + 114, 7, 11, 0, 0, 11, new ResourceLocation("bettermissiles:textures/screens/atlas/imagebutton_right.png"), 7, 22, e -> {
			if (true) {
				BettermissilesMod.PACKET_HANDLER.sendToServer(new WorkBenchButtonMessage(1, x, y, z));
				WorkBenchButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_right", imagebutton_right);
		this.addRenderableWidget(imagebutton_right);
	}
}
