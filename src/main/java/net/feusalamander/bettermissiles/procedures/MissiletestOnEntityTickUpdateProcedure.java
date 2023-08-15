package net.feusalamander.bettermissiles.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import net.feusalamander.bettermissiles.BettermissilesMod;

public class MissiletestOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xm = 0;
		double zm = 0;
		double dist = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 3, 1, 1, 1, 0.5);
		{
			// Get the radius of the sphere
			double radius = 0.4; // 3 blocks
			// Set the tolerance for how close to the surface a point must be to create a particle
			double tolerance = 0.005; // 0.1 blocks
			for (double xx = -radius; xx <= radius; xx += 0.1) {
				for (double yy = -radius; yy <= radius; yy += 0.1) {
					for (double zz = -radius; zz <= radius; zz += 0.1) {
						if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
							// Calculate the position of the particle
							double posX = x + xx;
							double posY = y + yy;
							double posZ = z + zz;
							if (true) {
								if (world instanceof ServerLevel)
									((ServerLevel) world).sendParticles(ParticleTypes.FLAME, posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
							} else {
								world.addParticle(ParticleTypes.FLAME, posX, posY, posZ, 0, 0, 0);
							}
						}
					}
				}
			}
		}
		if (entity.getY() > 300) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
			entity.setCustomName(Component.literal("Dinnerbone"));
			{
				Entity _ent = entity;
				_ent.teleportTo((entity.getPersistentData().getDouble("missile_x")), 250, (entity.getPersistentData().getDouble("missile_z")));
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("missile_x")), 250, (entity.getPersistentData().getDouble("missile_z")), _ent.getYRot(), _ent.getXRot());
			}
		} else if (entity.getPersistentData().getBoolean("ready") == true) {
			entity.getPersistentData().putBoolean("ready", false);
			if (entity.getZ() < entity.getPersistentData().getDouble("missile_z")) {
				zm = entity.getPersistentData().getDouble("missile_z") - entity.getZ();
			} else {
				zm = entity.getZ() - entity.getPersistentData().getDouble("missile_z");
			}
			if (entity.getX() < entity.getPersistentData().getDouble("missile_x")) {
				xm = entity.getPersistentData().getDouble("missile_x") - entity.getX();
			} else {
				xm = entity.getX() - entity.getPersistentData().getDouble("missile_x");
			}
			dist = Math.sqrt(xm * xm + zm * zm);
			if (dist > entity.getPersistentData().getDouble("missile_distance")) {
				BettermissilesMod.queueServerWork(40, () -> {
					entity.kill();
				});
			}
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 999, (int) (entity.getPersistentData().getDouble("missile_speed") * 18), false, false));
		}
	}
}
