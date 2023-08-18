package net.feusalamander.bettermissiles.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.animal.Cow;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.feusalamander.bettermissiles.init.BettermissilesModItems;
import net.feusalamander.bettermissiles.init.BettermissilesModEntities;
import net.feusalamander.bettermissiles.entity.ProxymissileEntity;
import net.feusalamander.bettermissiles.entity.PolarismissileEntity;

import java.util.concurrent.atomic.AtomicReference;

public class EntityreturnProcedure {
	public static Entity execute(LevelAccessor world, double x, double y, double z) {
		if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == BettermissilesModItems.PROXY_ITEM.get()) {
			return world instanceof Level _level ? new ProxymissileEntity(BettermissilesModEntities.PROXYMISSILE.get(), _level) : null;
		} else if ((new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				BlockEntity _ent = world.getBlockEntity(pos);
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
				return _retval.get();
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), 3)).getItem() == BettermissilesModItems.POLARIS_ITEM.get()) {
			return world instanceof Level _level ? new PolarismissileEntity(BettermissilesModEntities.POLARISMISSILE.get(), _level) : null;
		}
		return world instanceof Level _level ? new Cow(EntityType.COW, _level) : null;
	}
}
