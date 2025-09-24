
package net.mcreator.starwarsexpansion.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.starwarsexpansion.world.inventory.PlanetAnchorGUIMenu;
import net.mcreator.starwarsexpansion.procedures.TravelTatooineProcedureProcedure;
import net.mcreator.starwarsexpansion.procedures.TravelHothProcedureProcedure;
import net.mcreator.starwarsexpansion.procedures.TravelEarthProcedure;
import net.mcreator.starwarsexpansion.procedures.TravelDenyProcedureProcedure;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PlanetAnchorGUIButtonMessage {
	private final int buttonID, x, y, z;

	public PlanetAnchorGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public PlanetAnchorGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(PlanetAnchorGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(PlanetAnchorGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = PlanetAnchorGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			TravelTatooineProcedureProcedure.execute(entity);
		}
		if (buttonID == 1) {

			TravelDenyProcedureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			TravelDenyProcedureProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			TravelHothProcedureProcedure.execute(entity);
		}
		if (buttonID == 4) {

			TravelEarthProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		StarWarsExpansionMod.addNetworkMessage(PlanetAnchorGUIButtonMessage.class, PlanetAnchorGUIButtonMessage::buffer, PlanetAnchorGUIButtonMessage::new, PlanetAnchorGUIButtonMessage::handler);
	}
}
