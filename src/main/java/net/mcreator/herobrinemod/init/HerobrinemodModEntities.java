/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herobrinemod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.herobrinemod.entity.HerobrinePassiveEntity;
import net.mcreator.herobrinemod.entity.HerobrineLoaderEntity;
import net.mcreator.herobrinemod.entity.HerobrineEntity;
import net.mcreator.herobrinemod.HerobrinemodMod;

@EventBusSubscriber
public class HerobrinemodModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, HerobrinemodMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<HerobrineEntity>> HEROBRINE = register("herobrine",
			EntityType.Builder.<HerobrineEntity>of(HerobrineEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HerobrinePassiveEntity>> HEROBRINE_PASSIVE = register("herobrine_passive",
			EntityType.Builder.<HerobrinePassiveEntity>of(HerobrinePassiveEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<HerobrineLoaderEntity>> HEROBRINE_LOADER = register("herobrine_loader",
			EntityType.Builder.<HerobrineLoaderEntity>of(HerobrineLoaderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.ridingOffset(-0.6f).sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(HerobrinemodMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		HerobrineEntity.init(event);
		HerobrinePassiveEntity.init(event);
		HerobrineLoaderEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HEROBRINE.get(), HerobrineEntity.createAttributes().build());
		event.put(HEROBRINE_PASSIVE.get(), HerobrinePassiveEntity.createAttributes().build());
		event.put(HEROBRINE_LOADER.get(), HerobrineLoaderEntity.createAttributes().build());
	}
}