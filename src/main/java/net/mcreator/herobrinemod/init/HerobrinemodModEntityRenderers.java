/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.herobrinemod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.herobrinemod.client.renderer.HerobrineRenderer;
import net.mcreator.herobrinemod.client.renderer.HerobrinePassiveRenderer;
import net.mcreator.herobrinemod.client.renderer.HerobrineLoaderRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class HerobrinemodModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(HerobrinemodModEntities.HEROBRINE.get(), HerobrineRenderer::new);
		event.registerEntityRenderer(HerobrinemodModEntities.HEROBRINE_PASSIVE.get(), HerobrinePassiveRenderer::new);
		event.registerEntityRenderer(HerobrinemodModEntities.HEROBRINE_LOADER.get(), HerobrineLoaderRenderer::new);
	}
}