/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herobrinemod.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber
public class HerobrinemodModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> DEBUG_MODE;
	public static GameRules.Key<GameRules.IntegerValue> HEROBRINE_LOADER_SPAWN_DEBUG;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		DEBUG_MODE = GameRules.register("debugMode", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
		HEROBRINE_LOADER_SPAWN_DEBUG = GameRules.register("herobrineLoaderSpawnDebug", GameRules.Category.PLAYER, GameRules.IntegerValue.create(0));
	}
}