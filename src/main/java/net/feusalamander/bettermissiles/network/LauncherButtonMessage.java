
package net.feusalamander.bettermissiles.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.feusalamander.bettermissiles.world.inventory.LauncherMenu;
import net.feusalamander.bettermissiles.procedures.SetzProcedure;
import net.feusalamander.bettermissiles.procedures.SetxProcedure;
import net.feusalamander.bettermissiles.procedures.PlaceProcedure;
import net.feusalamander.bettermissiles.procedures.LaunchProcedure;
import net.feusalamander.bettermissiles.BettermissilesMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LauncherButtonMessage {
	private final int buttonID, x, y, z;

	public LauncherButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public LauncherButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(LauncherButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(LauncherButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = LauncherMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SetxProcedure.execute(world, x, y, z, guistate);
		}
		if (buttonID == 1) {

			SetzProcedure.execute(world, x, y, z, guistate);
		}
		if (buttonID == 2) {

			LaunchProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			PlaceProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		BettermissilesMod.addNetworkMessage(LauncherButtonMessage.class, LauncherButtonMessage::buffer, LauncherButtonMessage::new, LauncherButtonMessage::handler);
	}
}
