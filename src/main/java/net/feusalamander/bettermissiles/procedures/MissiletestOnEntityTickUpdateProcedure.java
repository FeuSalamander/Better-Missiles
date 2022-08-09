package net.feusalamander.bettermissiles.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.feusalamander.bettermissiles.BettermissilesModVariables;
import net.feusalamander.bettermissiles.BettermissilesMod;

import java.util.Map;
import java.util.Collections;

public class MissiletestOnEntityTickUpdateProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency world for procedure MissiletestOnEntityTickUpdate!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BettermissilesMod.LOGGER.warn("Failed to load dependency entity for procedure MissiletestOnEntityTickUpdate!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.getPersistentData().getBoolean("ready") == true) {
			entity.getPersistentData().putBoolean("ready", (false));
			entity.setMotion(0, 4, 0);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;

				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					entity.setMotion(0, 4, 0);
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
							this.waitTicks = waitTicks;
							MinecraftForge.EVENT_BUS.register(this);
							this.world = world;
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								this.ticks += 1;
								if (this.ticks >= this.waitTicks)
									run();
							}
						}

						private void run() {
							entity.setCustomName(new StringTextComponent("Dinnerbone"));
							{
								Entity _ent = entity;
								_ent.setPositionAndUpdate(BettermissilesModVariables.MapVariables.get(world).xm, 250,
										BettermissilesModVariables.MapVariables.get(world).zm);
								if (_ent instanceof ServerPlayerEntity) {
									((ServerPlayerEntity) _ent).connection.setPlayerLocation(BettermissilesModVariables.MapVariables.get(world).xm,
											250, BettermissilesModVariables.MapVariables.get(world).zm, _ent.rotationYaw, _ent.rotationPitch,
											Collections.emptySet());
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 50);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 50);
		}
	}
}
