
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

public class StarWarsExpansionModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, StarWarsExpansionMod.MODID);
	public static final RegistryObject<SimpleParticleType> LASER_PARTICLE = REGISTRY.register("laser_particle", () -> new SimpleParticleType(true));
}
