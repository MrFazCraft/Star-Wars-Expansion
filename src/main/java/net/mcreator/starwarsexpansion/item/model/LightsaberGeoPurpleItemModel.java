package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.LightsaberGeoPurpleItem;

public class LightsaberGeoPurpleItemModel extends GeoModel<LightsaberGeoPurpleItem> {
	@Override
	public ResourceLocation getAnimationResource(LightsaberGeoPurpleItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/lightsabergeo.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LightsaberGeoPurpleItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/lightsabergeo.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LightsaberGeoPurpleItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/lightsaber_purple.png");
	}
}
