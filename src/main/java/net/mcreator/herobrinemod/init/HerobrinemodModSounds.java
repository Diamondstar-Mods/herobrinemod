/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herobrinemod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.herobrinemod.HerobrinemodMod;

public class HerobrinemodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, HerobrinemodMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> BOSSTHEME = REGISTRY.register("bosstheme", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("herobrinemod", "bosstheme")));
	public static final DeferredHolder<SoundEvent, SoundEvent> STEVEHIT = REGISTRY.register("stevehit", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("herobrinemod", "stevehit")));
}