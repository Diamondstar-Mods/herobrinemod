package net.mcreator.herobrinemod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class HerobrinePassiveOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setCustomName(Component.literal("Herobrine"));
	}
}