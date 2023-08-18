
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.feusalamander.bettermissiles.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.feusalamander.bettermissiles.entity.ProxymissileEntity;
import net.feusalamander.bettermissiles.entity.PolarismissileEntity;
import net.feusalamander.bettermissiles.entity.OblivionmissileEntity;
import net.feusalamander.bettermissiles.entity.GolgotmissileEntity;
import net.feusalamander.bettermissiles.BettermissilesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BettermissilesModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BettermissilesMod.MODID);
	public static final RegistryObject<EntityType<OblivionmissileEntity>> OBLIVIONMISSILE = register("oblivionmissile", EntityType.Builder.<OblivionmissileEntity>of(OblivionmissileEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(3).setUpdateInterval(3).setCustomClientFactory(OblivionmissileEntity::new).fireImmune().sized(0.6f, 3.25f));
	public static final RegistryObject<EntityType<GolgotmissileEntity>> GOLGOTMISSILE = register("golgotmissile", EntityType.Builder.<GolgotmissileEntity>of(GolgotmissileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(3).setUpdateInterval(3).setCustomClientFactory(GolgotmissileEntity::new).fireImmune().sized(0.6f, 3.25f));
	public static final RegistryObject<EntityType<ProxymissileEntity>> PROXYMISSILE = register("proxymissile", EntityType.Builder.<ProxymissileEntity>of(ProxymissileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(3).setUpdateInterval(3).setCustomClientFactory(ProxymissileEntity::new).fireImmune().sized(0.6f, 3.25f));
	public static final RegistryObject<EntityType<PolarismissileEntity>> POLARISMISSILE = register("polarismissile", EntityType.Builder.<PolarismissileEntity>of(PolarismissileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(3).setUpdateInterval(3).setCustomClientFactory(PolarismissileEntity::new).fireImmune().sized(0.6f, 3.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			OblivionmissileEntity.init();
			GolgotmissileEntity.init();
			ProxymissileEntity.init();
			PolarismissileEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(OBLIVIONMISSILE.get(), OblivionmissileEntity.createAttributes().build());
		event.put(GOLGOTMISSILE.get(), GolgotmissileEntity.createAttributes().build());
		event.put(PROXYMISSILE.get(), ProxymissileEntity.createAttributes().build());
		event.put(POLARISMISSILE.get(), PolarismissileEntity.createAttributes().build());
	}
}
