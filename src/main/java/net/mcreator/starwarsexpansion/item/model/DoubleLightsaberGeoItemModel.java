package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.DoubleLightsaberGeoItem;

public class DoubleLightsaberGeoItemModel extends GeoModel<DoubleLightsaberGeoItem> {
	@Override
	public ResourceLocation getAnimationResource(DoubleLightsaberGeoItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/doublelightsaber.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoubleLightsaberGeoItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/doublelightsaber.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoubleLightsaberGeoItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/lightsaber_blue.png");
	}
}
