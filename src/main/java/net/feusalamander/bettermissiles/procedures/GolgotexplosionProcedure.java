package net.feusalamander.bettermissiles.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;

import net.feusalamander.bettermissiles.BettermissilesMod;

import java.util.Map;

public class GolgotexplosionProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency world for procedure Golgotexplosion!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency x for procedure Golgotexplosion!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency y for procedure Golgotexplosion!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency z for procedure Golgotexplosion!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 100, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x + 20), (int) y, (int) (z + 20), (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x + 20), (int) y, (int) (z - 20), (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x - 20), (int) y, (int) (z + 20), (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x - 20), (int) y, (int) (z - 20), (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x + 20), (int) y, (int) z, (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x - 20), (int) y, (int) z, (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) (z - 20), (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) (z + 20), (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y - 20), (int) z, (float) 100, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x + 20), (int) (y - 20), (int) (z + 20), (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x + 20), (int) (y - 20), (int) (z - 20), (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x - 20), (int) (y - 20), (int) (z + 20), (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x - 20), (int) (y - 20), (int) (z - 20), (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x + 20), (int) (y - 20), (int) z, (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) (x - 20), (int) (y - 20), (int) z, (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y - 20), (int) (z - 20), (float) 75, Explosion.Mode.DESTROY);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) (y - 20), (int) (z + 20), (float) 75, Explosion.Mode.DESTROY);
		}
	}
}
