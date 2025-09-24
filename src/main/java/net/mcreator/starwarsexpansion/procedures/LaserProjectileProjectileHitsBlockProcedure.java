package net.mcreator.starwarsexpansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.starwarsexpansion.init.StarWarsExpansionModParticleTypes;

public class LaserProjectileProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (StarWarsExpansionModParticleTypes.LASER_PARTICLE.get()), x, y, z, 1, 0, 0, 0, 0.1);
	}
}
