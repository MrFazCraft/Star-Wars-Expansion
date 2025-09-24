package net.mcreator.starwarsexpansion.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.phys.Vec3;

import net.mcreator.starwarsexpansion.init.StarWarsExpansionModEntities;
import net.mcreator.starwarsexpansion.entity.XWingEntity;
import net.mcreator.starwarsexpansion.entity.TIEFighterEntity;
import net.mcreator.starwarsexpansion.entity.SnowspeederEntity;
import net.mcreator.starwarsexpansion.entity.EscapePodEntity;
import net.mcreator.starwarsexpansion.entity.ATSTEntity;
import net.mcreator.starwarsexpansion.entity.LaserProjectileEntity;

public class SpaceshipShootKeyOnKeyPressedProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;

        Entity vehicle = entity.getVehicle();
        if (vehicle == null)
            return;

        Level level = entity.level();

        if (!level.isClientSide()) {
            // === Vectores básicos ===
            Vec3 look = entity.getLookAngle().normalize(); // Dirección hacia delante
            Vec3 up = new Vec3(0, 1, 0);                   // Vector arriba global
            Vec3 right = look.cross(up).normalize();       // Vector derecha relativo

            // === Base delante de la nave (+75 adelante de los ojos del piloto) ===
            Vec3 basePos = entity.position().add(look.scale(75 / 16.0)).add(0, entity.getEyeHeight(), 0);

            // === X-Wing: 4 disparos ===
            if (vehicle instanceof XWingEntity) {
                Vec3[] offsets = new Vec3[] {
                        // Alas superiores
                        up.scale(25 / 16.0).add(right.scale(90 / 16.0)),   // arriba derecha
                        up.scale(25 / 16.0).add(right.scale(-90 / 16.0)),  // arriba izquierda
                        // Alas inferiores
                        up.scale(-75 / 16.0).add(right.scale(66 / 16.0)),  // abajo derecha
                        up.scale(-75 / 16.0).add(right.scale(-66 / 16.0))  // abajo izquierda
                };

                for (Vec3 offset : offsets) {
                    spawnLaser(level, basePos.add(offset), look);
                }
            }

            // === TIE Fighter: 2 disparos ===
            if (vehicle instanceof TIEFighterEntity) {
                Vec3[] offsets = new Vec3[] {
                        up.scale(-3).add(right.scale(1)),   // derecha
                        up.scale(-3).add(right.scale(-1))   // izquierda
                };

                for (Vec3 offset : offsets) {
                    spawnLaser(level, basePos.add(offset), look);
                }
            }

            // === AT-ST: 2 disparos desde los ojos, -4 bloques abajo y +3 hacia delante ===
            if (vehicle instanceof ATSTEntity) {
                Vec3 atstBase = entity.position()
                        .add(0, entity.getEyeHeight() - 4, 0) // ojos del jugador -4 bloques
                        .add(look.scale(3.0)); // +3 bloques hacia delante

                Vec3[] offsets = new Vec3[] {
                        right.scale(-0.5), // izquierda
                        right.scale(0.5)   // derecha
                };

                for (Vec3 offset : offsets) {
                    spawnLaser(level, atstBase.add(offset), look);
                }
            }

            // === Snowspeeder: 2 disparos más bajos y separados ===
            if (vehicle instanceof SnowspeederEntity) {
                Vec3[] offsets = new Vec3[] {
                        new Vec3(3.0, -3, 0),  // derecha (más abajo y más separado)
                        new Vec3(-3.0, -3, 0)  // izquierda (más abajo y más separado)
                };

                for (Vec3 offset : offsets) {
                    // Rotamos el offset al sistema de coordenadas de la nave
                    Vec3 worldOffset = right.scale(offset.x).add(up.scale(offset.y));
                    spawnLaser(level, basePos.add(worldOffset), look);
                }
            }
        }
    }

    // Método para crear y disparar un láser
    private static void spawnLaser(Level level, Vec3 pos, Vec3 look) {
        Projectile laser = new LaserProjectileEntity(
                StarWarsExpansionModEntities.LASER_PROJECTILE.get(), level);
        if (laser instanceof AbstractArrow arrow) {
            arrow.setBaseDamage(0.2f);
            arrow.setKnockback(0);
            arrow.setSilent(true);
        }

        laser.setPos(pos.x, pos.y, pos.z);
        laser.shoot(look.x, look.y, look.z, 5, 0);
        level.addFreshEntity(laser);
    }
}
