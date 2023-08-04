
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.feusalamander.bettermissiles.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.feusalamander.bettermissiles.item.ProxyItem;
import net.feusalamander.bettermissiles.item.OblivionItem;
import net.feusalamander.bettermissiles.item.GolgotItem;
import net.feusalamander.bettermissiles.BettermissilesMod;

public class BettermissilesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BettermissilesMod.MODID);
	public static final RegistryObject<Item> PAD = block(BettermissilesModBlocks.PAD);
	public static final RegistryObject<Item> LAUNCHPADCONTROLLER = block(BettermissilesModBlocks.LAUNCHPADCONTROLLER);
	public static final RegistryObject<Item> OBLIVION = REGISTRY.register("oblivion", () -> new OblivionItem());
	public static final RegistryObject<Item> GOLGOT = REGISTRY.register("golgot", () -> new GolgotItem());
	public static final RegistryObject<Item> PROXY = REGISTRY.register("proxy", () -> new ProxyItem());
	public static final RegistryObject<Item> EXPLOSIVEWORKBENCH = block(BettermissilesModBlocks.EXPLOSIVEWORKBENCH);
	public static final RegistryObject<Item> WORKBENCH_TOP = block(BettermissilesModBlocks.WORKBENCH_TOP);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
