package net.feusalamander.bettermissiles.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.feusalamander.bettermissiles.network.BettermissilesModVariables;

public class ZProcedure {
	public static String execute(LevelAccessor world) {
		return new java.text.DecimalFormat("##").format(BettermissilesModVariables.MapVariables.get(world).zm);
	}
}
