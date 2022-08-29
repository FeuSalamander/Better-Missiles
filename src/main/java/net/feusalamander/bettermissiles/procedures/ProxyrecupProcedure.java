package net.feusalamander.bettermissiles.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.feusalamander.bettermissiles.item.ProxyItem;
import net.feusalamander.bettermissiles.BettermissilesMod;

import java.util.Map;

public class ProxyrecupProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency entity for procedure Proxyrecup!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency sourceentity for procedure Proxyrecup!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (!entity.world.isRemote())
			entity.remove();
		if (sourceentity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(ProxyItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
		}
	}
}
