package net.mcreator.starwarsexpansion.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.starwarsexpansion.init.StarWarsExpansionModEntities;

public class TwiLekOnRightClickProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double spawn = 0;
		spawn = Math.round(Math.random() * 3);
		if (spawn == 1) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = StarWarsExpansionModEntities.TWI_LEK_BLUE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
		}
		if (spawn == 2) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = StarWarsExpansionModEntities.TWI_LEK_ORANGE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
		}
		if (spawn == 3) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = StarWarsExpansionModEntities.TWI_LEK_PINK.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
				}
			}
		}
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
