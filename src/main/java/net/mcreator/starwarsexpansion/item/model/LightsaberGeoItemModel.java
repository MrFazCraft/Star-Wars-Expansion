package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.LightsaberGeoItem;

public class LightsaberGeoItemModel extends GeoModel<LightsaberGeoItem> {
	@Override
	public ResourceLocation getAnimationResource(LightsaberGeoItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/lightsabergeo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightsaberGeoItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/lightsabergeo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightsaberGeoItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/lightsaber_blue.png");
	}
}
