package net.mcreator.starwarsexpansion.procedures;

import net.minecraftforge.network.NetworkDirection;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.Connection;
import net.minecraft.core.BlockPos;

import net.mcreator.starwarsexpansion.network.StarWarsExpansionModVariables;
import net.mcreator.starwarsexpansion.init.StarWarsExpansionModItems;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

import java.util.List;
import java.util.Iterator;

public class DoubleJumpKeyOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude()
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(StarWarsExpansionModItems.BROWN_JEDI_CLOTHES_CHESTPLATE.get())) : false)
				&& false == (entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsExpansionModVariables.PlayerVariables())).jumpvar) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.7), (entity.getDeltaMovement().z())));
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "doublejump", false);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
					synchronized (connections) {
						Iterator<Connection> iterator = connections.iterator();
						while (iterator.hasNext()) {
							Connection connection = iterator.next();
							if (!connection.isConnecting() && connection.isConnected())
								StarWarsExpansionMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage(Component.literal("doublejump"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
			StarWarsExpansionMod.queueServerWork(13, () -> {
				if (world.isClientSide()) {
					SetupAnimationsProcedure.setAnimationClientside((Player) entity, "recall", true);
				}
				if (!world.isClientSide()) {
					if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
						List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
						synchronized (connections) {
							Iterator<Connection> iterator = connections.iterator();
							while (iterator.hasNext()) {
								Connection connection = iterator.next();
								if (!connection.isConnecting() && connection.isConnected())
									StarWarsExpansionMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage(Component.literal("recall"), entity.getId(), true), connection, NetworkDirection.PLAY_TO_CLIENT);
							}
						}
					}
				}
			});
			{
				boolean _setval = true;
				entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jumpvar = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (!world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude()
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(StarWarsExpansionModItems.GRAY_JEDI_CLOTHES_CHESTPLATE.get())) : false)
				&& false == (entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsExpansionModVariables.PlayerVariables())).jumpvar) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.7), (entity.getDeltaMovement().z())));
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "doublejump", false);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
					synchronized (connections) {
						Iterator<Connection> iterator = connections.iterator();
						while (iterator.hasNext()) {
							Connection connection = iterator.next();
							if (!connection.isConnecting() && connection.isConnected())
								StarWarsExpansionMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage(Component.literal("doublejump"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jumpvar = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (!world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude()
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(StarWarsExpansionModItems.BLACK_JEDI_CLOTHES_CHESTPLATE.get())) : false)
				&& false == (entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsExpansionModVariables.PlayerVariables())).jumpvar) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.7), (entity.getDeltaMovement().z())));
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "doublejump", false);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
					synchronized (connections) {
						Iterator<Connection> iterator = connections.iterator();
						while (iterator.hasNext()) {
							Connection connection = iterator.next();
							if (!connection.isConnecting() && connection.isConnected())
								StarWarsExpansionMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage(Component.literal("doublejump"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jumpvar = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (!world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude()
				&& (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(StarWarsExpansionModItems.GRAND_MASTER_JEDI_CLOTHES_CHESTPLATE.get())) : false)
				&& false == (entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsExpansionModVariables.PlayerVariables())).jumpvar) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 1), (entity.getDeltaMovement().z())));
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "doublejump", false);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
					synchronized (connections) {
						Iterator<Connection> iterator = connections.iterator();
						while (iterator.hasNext()) {
							Connection connection = iterator.next();
							if (!connection.isConnecting() && connection.isConnected())
								StarWarsExpansionMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage(Component.literal("doublejump"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jumpvar = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (!world.getBlockState(BlockPos.containing(x, y - 0.5, z)).canOcclude() && (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(StarWarsExpansionModItems.SITH_CLOTHES_CHESTPLATE.get())) : false)
				&& false == (entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new StarWarsExpansionModVariables.PlayerVariables())).jumpvar) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.7), (entity.getDeltaMovement().z())));
			if (world.isClientSide()) {
				SetupAnimationsProcedure.setAnimationClientside((Player) entity, "doublejump", false);
			}
			if (!world.isClientSide()) {
				if (entity instanceof Player && world instanceof ServerLevel srvLvl_) {
					List<Connection> connections = srvLvl_.getServer().getConnection().getConnections();
					synchronized (connections) {
						Iterator<Connection> iterator = connections.iterator();
						while (iterator.hasNext()) {
							Connection connection = iterator.next();
							if (!connection.isConnecting() && connection.isConnected())
								StarWarsExpansionMod.PACKET_HANDLER.sendTo(new SetupAnimationsProcedure.StarWarsExpansionModAnimationMessage(Component.literal("doublejump"), entity.getId(), false), connection, NetworkDirection.PLAY_TO_CLIENT);
						}
					}
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(StarWarsExpansionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.jumpvar = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
