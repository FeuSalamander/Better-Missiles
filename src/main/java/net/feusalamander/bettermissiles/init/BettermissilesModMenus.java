
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.feusalamander.bettermissiles.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.feusalamander.bettermissiles.world.inventory.WorkBenchMenu;
import net.feusalamander.bettermissiles.world.inventory.LauncherMenu;
import net.feusalamander.bettermissiles.BettermissilesMod;

public class BettermissilesModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BettermissilesMod.MODID);
	public static final RegistryObject<MenuType<LauncherMenu>> LAUNCHER = REGISTRY.register("launcher", () -> IForgeMenuType.create(LauncherMenu::new));
	public static final RegistryObject<MenuType<WorkBenchMenu>> WORK_BENCH = REGISTRY.register("work_bench", () -> IForgeMenuType.create(WorkBenchMenu::new));
}
