
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.feusalamander.bettermissiles.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.feusalamander.bettermissiles.BettermissilesMod;

public class BettermissilesModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BettermissilesMod.MODID);
	public static final RegistryObject<SoundEvent> WRENCH = REGISTRY.register("wrench", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("bettermissiles", "wrench")));
}
