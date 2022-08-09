
package net.feusalamander.bettermissiles.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.feusalamander.bettermissiles.BettermissilesModVariables;
import net.feusalamander.bettermissiles.BettermissilesMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class LauncherGuiWindow extends ContainerScreen<LauncherGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = LauncherGui.guistate;
	TextFieldWidget xm;
	TextFieldWidget zm;

	public LauncherGuiWindow(LauncherGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 285;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("bettermissiles:textures/launcher.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
		xm.render(ms, mouseX, mouseY, partialTicks);
		zm.render(ms, mouseX, mouseY, partialTicks);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		if (xm.isFocused())
			return xm.keyPressed(key, b, c);
		if (zm.isFocused())
			return zm.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
		xm.tick();
		zm.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "x: " + (BettermissilesModVariables.MapVariables.get(world).xm) + " z: "
				+ (BettermissilesModVariables.MapVariables.get(world).zm) + "", 133, 11, -12829636);
		this.font.drawString(ms, "Launchpad Controller", 5, 5, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		xm = new TextFieldWidget(this.font, this.guiLeft + 132, this.guiTop + 23, 120, 20, new StringTextComponent("x")) {
			{
				setSuggestion("x");
			}

			@Override
			public void writeText(String text) {
				super.writeText(text);
				if (getText().isEmpty())
					setSuggestion("x");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);
				if (getText().isEmpty())
					setSuggestion("x");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:xm", xm);
		xm.setMaxStringLength(32767);
		this.children.add(this.xm);
		zm = new TextFieldWidget(this.font, this.guiLeft + 131, this.guiTop + 56, 120, 20, new StringTextComponent("z")) {
			{
				setSuggestion("z");
			}

			@Override
			public void writeText(String text) {
				super.writeText(text);
				if (getText().isEmpty())
					setSuggestion("z");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);
				if (getText().isEmpty())
					setSuggestion("z");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:zm", zm);
		zm.setMaxStringLength(32767);
		this.children.add(this.zm);
		this.addButton(new Button(this.guiLeft + 251, this.guiTop + 23, 30, 20, new StringTextComponent("set x"), e -> {
			if (true) {
				BettermissilesMod.PACKET_HANDLER.sendToServer(new LauncherGui.ButtonPressedMessage(0, x, y, z));
				LauncherGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 251, this.guiTop + 56, 30, 20, new StringTextComponent("set z"), e -> {
			if (true) {
				BettermissilesMod.PACKET_HANDLER.sendToServer(new LauncherGui.ButtonPressedMessage(1, x, y, z));
				LauncherGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 229, this.guiTop + 139, 46, 20, new StringTextComponent("Launch"), e -> {
			if (true) {
				BettermissilesMod.PACKET_HANDLER.sendToServer(new LauncherGui.ButtonPressedMessage(2, x, y, z));
				LauncherGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 229, this.guiTop + 100, 46, 20, new StringTextComponent("place it"), e -> {
			if (true) {
				BettermissilesMod.PACKET_HANDLER.sendToServer(new LauncherGui.ButtonPressedMessage(3, x, y, z));
				LauncherGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
