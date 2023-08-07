package net.feusalamander.bettermissiles.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.feusalamander.bettermissiles.init.BettermissilesModItems;

public class ProxyrecupProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double speed = 0;
		double distance = 0;
		ItemStack missile = ItemStack.EMPTY;
		speed = entity.getPersistentData().getDouble("missile_speed");
		distance = entity.getPersistentData().getDouble("missile_distance");
		if (!entity.level.isClientSide())
			entity.discard();
		missile = new ItemStack(BettermissilesModItems.PROXY_ITEM.get());
		missile.getOrCreateTag().putDouble("missile_speed", speed);
		missile.getOrCreateTag().putDouble("missile_distance", distance);
		if (sourceentity instanceof Player _player) {
			ItemStack _setstack = missile;
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
