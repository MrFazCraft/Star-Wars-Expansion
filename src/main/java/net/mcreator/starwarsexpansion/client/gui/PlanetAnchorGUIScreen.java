package net.mcreator.starwarsexpansion.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.starwarsexpansion.world.inventory.PlanetAnchorGUIMenu;
import net.mcreator.starwarsexpansion.network.PlanetAnchorGUIButtonMessage;
import net.mcreator.starwarsexpansion.StarWarsExpansionMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PlanetAnchorGUIScreen extends AbstractContainerScreen<PlanetAnchorGUIMenu> {
	private final static HashMap<String, Object> guistate = PlanetAnchorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_tatooine;
	ImageButton imagebutton_endor;
	ImageButton imagebutton_kashyyyk;
	ImageButton imagebutton_hoth;
	ImageButton imagebutton_earth1png;

	public PlanetAnchorGUIScreen(PlanetAnchorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("star_wars_expansion:textures/screens/planet_anchor_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("star_wars_expansion:textures/screens/sky_background_scaled.png"), this.leftPos + -9, this.topPos + -357, 0, 0, 540, 364, 540, 364);

		guiGraphics.blit(new ResourceLocation("star_wars_expansion:textures/screens/sky_background_scaled.png"), this.leftPos + -532, this.topPos + 7, 0, 0, 540, 364, 540, 364);

		guiGraphics.blit(new ResourceLocation("star_wars_expansion:textures/screens/sky_background_scaled.png"), this.leftPos + 8, this.topPos + 7, 0, 0, 540, 364, 540, 364);

		guiGraphics.blit(new ResourceLocation("star_wars_expansion:textures/screens/sky_background_scaled.png"), this.leftPos + -532, this.topPos + -357, 0, 0, 540, 364, 540, 364);

		guiGraphics.blit(new ResourceLocation("star_wars_expansion:textures/screens/sun_planet.png"), this.leftPos + 124, this.topPos + -162, 0, 0, 128, 128, 128, 128);

		guiGraphics.blit(new ResourceLocation("star_wars_expansion:textures/screens/tatooine_small.png"), this.leftPos + -202, this.topPos + 51, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("star_wars_expansion:textures/screens/hoth_small.png"), this.leftPos + -202, this.topPos + 67, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("star_wars_expansion:textures/screens/kashyyyk_small.png"), this.leftPos + -202, this.topPos + 84, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("star_wars_expansion:textures/screens/endor_small.png"), this.leftPos + -202, this.topPos + 101, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("star_wars_expansion:textures/screens/earth-1.png.png"), this.leftPos + -202, this.topPos + 34, 0, 0, 8, 8, 8, 8);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.star_wars_expansion.planet_anchor_gui.label_earth"), -191, 33, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.star_wars_expansion.planet_anchor_gui.label_tatooine"), -191, 50, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.star_wars_expansion.planet_anchor_gui.label_hoth"), -190, 66, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.star_wars_expansion.planet_anchor_gui.label_kashyyyk"), -190, 83, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.star_wars_expansion.planet_anchor_gui.label_endor"), -190, 100, -1, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_tatooine = new ImageButton(this.leftPos + -146, this.topPos + -75, 32, 32, 0, 0, 32, new ResourceLocation("star_wars_expansion:textures/screens/atlas/imagebutton_tatooine.png"), 32, 64, e -> {
			if (true) {
				StarWarsExpansionMod.PACKET_HANDLER.sendToServer(new PlanetAnchorGUIButtonMessage(0, x, y, z));
				PlanetAnchorGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_tatooine", imagebutton_tatooine);
		this.addRenderableWidget(imagebutton_tatooine);
		imagebutton_endor = new ImageButton(this.leftPos + 79, this.topPos + -16, 32, 32, 0, 0, 32, new ResourceLocation("star_wars_expansion:textures/screens/atlas/imagebutton_endor.png"), 32, 64, e -> {
			if (true) {
				StarWarsExpansionMod.PACKET_HANDLER.sendToServer(new PlanetAnchorGUIButtonMessage(1, x, y, z));
				PlanetAnchorGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		});
		guistate.put("button:imagebutton_endor", imagebutton_endor);
		this.addRenderableWidget(imagebutton_endor);
		imagebutton_kashyyyk = new ImageButton(this.leftPos + 1, this.topPos + 45, 32, 32, 0, 0, 32, new ResourceLocation("star_wars_expansion:textures/screens/atlas/imagebutton_kashyyyk.png"), 32, 64, e -> {
			if (true) {
				StarWarsExpansionMod.PACKET_HANDLER.sendToServer(new PlanetAnchorGUIButtonMessage(2, x, y, z));
				PlanetAnchorGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		});
		guistate.put("button:imagebutton_kashyyyk", imagebutton_kashyyyk);
		this.addRenderableWidget(imagebutton_kashyyyk);
		imagebutton_hoth = new ImageButton(this.leftPos + -52, this.topPos + -40, 32, 32, 0, 0, 32, new ResourceLocation("star_wars_expansion:textures/screens/atlas/imagebutton_hoth.png"), 32, 64, e -> {
			if (true) {
				StarWarsExpansionMod.PACKET_HANDLER.sendToServer(new PlanetAnchorGUIButtonMessage(3, x, y, z));
				PlanetAnchorGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		});
		guistate.put("button:imagebutton_hoth", imagebutton_hoth);
		this.addRenderableWidget(imagebutton_hoth);
		imagebutton_earth1png = new ImageButton(this.leftPos + -62, this.topPos + -80, 8, 8, 0, 0, 8, new ResourceLocation("star_wars_expansion:textures/screens/atlas/imagebutton_earth1png.png"), 8, 16, e -> {
			if (true) {
				StarWarsExpansionMod.PACKET_HANDLER.sendToServer(new PlanetAnchorGUIButtonMessage(4, x, y, z));
				PlanetAnchorGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		});
		guistate.put("button:imagebutton_earth1png", imagebutton_earth1png);
		this.addRenderableWidget(imagebutton_earth1png);
	}
}
