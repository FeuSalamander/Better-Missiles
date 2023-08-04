
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.feusalamander.bettermissiles.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.feusalamander.bettermissiles.block.entity.LaunchpadcontrollerBlockEntity;
import net.feusalamander.bettermissiles.block.entity.ExplosiveworkbenchBlockEntity;
import net.feusalamander.bettermissiles.BettermissilesMod;

public class BettermissilesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BettermissilesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> LAUNCHPADCONTROLLER = register("launchpadcontroller", BettermissilesModBlocks.LAUNCHPADCONTROLLER, LaunchpadcontrollerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> EXPLOSIVEWORKBENCH = register("explosiveworkbench", BettermissilesModBlocks.EXPLOSIVEWORKBENCH, ExplosiveworkbenchBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
