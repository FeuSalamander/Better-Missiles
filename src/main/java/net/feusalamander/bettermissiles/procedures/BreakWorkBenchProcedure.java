package net.feusalamander.bettermissiles.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BreakWorkBenchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
	}
}
