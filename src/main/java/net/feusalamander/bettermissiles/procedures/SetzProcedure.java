package net.feusalamander.bettermissiles.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.client.gui.components.EditBox;

import net.feusalamander.bettermissiles.network.BettermissilesModVariables;

import java.util.HashMap;

public class SetzProcedure {
	public static void execute(LevelAccessor world, HashMap guistate) {
		if (guistate == null)
			return;
		BettermissilesModVariables.MapVariables.get(world).zm = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(guistate.containsKey("text:zm") ? ((EditBox) guistate.get("text:zm")).getValue() : "");
		BettermissilesModVariables.MapVariables.get(world).syncData(world);
	}
}
