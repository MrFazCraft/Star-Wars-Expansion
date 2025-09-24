package net.mcreator.starwarsexpansion.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.starwarsexpansion.network.StarWarsExpansionModVariables;

public class SpaceshipMoveKeyOnKeyPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ssmov = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
