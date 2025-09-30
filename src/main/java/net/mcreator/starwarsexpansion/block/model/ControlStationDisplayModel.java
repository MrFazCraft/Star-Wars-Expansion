package net.mcreator.starwarsexpansion.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.block.display.ControlStationDisplayItem;

public class ControlStationDisplayModel extends GeoModel<ControlStationDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ControlStationDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/controlstation.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ControlStationDisplayItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/controlstation.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ControlStationDisplayItem entity) {
		return new ResourceLocation("star_wars_expansion", "textures/block/controlstation.png");
	}
}
