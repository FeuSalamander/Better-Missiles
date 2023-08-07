package net.feusalamander.bettermissiles.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import net.feusalamander.bettermissiles.BettermissilesMod;

public class MissiletestOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double xm = 0;
		double zm = 0;
		if (entity.getPersistentData().getBoolean("ready") == true) {
			entity.getPersistentData().putBoolean("ready", false);
			entity.setDeltaMovement(new Vec3(0, 4, 0));
			BettermissilesMod.queueServerWork(50, () -> {
				entity.setDeltaMovement(new Vec3(0, 4, 0));
				BettermissilesMod.queueServerWork(50, () -> {
					entity.setCustomName(Component.literal("Dinnerbone"));
					{
						Entity _ent = entity;
						_ent.teleportTo((entity.getPersistentData().getDouble("missile_x")), 250, (entity.getPersistentData().getDouble("missile_z")));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("missile_x")), 250, (entity.getPersistentData().getDouble("missile_z")), _ent.getYRot(), _ent.getXRot());
					}
				});
			});
		}
	}
}
