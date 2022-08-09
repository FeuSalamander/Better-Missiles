package net.feusalamander.bettermissiles.procedures;

import net.minecraftforge.fml.network.NetworkHooks;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.feusalamander.bettermissiles.gui.LauncherGui;
import net.feusalamander.bettermissiles.block.PadBlock;
import net.feusalamander.bettermissiles.BettermissilesMod;

import java.util.Map;

import io.netty.buffer.Unpooled;

public class LaunchpadcontrollerOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency world for procedure LaunchpadcontrollerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency x for procedure LaunchpadcontrollerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency y for procedure LaunchpadcontrollerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency z for procedure LaunchpadcontrollerOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency entity for procedure LaunchpadcontrollerOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 1, y, z + 2))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 1, y, z + 3))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x, y, z + 2))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x, y, z + 3))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 1, y, z + 2))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 1, y, z + 3))).getBlock() == PadBlock.block) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
						@Override
						public ITextComponent getDisplayName() {
							return new StringTextComponent("Launcher");
						}

						@Override
						public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
							return new LauncherGui.GuiContainerMod(id, inventory, new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putString("direction", "sud");
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 1, y, z - 2))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 1, y, z - 3))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x, y, z - 2))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x, y, z - 3))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 1, y, z - 2))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 1, y, z - 3))).getBlock() == PadBlock.block) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
						@Override
						public ITextComponent getDisplayName() {
							return new StringTextComponent("Launcher");
						}

						@Override
						public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
							return new LauncherGui.GuiContainerMod(id, inventory, new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putString("direction", "nord");
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 2, y, z + 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 3, y, z + 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 2, y, z - 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 3, y, z - 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 2, y, z))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x + 3, y, z))).getBlock() == PadBlock.block) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
						@Override
						public ITextComponent getDisplayName() {
							return new StringTextComponent("Launcher");
						}

						@Override
						public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
							return new LauncherGui.GuiContainerMod(id, inventory, new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putString("direction", "est");
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		} else if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 2, y, z + 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 3, y, z + 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 2, y, z - 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 3, y, z - 1))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 2, y, z))).getBlock() == PadBlock.block
				&& (world.getBlockState(new BlockPos(x - 3, y, z))).getBlock() == PadBlock.block) {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
						@Override
						public ITextComponent getDisplayName() {
							return new StringTextComponent("Launcher");
						}

						@Override
						public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
							return new LauncherGui.GuiContainerMod(id, inventory, new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
			if (!world.isRemote()) {
				BlockPos _bp = new BlockPos(x, y, z);
				TileEntity _tileEntity = world.getTileEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_tileEntity != null)
					_tileEntity.getTileData().putString("direction", "ouest");
				if (world instanceof World)
					((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
			}
		}
	}
}
