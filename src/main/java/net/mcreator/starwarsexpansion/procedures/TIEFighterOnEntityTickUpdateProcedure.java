package net.mcreator.starwarsexpansion.procedures;

import net.minecraft.world.entity.Entity;

public class TIEFighterOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.fallDistance = 0;
	}
}
