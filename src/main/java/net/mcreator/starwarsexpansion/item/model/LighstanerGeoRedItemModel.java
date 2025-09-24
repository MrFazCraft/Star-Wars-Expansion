package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.LighstanerGeoRedItem;

public class LighstanerGeoRedItemModel extends GeoModel<LighstanerGeoRedItem> {
	@Override
	public ResourceLocation getAnimationResource(LighstanerGeoRedItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/lightsabergeo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LighstanerGeoRedItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/lightsabergeo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LighstanerGeoRedItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/lightsaber_red.png");
	}
}
