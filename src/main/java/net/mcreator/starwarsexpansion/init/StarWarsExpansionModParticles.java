
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.starwarsexpansion.client.particle.LaserParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StarWarsExpansionModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(StarWarsExpansionModParticleTypes.LASER_PARTICLE.get(), LaserParticleParticle::provider);
	}
}
