package net.feusalamander.bettermissiles.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.feusalamander.bettermissiles.network.BettermissilesModVariables;

public class XProcedure {
	public static String execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format(BettermissilesModVariables.MapVariables.get(world).xm);
	}
}
