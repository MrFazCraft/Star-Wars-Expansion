package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.LightsaberGeoYellowItem;

public class LightsaberGeoYellowItemModel extends GeoModel<LightsaberGeoYellowItem> {
	@Override
	public ResourceLocation getAnimationResource(LightsaberGeoYellowItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/lightsabergeo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightsaberGeoYellowItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/lightsabergeo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightsaberGeoYellowItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/lightsaber_yellow.png");
	}
}
