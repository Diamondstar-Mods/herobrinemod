/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herobrinemod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.herobrinemod.item.YouShouldntDoThatItem;
import net.mcreator.herobrinemod.item.HerobrineDimensionItem;
import net.mcreator.herobrinemod.HerobrinemodMod;

import java.util.function.Function;

public class HerobrinemodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(HerobrinemodMod.MODID);
	public static final DeferredItem<Item> HEROBRINE_SPAWN_EGG;
	public static final DeferredItem<Item> THAT_FACE;
	public static final DeferredItem<Item> HEROBRINE_DIMENSION;
	public static final DeferredItem<Item> YOU_SHOULDNT_DO_THAT;
	public static final DeferredItem<Item> HEROBRINE_PASSIVE_SPAWN_EGG;
	public static final DeferredItem<Item> HEROBRINE_LOADER_SPAWN_EGG;
	public static final DeferredItem<Item> RESTART_FIGHT;
	static {
		HEROBRINE_SPAWN_EGG = register("herobrine_spawn_egg", properties -> new SpawnEggItem(HerobrinemodModEntities.HEROBRINE.get(), properties));
		THAT_FACE = block(HerobrinemodModBlocks.THAT_FACE);
		HEROBRINE_DIMENSION = register("herobrine_dimension", HerobrineDimensionItem::new);
		YOU_SHOULDNT_DO_THAT = register("you_shouldnt_do_that", YouShouldntDoThatItem::new);
		HEROBRINE_PASSIVE_SPAWN_EGG = register("herobrine_passive_spawn_egg", properties -> new SpawnEggItem(HerobrinemodModEntities.HEROBRINE_PASSIVE.get(), properties));
		HEROBRINE_LOADER_SPAWN_EGG = register("herobrine_loader_spawn_egg", properties -> new SpawnEggItem(HerobrinemodModEntities.HEROBRINE_LOADER.get(), properties));
		RESTART_FIGHT = block(HerobrinemodModBlocks.RESTART_FIGHT);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}