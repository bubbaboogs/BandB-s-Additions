
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bandbadditions.init;

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

import net.mcreator.bandbadditions.entity.IronBombProjectileEntity;
import net.mcreator.bandbadditions.entity.DirtBombProjectileEntity;
import net.mcreator.bandbadditions.entity.BombProjectileEntity;
import net.mcreator.bandbadditions.BandbAdditionsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BandbAdditionsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BandbAdditionsMod.MODID);
	public static final RegistryObject<EntityType<BombProjectileEntity>> BOMB_PROJECTILE = register("projectile_bomb_projectile",
			EntityType.Builder.<BombProjectileEntity>of(BombProjectileEntity::new, MobCategory.MISC).setCustomClientFactory(BombProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IronBombProjectileEntity>> IRON_BOMB_PROJECTILE = register("projectile_iron_bomb_projectile", EntityType.Builder.<IronBombProjectileEntity>of(IronBombProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(IronBombProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DirtBombProjectileEntity>> DIRT_BOMB_PROJECTILE = register("projectile_dirt_bomb_projectile", EntityType.Builder.<DirtBombProjectileEntity>of(DirtBombProjectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(DirtBombProjectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
