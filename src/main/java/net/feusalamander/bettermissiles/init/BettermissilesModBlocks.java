
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.feusalamander.bettermissiles.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.feusalamander.bettermissiles.block.PadBlock;
import net.feusalamander.bettermissiles.block.LaunchpadcontrollerBlock;
import net.feusalamander.bettermissiles.BettermissilesMod;

public class BettermissilesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BettermissilesMod.MODID);
	public static final RegistryObject<Block> PAD = REGISTRY.register("pad", () -> new PadBlock());
	public static final RegistryObject<Block> LAUNCHPADCONTROLLER = REGISTRY.register("launchpadcontroller", () -> new LaunchpadcontrollerBlock());
}
