/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herobrinemod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.herobrinemod.HerobrinemodMod;

@EventBusSubscriber
public class HerobrinemodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HerobrinemodMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> HEROBRINE_MOD = REGISTRY.register("herobrine_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.herobrinemod.herobrine_mod")).icon(() -> new ItemStack(HerobrinemodModBlocks.THAT_FACE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HerobrinemodModItems.HEROBRINE_SPAWN_EGG.get());
				tabData.accept(HerobrinemodModBlocks.THAT_FACE.get().asItem());
				tabData.accept(HerobrinemodModItems.HEROBRINE_DIMENSION.get());
				tabData.accept(HerobrinemodModItems.HEROBRINE_PASSIVE_SPAWN_EGG.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(HerobrinemodModItems.HEROBRINE_SPAWN_EGG.get());
			tabData.accept(HerobrinemodModItems.HEROBRINE_PASSIVE_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(HerobrinemodModItems.HEROBRINE_DIMENSION.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.OP_BLOCKS) {
			if (tabData.hasPermissions()) {
				tabData.accept(HerobrinemodModItems.YOU_SHOULDNT_DO_THAT.get());
				tabData.accept(HerobrinemodModItems.HEROBRINE_LOADER_SPAWN_EGG.get());
			}
		}
	}
}