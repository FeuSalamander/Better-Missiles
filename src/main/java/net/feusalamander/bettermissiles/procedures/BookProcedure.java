package net.feusalamander.bettermissiles.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.feusalamander.bettermissiles.network.BettermissilesModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BookProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(BettermissilesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BettermissilesModVariables.PlayerVariables())).bookM == true) {
			{
				boolean _setval = true;
				entity.getCapability(BettermissilesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.bookM = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(BettermissilesModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new BettermissilesModVariables.PlayerVariables())).bookM == false) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"give @p patchouli:guide_book{\"patchouli:book\": \"bettermissiles:bettermissiles_book\"}");
			{
				boolean _setval = true;
				entity.getCapability(BettermissilesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.bookM = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
