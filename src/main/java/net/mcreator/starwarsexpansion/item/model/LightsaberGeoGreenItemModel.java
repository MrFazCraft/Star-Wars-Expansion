package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.LightsaberGeoGreenItem;

public class LightsaberGeoGreenItemModel extends GeoModel<LightsaberGeoGreenItem> {
	@Override
	public ResourceLocation getAnimationResource(LightsaberGeoGreenItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/lightsabergeo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightsaberGeoGreenItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/lightsabergeo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightsaberGeoGreenItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/lightsaber_green.png");
	}
}
