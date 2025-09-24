package net.mcreator.starwarsexpansion.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

import net.mcreator.starwarsexpansion.network.StarWarsExpansionModVariables;
import net.mcreator.starwarsexpansion.entity.XWingEntity;
import net.mcreator.starwarsexpansion.entity.TIEFighterEntity;
import net.mcreator.starwarsexpansion.entity.SnowspeederEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpaceshipMoveProcedureProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsExpansionModVariables.PlayerVariables())).ssmov == true) {
			if ((entity.getVehicle()) instanceof XWingEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getLookAngle().x * 2), (entity.getXRot() * (-0.01)), (entity.getLookAngle().z * 2)));
			}
		} else if ((entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsExpansionModVariables.PlayerVariables())).ssmov == false) {
			if ((entity.getVehicle()) instanceof XWingEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getXRot() * (-0.01)), (entity.getDeltaMovement().z())));
			}
		}
		if ((entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsExpansionModVariables.PlayerVariables())).ssmov == true) {
			if ((entity.getVehicle()) instanceof TIEFighterEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getLookAngle().x * 2), (entity.getXRot() * (-0.01)), (entity.getLookAngle().z * 2)));
			}
		} else if ((entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsExpansionModVariables.PlayerVariables())).ssmov == false) {
			if ((entity.getVehicle()) instanceof TIEFighterEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getXRot() * (-0.01)), (entity.getDeltaMovement().z())));
			}
		}
		if ((entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsExpansionModVariables.PlayerVariables())).ssmov == true) {
			if ((entity.getVehicle()) instanceof SnowspeederEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getLookAngle().x * 2), (entity.getXRot() * (-0.01)), (entity.getLookAngle().z * 2)));
			}
		} else if ((entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsExpansionModVariables.PlayerVariables())).ssmov == false) {
			if ((entity.getVehicle()) instanceof SnowspeederEntity) {
				(entity.getVehicle()).setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getXRot() * (-0.01)), (entity.getDeltaMovement().z())));
			}
		}
	}
}
