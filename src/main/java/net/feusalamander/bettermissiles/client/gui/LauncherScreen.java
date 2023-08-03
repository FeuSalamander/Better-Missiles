package net.feusalamander.bettermissiles.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;

import net.feusalamander.bettermissiles.world.inventory.LauncherMenu;
import net.feusalamander.bettermissiles.procedures.ZProcedure;
import net.feusalamander.bettermissiles.procedures.XProcedure;
import net.feusalamander.bettermissiles.network.LauncherButtonMessage;
import net.feusalamander.bettermissiles.BettermissilesMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class LauncherScreen extends AbstractContainerScreen<LauncherMenu> {
	private final static HashMap<String, Object> guistate = LauncherMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox xm;
	EditBox zm;
	Button button_set_x;
	Button button_set_z;
	Button button_launch;
	Button button_place_it;

	public LauncherScreen(LauncherMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 285;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("bettermissiles:textures/screens/launcher.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		xm.render(ms, mouseX, mouseY, partialTicks);
		zm.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (xm.isFocused())
			return xm.keyPressed(key, b, c);
		if (zm.isFocused())
			return zm.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		xm.tick();
		zm.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.bettermissiles.launcher.label_launchpad_controller"), 5, 5, -12829636);
		this.font.draw(poseStack,

				XProcedure.execute(world, entity), 117, 27, -12829636);
		this.font.draw(poseStack,

				ZProcedure.execute(world), 117, 62, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		xm = new EditBox(this.font, this.leftPos + 132, this.topPos + 23, 120, 20, Component.translatable("gui.bettermissiles.launcher.xm")) {
			{
				setSuggestion(Component.translatable("gui.bettermissiles.launcher.xm").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.bettermissiles.launcher.xm").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.bettermissiles.launcher.xm").getString());
				else
					setSuggestion(null);
			}
		};
		xm.setMaxLength(32767);
		guistate.put("text:xm", xm);
		this.addWidget(this.xm);
		zm = new EditBox(this.font, this.leftPos + 131, this.topPos + 56, 120, 20, Component.translatable("gui.bettermissiles.launcher.zm")) {
			{
				setSuggestion(Component.translatable("gui.bettermissiles.launcher.zm").getString());
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.bettermissiles.launcher.zm").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.bettermissiles.launcher.zm").getString());
				else
					setSuggestion(null);
			}
		};
		zm.setMaxLength(32767);
		guistate.put("text:zm", zm);
		this.addWidget(this.zm);
		button_set_x = Button.builder(Component.translatable("gui.bettermissiles.launcher.button_set_x"), e -> {
			if (true) {
				BettermissilesMod.PACKET_HANDLER.sendToServer(new LauncherButtonMessage(0, x, y, z));
				LauncherButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 251, this.topPos + 23, 30, 20).build();
		guistate.put("button:button_set_x", button_set_x);
		this.addRenderableWidget(button_set_x);
		button_set_z = Button.builder(Component.translatable("gui.bettermissiles.launcher.button_set_z"), e -> {
			if (true) {
				BettermissilesMod.PACKET_HANDLER.sendToServer(new LauncherButtonMessage(1, x, y, z));
				LauncherButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 251, this.topPos + 56, 30, 20).build();
		guistate.put("button:button_set_z", button_set_z);
		this.addRenderableWidget(button_set_z);
		button_launch = Button.builder(Component.translatable("gui.bettermissiles.launcher.button_launch"), e -> {
			if (true) {
				BettermissilesMod.PACKET_HANDLER.sendToServer(new LauncherButtonMessage(2, x, y, z));
				LauncherButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 229, this.topPos + 139, 46, 20).build();
		guistate.put("button:button_launch", button_launch);
		this.addRenderableWidget(button_launch);
		button_place_it = Button.builder(Component.translatable("gui.bettermissiles.launcher.button_place_it"), e -> {
			if (true) {
				BettermissilesMod.PACKET_HANDLER.sendToServer(new LauncherButtonMessage(3, x, y, z));
				LauncherButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 229, this.topPos + 100, 46, 20).build();
		guistate.put("button:button_place_it", button_place_it);
		this.addRenderableWidget(button_place_it);
	}
}
