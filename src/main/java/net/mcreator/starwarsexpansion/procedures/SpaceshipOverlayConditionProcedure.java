package net.mcreator.starwarsexpansion.procedures;

import net.minecraft.world.entity.Entity;
import net.mcreator.starwarsexpansion.entity.XWingEntity;
import net.mcreator.starwarsexpansion.entity.TIEFighterEntity;
import net.mcreator.starwarsexpansion.entity.EscapePodEntity;

public class SpaceshipOverlayConditionProcedure {
    public static boolean execute(Entity entity) {
        if (entity == null) {
            return false;
        }
        // Devuelve true si el entity está montado en un XWing, un TIE Fighter o una Escape Pod
        return entity.getVehicle() instanceof XWingEntity 
            || entity.getVehicle() instanceof TIEFighterEntity
            || entity.getVehicle() instanceof EscapePodEntity;
    }
}
