package net.mcreator.herobrinemod.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.herobrinemod.init.HerobrinemodModGameRules;

public class HerobrineLoaderOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"gamerule herobrineLoaderSpawnDebug 0");
		if ((world instanceof ServerLevel _serverLevelGR1 && _serverLevelGR1.getGameRules().getBoolean(HerobrinemodModGameRules.DEBUG_MODE)) == true) {
			entity.setCustomName(Component.literal("Loader"));
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"execute if @e[type=herobrinemod:herobrine] run gamerule herobrineLoaderSpawnDebug 1");
	}
}