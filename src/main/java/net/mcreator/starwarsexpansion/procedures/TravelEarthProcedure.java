package net.mcreator.starwarsexpansion.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceKey;

import net.mcreator.starwarsexpansion.entity.XWingEntity;

public class TravelEarthProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;

        if (entity instanceof ServerPlayer player && player.getVehicle() instanceof XWingEntity vehicle) {
            ResourceKey<Level> destination = Level.OVERWORLD;

            if (player.level().dimension() != destination) {
                ServerLevel nextLevel = player.server.getLevel(destination);
                if (nextLevel != null) {
                    // Teletransportar el X-Wing
                    Entity newVehicle = vehicle.changeDimension(nextLevel);
                    if (newVehicle != null) {
                        // Teletransportar el jugador
                        player.changeDimension(nextLevel);

                        // Volver a montar al jugador en el X-Wing
                        player.startRiding(newVehicle, true);
                    }
                }
            }
        }
    }
}
