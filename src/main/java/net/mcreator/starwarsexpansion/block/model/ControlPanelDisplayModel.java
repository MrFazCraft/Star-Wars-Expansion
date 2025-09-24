package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.display.ControlPanelDisplayItem;

public class ControlPanelDisplayModel extends GeoModel<ControlPanelDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ControlPanelDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/panel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ControlPanelDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/panel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ControlPanelDisplayItem entity) {
		return new ResourceLocation("star_wars_expansion", "textures/block/panel.png");
	}
}
