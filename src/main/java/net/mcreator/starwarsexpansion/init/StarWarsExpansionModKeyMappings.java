
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.starwarsexpansion.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.starwarsexpansion.network.SpaceshipShootKeyMessage;
import net.mcreator.starwarsexpansion.network.SpaceshipMoveKeyMessage;
import net.mcreator.starwarsexpansion.network.SpaceshipAnchorGUIKeyMessage;
import net.mcreator.starwarsexpansion.network.DoubleJumpKeyMessage;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StarWarsExpansionModKeyMappings {
	public static final KeyMapping DOUBLE_JUMP_KEY = new KeyMapping("key.star_wars_expansion.double_jump_key", GLFW.GLFW_KEY_SPACE, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StarWarsExpansionMod.PACKET_HANDLER.sendToServer(new DoubleJumpKeyMessage(0, 0));
				DoubleJumpKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SPACESHIP_MOVE_KEY = new KeyMapping("key.star_wars_expansion.spaceship_move_key", GLFW.GLFW_KEY_W, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StarWarsExpansionMod.PACKET_HANDLER.sendToServer(new SpaceshipMoveKeyMessage(0, 0));
				SpaceshipMoveKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				SPACESHIP_MOVE_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SPACESHIP_MOVE_KEY_LASTPRESS);
				StarWarsExpansionMod.PACKET_HANDLER.sendToServer(new SpaceshipMoveKeyMessage(1, dt));
				SpaceshipMoveKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SPACESHIP_SHOOT_KEY = new KeyMapping("key.star_wars_expansion.spaceship_shoot_key", GLFW.GLFW_KEY_G, "key.categories.movement") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StarWarsExpansionMod.PACKET_HANDLER.sendToServer(new SpaceshipShootKeyMessage(0, 0));
				SpaceshipShootKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
				SPACESHIP_SHOOT_KEY_LASTPRESS = System.currentTimeMillis();
			} else if (isDownOld != isDown && !isDown) {
				int dt = (int) (System.currentTimeMillis() - SPACESHIP_SHOOT_KEY_LASTPRESS);
				StarWarsExpansionMod.PACKET_HANDLER.sendToServer(new SpaceshipShootKeyMessage(1, dt));
				SpaceshipShootKeyMessage.pressAction(Minecraft.getInstance().player, 1, dt);
			}
			isDownOld = isDown;
		}
	};
	public static final KeyMapping SPACESHIP_ANCHOR_GUI_KEY = new KeyMapping("key.star_wars_expansion.spaceship_anchor_gui_key", GLFW.GLFW_KEY_Z, "key.categories.ui") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StarWarsExpansionMod.PACKET_HANDLER.sendToServer(new SpaceshipAnchorGUIKeyMessage(0, 0));
				SpaceshipAnchorGUIKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};
	private static long SPACESHIP_MOVE_KEY_LASTPRESS = 0;
	private static long SPACESHIP_SHOOT_KEY_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(DOUBLE_JUMP_KEY);
		event.register(SPACESHIP_MOVE_KEY);
		event.register(SPACESHIP_SHOOT_KEY);
		event.register(SPACESHIP_ANCHOR_GUI_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				DOUBLE_JUMP_KEY.consumeClick();
				SPACESHIP_MOVE_KEY.consumeClick();
				SPACESHIP_SHOOT_KEY.consumeClick();
				SPACESHIP_ANCHOR_GUI_KEY.consumeClick();
			}
		}
	}
}
