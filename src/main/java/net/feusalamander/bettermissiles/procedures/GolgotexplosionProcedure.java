package net.feusalamander.bettermissiles.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

public class GolgotexplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 100, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x + 20), y, (z + 20), 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x + 20), y, (z - 20), 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x - 20), y, (z + 20), 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x - 20), y, (z - 20), 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x + 20), y, z, 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x - 20), y, z, 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, (z - 20), 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, (z + 20), 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, (y - 20), z, 100, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x + 20), (y - 20), (z + 20), 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x + 20), (y - 20), (z - 20), 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x - 20), (y - 20), (z + 20), 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x - 20), (y - 20), (z - 20), 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x + 20), (y - 20), z, 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (x - 20), (y - 20), z, 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, (y - 20), (z - 20), 75, Level.ExplosionInteraction.BLOCK);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, (y - 20), (z + 20), 75, Level.ExplosionInteraction.BLOCK);
	}
}
