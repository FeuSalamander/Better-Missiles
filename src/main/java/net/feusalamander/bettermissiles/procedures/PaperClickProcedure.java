package net.feusalamander.bettermissiles.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.feusalamander.bettermissiles.init.BettermissilesModBlocks;

public class PaperClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity.isShiftKeyDown() && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == BettermissilesModBlocks.LAUNCHPADCONTROLLER.get()) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("missile_x", (itemstack.getOrCreateTag().getDouble("missile_x")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putDouble("missile_z", (itemstack.getOrCreateTag().getDouble("missile_z")));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("The coords have been succefully pasted"), true);
		} else {
			itemstack.getOrCreateTag().putDouble("missile_x", x);
			itemstack.getOrCreateTag().putDouble("missile_z", z);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("The coords have been set to x: " + x + " and z: " + z)), true);
		}
	}
}
