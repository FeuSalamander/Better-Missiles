package net.feusalamander.bettermissiles.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.client.gui.widget.TextFieldWidget;

import net.feusalamander.bettermissiles.BettermissilesModVariables;
import net.feusalamander.bettermissiles.BettermissilesMod;

import java.util.Map;
import java.util.HashMap;

public class SetxProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency world for procedure Setx!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency guistate for procedure Setx!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		BettermissilesModVariables.MapVariables.get(world).xm = new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:xm");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText());
		BettermissilesModVariables.MapVariables.get(world).syncData(world);
	}
}
