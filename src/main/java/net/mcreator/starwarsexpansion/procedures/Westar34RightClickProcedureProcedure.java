package net.mcreator.starwarsexpansion.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.starwarsexpansion.item.Westar34Item;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModEntities;
import net.mcreator.starwarsexpansion.entity.LaserProjectileEntity;

public class Westar34RightClickProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		{
			Entity _shootFrom = entity;
			Level projectileLevel = _shootFrom.level();
			if (!projectileLevel.isClientSide()) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback) {
						AbstractArrow entityToSpawn = new LaserProjectileEntity(StarWarsExpansionModEntities.LASER_PROJECTILE.get(), level);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setKnockback(knockback);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 2f / 3f, 0); // Daño reducido a un tercio (≈0.66)

				// Offset para mover el disparo (misma posición que la DL-44)
				Vec3 look = _shootFrom.getLookAngle();
				Vec3 right = look.cross(new Vec3(0, 1, 0)).normalize();

				double forwardOffset = 1.0; // Adelante (igual que la DL-44)
				double rightOffset = 0.3;   // Derecha
				double upOffset = -0.1;     // Un poco más bajo

				double startX = _shootFrom.getX() + look.x * forwardOffset + right.x * rightOffset;
				double startY = _shootFrom.getEyeY() + upOffset + look.y * forwardOffset + right.y * rightOffset;
				double startZ = _shootFrom.getZ() + look.z * forwardOffset + right.z * rightOffset;

				_entityToSpawn.setPos(startX, startY, startZ);
				_entityToSpawn.shoot(look.x, look.y, look.z, 5, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("star_wars_expansion:westar_shot")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("star_wars_expansion:westar_shot")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (itemstack.getItem() instanceof Westar34Item)
			itemstack.getOrCreateTag().putString("geckoAnim", "1");
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 8);
	}
}
