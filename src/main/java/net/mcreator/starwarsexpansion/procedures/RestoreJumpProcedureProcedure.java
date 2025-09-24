package net.mcreator.starwarsexpansion.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.starwarsexpansion.network.StarWarsExpansionModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RestoreJumpProcedureProcedure {
	@SubscribeEvent
	public static void onEntityJump(LivingEvent.LivingJumpEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			{
				boolean _setval = false;
				entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jumpvar = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
