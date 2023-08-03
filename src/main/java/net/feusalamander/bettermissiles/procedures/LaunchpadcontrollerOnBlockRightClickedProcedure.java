package net.feusalamander.bettermissiles.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.feusalamander.bettermissiles.world.inventory.LauncherMenu;
import net.feusalamander.bettermissiles.init.BettermissilesModBlocks;

import io.netty.buffer.Unpooled;

public class LaunchpadcontrollerOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x + 1, y, z + 2))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z + 3))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x, y, z + 2))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x, y, z + 3))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x - 1, y, z + 2))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z + 3))).getBlock() == BettermissilesModBlocks.PAD.get()) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Launcher");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new LauncherMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("direction", "sud");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x + 1, y, z - 2))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z - 3))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x, y, z - 2))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x, y, z - 3))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x - 1, y, z - 2))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z - 3))).getBlock() == BettermissilesModBlocks.PAD.get()) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Launcher");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new LauncherMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("direction", "nord");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x + 2, y, z + 1))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x + 3, y, z + 1))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x + 2, y, z - 1))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x + 3, y, z - 1))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x + 2, y, z))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x + 3, y, z))).getBlock() == BettermissilesModBlocks.PAD.get()) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Launcher");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new LauncherMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("direction", "est");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x - 2, y, z + 1))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x - 3, y, z + 1))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x - 2, y, z - 1))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x - 3, y, z - 1))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == BettermissilesModBlocks.PAD.get() && (world.getBlockState(BlockPos.containing(x - 2, y, z))).getBlock() == BettermissilesModBlocks.PAD.get()
				&& (world.getBlockState(BlockPos.containing(x - 3, y, z))).getBlock() == BettermissilesModBlocks.PAD.get()) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = BlockPos.containing(x, y, z);
					NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return Component.literal("Launcher");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new LauncherMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putString("direction", "ouest");
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
