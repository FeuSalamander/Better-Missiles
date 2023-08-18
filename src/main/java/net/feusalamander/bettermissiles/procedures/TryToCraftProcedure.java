package net.feusalamander.bettermissiles.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.BlockPos;

import net.feusalamander.bettermissiles.network.BettermissilesModVariables;
import net.feusalamander.bettermissiles.init.BettermissilesModItems;
import net.feusalamander.bettermissiles.BettermissilesMod;

import java.util.concurrent.atomic.AtomicReference;

public class TryToCraftProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BettermissilesMod.queueServerWork(1, () -> {
			BettermissilesModVariables.MapVariables.get(world).body = (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 1));
			BettermissilesModVariables.MapVariables.get(world).syncData(world);
			BettermissilesModVariables.MapVariables.get(world).nuzzle = (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 2));
			BettermissilesModVariables.MapVariables.get(world).syncData(world);
			if (BettermissilesModVariables.MapVariables.get(world).nuzzle.getItem() == BettermissilesModItems.NOZZLE_1.get()) {
				BettermissilesModVariables.MapVariables.get(world).nuzzle.getOrCreateTag().putDouble("missile_distance", 100);
			} else if (BettermissilesModVariables.MapVariables.get(world).nuzzle.getItem() == BettermissilesModItems.NOZZLE_2.get()) {
				BettermissilesModVariables.MapVariables.get(world).nuzzle.getOrCreateTag().putDouble("missile_distance", 500);
			} else if (BettermissilesModVariables.MapVariables.get(world).nuzzle.getItem() == BettermissilesModItems.NOZZLE_3.get()) {
				BettermissilesModVariables.MapVariables.get(world).nuzzle.getOrCreateTag().putDouble("missile_distance", 2000);
			}
			if (BettermissilesModVariables.MapVariables.get(world).body.getItem() == BettermissilesModItems.BODY_COPPER.get()) {
				BettermissilesModVariables.MapVariables.get(world).body.getOrCreateTag().putDouble("missile_speed", 1);
			} else if (BettermissilesModVariables.MapVariables.get(world).body.getItem() == BettermissilesModItems.BODY_IRON.get()) {
				BettermissilesModVariables.MapVariables.get(world).body.getOrCreateTag().putDouble("missile_speed", 2);
			} else if (BettermissilesModVariables.MapVariables.get(world).body.getItem() == BettermissilesModItems.BODY_CARBON.get()) {
				BettermissilesModVariables.MapVariables.get(world).body.getOrCreateTag().putDouble("missile_speed", 3);
			}
			if (((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 2)).getItem() == BettermissilesModItems.NOZZLE_1.get() || (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 2)).getItem() == BettermissilesModItems.NOZZLE_2.get() || (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 2)).getItem() == BettermissilesModItems.NOZZLE_3.get()) && ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == BettermissilesModItems.BODY_IRON.get() || (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == BettermissilesModItems.BODY_CARBON.get() || (new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					BlockEntity _ent = world.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
					return _retval.get();
				}
			}.getItemStack(world, BlockPos.containing(x, y, z), 1)).getItem() == BettermissilesModItems.BODY_COPPER.get())) {
				if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == BettermissilesModItems.PROXY_WAR_HEAD.get()) {
					BettermissilesModVariables.MapVariables.get(world).missile = new ItemStack(BettermissilesModItems.PROXY_ITEM.get());
					BettermissilesModVariables.MapVariables.get(world).syncData(world);
					BettermissilesModVariables.MapVariables.get(world).missile.getOrCreateTag().putDouble("missile_speed", (BettermissilesModVariables.MapVariables.get(world).body.getOrCreateTag().getDouble("missile_speed")));
					BettermissilesModVariables.MapVariables.get(world).missile.getOrCreateTag().putDouble("missile_distance", (BettermissilesModVariables.MapVariables.get(world).nuzzle.getOrCreateTag().getDouble("missile_distance")));
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 3;
							final ItemStack _setstack = BettermissilesModVariables.MapVariables.get(world).missile;
							_setstack.setCount(1);
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				} else if ((new Object() {
					public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						BlockEntity _ent = world.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> _retval.set(capability.getStackInSlot(slotid).copy()));
						return _retval.get();
					}
				}.getItemStack(world, BlockPos.containing(x, y, z), 0)).getItem() == BettermissilesModItems.POLARIS_WAR_HEAD.get()) {
					BettermissilesModVariables.MapVariables.get(world).missile = new ItemStack(BettermissilesModItems.POLARIS_ITEM.get());
					BettermissilesModVariables.MapVariables.get(world).syncData(world);
					BettermissilesModVariables.MapVariables.get(world).missile.getOrCreateTag().putDouble("missile_speed", (BettermissilesModVariables.MapVariables.get(world).body.getOrCreateTag().getDouble("missile_speed")));
					BettermissilesModVariables.MapVariables.get(world).missile.getOrCreateTag().putDouble("missile_distance", (BettermissilesModVariables.MapVariables.get(world).nuzzle.getOrCreateTag().getDouble("missile_distance")));
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 3;
							final ItemStack _setstack = BettermissilesModVariables.MapVariables.get(world).missile;
							_setstack.setCount(1);
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, _setstack);
							});
						}
					}
				} else {
					{
						BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
						if (_ent != null) {
							final int _slotid = 3;
							_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
								if (capability instanceof IItemHandlerModifiable)
									((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
							});
						}
					}
				}
			} else {
				{
					BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
					if (_ent != null) {
						final int _slotid = 3;
						_ent.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
							if (capability instanceof IItemHandlerModifiable)
								((IItemHandlerModifiable) capability).setStackInSlot(_slotid, ItemStack.EMPTY);
						});
					}
				}
			}
		});
	}
}
