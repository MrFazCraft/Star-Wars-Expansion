package net.mcreator.starwarsexpansion.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.starwarsexpansion.item.DoubleLightsaberPurpleItem;

public class DoubleLightsaberPurpleItemModel extends GeoModel<DoubleLightsaberPurpleItem> {
	@Override
	public ResourceLocation getAnimationResource(DoubleLightsaberPurpleItem animatable) {
		return new ResourceLocation("star_wars_expansion", "animations/doublelightsaber.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DoubleLightsaberPurpleItem animatable) {
		return new ResourceLocation("star_wars_expansion", "geo/doublelightsaber.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DoubleLightsaberPurpleItem animatable) {
		return new ResourceLocation("star_wars_expansion", "textures/item/lightsaber_purple.png");
	}
}
