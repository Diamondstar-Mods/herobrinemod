/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herobrinemod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.herobrinemod.block.ThatFaceBlock;
import net.mcreator.herobrinemod.block.RestartFightBlock;
import net.mcreator.herobrinemod.block.HerobrineDimensionPortalBlock;
import net.mcreator.herobrinemod.HerobrinemodMod;

import java.util.function.Function;

public class HerobrinemodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(HerobrinemodMod.MODID);
	public static final DeferredBlock<Block> THAT_FACE;
	public static final DeferredBlock<Block> HEROBRINE_DIMENSION_PORTAL;
	public static final DeferredBlock<Block> RESTART_FIGHT;
	static {
		THAT_FACE = register("that_face", ThatFaceBlock::new);
		HEROBRINE_DIMENSION_PORTAL = register("herobrine_dimension_portal", HerobrineDimensionPortalBlock::new);
		RESTART_FIGHT = register("restart_fight", RestartFightBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}